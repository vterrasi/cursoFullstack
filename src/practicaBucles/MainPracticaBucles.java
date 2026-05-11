package practicaBucles;
import java.util.Random;

public class MainPracticaBucles {
    public static void main(String[] args) {
        System.out.println("En mainPracticaBucles");

/*
        // * Sacar por pantalla los números pares hasta el 200 (inclusive).
        for (int i = 0; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("El numero " + i + " es par");
            }
        }
        // paso 1: ejecutar int i = 0;
        // paso 2: ejecutar 0 < 10  ¿Si o no? En este caso es SI
        // paso 3: Entra a las llaves del for
        // paso 4: ejecuta el if. En este caso, 0 es par, e imprime el 0
        // paso 5: regresa al i++ y lo ejecuta. La i ahora vale 1
        // paso 6: ejecutar 1 < 10  ¿Si o no? En este caso es SI
        // paso 7: Entra a las llaves del for
        // paso 8: ejecuta el if. En este caso, 1 NO es par, por lo tanto no imprime 1
        // paso 9: regresa al i++ y lo ejecuta. En este caso, i = 2
        // paso 10: ejecutar 2 < 10  ¿Si o no? En este caso es SI


        //* Preparar un bucle que recorra los 51 primeros números enteros.
        //  - En cada iteración, sacará el número en el que esté en ese momento por consola.
        //  - Si el número en el que está en ese momento es divisible por 3 (su resto es 0),
        // mostrar que esto ocurre por consola, además del número, y "saltarse" 4 números, es decir,
        // los siguientes cuatro números naturales no se mostrarán.

        int i = 0;
        while (i <= 51) {
            if (i % 3 == 0) {
                System.out.println(i + " es divisible por 3");
                i+=4;
            }
        }
*/

        // paso 1: ejecutar int i = 0;
        // paso 2: ejecutar 0 <= 51  ¿Si o no? En este caso es SI
        // paso 3: Entra a las llaves del while
        // paso 4: ejecuta el if. En este caso, 0 es divisible entre 3, e imprime el 0
        // paso 5: regresa al i++ y lo ejecuta. La i ahora vale 1
        // paso 6: ejecutar 1 < 10  ¿Si o no? En este caso es SI
        // paso 7: Entra a las llaves del for
        // paso 8: ejecuta el if. En este caso, 1 NO es par, por lo tanto no imprime 1
        // paso 9: regresa al i++ y lo ejecuta. En este caso, i = 2
        // paso 10: ejecutar 2 < 10  ¿Si o no? En este caso es SI


        //* Generar un string a partir de unir el contenido de dos arrays de caracteres, de igual longitud,
        //  uniendo las letras leyendo alternamente caracteres de uno y otro array.
//        //    - Si los arrays fueran ['d', '4', 'f'] y ['7', 'n', 'o'] el string resultante sería "d74nfo".
//
///*
//                // 1. Nuestros arrays de ejemplo
//                char[] array1 = {'d', '4', 'f'};
//                char[] array2 = {'7', 'n', 'o'};
//
//                // 2. Empezamos con un String totalmente vacío (unas comillas sin nada)
//                String resultado = "";
//
//                // 3. El bucle que recorre los arrays
//                for (int i = 0; i < array1.length; i++) {
//
//                    // Vamos sumando las letras al "resultado" una por una
//                    // Primero la del primer array, luego la del segundo
//                    resultado = resultado + array1[i] + array2[i];
//                }
//
//                // 4. Mostramos el String final
//                System.out.println("El resultado es: " + resultado);
//
//
//        /*Crear dos arrays de números enteros: uno de números mayores o iguales que 0 y el otro con números
//        //enteros cualquiera.
//            - Recorrer el array de números mayores o iguales que 0 y mostrar por pantalla la posición
//            del otro array que se corresponda con el valor de la posición actual del array.
//            - Por ejemplo, si los arrays fueran [0, 1, 0, 2] y [-3, 142, 243] saldría por pantalla "-3", luego "142",
//            luego otra vez "-3" y por último "243".*/
//
//        // 1. El "Mapa": nos dice a qué posición ir
//        int[] mapa = {0, 1, 0, 2};
//
//        // 2. El "Tesoro": contiene los valores reales
//        int[] valores = {-3, 142, 243};
//
//        // 3. Recorremos el "Mapa" de principio a fin
////        for (int i = 0; i < mapa.length; i++) {
//
//            // 4. Sacamos el número que hay en el mapa
//            // En la primera vuelta, posicionABuscar será 0
//            int posicionABuscar = mapa[i];
//
//            // 5. Usamos ese número para mirar en el array de valores
//            // Es como decir: "Dime qué hay en el cajón número [posicionABuscar]"
//            System.out.println(valores[posicionABuscar]);
//        }




        /* Crear un array de caracteres del tamaño que se desee.
        - Ir concatenando en una cadena de texto los caracteres mientras que en el array de caracteres
        no se encuentre una z.
        - Después de encontrar la z o si se acaba de recorrer el array, sacar la cadena por pantalla.*/

        //char[] arrayDeCaracteres = new char[5];



        /* Crear un array de nombres, otro de primeros apellidos y otro de segundos apellidos.
        - A partir de los tres arrays, formar "familias", esto es, a partir de cada uno de los nombres,
        generar todas las posibles combinaciones de tres apellidos y mostrar las combinaciones por pantalla.*/

        String[] nombres = new String[]{"Melina", "Carmen Luisa", "Gustavo", "Viviana", "Agustín", "Rodrigo"};
        String[] primerosApellidos = new String[]{"Rodriguez", "Castro", "Cerati", "Gomez", "Velásquez", "Blanco"};
        String[] segundosApellidos = new String[]{"Díaz", "Gutiérrez", "Clark", "Rodríguez", "Rojas", "Vélez"};





        /* Crear un array de números enteros.
        - Crear una variable entera suma.
        - Ir sumando los números del array hasta que la suma sea mayor que 20,
        entonces parar (no hay por qué llegar a 20).
        - Si el número a sumar es un 3, no sumarlo.
        - Si el número a sumar es un 4, parar.
        - Si no, sacar por pantalla la suma hasta ese momento en cada iteración.*/

//
//        /}
//*/
//        //Refactorizar el algoritmo anterior para generar uno nuevo que permita comprobar si una frase es palindromo
//        //o no en un array de caracteres con espacios permitidos para formar la frase "real".

/*
        char[] frase = {'a', 'n', 'i', 't', 'a', ' ', 'l', 'a', 'v', 'a', ' ', 'l', 'a', ' ', 't', 'i', 'n', 'a'};
        boolean esPalindromo= true;

        int derecha = 0;
        int izquierda = frase.length - 1;

        for(derecha<izquierda; derecha++){
            if (frase (derecha) == ' '){
            derecha++
            }
        }

            //if frase[derecha] != frase[izquierda]{
            esPalindromo= false;
            }


        }*/


        /* Crear un algoritmo para que utilizando @ impresas por consola un rectángulo o cuadrado de
        "alto" indicado por un numero entero (máximo 20) y "ancho" indicado por otro numero entero (máximo 40).*/

       /* for (int alto = 0; alto < 10; alto++) {
            for (int ancho = 0; ancho < 30; ancho++) {
                System.out.print('@');
            }
            System.out.print('\n');
        }

        System.out.print('\n');*/

        /*Partiendo del ejercicio anterior generar una figura similar pero haciendo que el interior
        quede vacío, lleno de espacios en blanco.*/

      /*  int lado = 10;
        char simbolo = '@';

        for (int fila = 0; fila <= lado; fila++) {
            for (int col = 0; col <= lado; col++) {

                System.out.print (

                    (fila == 0 || fila == lado || col == 0 || col == lado) ? simbolo : ' '

                );
            }
            System.out.print('\n');
        }
*/
        /* Crear un array de numeros enteros que contenga los numeros naturales del (0 al 9), pero desordenados.
        Recorrer el array para "encontrar y sacar" por pantalla todos los numeros en orden.
        El algoritmo ha de funcionar para cualquier array que cumpla todas las características propuestas. */
        /*//3, 0, 7, 4, 5, 9, 1, 8, 2, 6  //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        int[] naturales = {

                0, 1, 2, 3, 4, 5, 6, 7, 8, 9
        };

        int indiceArray = 0;
        int numeroAimprimir = 0;

        while (numeroAimprimir < 10) {
            if (indiceArray == 10) {
                indiceArray = 0; // Reseteo el contador índice mientras no le toque al ultimo que es 10.

                System.out.println(naturales[indiceArray]);
                continue;
            }

            if (naturales[indiceArray] == indiceArray)
        }

        indiceArray++;
    }*/

    /* 3 en random. Generar un juego de tres en raya con los siguientes requisitos:
       - Habrá dos "fichas" una X y una O.
       - Empezará siempre la O.
       - En cada "turno" se pondrá una "ficha" apropiada según a quién le toque.
       - La ficha se pondrá en un lugar al azar del "tablero".
       - El tablero de juego tendrá unas dimensiones de tres x tres "fichas".
       - Una vez el "tablero" esté lleno de fichas el juego terminará.
       - No hay que controlar ni durante la partida ni al final si alguien gana o pierde.
       - Tras cada "turno" mostrar cómo está el tablero.
       - NOTA: Mirar como génerar numeros aleatorios para conseguir el objetivo.
   */

     /* Crear un algoritmo que actúe como un generador de "caminos".
     - Tendremos un número que representará lo "ancho" de una fila.
     - Un array que será el de movimientos que solo podrán ser "ABAJO" y "DCHA".
     - El array de movimientos contendrá un número variable de movimientos.
     - Pintar '->' cuando el movimiento sea hacia la derecha.
     - Pintar '|' en la línea desde la que se baja y hacia la que se baja cuando sea hacia abajo.
     - Tener en cuenta que el movimiento a la derecha no pueda salirse del ancho de la fila,
     la aplicación dejará de imprimir movimientos la derecha en este caso.
     - No habrá más límite de veces en el que se podrá ir "abajo" que el que
     el número de movimientos "ABAJO" permita.

     */
        int anchoMaxFila = 15;
        String [][] arrayDeCaminos = new String[15][15];

        //Crear el array vacío

        for (int i = 0; i < anchoMaxFila; i++){
            for (int j = 0; j < 10; j++){
                arrayDeCaminos[i][j] = "_";
            }
        }

        Random random = new Random();
        String[] arrayInstruccionesRandom = new String[30];

        int elementoEnArraydeInstrucciones = 0;

        while (elementoEnArraydeInstrucciones < arrayInstruccionesRandom.length){
                int fila = random.nextInt(); // Elige 0, 1 o 2
                int columna = random.nextInt();

           elementoEnArraydeInstrucciones = random.nextInt();

            if (elementoEnArraydeInstrucciones % 2 == 0){
                arrayInstruccionesRandom[elementoEnArraydeInstrucciones] = "DCHA";
            } else {
                arrayInstruccionesRandom[elementoEnArraydeInstrucciones] = "ABAJO";
            }

            System.out.print(arrayInstruccionesRandom);
        }

    /* Crear una variable entera y asignarle un valor.
        - Crear dos arrays de números enteros y asignarle valores.
        - Cambiar los contenidos de los dos array si uno es mayor que otro:
            En el cambio del menor al mayor, llenar los huecos que sobren con el número de la variable.
            En el cambio del mayor al menor, no cambiar los números que no quepan.

        Si los array son a = [1, 2, 3] y b = [4, 5, 6, 7, 8] y el número un 0 el resultado sería
        a = [4, 5, 6] y b = [1, 2, 3, 0, 0]

        Sacar por pantalla los arrays cambiados.

        PISTA - Se pueden usar las variables intermedias para no perder los originales en el cambio.
        NOTA - El objetivo del ejercicio es a partir de dos arrays y cambiar sus valores.

     */


    /* import java.util.ArrayList;
import java.util.Arrays;

public class RellenarArrays {
    public static void main(String[] args) {
        // 1. Definimos el número que usaremos para rellenar
        int numeroRelleno = 0;

        // 2. Usamos ArrayList porque permiten cambiar su tamaño fácilmente
        ArrayList<Integer> array1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(10, 20));

        System.out.println("Antes -> Array 1: " + array1 + " | Array 2: " + array2);

        // 3. Medimos cuántos números tiene cada uno
        int tamano1 = array1.size();
        int tamano2 = array2.size();

        // 4. Comparamos quién es más pequeño
        if (tamano1 > tamano2) {
            System.out.println("El Array 2 es más pequeño. Rellenando...");
            // Mientras el 2 sea más chico que el 1, le añadimos el 0
            while (array2.size() < tamano1) {
                array2.add(numeroRelleno);
            }
        }
        else if (tamano2 > tamano1) {
            System.out.println("El Array 1 es más pequeño. Rellenando...");
            // Mientras el 1 sea más chico que el 2, le añadimos el 0
            while (array1.size() < tamano2) {
                array1.add(numeroRelleno);
            }
        }
        else {
            System.out.println("¡Ya son iguales, no hay que hacer nada!");
        }

        // 5. Mostramos el resultado final
        System.out.println("---");
        System.out.println("Después -> Array 1: " + array1);
        System.out.println("Después -> Array 2: " + array2);






     */



    }
}
