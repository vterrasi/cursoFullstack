package practicaFunciones;

import java.util.*;

public class MainPracticaFunciones {

    public static void main(String[] args) {
        System.out.println("En MainPracticaFunciones");

        int[] numeros = {1, 4, 2, 8, 3, 20};
        System.out.println(MainPracticaFunciones.sumarNumeros(numeros));

        System.out.println(MainPracticaFunciones.cadenaDeEntero(10));

        char[] letras = {'t', 'o', 'a', 'l', 'l', 'a', '0', '2'};
        System.out.println(MainPracticaFunciones.extraerVocales(letras));

        String texto = "Cadena ejercicio sustitucion";
        System.out.println(MainPracticaFunciones.cambiarCaracteres(texto, 'c', '4', 'F'));

        String fraseHobby = "programar es como jugar con piezas de lego";
        char letra = 'a';
        int resultadoLetras = MainPracticaFunciones.contarLetras(fraseHobby, letra);
        System.out.println("La letra '" + letra + "' aparece " + resultadoLetras + " veces.");

        char[] operaciones = {'+', '*', 'R', '-'};
        float resultadoCharToFloat = procesarOperaciones(operaciones);
        System.out.println("El resultado final es: " + resultadoCharToFloat);

        String texto1 = "La gata linda bibibibi";
        int resultado1 = calcularValorString(texto1);
        System.out.println("El valor total es: " + resultado1);

        String texto2 = "cascos cosquillas cacerola cecina";
        int resultado2 = contarLetrasC(texto2);
        System.out.println("La letra 'c' aparece " + resultado2 + " veces.");


        String[] palabrasFranken = {"Hola", "Mimi", "niña", "bonita", "Java"};
        String[] resultadoFranken = frankenstring(palabrasFranken, 2);
        System.out.println("Frankenstring: " + Arrays.toString(resultadoFranken));


        char[] charArrayAentero = {'a', 'c', 'd', 'a', 'e', 'f'};
        System.out.println("Suma de caracteres: " + caracterAEntero(charArrayAentero));


        System.out.println("--- Dibujando Pirámide Girada ---");
        dibujarPiramideGirada('¬', 6);


        String miCadena = "   BICICLETA LANA LONA LUNA MINI   ";
        String[] misTareas = {"TRIM", "LOWERIZE"};
        System.out.println("Taller de strings: " + MainPracticaFunciones.tallerDeStrings(miCadena, misTareas));

        // ---------------------------- FUNCIÓN ANALIZADOR DE STRINGS ----------------------------
        String miFrase = "La banana de Ana";
        System.out.println("Analizando la frase: " + miFrase);
        System.out.println(MainPracticaFunciones.analizarString(miFrase));


        // ---------------------------- FUNCIÓN CAPTURAR Y PROCESAR ----------------------------
        // Definimos el límite de iteraciones
        int limite = 5;

        System.out.println("--- Iniciando captura de " + limite + " caracteres ---");
        String resultado = capturarYProcesar(limite);

        System.out.println("\n--- Informe Final ---");
        System.out.println("Cadena resultante: " + resultado);

        //---------------------------------- FUNCION LISTA DE ITEMS ----------------------------------
        // 1. Datos de entrada
        String[] listaItems = {"Aceite", "10", "Pan", "12", "Fuet", "23", "Cavier", "1000"};
        float presupuesto = 100.0f;

        // 2. Llamada a la función
        String[] productosComprados = getProductsThatCanBeBought(listaItems, presupuesto);

        // 3. Imprimir el resultado final
        for (String nombre : productosComprados) {
            if (nombre != null) {
                System.out.println("Se puede comprar: " + nombre);
            }
        }

        //---------------------------------- SIGUIENTE FUNCION ----------------------------------

    }

    // --- FUNCIONES EXISTENTES ---

    public static int sumarNumeros(int[] numeros) {
        int total = 0;
        for (int numero : numeros) {
            total = total + numero;
        }
        return total;
    }

    public static String cadenaDeEntero(int numeroEntero) {
        String palabra = "Oximoron";
        return (numeroEntero % 2 == 0) ? palabra.toUpperCase() : palabra.toLowerCase();
    }

    public static char[] extraerVocales(char[] letras) {
        char[] soloVocales = new char[letras.length];
        int posicionNueva = 0;
        for (char letraActual : letras) {
            if ("aeiouAEIOU".indexOf(letraActual) != -1) {
                soloVocales[posicionNueva] = letraActual;
                posicionNueva++;
            }
        }
        return soloVocales;
    }

    public static String cambiarCaracteres(String texto, char uno, char dos, char tres) {
        return texto.replace(uno, tres).replace(dos, tres);
    }

    public static int contarLetras(String texto, char letraBusqueda) {
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letraBusqueda) contador++;
        }
        return contador;
    }


    public static float procesarOperaciones(char[] simbolos) {
        float acumulador = 1.0f;
        char ultimaOperacion = ' ';
        for (char simbolo : simbolos) {
            if (simbolo == 'R') {
                acumulador = ejecutarOperacion(ultimaOperacion, acumulador);
            } else {
                acumulador = ejecutarOperacion(simbolo, acumulador);
                ultimaOperacion = simbolo;
            }
            if (acumulador <= 0) acumulador = 1.0f;
        }
        return acumulador;
    }

    /* char[] operaciones = {'+', '*', 'R', '-'};
        float resultadoCharToFloat = procesarOperaciones(operaciones);
        System.out.println("El resultado final es: " + resultadoCharToFloat);
    */
    private static float ejecutarOperacion(char operacion, float valor) {
        switch (operacion) {
            case '+':
                return sumar(valor, valor);
            case '-':
                return restar(valor, valor);
            case '*':
                return multiplicar(valor, valor);
            case '/':
                return dividir(valor, valor);
            default:
                return valor;
        }
    }

    private static float sumar(float a, float b) {
        return a + b;
    }

    private static float restar(float a, float b) {
        return a - b;
    }

    private static float multiplicar(float a, float b) {
        return a * b;
    }

    private static float dividir(float a, float b) {
        return b == 0 ? 0 : a / b;
    }


    public static int calcularValorString(String input) {
        int sumaTotal = 0;
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char letra = input.charAt(i);
            if (letra == ' ') sumaTotal += 0;
            else if ("aeiou".indexOf(letra) != -1) sumaTotal += 2;
            else if (letra >= 'a' && letra <= 'z') sumaTotal += 1;
        }
        return sumaTotal;
    }

    public static int contarLetrasC(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'c') contador++;
        }
        return contador;
    }


    public static String[] frankenstring(String[] palabras, int numero) {
        String parte1 = "";
        String parte2 = "";
        for (int i = 0; i < palabras.length; i++) {
            if ((i + 1) <= numero) parte1 += palabras[i];
            else parte2 += palabras[i];
        }
        return new String[]{parte1, parte2};
    }

    public static String generarAnagrama(String palabra) {
        List<Character> letras = new ArrayList<>();
        for (char c : palabra.toCharArray()) letras.add(c);
        Collections.shuffle(letras);
        StringBuilder resultado = new StringBuilder();
        for (char c : letras) resultado.append(c);
        return resultado.toString();
    }


    public static int caracterAEntero(char[] arreglo) {
        int suma = 0;
        for (char c : arreglo) {
            suma += obtenerCodigo(c);
        }
        return suma;
    }

    private static int obtenerCodigo(char c) {
        switch (c) {
            case 'a':
                return 2;
            case 'b':
                return -3;
            case 'f':
                return 50;
            default:
                return 0;
        }
    }

    // --- PIRÁMIDE GIRADA ---
    public static void dibujarPiramideGirada(char simbolo, int altura) {
        // PARTE 1: Subida (de 1 hasta la altura máxima)
        for (int i = 1; i <= altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(simbolo);
            }
            System.out.println(); // Salto de línea al terminar la fila
        }

        // PARTE 2: Bajada (desde altura-1 hasta 1)
        for (int i = altura - 1; i >= 1; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(simbolo);
            }
            System.out.println(); // Salto de línea
        }
    }


    // --- TALLER DE STRINGS ---
    public static String tallerDeStrings(String texto, String[] tareas) {
        String resultado = texto;
        for (String tarea : tareas) {
            switch (tarea.toUpperCase()) {
                case "TRIM":
                    resultado = aplicarTrim(resultado);
                    break;
                case "UPPERIZE":
                    resultado = aplicarUpper(resultado);
                    break;
                case "LOWERIZE":
                    resultado = aplicarLower(resultado);
                    break;
                case "ALL":
                    resultado = aplicarTrim(resultado);
                    resultado = aplicarUpper(resultado);
                    resultado = aplicarLower(resultado);
                    break;
            }
        }
        return resultado;
    }

    public static String aplicarTrim(String s) {
        if (s.equals(s.trim())) System.out.println("Aviso: Sin espacios.");
        else s = s.trim();
        return s;
    }

    public static String aplicarUpper(String s) {
        if (s.isEmpty()) return s;
        return s.toUpperCase();
    }

    public static String aplicarLower(String s) {
        if (s.isEmpty()) return s;
        return s.toLowerCase();
    }

    // --- LA FUNCIÓN DE ANÁLISIS ---
    public static String analizarString(String texto) {
        String resultadoFinal = "";
        String caracteresYaContados = "";

        // Recorremos el texto letra por letra
        for (int i = 0; i < texto.length(); i++) {
            char letraActual = texto.charAt(i);

            // 1. ¿Es un espacio? Si lo es, lo ignoramos (Character.isWhitespace)
            if (Character.isWhitespace(letraActual)) {
                continue;
            }

            // 2. ¿Ya hemos contado esta letra antes?
            // Usamos String.valueOf para convertir el char en String y buscarlo
            if (caracteresYaContados.contains(String.valueOf(letraActual))) {
                continue;
            }

            // 3. Si es una letra nueva, contamos cuántas veces aparece
            int contador = 0;
            for (int j = 0; j < texto.length(); j++) {
                if (texto.charAt(j) == letraActual) {
                    contador++;
                }
            }

            // 4. Guardamos la letra en la "lista de ya contadas"
            caracteresYaContados += letraActual;

            // 5. Convertimos el número a String (aunque Java lo hace solo, usamos la lógica pedida)
            String vecesTexto = String.valueOf(contador);
            int vecesFinal = Integer.parseInt(vecesTexto); // Ejemplo de uso de Integer.parseInt

            // 6. Lo añadimos al informe final
            resultadoFinal += "[" + letraActual + ": " + vecesFinal + "] ";
        }

        return resultadoFinal;
    }

     /*Crear una función que reciba un número entero y devuelva un string.
    - La función irá pidiendo tantos caracteres por consola como indique el número.
    - Los caracteres se irán introduciendo por consola uno a uno.
    - Si el caracter introducido se puede convertir a un número, hacerlo.
    - Todos los caracteres convertidos a número se irán sumando, guardando el valor de esa suma.
    - Si el caracter no es numérico, guardarlo.
    - Cuando se llegue al número de caracteres pedidos, la función mostrará por consola la suma acumulada de los caracteres numéricos.
    - La funcion devolverá como resultado un string compuesto por los caracteres introducidos por consola, que habrá
que mostrar por consola.
 NOTA: Consultar el uso de Scanner para cumplir el objetivo.*/


    /**
     * Gestiona la captura serializada de caracteres y realiza el sumatorio de tipos numéricos.
     *
     * @param n Cantidad de ciclos de lectura.
     * @return String concatenado con la secuencia de entrada original.
     */

    public static String capturarYProcesar(int n) {
        Scanner sc = new Scanner(System.in);
        StringBuilder builderFinal = new StringBuilder();
        int acumuladorNumerico = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Introduzca el caracter (" + (i + 1) + "/" + n + "): ");
            String input = sc.next();
            char c = input.charAt(0);

            builderFinal.append(c);

            if (Character.isDigit(c)) {
                int valorCodificado = Character.getNumericValue(c);
                acumuladorNumerico += valorCodificado;
            }
        }

        System.out.println("\n[LOG] Suma acumulada de caracteres numéricos: " + acumuladorNumerico);
        return builderFinal.toString();
    }

    /* * Crear una función que reciba un array de string y un número en coma flotante, simple precision. Devolverá un array de strings.
            - El array contendrá nombres de productos y sus precios asociados.
            - Por cada nombre de producto habrá solo un precio asociado.
            - Yendo en el orden en que están los productos en el array, ir sumando sus precios mientras no se supere el umbral
            indicado por el parámetro numérico de la función.
            - Una vez se supere este umbral, o se hayan procesado todos los productos, devolver sus nombres en el array
            de retorno de la función.
            - El programa deberá imprimir por pantalla los productos devueltos como resultado de la función.
    * */

    public static String[] getProductsThatCanBeBought(String[] listaItems, float umbral) {
        // Creamos un array para guardar los nombres (máximo tendrá la mitad del tamaño de la lista original)
        String[] resultado = new String[listaItems.length / 2];
        float sumaAcumulada = 0;
        int contadorResultado = 0;

        // Recorremos la lista de dos en dos (Nombre, Precio, Nombre, Precio...)
        for (int i = 0; i < listaItems.length; i += 2) {
            String nombreProducto = listaItems[i];
            float precioProducto = Float.parseFloat(listaItems[i + 1]);

            // Comprobamos si al sumar este precio nos pasamos del límite
            if (sumaAcumulada + precioProducto <= umbral) {
                sumaAcumulada += precioProducto;
                resultado[contadorResultado] = nombreProducto;
                contadorResultado++;
            } else {
                // Si nos pasamos, dejamos de procesar la lista
                break;
            }
        }
        return resultado;
    }
}