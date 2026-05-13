package PracticaAbstractasInterfases.embutidos;

class Salchichon extends Embutido {
    public Salchichon() {
        super("Carne de cerdo, pimienta en grano y sal");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Salchichón: Se pica la carne fina y se deja curar al aire.");
    }
}
