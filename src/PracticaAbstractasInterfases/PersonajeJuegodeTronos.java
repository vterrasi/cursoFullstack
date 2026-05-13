package PracticaAbstractasInterfases;

public abstract class PersonajeJuegodeTronos {
    String nombre;
    Casa casa; // El personaje TIENE una casa (Agregación)

    public PersonajeJuegodeTronos(String nombre, Casa casa) {
        this.nombre = nombre;
        this.casa = casa;
    }

    // Mét0do común para todos los personajes
    public void presentarse() {
        System.out.println("Soy " + nombre + " de la Casa " + casa.nombre + ". ¡" + casa.lema + "!");
    }
}