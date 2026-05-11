package PracticaEstructurasDatos.catalogadorpelis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// Esta clase está hecha para mostrar cómo usar los HashMap
public class CatalogadorPelis2 {
    // Usamos el título de la película como clave para encontrarla al instante
    private Map<String, Pelicula> catalogo;

    public CatalogadorPelis2() {
        this.catalogo = new HashMap<>();
    }

    public void agregarPelicula(Pelicula p) {
        // Guardamos la película usando su título en minúsculas para evitar problemas al buscar
        catalogo.put(p.getTitulo().toLowerCase(), p);
    }

    // Mostrar película por título
    public void mostrarPeliculaPorTitulo(String titulo) {
        Pelicula p = catalogo.get(titulo.toLowerCase());
        if (p != null) {
            p.mostrarInformacion();
        } else {
            System.out.println("No se encontró la película: " + titulo);
        }
    }

    // Obtener películas por valoración
    public List<Pelicula> obtenerPorValoracionMinima(int minValoracion) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo.values()) {
            if (p.getValoracion() >= minValoracion) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Obtener películas por actor
    public List<Pelicula> obtenerPorActor(String nombreActor) {
        List<Pelicula> resultado = new ArrayList<>();
        for (Pelicula p : catalogo.values()) {
            for (Actor a : p.getActores()) {
                if (a.getNombreCompleto().equalsIgnoreCase(nombreActor)) {
                    resultado.add(p);
                    break;
                }
            }
        }
        return resultado;
    }

    // Obtener películas por director
    public List<Pelicula> obtenerPorDirector(String nombreCompleto) {
        List<Pelicula> resultado = new ArrayList<>();

        for (Pelicula p : catalogo.values()) {
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
        for (Pelicula p : catalogo.values()) {
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

        // Convertimos los valores del mapa en una lista para hacer el cálculo
        List<Pelicula> peliculas = new ArrayList<>(catalogo.values());

        Pelicula mayor = peliculas.get(0);
        Pelicula menor = peliculas.get(0);
        int sumaDuracion = 0;

        for (Pelicula p : peliculas) {
            if (p.getDuracion() > mayor.getDuracion()) {
                mayor = p;
            }
            if (p.getDuracion() < menor.getDuracion()) {
                menor = p;
            }
            sumaDuracion += p.getDuracion();
        }

        double media = (double) sumaDuracion / peliculas.size();

        System.out.println("--- Resumen Estadístico ---");
        System.out.println("Película de mayor duración: " + mayor.getTitulo() + " (" + mayor.getDuracion() + " min)");
        System.out.println("Película de menor duración: " + menor.getTitulo() + " (" + menor.getDuracion() + " min)");
        System.out.println("Media aritmética de duración: " + media + " min");
    }
}