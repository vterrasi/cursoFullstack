package PracticaAbstractasInterfases;

public class MainPracticaAbstractasInterfases {
    public static void main(String[] args) {
        System.out.println("En MainPracticaClasesAbstractas\n");

        Embutido miSalchichon = new Salchichon();
        Embutido miChorizo = new Chorizo();
        Embutido miLomo = new Lomo();

        // Mostramos la preparación de cada uno
        miSalchichon.preparar();
        miChorizo.preparar();
        miLomo.preparar();

        System.out.println("\n");
//--------------------------------------------------------------------

        // 1. Creamos las casas (existen independientemente)
        Casa casaStark = new Casa("Stark", "Winter is coming");
        Casa casaLannister = new Casa("Lannister", "A Lannister always pays his debts");

        // 2. Creamos los personajes específicos
        Stark ned = new Stark("Ned", casaStark);
        Stark sansa = new Stark("Sansa", casaStark);

        Lannister tyrion = new Lannister("Tyrion", casaLannister);
        Lannister jamie = new Lannister("Jamie", casaLannister);

        // 3. Hacemos que se presenten
        ned.presentarse();
        sansa.presentarse();
        tyrion.presentarse();
        jamie.presentarse();

//--------------------------------------------------------------------

    }
}
