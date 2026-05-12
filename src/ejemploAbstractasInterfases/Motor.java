package ejemploAbstractasInterfases;

public abstract class Motor {
    protected int caballos;
    protected String marca;

    public void arrancar() {
        System.out.println("Este es el arrancar genérico");
    }

    @Override
    public String toString() {
        return this.marca + " de " + this.caballos;
    }
}
