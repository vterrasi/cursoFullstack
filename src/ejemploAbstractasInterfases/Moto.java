package ejemploAbstractasInterfases;

import EjemploHerencia.Person;

public class Moto extends VehiculoMotor implements Asegurable {

    public Moto(int numRuedas, Motor motor, Person conductor){
        this.numRuedas = numRuedas;
        this.motor = motor;
        this.conductor = conductor;
    }

    @Override
    public void asegurar() {
        System.out.println("Asegurando la moto");
    }
}
