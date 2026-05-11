package PracticaEstructurasDatos.videoclub;

public class Alquiler {
    private Pelicula pelicula;
    private double precio;

    public Alquiler(Pelicula pelicula, double precio) {
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Pelicula getPelicula() { return pelicula; }
    public double getPrecio() { return precio; }
}