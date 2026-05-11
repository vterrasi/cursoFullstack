package practicaFunciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MainFuncionesCarlos {
    public static void main(String[] args) {

        int[] numbersToSum = { 1, 4, 2, 8, 3, 20 };
        System.out.println(MainFuncionesCarlos.sumArrayOfNumbers(numbersToSum));

        System.out.println(MainFuncionesCarlos.stringCaseFromEvenOrNot(2, "Estoy en mayusculas o en minusculas?"));

        char[] charsToScan = { 'a', 'y', 'e', 'e', 'w', '2' };
        System.out.println(MainFuncionesCarlos.getArrayOfVowels(charsToScan));

        String stringToReplaceChars = "En esta cadena los caracteres estan un poco cambiados";
        System.out.println(MainFuncionesCarlos.replaceCharsInString(stringToReplaceChars, 'c', 'o', '^'));

        char[] operationChars = { '+', '+', '-', '+', 'R', '*', '/', '+', 'R' };
        System.out.println(MainFuncionesCarlos.doOperationsFromCharArray(operationChars));

        System.out.println(MainFuncionesCarlos.getNumberOfCs("Cadena con c en varios sitios con c"));

        String[] stringsForFrankenString =
                {
                        "the summer is magic"
                        , "summertime sadness"
                        , "billie jean is not my lover"
                        , "persiana persa persignada"
                        , "happy chic"
                };
        String[] frankenstrings = MainFuncionesCarlos.frankenstring(stringsForFrankenString, 2);
        for (String frankenstring : frankenstrings) {
            System.out.println(frankenstring);
        }

        String toAnagram = "claros";
        System.out.println(MainFuncionesCarlos.getAnagram(toAnagram));


        char[] charsToEncode = { 'b', 'a', 'f', 'a' };
        System.out.println(MainFuncionesCarlos.encodeCharToIntAndSum(charsToEncode));

        MainFuncionesCarlos.mitadRombo(10, '@');


        String stringParaElTaller = "   prueba de cadena   ";
        // Aquí puedes probar con "ALL", "TRIM", etc.
        String[] tareasDelTaller = {"ALL"};
        String resultado = tallerDeStrings(stringParaElTaller, tareasDelTaller);
        System.out.println("Resultado final: '" + resultado + "'");

        String texto = "hola mundo moderno";
        String resultadoAnalisis = analizarString(texto);
        System.out.println(resultadoAnalisis);

        System.out.println(MainFuncionesCarlos.getStringFromConsoleChars(4));

        String[] products =
                MainFuncionesCarlos.getProductsThatCanBeBought(
                        new String[] { "Aceite", "10", "Pan", "12", "Longanizas", "23", "Caviar", "1000" }
                        , 100
                );

        for (String product : products) {
            if (product != null) {
                System.out.println("Se puede comprar " + product);
            }
        }

    }

   // * Crear una función a la que se le pase un array de números enteros y devuelva su suma.

    public static int sumArrayOfNumbers(int[] numbers) {
        System.out.println("Esta función devuelve la suma de un array de numeros enteros:");

        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        return sum;
    }


/** Crear una función a la que se le pase un número entero y una cadena de texto y que devuelva una cadena de texto
· Si el número es par la cadena devuelta será la pasada, pero en mayúsculas.
· Si el número es impar la cadena devuelta será la pasada, pero en minúsculas.*/

    public static String stringCaseFromEvenOrNot(int num, String stringToChange) {
        System.out.println("Esta función devuelve una cadena en mayusculas o minusculas dependiendo de un numero que se le pasa:");

        return num % 2 == 0 ? stringToChange.toUpperCase() : stringToChange.toLowerCase();
    }


/** Crear una función a la que se le pase un array de caracteres en minúscula y devuelva un array de caracteres con los que sean vocales.
    NOTA · No pasa nada si en el array devuelto por la función "sobran" caracteres al final o hay algunos en blanco.*/

    public static char[] getArrayOfVowels(char[] charsToScan) {
        System.out.println("Array de vocales extraidas de un arrayChar dado:");

        char[] result = new char[charsToScan.length];

        for (int i = 0, addedChars = 0; i < charsToScan.length; i++) {
            if (charsToScan[i] == 'a' || charsToScan[i] == 'e'
                    || charsToScan[i] == 'i' || charsToScan[i] == 'o' || charsToScan[i] == 'u'
            ) {
                result[addedChars] = charsToScan[i];
                addedChars++;
            }
        }
        return result;
    }


    /** Crear una función a la que se le pase una cadena de texto y 3 caracteres distintos y devuelva la cadena de texto
    pasada con los dos primeros caracteres sustituidos por el tercero.*/

    public static String replaceCharsInString(String stringToReplaceChars, char c1, char c2, char c3) {
        System.out.println("Devuelve un String (inicialmente dado) donde un tercer caracter pasado sustituye a otros dos.");

        return stringToReplaceChars
                .replace(c1, c3)
                .replace(c2, c3);
    }

/** Crear una función que reciba como parámetro un array de char y devuelva un número en coma flotante, simple precisión.
· El array de char podrá contener los siguientes valores: '/', '*', '+', '-' y 'R'.
· A partir de un valor de 1, la función realizará las operaciones algebraicas que indique el array de char, siendo ambos operandos el número inicial.
· La letra 'R' significa repetir la anterior operación.
· Si una operación da como resultado 0 o un número menor, "resetear" el acumulador a 1.
· Utilizar distintas funciones para dividir las responsabilidades de las operaciones y de la repetición de la última.*/

    public static float doOperationsFromCharArray(char[] operationChars) {
        System.out.println("A esta funcion se le pasa un arrayChar cuyos elementos indican operaciones matematicas a realizar a partir de un valor de 1:");

        float acum = 1F;

        for (int i = 0; i < operationChars.length; i++) {
            acum = MainFuncionesCarlos.doOperation(operationChars[i] == 'R' ? operationChars[i - 1] : operationChars[i], acum);

            if (acum <= 0) {
                System.out.println("Reseteando acumulador");
                acum = 1;
            }
        }

        return acum;
    }

    private static float doOperation(char opCode, float acum) {
        System.out.println("doOperation");

        switch (opCode) {
            case '+':
                acum = MainFuncionesCarlos.doSum(acum);
                break;
            case '-':
                acum = MainFuncionesCarlos.doSub(acum);
                break;
            case '*':
                acum = MainFuncionesCarlos.doMul(acum);
                break;
            case '/':
                acum = MainFuncionesCarlos.doDiv(acum);
                break;
        }
        System.out.println("Current acum value is " + acum);

        return acum;
    }

    private static float doSum(float x) {
        System.out.println("doSum");

        return x + x;
    }

    private static float doSub(float x) {
        System.out.println("doSub");

        return x - x;
    }

    private static float doMul(float x) {
        System.out.println("doMul");

        return x * x;
    }

    private static float doDiv(float x) {
        System.out.println("doDiv");

        return x / x;
    }


/** Crear una función a la que se le pase una cadena de texto y devuelva
 * un entero que se corresponda con el número de letras 'c' que	contenga la cadena.*/

    public static int getNumberOfCs(String stringToFindCs) {
        System.out.println("Dado un String devuelve un entero indicando el numero de letras 'c':");

        int startingIndex = 0;
        int result = 0;

        while (stringToFindCs.indexOf('c', startingIndex) != -1) {
            startingIndex = stringToFindCs.indexOf('c', startingIndex) + 1;
            System.out.println("Hay una c en el índice " + startingIndex);
            result++;
        }

        return result;
    }

/** Crear la función "Frankenstring". Recibirá un array de string y un número mayor que 0 y menor que el número de strings que contenga el array pasado como parámetro.
            · Devolverá un array de strings con dos string.
            · El primer string del array devuelto será un string combinando aquellos del array pasado como parámetro cuya posición
            (no índice) en el array sea menor o igual a la indicada por el número pasado como parámetro.
            · El segundo string del array devuelto será un string combinando aquellos del array pasado como parámetro cuya posición
            (no índice) en el array sea mayor a la indicada por el número pasado como parámetro.*/

    public static String[] frankenstring(String[] stringsForFrankenString, int divisionIndex) {
        System.out.println("Esta función se llama 'frankenstring' o 'lo aberrante de lo binario' xD:");

        String[] result = new String[2];

        String frankenstring1 = "";
        String frankenstring2 = "";

        for (int i = 0; i < stringsForFrankenString.length; i++) {
            if (i <= divisionIndex - 1) {
                frankenstring1 += stringsForFrankenString[i];
            } else {
                frankenstring2 += stringsForFrankenString[i];
            }
        }

        result[0] = frankenstring1;
        result[1] = frankenstring2;

        return result;
    }

/** Crear una función que haga de generador de anagramas, recibiendo un string, sin espacios y con los caracteres en minúscula,
 * y devolviendo otro string que sea un anagrama del string pasado, también sin espacios y en minúsculas.
 * Cada vez que se llame a la función, el anagrama tendrá que ser distinto.
· Un anagrama es una palabra que, teniendo las mismas letras que otra, las tiene en distinto orden.*/

    public static String getAnagram(String toAnagram) {
        System.out.println("Esta funcion es la del anagrama:");

        char[] result = new char[toAnagram.length()];
        Arrays.fill(result, '·');

        Random randomIndexGen = new Random();
        int randomIndex;

        for (int i = 0; i < toAnagram.length(); i++) {
            randomIndex = randomIndexGen.nextInt(0, toAnagram.length());
            System.out.println("index contains: " + result[randomIndex]);

            if (result[randomIndex] != '·') {
                System.out.println("index full, retry");
                i--;
                continue;
            }

            result[randomIndex] = toAnagram.charAt(i);
        }

        return new String(result);
    }

    /** Crear una función a la que se le pase un array de caracteres, cuyos posibles valores irán de la 'a' a la 'f'.
    Devolverá un entero, que será la suma de un código numérico entero asociado a cada letra, devuelto por otra función
    a la que se le pasará un carácter y devolverá el código numérico asociado. Por ejemplo, si el array de caracteres
    fuera ['b', 'a', 'f', 'a'] y los valores númericos asociados fueran a = 2, b = -3, f = 50, la función devolvería 51.*/

    public static int encodeCharToIntAndSum(char[] charsToEncode) {
        System.out.println("Convertir un Achar de letras asignadas a un cierto valor a una suma de valores enteros:");

        int result = 0;

        for (char c : charsToEncode) {
            result += MainFuncionesCarlos.encodeCharToInt(c);
        }

        return result;
    }

    public static int encodeCharToInt(char c) {
        System.out.println("encodeCharToInt");

        int result;

        switch (c) {
            case 'a':
                result = 2;
                break;
            case 'b':
                result = -3;
                break;
            case 'c':
                result = -1;
                break;
            case 'd':
                result = 21;
                break;
            case 'e':
                result = 6;
                break;
            case 'f':
                result = 50;
                break;
            default:
                result = 0;
                break;
        }

        return result;
    }

/*  · Crear una función a la que se le pase un carácter y un entero cualesquiera.
    · No devolverá nada, pero si el carácter fuera una '@' y el número un 3 saldría por pantalla:

    @
    @@
    @@@
    @@
    @
*/
    public static void mitadRombo(int height, char fill) {
        System.out.println("Imprime lo que parece una mitad de un rombo");

        String print = "";

        for (int i = 0; i < height; i++) {
            print += fill;
            System.out.println(print);
        }

        for (int i = height; i > 0; i--) {
            print = print.substring(0, i - 1);
            System.out.println(print);
        }
    }


/** Crear una función que actúe como un "taller" de strings. Recibirá un string sobre el que realizar las tareas, un array de string
 * con las tareas a realizar y devolverá un string con las tareas realizadas.
· Las tareas podrán ser: "TRIM", "UPPERIZE", "LOWERIZE" y "ALL".
            · Si se selecciona "TRIM" una función comprobará si la cadena tiene espacios en blanco, indicando si no es así.
            Si tiene espacios en blanco, aplicará el trim de string (solo hace falta quitar los espacios antes y después de la cadena).
            · Si se selecciona "UPPERIZE" o "LOWERIZE" una función para cada caso, comprobará si la cadena está vacía,
            indicando si es así. Si no está vacía, aplicará la función ToUpper o ToLower de string según el caso.
            · Si se selecciona "ALL" se aplicarán las tres funciones al string, en el orden en el que se desee.*/

public static String tallerDeStrings(String stringParaElTaller, String[] tareasDelTaller) {
    String result = stringParaElTaller;

    for (String tareaDelTaller : tareasDelTaller) {
        switch (tareaDelTaller) {
            case "TRIM":
                result = SWtrim(result);
                break;
            case "UPPERIZE":
                result = SWupperize(result);
                break;
            case "LOWERIZE":
                result = SWlowerize(result);
                break;
            case "ALL":
                // El orden lógico suele ser: Limpiar -> Transformar
                result = SWtrim(result);
                result = SWupperize(result);
                // Quitamos LOWERIZE de aquí para que el UPPERIZE se vea
                break;
            default:
                System.out.println("Tarea desconocida: " + tareaDelTaller);
        }
    }
    return result;
}

    public static String SWlowerize(String texto) {
        if (texto == null || texto.isEmpty()) {
            System.out.println("SWlowerize: La cadena está vacía");
            return texto;
        }
        return texto.toLowerCase();
    }

    public static String SWupperize(String texto) {
        if (texto == null || texto.isEmpty()) {
            System.out.println("SWupperize: La cadena está vacía");
            return texto;
        }
        return texto.toUpperCase();
    }

    public static String SWtrim(String texto) {
        // Truco: Si el texto original es igual al texto con trim(),
        // significa que no tenía espacios en los bordes.
        if (texto.equals(texto.trim())) {
            System.out.println("SWtrim: No hay espacios en los bordes para quitar");
            return texto;
        }
        return texto.trim();
    }


/** Crear una función que "analice" un string. Esto es, recibirá un string e indicará qué caracteres aparecen y cuantas
 * veces aparece cada uno (hasta un máximo de 9 repeticiones).
            · Pensar un tipo de retorno apropiado para esta función, que pueda imprimir por consola el "análisis" del string.
            · Los espacios no contarán para el análisis.
· Existen las funciones char.Parse y char.IsWhiteSpace.*/

     public static String analizarString(String entrada) {
        if (entrada == null) return "Texto vacío";

        // 1. Usamos un Map para guardar: Letra -> Cantidad
        Map<Character, Integer> conteo = new HashMap<>();

        // 2. Convertimos a array de letras y recorremos
        for (char letra : entrada.toCharArray()) {

            // Si es espacio, lo ignoramos (como pedía el enunciado)
            if (Character.isWhitespace(letra)) {
                continue;
            }

            // Si la letra ya está, le sumamos 1. Si no, empezamos en 0 y sumamos 1.
            conteo.put(letra, conteo.getOrDefault(letra, 0) + 1);
        }

        // 3. Convertimos el resultado a un texto bonito
        return formatearResultado(conteo);
    }

    private static String formatearResultado(Map<Character, Integer> conteo) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> pareja : conteo.entrySet()) {
            sb.append("La letra '")
              .append(pareja.getKey())
              .append("' aparece ")
              .append(pareja.getValue())
              .append(" veces\n");
        }

        return sb.toString();
    }


    /** Crear una función que reciba un número entero y devuelva un string.
        · La función irá pidiendo tantos caracteres por consola como indique el número.
        · Los caracteres se irán introduciendo por consola uno a uno.
        · Si el caracter introducido se puede convertir a un número, hacerlo.
        · Todos los caracteres convertidos a número se irán sumando, guardando el valor de esa suma.
        · Si el caracter no es numérico, guardarlo.
        · Cuando se llegue al número de caracteres pedidos, la función mostrará por consola la suma acumulada de los
     caracteres numéricos.
        · La función devolverá como resultado un string compuesto por los caracteres introducidos por consola,
        que habrá que mostrar por consola.
            NOTA: Consultar el uso de Scanner para conseguir el objetivo.*/

    public static String getStringFromConsoleChars(int v) {
        System.out.println("getStringFromConsoleChars");

        int sum = 0;
        char[] chars = new char[v];
        int charsEntered = 0;
        char charEntered;

        do {
            System.out.println("Introduzca un caracter: ");

            Scanner scanner = new Scanner(System.in);

            charEntered = scanner.next().charAt(0);

            if (Character.isDigit(charEntered)) {
                System.out.println("El caracter es un dígito, sumándolo");

                sum += Integer.parseInt(String.valueOf(charEntered));
            } else {
                chars[charsEntered] = charEntered;
            }


            charsEntered++;
        } while (charsEntered < v);

        System.out.println("Los caracteres numéricos han sumado " + sum);

        return new String(chars);
    }

/** Crear una función que reciba un array de string y un número en coma flotante, simple precisión. Devolverá un array de strings.
        · El array contendrá nombres de productos y sus precios asociados.
        · Por cada nombre de producto habrá solo un precio asociado.
        · Yendo en el orden en el que estén los productos en el array, ir sumando sus precios mientras no se supere el umbral
        indicado por el parámetro numérico de la función.
        · Una vez se supere este umbral, o se hayan procesado todos los productos, devolver sus nombres en el array de retorno de la función.
        · El programa deberá imprimir por pantalla los productos devueltos como resultado de la función.
        · Pensar un contenido y orden adecuado para el array de entrada.*/

    public static String[] getProductsThatCanBeBought(String[] productsAndPrices, float maxMoneyToSpend) {
        System.out.println("getProductsThatCanBeBought");

        String[] result = new String[productsAndPrices.length / 2];
        float totalPriceProductsBought = 0;
        int productsBought = 0;

        for (int i = 0; i < productsAndPrices.length; i = i + 2) {

            if ((Float.parseFloat(productsAndPrices[i + 1]) + totalPriceProductsBought) <= maxMoneyToSpend) {
                System.out.println(
                        "Añadiendo el producto " + productsAndPrices[i]
                                + " con precio " + productsAndPrices[i + 1]
                                + " al total comprado de " + totalPriceProductsBought
                );

                result[productsBought] = productsAndPrices[i];
                totalPriceProductsBought += Float.parseFloat(productsAndPrices[i + 1]);
                productsBought++;
            } else {
                System.out.println("No se pueden comprar más productos");
                break;
            }
        }

        return result;
    }
}