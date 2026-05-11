package PracticaEstructurasDatos.videoclub;

class Pelicula {
    private String titulo;
    private String genero;
    private int stock;
    private boolean esNovedad;

    public Pelicula(String titulo, String genero, int stock, boolean esNovedad) {
        this.titulo = titulo;
        this.genero = genero;
        this.stock = stock;
        this.esNovedad = esNovedad;
    }

    public String getTitulo() { return titulo; }
    public String getGenero() { return genero; }

    public int getStock() { return stock; }

    public boolean esNovedad() { return esNovedad; }
    public void reducirStock() { stock--; }
    public void aumentarStock() { stock++; }
    public double getPrecio() { return esNovedad ? 5.0 : 3.0; }
}