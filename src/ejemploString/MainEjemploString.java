package ejemploString;

import java.util.Locale;

public class MainEjemploString {
    static void main() {
        System.out.println("En MainEjemploString");

        String name = "Kirena";
        System.out.println("Mi nombre es " + name);


        String newName = name.substring(1);
        System.out.println("Mi nuevo nombre es " + newName);
        System.out.println("y mi nombre sigue siendo " + name);

        System.out.println("\nMi nombre tiene " + name.length() + " caracteres");

        String tests = "Esto es una prueba           ";

        System.out.println("La primera e está en la posición " + tests.indexOf('e'));

        System.out.println("La cadena sin espacios delante ni detrás es: " + tests.trim());

        System.out.println("La cadena en mayúsculas es: " + tests.toUpperCase());
        System.out.println("La cadena en mayúsculas es: " + tests.toLowerCase());

        System.out.println("La cuarta letra de la cadena " + tests.charAt(3));

        System.out.println("La cadena con aes en vez de es es: " + tests.replace("E", "A"));

        System.out.println(tests);
        int x = Integer.parseInt("3");
        System.out.println(x);
        //int y = Integer.parseInt("a");

        String testNull = null;
        //System.out.println("testNull tiene " + testNull.length() + " caracteres");

        int y = 0;
        int ternaryTest;

        if ( y <= 0){
           ternaryTest = 0;
        } else {
            ternaryTest = 1;
        }

        System.out.println("ternaryTest vale " + ternaryTest);

        ternaryTest = y <= 0 ? 0 : 1;
        System.out.println("ternaryTest vale " + ternaryTest);
        System.out.println(y <= 0 ? 0 : 1);
    }
}
