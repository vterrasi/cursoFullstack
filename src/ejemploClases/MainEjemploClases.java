package ejemploClases;

public class MainEjemploClases {
    public static void main(String[] args) {
        System.out.println("En MainEjemploClases");

        // 1. Ver el contador antes de empezar
        System.out.println(
                "Hay " + ejemploClases.NameDisplay.getDisplayCount() + " displays creados"
        );

        // 2. Crear el primer visor (instanciar la clase)
        ejemploClases.NameDisplay portrait1 = new ejemploClases.NameDisplay();
        System.out.println(
            "El nombre que está en el visor es: "
                + portrait1.getName()
        );

        // 3. Usar el SETTER para cambiar el nombre
        portrait1.setName("Juanito");

        // Usar un metodo de la clase
        portrait1.sayName();
        System.out.println(portrait1.getStatus());

        // 4. Crear el segundo visor
        ejemploClases.NameDisplay portrait2 = new ejemploClases.NameDisplay("Marta");

        portrait2.sayName();
        System.out.println(
                "El nombre que está en el visor es: "
                        + portrait2.getName()
        );

        System.out.println(
                "Hay " + ejemploClases.NameDisplay.getDisplayCount() + " displays creados"
        );

        System.out.println(
            "El nombre que está en el visor es: "
                + portrait2.getStatus()
        );
    }
}