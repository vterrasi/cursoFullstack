package PracticaAbstractasInterfases;

abstract class Embutido {
    String ingredientes;

   public Embutido(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public abstract void preparar();
}