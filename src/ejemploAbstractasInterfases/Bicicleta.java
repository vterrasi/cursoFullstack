package ejemploAbstractasInterfases;

public class Bicicleta extends Vehiculo implements Asegurable {

    @Override
    public void asegurar() {
        System.out.println("Asegurando la bicicleta");
    }
}
