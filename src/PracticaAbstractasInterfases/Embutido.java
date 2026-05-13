package PracticaAbstractasInterfases;

abstract class Embutido {
    String ingredientes;
    public Embutido(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    //Mét0do abstracto puro
    public abstract void preparar();
}