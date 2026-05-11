package PracticaEstructurasDatos.catalogadorpelis;

import java.util.ArrayList;
import java.util.List;

//Esta clase está hecha para mostrar cómo usar ArrayList

class CatalogadorPelis1 {
    private List<Pelicula> catalogo;

    public CatalogadorPelis1() {
        this.catalogo = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula p) {
        catalogo.add(p);
    }

    // Mostrar película por título
    public void mostrarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : catalogo) {
            if (p.getTitulo().equalsIgnoreCase(titulo)) {
                p.mostrarInformacion();
                return;
            }
        }
        System.out.println("No se encontró la película: " + titulo);
    }

    // Obtener películas por valoración
    public List<Pelicula> obtenerPorValoracionMinima(int minValoracion) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo) {
            if (p.getValoracion() >= minValoracion) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Obtener películas por actor
    public List<Pelicula> obtenerPorActor(String nombreActor) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo) {
            for (Actor a : p.getActores()) {
                if (a.getNombreCompleto().equalsIgnoreCase(nombreActor)) {
                    resultado.add(p);
                    break; // Salimos para no duplicar la película si el actor aparece dos veces
                }
            }
        }
        return resultado;
    }

// Obtener películas por director
    public List<Pelicula> obtenerPorDirector(String nombreCompleto) {
        List<Pelicula> resultado = new ArrayList<>();

        for (Pelicula p : catalogo) {
            // Comprobamos si el nombre del director coincide
            if (p.getDirector().getNombreCompleto().equalsIgnoreCase(nombreCompleto)) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Obtener películas por género
    public List<Pelicula> obtenerPorGenero(Genero genero) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo) {
            if (p.getGenero() == genero) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Resumen estadístico
    public void mostrarEstadisticas() {
        if (catalogo.isEmpty()) {
            System.out.println("El catálogo está vacío.");
            return;
        }

        Pelicula mayor = catalogo.get(0);
        Pelicula menor = catalogo.get(0);
        int sumaDuracion = 0;

        for (Pelicula p : catalogo) {
            if (p.getDuracion() > mayor.getDuracion()) {
                mayor = p;
            }
            if (p.getDuracion() < menor.getDuracion()) {
                menor = p;
            }
            sumaDuracion += p.getDuracion();
        }

        double media = (double) sumaDuracion / catalogo.size();

        System.out.println("--- Resumen Estadístico ---");
        System.out.println("Película de mayor duración: " + mayor.getTitulo() + " (" + mayor.getDuracion() + " min)");
        System.out.println("Película de menor duración: " + menor.getTitulo() + " (" + menor.getDuracion() + " min)");
        System.out.println("Media aritmética de duración: " + media + " min");
    }
}