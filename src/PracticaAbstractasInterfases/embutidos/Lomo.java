package PracticaAbstractasInterfases.embutidos;

class Lomo extends Embutido {
    public Lomo() {
        super("Cinta de lomo de cerdo y especias");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Lomo: Se adoba la pieza entera y se embucha para su curación.");
    }
}