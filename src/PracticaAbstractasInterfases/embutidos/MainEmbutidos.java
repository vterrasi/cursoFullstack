package PracticaAbstractasInterfases.embutidos;

public class MainEmbutidos {
    public static void main(String[] args) {
        Embutido miSalchichon = new Salchichon();
        Embutido miChorizo = new Chorizo();
        Embutido miLomo = new Lomo();

        // Mostramos la preparación de cada uno
        miSalchichon.preparar();
        miChorizo.preparar();
        miLomo.preparar();

        System.out.println("\n");
    }
}
