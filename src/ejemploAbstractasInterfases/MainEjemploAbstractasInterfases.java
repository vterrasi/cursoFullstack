package ejemploAbstractasInterfases;

import EjemploHerencia.Person;

public class MainEjemploAbstractasInterfases {
     static void main() {
        System.out.println("En MainEjemploAbstractasInterfases");

        GestorSeguro gestorSeguro = new GestorSeguro();

        Patinete patinete = new Patinete();
        Bicicleta bicicleta = new Bicicleta();
        gestorSeguro.asegurar(bicicleta);

        Person person = new Person(
                "Kirena",
                "Racer"
        );

        Motor motorMoto = new MotorMoto(
            120,
            "Suzuki"
        );

        Moto moto = new Moto(
                2,
                motorMoto,
                person
        );
        moto.arrancar();
        System.out.println(moto);
        gestorSeguro.asegurar(moto);

        Motor motorCoche = new MotorCoche(
                220,
                "Toyota"
        );

        Coche coche = new Coche(
                4
                , motorCoche
                , person
        );
        coche.arrancar();
        System.out.println(coche);
        gestorSeguro.asegurar(coche);
    }
}
