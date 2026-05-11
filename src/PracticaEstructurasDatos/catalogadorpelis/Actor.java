package PracticaEstructurasDatos.catalogadorpelis;

public class Actor {
    private String nombreCompleto;
    private Genero generoDestacado;

    public Actor(String nombreCompleto, Genero generoDestacado) {
        this.nombreCompleto = nombreCompleto;
        this.generoDestacado = generoDestacado;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String toString() {
        return nombreCompleto + " (Especialidad: " + generoDestacado + ")";
    }
}
