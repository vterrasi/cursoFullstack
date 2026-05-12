package ejemploAbstractasInterfases;

import EjemploHerencia.Person;

public class Coche extends VehiculoMotor implements Asegurable {

    public Coche(int numRuedas, Motor motor, Person conductor) {
        this.numRuedas = numRuedas;
        this.motor = motor;
        this.conductor = conductor;
    }

    @Override
    public void asegurar() {
        System.out.println("Asegurando el coche");
    }
}
