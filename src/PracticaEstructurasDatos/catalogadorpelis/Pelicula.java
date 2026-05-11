package PracticaEstructurasDatos.catalogadorpelis;

import java.util.ArrayList;
import java.util.List;

class Director {
    private String nombreCompleto;
    private int peliculasDirigidas;

    public Director(String nombreCompleto, int peliculasDirigidas) {
        this.nombreCompleto = nombreCompleto;
        this.peliculasDirigidas = peliculasDirigidas;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (Películas dirigidas: " + peliculasDirigidas + ")";
    }
}

public class Pelicula {
    private String titulo;
    private int valoracion; // Del 1 al 10
    private Genero genero;
    private int duracion; // En minutos
    private Director director;
    private List<Actor> actores;

    public Pelicula(String titulo, int valoracion, Genero genero, int duracion, Director director) {
        this.titulo = titulo;
        this.valoracion = valoracion;
        this.genero = genero;
        this.duracion = duracion;
        this.director = director;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getValoracion() {
        return valoracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public Director getDirector() {
        return director;
    }

    public List<Actor> getActores() {
        return actores;
    }

    public void mostrarInformacion() {
        System.out.println("--- " + titulo + " ---");
        System.out.println("Género: " + genero);
        System.out.println("Duración: " + duracion + " min");
        System.out.println("Valoración: " + valoracion + "/10");
        System.out.println("Director: " + director);
        System.out.println("Actores:");
        for (Actor a : actores) {
            System.out.println("  - " + a);
        }
    }
}