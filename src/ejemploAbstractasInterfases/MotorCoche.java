package ejemploAbstractasInterfases;

public class MotorCoche extends Motor {
    public MotorCoche (int caballos, String marca) {
        this.caballos = caballos;
        this.marca = marca;
    }

    @Override
    public void arrancar() {
        System.out.println("Estoy arrancando el motor coche");
    }
}
