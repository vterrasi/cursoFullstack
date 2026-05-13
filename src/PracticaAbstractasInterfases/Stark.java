package PracticaAbstractasInterfases;

class Stark extends PersonajeJuegodeTronos {
    // Al ser Stark, el constructor ya sabe que la casa es Stark
    public Stark(String nombre, Casa casaStark) {
        super(nombre, casaStark);
    }
}
