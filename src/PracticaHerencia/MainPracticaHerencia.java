package PracticaHerencia;

public class MainPracticaHerencia {
    public static void main(String[] args) {
    System.out.println("En MainPracticaHerencia");
    // Creamos un helado de cada tipo
    Frigopie f = new Frigopie("Fresa");
    SandwichNata s = new SandwichNata("Nata y Galleta");
    Calippo c = new Calippo("Lima-Limón");

    // Mostramos los mensajes
    System.out.println(f.toString());
    System.out.println(s.toString());
    System.out.println(c.toString());

//----------------------------------------------------------------------------------------------------------------------
    System.out.println("\n");

    FanF1 fanf11 = new FanF1("Michael Schumacher", "Fórmula 1");
    FanF1 fanf12 = new FanF1("Ayrton Senna", "Fórmula 1");
    FanTenis fanTenis1 = new FanTenis("Venus Williams", "tenis");
    FanTenis fanTenis2 = new FanTenis("Serena Williams", "tenis");

    System.out.println(fanf11.toString());
    System.out.println(fanf12.toString());
    System.out.println(fanTenis1.toString());
    System.out.println(fanTenis2.toString());

//----------------------------------------------------------------------------------------------------------------------
    System.out.println("\n");
    Tostadora tostadora1 = new Tostadora(220, "Moulinex LT160", 2, true);
    Tostadora tostadora2 = new Tostadora(220, "Bosch tat3m121", 3, false);

    tostadora1.tostar(2);
    tostadora2.tostar(3);

    String[] funcionesHorno1 = {"deshidratar", "descongelar" , "recalentar", "gratinar"};
    String[] funcionesHorno2 = {"rostizadora", "deshidratar", "descongelar" , "recalentar", "gratinar"};

    Horno horno1 = new Horno(230, "Royal Catering RCCO-2.0", 2400, funcionesHorno1);
    Horno horno2 = new Horno(230, "Bake&Toast 4600 Black Gyro", 2000, funcionesHorno2);

    horno1.mostrar();
    horno2.mostrar();

//----------------------------------------------------------------------------------------------------------------------
    // Creamos un atacante
    Atacante jugador1 = new Atacante("Stephen Curry", "Warriors", Posicion.BASE);

    // Creamos un defensor
    Defensor jugador2 = new Defensor("Rudy Gobert", "Timberwolves", Posicion.PIVOT);

    // Acciones del Atacante
    System.out.println("\n--- JUGADOR 1 ---");
    jugador1.mostrarInformacion();
    jugador1.atacar();

    System.out.println("\n--- JUGADOR 2 ---");

    // Acciones del Defensor
    jugador2.mostrarInformacion();
    jugador2.defender();

//----------------------------------------------------------------------------------------------------------------------
// 1. Queso de cabra
        Queso quesoCabra = new Queso("Cabra", 45.0, "Sabor suave y cremoso.");
        System.out.println("\n--- Queso de Cabra ---");
        System.out.println("Nota de cata: " + quesoCabra.obtenerNotaDeCata());
        System.out.println("Índice de grasa (ICG): " + quesoCabra.obtenerICG() + " (" + quesoCabra.getPorcentajeGrasa() + "%)");
        System.out.println();

        // 2. Quesos de oveja (variedades)
        String[] tiposOveja = {"manchega", "churra", "castellana", "latxa", "merina"};

        for (String oveja : tiposOveja) {
            String matiz = AsistenteDeMatices.matizNotaDeCata(oveja);
            Queso quesoOveja = new Queso("Oveja - " + oveja, 36.0, matiz);

            System.out.println("--- Queso de Oveja (" + oveja.toUpperCase() + ") ---");
            System.out.println("Nota de cata: " + quesoOveja.obtenerNotaDeCata());
            System.out.println("Índice de grasa (ICG): " + quesoOveja.obtenerICG() + " (" + quesoOveja.getPorcentajeGrasa() + "%)");
            System.out.println();
        }

        // 3. Quesos de vaca (con diferentes tiempos de maduración)
        int[] diasVaca = {5, 20, 60, 120, 200};

        for (int dias : diasVaca) {
            QuesoDeVaca quesoVaca = new QuesoDeVaca(28.5, "Sabor tradicional de leche de vaca.", dias);
            System.out.println("--- Queso de Vaca (" + dias + " días de maduración) ---");
            System.out.println("Nota de cata: " + quesoVaca.obtenerNotaDeCata());
            System.out.println("Índice de grasa (ICG): " + quesoVaca.obtenerICG() + " (" + quesoVaca.getPorcentajeGrasa() + "%)");
            System.out.println();
        }

    //----------------------------------------------------------------------------------------------------------------------


    }
}
