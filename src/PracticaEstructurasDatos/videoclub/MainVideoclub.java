package PracticaEstructurasDatos.videoclub;
import java.util.List;
import java.util.Scanner;

public class MainVideoclub {
    public static void main(String[] args) {
        Videoclub vc = new Videoclub();
        Scanner sc = new Scanner(System.in);

        // Carga inicial de películas
        vc.getCatalogo().add(new Pelicula("Matrix", "SciFi", 5, false));
        vc.getCatalogo().add(new Pelicula("Shrek", "Animación", 2, false));
        vc.getCatalogo().add(new Pelicula("Interstellar", "SciFi", 6, true));
        vc.getCatalogo().add(new Pelicula("Todo a la vez en todas partes", "Drama, Comedia", 3, true));
        vc.getCatalogo().add(new Pelicula("Forrest Gump","Drama, Comedia", 5, false));
        vc.getCatalogo().add(new Pelicula("Constantine", "Acción", 4, false));

        while (true) {
            Usuario userLogueado = vc.getUsuarioLogueado();
            System.out.println("\n--- VIDEOCLUB (Sesión: " + (userLogueado == null ? "Anónimo" : userLogueado.getNombre()) + ") ---");

            // --- MENÚ ESTÁNDAR (Siempre visible) ---
            System.out.println("1. Ver catálogo");
            System.out.println("2. Alquilar película");
            System.out.println("3. Crear nuevo usuario");
            System.out.println("4. Identificarse (Login)");
            System.out.println("5. Cambiar/Cerrar usuario");

            // --- MENÚ DE USUARIO ACTIVO ---
            // Solo aparece si hay alguien logueado y tiene alquileres
            if (userLogueado != null && !userLogueado.getMisAlquileres().isEmpty()) {
                System.out.println("6. Ver mis alquileres activos");
                System.out.println("7. Devolver una película");
            }

            // --- MENÚ DE ADMINISTRADOR (Exclusivo) ---
            if (userLogueado != null && userLogueado.esAdmin()) {
                System.out.println("\n[ADMIN] 8. Añadir una película al sistema");
                System.out.println("[ADMIN] 9. Ver listado global de alquileres");
                System.out.println("[ADMIN] 10. Buscar alquileres por usuario");
            }

            System.out.println("0. Salir");
            System.out.print("Opción: ");

            // Validación de número para evitar errores (lo que pediste antes 😅)
            if (!sc.hasNextInt()) {
                System.out.println("-> [ERROR] ¡Eso no es un número!");
                sc.next(); sc.nextLine();
                continue;
            }

            int op = sc.nextInt();
            sc.nextLine();

            if (op == 0) {
                if (userLogueado != null) {
                    System.out.println("¡Hasta pronto, " + userLogueado.getNombre() + "! \n    ✨🎥🎞️✨");
                } else {
                    System.out.println("🎞️🎥 ¡Gracias por su visita! 🎥🎞️");
                }
                break;
            }

            switch (op) {
                case 1:
                    vc.getCatalogo().forEach(p -> System.out.println(p.getTitulo() + " | Stock: " + p.getStock() + " | " + (p.esNovedad() ? "5€" : "3€")));
                    break;
                case 2:
                    System.out.print("Título de la película: ");
                    vc.alquilar(sc.nextLine());
                    break;
                case 3:
                    System.out.print("Usuario: "); String n = sc.nextLine();
                    System.out.print("Contraseña: "); String p = sc.nextLine();
                    vc.registrarUsuario(n, p, false);
                    break;
                case 4:
                    System.out.println("[TRAZA] Entrando en modo Login.");
                    vc.listarUsuarios();

                    System.out.print("Elige el número de usuario: ");

                    // 1. Verificamos si la entrada es un número
                    if (sc.hasNextInt()) {
                        int idx = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer

                        // 2. Verificamos si el número está dentro del rango de la lista
                        if (idx >= 0 && idx < vc.getListaUsuarios().size()) {
                            Usuario u = vc.getListaUsuarios().get(idx);
                            int intentos = 0;
                            boolean loginOk = false;

                            while (intentos < 3 && !loginOk) {
                                System.out.print("Contraseña para " + u.getNombre() + " (Intento " + (intentos+1) + "/3): ");
                                String c = sc.nextLine();

                                if (u.getContrasena().equals(c)) {
                                    vc.seleccionarUsuarioPorIndice(idx, c);
                                    loginOk = true;
                                } else {
                                    intentos++;
                                    System.out.println("-> [ERROR] Clave incorrecta.");
                                    if (intentos == 3) System.out.println("[TRAZA] Bloqueo de login por intentos agotados.");
                                }
                            }
                        } else {
                            System.out.println("-> [ERROR] No existe el número de usuario indicado. Introduce uno de la lista.");
                        }
                    } else {
                        // 3. Si el usuario ha escrito letras o palabras
                        System.out.println("-> [ERROR] ¡Eso no es un número! Por favor, introduce un número válido de la lista.");
                        sc.next(); // "Nos comemos" la palabra errónea para que no bloquee el bucle
                        sc.nextLine(); // Limpiamos el resto de la línea
                    }
                    break;
                case 5:
                    if (vc.getUsuarioLogueado() != null) vc.logout();
                    System.out.println("[TRAZA] Sesión cerrada. Por favor, identifícate de nuevo.");
                    break;
                case 6: // Ver mis alquileres
                    if (vc.getUsuarioLogueado() != null) {
                        System.out.println("--- ALQUILERES ACTIVOS ---");
                        vc.getUsuarioLogueado().getMisAlquileres().forEach(a -> System.out.println("- " + a.getPelicula().getTitulo()));
                    }
                    break;
                case 7: // Devolver
                    System.out.print("Película a devolver: ");
                    vc.devolverPelicula(sc.nextLine());
                    break;

                case 8: // Admin: Añadir película al sistema
                    if (userLogueado != null && userLogueado.esAdmin()) {
                        System.out.println("\n[ADMIN] --- REGISTRAR NUEVA PELÍCULA ---");

                        System.out.print("Introduce el título: ");
                        String tit = sc.nextLine();

                        System.out.print("Introduce el género: ");
                        String gnr = sc.nextLine();

                        System.out.print("Introduce el stock inicial: ");
                        // Pequeño truco para que el stock también sea seguro
                        while (!sc.hasNextInt()) {
                            System.out.println("-> [ERROR] El stock debe ser un número entero.");
                            System.out.print("Introduce el stock inicial: ");
                            sc.next();
                        }
                        int st = sc.nextInt();
                        sc.nextLine(); // Limpiar buffer

                        // --- VALIDACIÓN ESTRICTA DE NOVEDAD ---
                        boolean nov = false;
                        boolean respuestaValida = false;

                        while (!respuestaValida) {
                            System.out.print("¿Es una novedad? (si/no): ");
                            // .trim() quita espacios, .toLowerCase() pasa todo a minúsculas
                            String respuesta = sc.nextLine().trim().toLowerCase();

                            if (respuesta.equals("si")) {
                                nov = true;
                                respuestaValida = true;
                            } else if (respuesta.equals("no")) {
                                nov = false;
                                respuestaValida = true;
                            } else {
                                // Si pone "SI ", " No", "Tal vez" o "123"...
                                System.out.println("-> [ERROR] Entrada no válida. Por favor, escribe exactamente 'si' o 'no'.");
                                System.out.println("[TRAZA] Se detectó entrada inválida: '" + respuesta + "'");
                            }
                        }

                        // Una vez t0do validado, añadimos al catálogo
                        vc.getCatalogo().add(new Pelicula(tit, gnr, st, nov));
                        System.out.println("[TRAZA] Película '" + tit + ", género: " + gnr + "' añadida correctamente.");
                        System.out.println("[TRAZA] Precio configurado automáticamente: " + (nov ? "5.0€" : "3.0€"));

                    } else {
                        System.out.println("-> [ERROR] Acceso denegado. Solo administradores.");
                    }
                    break;
                case 9: // Admin: LISTADO GLOBAL DE ALQUILERES
                    if (vc.getUsuarioLogueado() != null && vc.getUsuarioLogueado().esAdmin()) {
                        System.out.println("\n=== LISTADO GLOBAL DE ALQUILERES ACTIVOS ===");
                        boolean hayAlquileres = false;
                        for (Usuario user : vc.getListaUsuarios()) {
                            if (!user.getMisAlquileres().isEmpty()) {
                                hayAlquileres = true;
                                System.out.print("Usuario: " + user.getNombre() + " tiene -> ");
                                user.getMisAlquileres().forEach(a -> System.out.print("[" + a.getPelicula().getTitulo() + "] "));
                                System.out.println();
                            }
                        }
                        if (!hayAlquileres) System.out.println("No hay alquileres activos en el sistema.");
                    }
                    break;
                case 10: // Admin: Buscar por nombre
                    if (userLogueado != null && userLogueado.esAdmin()) {
                        System.out.print("Introduce el nombre del usuario a buscar: ");
                        String nombreBusqueda = sc.nextLine();

                        List<Alquiler> encontrados = vc.buscarAlquileresPorUsuario(nombreBusqueda);

                        if (encontrados == null) {
                            System.out.println("-> [ERROR] El usuario '" + nombreBusqueda + "' no existe.");
                        } else if (encontrados.isEmpty()) {
                            System.out.println("-> El usuario '" + nombreBusqueda + "' no tiene alquileres activos.");
                        } else {
                            System.out.println("--- Alquileres de " + nombreBusqueda + " ---");
                            encontrados.forEach(a -> System.out.println("- " + a.getPelicula().getTitulo() + " [" + a.getPrecio() + "€]"));
                        }
                    }
                    break;
            }
        }
    }
}