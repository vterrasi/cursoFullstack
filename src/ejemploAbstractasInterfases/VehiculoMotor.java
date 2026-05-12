package ejemploAbstractasInterfases;

import EjemploHerencia.Person;

public abstract class VehiculoMotor extends Vehiculo {
    protected Motor motor;
    protected Person conductor;

    public void arrancar() {
        System.out.println("Inicio proceso arranque vehículo motor");
        this.motor.arrancar();
        System.out.println("Fin proceso arranque vehículo motor");
    }
    @Override
    public String toString() {
        return "El vehículo tiene " + this.numRuedas + " ruedas"
                + " motor " + this.motor
                + " y lo conduce " + this.conductor.getName();
    }
}
