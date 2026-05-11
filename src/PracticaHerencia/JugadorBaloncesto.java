package PracticaHerencia;

enum Posicion {
    BASE, ESCOLTA, ALERO, ALA_PIVOT, PIVOT
}
// Clase general para todos los jugadores
abstract class JugadorBaloncesto {
    protected String nombre;
    protected String equipo;
    protected Posicion posicion;

    public JugadorBaloncesto(String nombre, String equipo, Posicion posicion) {
        this.nombre = nombre;
        this.equipo = equipo;
        this.posicion = posicion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " | Equipo: " + equipo + " | Posición: " + posicion);
    }
}

// Clase para el jugador que ataca
class Atacante extends JugadorBaloncesto {
    public Atacante(String nombre, String equipo, Posicion posicion) {
        super(nombre, equipo, posicion);
    }

    public void atacar() {
        System.out.println(nombre + " está realizando funciones de ataque:");
        System.out.println("- Dribbling, Pase, Tiro, Movimiento sin balón, Rebote ofensivo.");
    }
}

// Clase para el jugador que defiende
class Defensor extends JugadorBaloncesto {
    public Defensor(String nombre, String equipo, Posicion posicion) {
        super(nombre, equipo, posicion);
    }

    public void defender() {
        System.out.println(nombre + " está realizando funciones de defensa:");
        System.out.println("- Postura defensiva, Marcaje, Presión, Defensa de lado débil/fuerte, Rebote defensivo.");
    }
}