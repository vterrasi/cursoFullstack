package PracticaAbstractasInterfases;

class Chorizo extends Embutido {
    public Chorizo() {
        super("Carne de cerdo, pimentón y ajo");
    }

    @Override
    public void preparar() {
        System.out.println("Preparando Chorizo: Se mezcla con pimentón y se embuten en tripa natural.");
    }
}

