package ejemploAbstractasInterfases;

public class GestorSeguro {

    public void asegurar(Asegurable vehiculo) {
        System.out.println("Iniciando proceso de asegurar");
        vehiculo.asegurar();
        System.out.println("Fin proceso de asegurar");
    }
}
