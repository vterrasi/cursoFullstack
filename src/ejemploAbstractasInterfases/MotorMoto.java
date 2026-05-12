package ejemploAbstractasInterfases;

public class MotorMoto extends Motor {

    public MotorMoto (int caballos, String marca) {
        this.caballos = caballos;
        this.marca = marca;
    }

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando el motor moto");
    }

}
