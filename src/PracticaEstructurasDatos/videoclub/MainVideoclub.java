package PracticaEstructurasDatos.videoclub;
import java.util.Scanner;
import java.util.List;

public class MainVideoclub {
    public static void main(String[] args) {
        Videoclub vc = new Videoclub();
        Scanner sc = new Scanner(System.in);
        inicializarDatos(vc);

        while (true) {
            Usuario userLogueado = vc.getUsuarioLogueado();
            mostrarMenu(userLogueado);

            if (!sc.hasNextInt()) {
                System.out.println("-> [ERROR] ¡Eso no es un número!");
                sc.next();
                sc.nextLine();
                continue;
            }

            int op = sc.nextInt();
            sc.nextLine();
            if (op == 0) {
                salirSistema(userLogueado);
                break;
            }

            // --- EL SWITCH LIMPIO Y ESTÉTICO ---
            switch (op) {
                case 1: mostrarCatalogo(vc); break;
                case 2: procesoAlquiler(vc, sc); break;
                case 3: crearNuevoUsuario(vc, sc); break;
                case 4: procesoLogin(vc, sc); break;
                case 5: vc.logout(); break;
                case 6: verMisAlquileres(userLogueado); break;
                case 7: procesoDevolucion(vc, sc); break;
                case 8: adminAnadirPelicula(vc, sc); break;
                case 9: adminListadoGlobal(vc); break;
                case 10: adminBuscarPorNombre(vc, sc); break;
                default: System.out.println("Opción no válida.");
            }
        }
    }

    // --- MÉTODOS ESTÁTICOS (LA MAGIA DE LA REFACTORIZACIÓN) ---

    public static void mostrarCatalogo(Videoclub vc) {
        System.out.println("\n--- CATÁLOGO ---");
        vc.getCatalogo().forEach(p ->
                System.out.println(p.getTitulo() + " | " + p.getGenero() + " | Stock: " + p.getStock() + " | " + (p.esNovedad() ? "5€" : "3€"))
        );
    }

    public static void procesoLogin(Videoclub vc, Scanner sc) {
        vc.listarUsuarios();
        System.out.print("Elige el número de usuario: ");
        if (sc.hasNextInt()) {
            int idx = sc.nextInt();
            sc.nextLine();
            if (idx >= 0 && idx < vc.getListaUsuarios().size()) {
                System.out.print("Contraseña: ");
                String pass = sc.nextLine();
                vc.seleccionarUsuarioPorIndice(idx, pass);
            }
        } else {
            sc.next();
            sc.nextLine();
        }
    }

    public static void procesoAlquiler(Videoclub vc, Scanner sc) {
        System.out.print("Título de la película: ");
        vc.alquilar(sc.nextLine());
    }

    public static void crearNuevoUsuario(Videoclub vc, Scanner sc) {
        System.out.print("Usuario: ");
        String n = sc.nextLine();
        System.out.print("Contraseña: ");
        String p = sc.nextLine();
        vc.registrarUsuario(n, p, false);
    }

    public static void adminAnadirPelicula(Videoclub vc, Scanner sc) {
        if (vc.getUsuarioLogueado() != null && vc.getUsuarioLogueado().esAdmin()) {
            System.out.print("Título: ");
            String t = sc.nextLine();
            System.out.print("Género: ");
            String g = sc.nextLine();
            System.out.print("Stock: ");
            int s = sc.nextInt();
            sc.nextLine();
            System.out.print("¿Es novedad? (si/no): ");
            boolean n = sc.nextLine().trim().equalsIgnoreCase("si");
            vc.getCatalogo().add(new Pelicula(t, g, s, n));
        }
    }

    public static void verMisAlquileres(Usuario userLogueado) {
        if (userLogueado != null) {
            System.out.println("--- ALQUILERES ACTIVOS ---");
            userLogueado.getMisAlquileres().forEach(a ->
                    System.out.println("- " + a.getPelicula().getTitulo())
            );
        }
    }

    public static void procesoDevolucion(Videoclub vc, Scanner sc) {
        System.out.print("Película a devolver: ");
        vc.devolverPelicula(sc.nextLine());
    }

    public static void adminListadoGlobal(Videoclub vc) {
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
    }

    public static void adminBuscarPorNombre(Videoclub vc, Scanner sc) {
        Usuario admin = vc.getUsuarioLogueado();
        if (admin != null && admin.esAdmin()) {
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
    }

    private static void inicializarDatos(Videoclub vc) {
        vc.getCatalogo().add(new Pelicula("Matrix", "SciFi", 5, false));
        vc.getCatalogo().add(new Pelicula("Shrek", "Animación", 2, false));
        vc.getCatalogo().add(new Pelicula("Interstellar", "SciFi", 6, true));
        vc.getCatalogo().add(new Pelicula("Todo a la vez en todas partes", "Drama, Comedia", 3, true));
        vc.getCatalogo().add(new Pelicula("Forrest Gump","Drama, Comedia", 5, false));
        vc.getCatalogo().add(new Pelicula("Constantine", "Acción", 4, false));

    }

    private static void mostrarMenu(Usuario u) {
        System.out.println("\n--- VIDEOCLUB (" + (u == null ? "Anónimo" : u.getNombre()) + ") ---");
        System.out.println("1. Ver catálogo | 2. Alquilar | 3. Registrar | 4. Login | 5. Logout");
        if (u != null && !u.getMisAlquileres().isEmpty()) System.out.println("6. Ver mis alquileres | 7. Devolver");
        if (u != null && u.esAdmin()) System.out.println("[ADMIN] 8. Añadir Peli | 9. Listado Global | 10. Buscar por User");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    private static void salirSistema(Usuario u) {
        System.out.println("¡Hasta pronto" + (u != null ? ", " + u.getNombre() : "") + "! ✨🎥");
    }
}