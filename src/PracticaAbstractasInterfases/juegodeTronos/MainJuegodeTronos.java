package PracticaAbstractasInterfases.juegodeTronos;

public class MainJuegodeTronos {
    public static void main(String[] args) {

    // 1. Creamos las casas (existen independientemente)
    Casa casaStark = new Casa("Stark", "❄️ Winter is coming ❄️");
    Casa casaLannister = new Casa("Lannister", "💰 A Lannister always pays his debts 💰");

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
    }
}
