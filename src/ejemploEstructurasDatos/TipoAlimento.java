package ejemploEstructurasDatos;

public enum TipoAlimento {
    VERDURA("Verdura"),
    CARNE ("Carne"),
    FRUTA("Fruta");

    private String nombre;

    TipoAlimento(String nombre){
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
