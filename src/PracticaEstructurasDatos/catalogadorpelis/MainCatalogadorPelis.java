package PracticaEstructurasDatos.catalogadorpelis;

import java.util.List;

public class MainCatalogadorPelis {
    public static void main(String[] args) {
        // 1. Creamos el catalogador (puedes usar el CatalogadorPelis o CatalogadorPelisMapa)
        CatalogadorPelis1 catalogo = new CatalogadorPelis1();

        // Cambiar esta línea:
        // CatalogadorPelis1 catalogo = new CatalogadorPelis1();

        // Por esta otra, para usar la opcion2:
        //CatalogadorPelis2 catalogo = new CatalogadorPelis2();
        
        // 2. Creamos algunos directores y actores
        Director director1 = new Director("Christopher Nolan", 11);
        Director director2 = new Director("Quentin Tarantino", 10);
        Director director3 = new Director("Lana Wachowski", 7);

        Actor actor1 = new Actor("Leonardo DiCaprio", Genero.MISTERIO);
        Actor actor2 = new Actor("Uma Thurman", Genero.ACCION);
        Actor actor3 = new Actor("Keanu Reeves", Genero.CIENCIA_FICCION);
        Actor actor4 = new Actor("Matthew McConaughey", Genero.CIENCIA_FICCION);

        // 3. Creamos películas
        Pelicula p1 = new Pelicula("Inception", 9, Genero.CIENCIA_FICCION, 148, director1);
        p1.agregarActor(actor1);

        Pelicula p2 = new Pelicula("Kill Bill", 8, Genero.ACCION, 111, director2);
        p2.agregarActor(actor2);

        Pelicula p3 = new Pelicula("Matrix", 9, Genero.CIENCIA_FICCION, 120, director3);
        p3.agregarActor(actor3);

        Pelicula p4 = new Pelicula("Titanic", 9, Genero.ROMANTICA, 90, director1);
        p4.agregarActor(actor1);

        Pelicula p5 = new Pelicula("Interstellar", 9, Genero.CIENCIA_FICCION, 180, director1);
        p5.agregarActor(actor4);


        // 4. Añadimos las películas al catálogo
        catalogo.agregarPelicula(p1);
        catalogo.agregarPelicula(p2);
        catalogo.agregarPelicula(p3);
        catalogo.agregarPelicula(p4);
        catalogo.agregarPelicula(p5);

        // --- Probamos las funciones ---

        // A. Mostrar información de una película por su título
        System.out.println("\n\n=== Buscar Película por Título ===");
        catalogo.mostrarPeliculaPorTitulo("Inception");
        System.out.println();

        // B. Obtener películas con valoración igual o superior (por ejemplo, 8 o más)
        System.out.println("=== Películas con valoración >= 8 ===");
        List<Pelicula> valoradas = catalogo.obtenerPorValoracionMinima(8);
        for (Pelicula p : valoradas) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println();

        // C. Obtener películas en las que participa un actor determinado
        System.out.println("=== Películas de Leonardo DiCaprio ===");
        List<Pelicula> peliculasActor1 = catalogo.obtenerPorActor("Leonardo DiCaprio");
        for (Pelicula p : peliculasActor1) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println();

        System.out.println("=== Películas de Keanu Reeves ===");
        List<Pelicula> peliculasActor2 = catalogo.obtenerPorActor("Keanu Reeves");
        for (Pelicula p : peliculasActor2) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println();

        // D. Obtener películas de un género determinado (ejemplo: Acción)
        System.out.println("=== Películas de género: Acción ===");
        List<Pelicula> peliculasAccion = catalogo.obtenerPorGenero(Genero.ACCION);
        for (Pelicula p : peliculasAccion) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println();

        // E. Obtener películas de un director determinado
        System.out.println("=== Películas de Christopher Nolan ===");
        List<Pelicula> peliculasDirector1 = catalogo.obtenerPorDirector("Christopher Nolan");
        for (Pelicula p : peliculasDirector1) {
            System.out.println("- " + p.getTitulo());
        }
        System.out.println();

        // F. Mostrar resumen estadístico
        catalogo.mostrarEstadisticas();
    }
}