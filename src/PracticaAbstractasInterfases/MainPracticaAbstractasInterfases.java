package PracticaAbstractasInterfases;

public class MainPracticaAbstractasInterfases {
    public static void main(String[] args) {
        // Creamos los objetos
        Embutido miSalchichon = new Salchichon();
        Embutido miChorizo = new Chorizo();
        Embutido miLomo = new Lomo();

        // Mostramos la preparación de cada uno
        miSalchichon.preparar();
        miChorizo.preparar();
        miLomo.preparar();
    }
}