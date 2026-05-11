package PracticaEstructurasDatos.videoclub;

import java.util.ArrayList;
import java.util.List;

class Videoclub {
    private List<Pelicula> catalogo = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();
    private Usuario usuarioLogueado = null;

    public Videoclub() {
        usuarios.add(new Usuario("admin1", "123456", true));
        usuarios.add(new Usuario("admin2", "admin2", true));
        usuarios.add(new Usuario("admin3", "secreto", true));
        for(int i=1; i<=5; i++) usuarios.add(new Usuario("user"+i, "1234", false));
    }

    public void registrarUsuario(String nombre, String pass, boolean admin) {
        usuarios.add(new Usuario(nombre, pass, admin));
    }

    public void logout() {
        usuarioLogueado = null;
    }

    public void alquilar(String titulo) {
        for (Pelicula p : catalogo) {
            if (p.getTitulo().equalsIgnoreCase(titulo.trim()) && p.getStock() > 0) {
                p.reducirStock();
                Alquiler a = new Alquiler(p, p.getPrecio());
                if (usuarioLogueado != null) {
                    usuarioLogueado.agregarAlquiler(a);
                    System.out.println("¡Película alquilada correctamente por " + usuarioLogueado.getNombre() + "!");
                } else {
                    System.out.println("¡Película alquilada correctamente por usuario anónimo!");
                }
                return;
            }
        }
        System.out.println("-> [ERROR] Película no encontrada o sin stock.");
    }

    public void devolverPelicula(String titulo) {
        if (usuarioLogueado != null) {
            List<Alquiler> susAlquileres = usuarioLogueado.getMisAlquileres();
            // Usamos removeIf para que sea más moderno y limpio
            boolean borrado = susAlquileres.removeIf(a -> {
                if (a.getPelicula().getTitulo().equalsIgnoreCase(titulo.trim())) {
                    a.getPelicula().aumentarStock();
                    return true;
                }
                return false;
            });

            if (borrado) System.out.println("-> Devolución realizada con éxito.");
            else System.out.println("-> [ERROR] No tienes esa película.");
        } else {
            System.out.println("-> [ERROR] Debes estar identificado para devolver.");
        }
    }

    public void listarUsuarios() {
        System.out.println("\n=== LISTADO DE USUARIOS REGISTRADOS ===");
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario u = usuarios.get(i);
            System.out.println(i + ". " + (u.esAdmin() ? "[ADMIN]" : "[CLIENTE]") + " " + u.getNombre());
        }
    }

    public void seleccionarUsuarioPorIndice(int indice, String pass) {
        if (indice >= 0 && indice < usuarios.size()) {
            Usuario u = usuarios.get(indice);
            if (u.getContrasena().equals(pass)) {
                usuarioLogueado = u;
                System.out.println("[TRAZA] " + u.getNombre() + " ha iniciado sesión.");
            }
        }
    }

    public List<Alquiler> buscarAlquileresPorUsuario(String nombre) {
        for (Usuario u : usuarios) {
            // Usamos equalsIgnoreCase para que no importen las mayúsculas
            if (u.getNombre().equalsIgnoreCase(nombre.trim())) {
                return u.getMisAlquileres();
            }
        }
        return null; // Si no encuentra al usuario
    }

    public Usuario getUsuarioLogueado() { return usuarioLogueado; }
    public List<Pelicula> getCatalogo() { return catalogo; }
    public List<Usuario> getListaUsuarios() { return usuarios; }
}