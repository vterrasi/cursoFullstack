//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import org.w3c.dom.ls.LSOutput;

import javax.naming.ServiceUnavailableException;

import static jdk.internal.org.jline.utils.Colors.s;

public static void main() {
    /*
    Tengo una cantidad de bocadillos a repartir, de morcilla chorizo y salchichón
    entre un número de personas. Con base en esto quiero un programa que me ayude a saber:
        - Cuantos bocadillos tengo en total.
        - Tocando a un bocadillo por persona, cuántos me quedarían si los reparto
    entre las personas que hay.
     */
/*
    int cantidadDePersonas = 70;
    int bocadillosMorcilla = 20;
    int bocadillosChorizo = 30;
    int bocadillosSalchichon = 40;
    int TotalBocadillos = bocadillosMorcilla + bocadillosSalchichon + bocadillosChorizo;
    int RestoBocadillos = (TotalBocadillos - cantidadDePersonas);

    System.out.println("En total tengo: ");
    System.out.println(TotalBocadillos + " bocadillos");
    System.out.println("\nEl resto es: ");
    System.out.println(RestoBocadillos + " bocadillos");

}
*/
    //Enteros
    byte miByte = 1; // 8 bits
    short miShort = 2;  // 16 bits
    int miInt = 3; // 32 bits
    long miLong = 4; // 64 bits

    // Coma flotante
    float miFloat = 5; //32 bits IEEE 754
    double miDouble = 6; // 64 bits IEEE 754

    //Boolean
    boolean miBoolean = true; // depende (1 bit)

    // Texto
    char miChar = 'K'; // 16 bits UNICODE
    String miString = "Kirena"; // variable
/*
    System.out.println("Mi byte vale " + miByte);
    System.out.println("Mi short vale " + miShort);
    System.out.println("Mi int vale " + miInt);
    System.out.println("Mi long vale " + miLong);
    System.out.println("Mi float vale " + miFloat);
    System.out.println("Mi double vale " + miDouble);
    System.out.println("Mi boolean vale " + miBoolean);
    System.out.println("Mi char vale " + miChar);
    System.out.println("Mi string vale " + miString);

    final float PI = 3.14159264f;
}

    EJERCICIOS DE VARIABLES

    double moleculasDeAguaEnUnVaso = 8.365e24;
    int numeroDeDedosDeUnaMano = 5;
    double elNumeroPi = 3.141592653589793;
    String unNumeroDeCuenta = "ES21 0049 1234 56 1234567890";
    int numeroDeHojasEnUnArbol = 500000; //Depende del árbol.
    long longitudDeLaEstelaDeUnCometa = 10; // En kilómetros.
    String unNumeroDeTelefono = "656238845";
    float pesoDeUnAtomoDeHidrogeno = 1.0079f; // En gramos por mol.
    char unaLetraDelAlfabeto = 'M';
    String tipoDeHormigaEnUnHormiguero = "Carpintera";
    String plantillaDeUnEquipoDeRugby = ;
    String laTallaDeUnaCamisa = "16"; // mejor poner un string.
    boolean siHoyHaceSol = true;

    String unRangoELOdeAjedrez = "2760";
    int VolumenDeAguaEnUnaFuente = (int) 80e6; // En litros. (Varía de acuerdo a la fuente. Referencia: Fontana di trevi, Italia).
    float sueldoMedioDeUnaPersona = 28049.49F; //Esta cifra corresponde al valor anual bruto en el 2023.
    boolean MeGustaLaTortillaDePatataConCebolla = false;
    String ratioDeCalificacionDeDeudaSoberanaDeUnPais = "A3";
    int temperaturaDelSol = (int) 15e6; //Grados celsius.
    int cantidadDeLentejasDeUnGuiso = 9000; // Aproximadamente. En 500 gramos de lentejas. Pueden ser pardinas o castellanas.
    char unaInicialDeUnNombre = 'V';
    double numeroDeGranosDeArenaDeUnaPlaya = 8e14;
    boolean soyFeliz = true;
    String problemasDeHabitatDeLaProcesionaria
    short a7oDelCalendarioGregoriano = 2026;
    float precioPorKiloDelSalmon = 24.00f;

    String aprecioPorSanRobustianoEnLasGentesDeLaComarcaDelAlcornoque = "Mucho";
    int miNumeroDeTurnoEnLaCarniceria = 72;
    int horasDeReelsQueLlevoVistas = 40;
    String handicapEnElGolf = ;
    String gemasDelGuanteleteEnElInfinito = "6";
    String ingredientesDeLasAtascaburras = "Patatas" "bacalao desalado" "AOVE" "Ajos" "nueces" "huevos cocidos";
    boolean mayoriaCualifiCadaDeUnaJuntaDeVecinos = false; //Si se cumple que hay mayoría cualificada o no.
    float interesesAnualesDeUnPrestamo = 20.0f;
    byte numeroDeTeclasEnUnTecladoQwertyEstandar = 105;
    int caracteresEscritosEnLaPrimeraEdicionDelQuijote = 1040000;
    boolean meHeDejadoLaPlanchaEncendida = false;



//Castear: una variable se convierte de un tipo a otro.

    //OPERADORES

    //Asignación

    // Suma
    // Resta
    // Multiplicación
    // División
    // Modulo

    // Aritméticos lógicos
    // +=
    // -=
    // *=
    // /=
/*
    int x = 3;
    int y = 2;

    System.out.println("\nAl principio");
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    x = x + y;

    System.out.println("\nTras la suma");
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    y = x - y;
    System.out.println("\nTras la resta");
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    x = x * y;
    System.out.println("\nTras la multiplicacion");
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    y = x / y;
    System.out.println("\nTras la division");
    System.out.println("x es " + x);
    System.out.println("y es " + y);

    x += y;
    System.out.println("\nTras la suma +=");
    System.out.println("x es " + x);
    System.out.println("y es " + y);


    x = x % y;  // Módulo
    System.out.println("El resto de dividir x entre y es " + x);

    x = 3;
    y = 2;

    x = (x + x) * y;

    System.out.println("\nx es " + x);
    System.out.println("y es " + y);

    //UNARIOS

    // +
    // -
    // ++
    // --

    x = 0;
    System.out.println("\nx es " + x);

    x++;
    System.out.println("\nx es " + x);

    ++x;
    System.out.println("\nx es " + x);

    System.out.println(x++);
    System.out.println(x);
    System.out.println(++x);
    System.out.println(x);

    //int x = 4-3-5;
    //System.out.println(x);

/*
 1) Restar 4 y 3 y 5.
 2) Sumar 2 y 3 y restarle 10.
 3) Multiplicar 7 y 3 y 21.
 4) Dividir 9 y 3.
 5) Multiplicar 5 y 3 y restarle 3.
 6) Sumar 25 y 31 y restarle 10 y 2.
 7) Multiplicar 3 por 4 y por 12 y dividirlo entre 8.
 8) Sumar el resultado de 4 mas 3 a la division de  10 y 5.
 9) Dividir 4 entre 2 y sumarle 25, AL RESULTADO DE ESTO, SUMARLE LA RESTA ENTRE 3 Y 6.
 10) Restar 3 y 5; 10 y 2, y 3 y 1, y sumar todos los resultado de las restas.
  */
/*
    System.out.println((4 - 3) - 5);  // 1)
    System.out.println("\n");
    System.out.println((2 + 3) - 10);  // 2)
    System.out.println("\n");
    System.out.println(7 * 3 * 21);  // 3)
    System.out.println("\n");
    System.out.println(9 / 3);  // 4)
    System.out.println("\n");
    System.out.println((5 * 3) - 3); // 5)
    System.out.println("\n");
    System.out.println((25 + 31) - (10 - 2));  // 6)
    System.out.println("\n");
    System.out.println((3 * 4 * 12) / 8); // 7)
    System.out.println("\n");
    System.out.println((4 + 3) + (10 / 5)); // 8)
    System.out.println("\n");
    System.out.println(((4 / 2) + 25) + (3 - 6));  // 9)
    System.out.println("\n");
    System.out.println((3 - 5) + (10 - 2) + (3 - 1));  // 10)


    System.out.println("\n");
    System.out.println("Segunda tanda de ejercicios: ");
    System.out.println("\n");
*/
    /*
    1) Sumar a la resta de los resultados de las divisiones de 8 entre 4 y 35 entre 3
    el resultado de multiplicar 3 por 8.
    2) Al resultado de multiplicar 3 y 8, y luego dividirlo entre 2,
    sumarle la suma de 10 y 22.
    3) Restar 1 a la division entre el resultado de multiplicar 11 por 3 entre 2.
    4) Sumar 10 y 218 a la resta de 1, 3 y 8
    5) Restar 100 a la división de 30 y 6, a cuyo resultado
    se ha sumado el de la multiplicación de 10 y 4, a todo ello se le resta la division entre 20 y 5
    6) Sumar 1 y 2, y a ello sumarle 10, y a ello restarle la multiplicación de 3 y 4.
    7) Multiplicar la suma de 3 y 5 mas la resta de 10 y 23 por 4.

    /*
    System.out.println(((8 / 4) - (35 / 3)) + (3 * 8)); // 1)
    System.out.println("\n");
    System.out.println(((3 * 8)/ 2) + (10 + 22)); // 2)
    System.out.println("\n");
    System.out.println(((11 * 3) / 2) - 1); // 3)
    System.out.println("\n");
    System.out.println((1 - 3 - 8) + 10 + 218);  // 4)
    System.out.println("\n");
    System.out.println((((30 / 6) - 100) + (10 * 4)) - (20 / 5));  // 5)
    System.out.println("\n");
    System.out.println(1 + 2 + 10 - (3 * 4)); //  7)
    System.out.println("\n");
    System.out.println(((3 + 5) + (10 - 23)) * 4);  //  8)
    */

    /*

    **PSEUDOCÓDIGO
    SI
    SI NO SI
    SINO
    MAYOR QUE
    MENOR QUE
    MAYOR O IGUAL QUE
    MENOR O IGUAL QUE
    IGUAL QUE
    DISTINTO QUE
    Y
    O

    **Combinación de operaciones en pseudocódigo para generar programas básicos.
     * Declarar las variables necesarias y asignarles valores si es necesario.
     * Utilizar pseudocódigo para generar el programa pedido.
     * Se puede utilizar IntelliJ IDEA para generar el código.
     * El pseudocódigo se puede poner en comentarios.
     * Se puede sacar información directamente por consola.
     * // SI X MAYOR QUE
     * System.out.println("x mayor que y");


    * Si un caracter es igual a otro indicarlo por pantalla en caso contario indicarlo también.
     // Si caracter1 igual que caracter2 ENTONCES
      System.out.println("Es igual");
      //SINO
      System.out.println("No es igual");

        PSEUDOCODIGO:
        Debo declarar dos variables. Estas pueden ser iguales o diferentes.
        Debo escribir una línea de código donde me diga si es verdadero o falso que son iguales.
        Si son iguales imprimir que es igual.
        Si es falso que son iguales escribir "no es igual"
    */
    int caracter1 = 'e';
    int caracter2 = 'e';

    // Si caracter1 es igual a caracter2
    System.out.println("Es igual.\n");

    /*
    * Si la suma de dos números da un resultado mayor que 10, indicarlo por pantalla.
    Si la resta de los mismos números da un resultado menor que 10, indicarlo por pantalla.

        PSEUDOCÓDIGO:
        - Declaro la suma y resta de dos números como dos variables.
        - Para la suma:
            - Asigno un valor de verdadero si la suma es mayor que 10.
            - Si es verdadero, imprimir: "La suma de _ y _ es mayor que 10".
        - Para la resta:
            - Asigno un valor de verdadero si la resta es menor que 10.
            - Si es verdadero, imprimir: "La resta de _ y _ es menor que 10".
*/
    int sumaDosNumeros = (9 + 5);
    int restaDosNumeros = (9 - 5);

        System.out.println("La suma de 9 y 5 es mayor que 10 y es " + sumaDosNumeros); //Si sumaDosNumeros es mayor que 10 imprimirá "La suma de 9 y 5 es mayor que 10" y su resultado
        System.out.println("La resta de 9 y 5 es menor que 10 y es " + restaDosNumeros + "\n"); //Si restaDosNumeros es menor que 10 imprimirá "La resta de 9 y 5 es menor que 10" y su resultado
    /*

    * Si la suma de dos números da un resultado mayor que 10, indicarlo por pantalla.
    Si la resta de los mismos números da un resultado mayor que 10, indicarlo por pantalla.

        PSEUDOCÓDIGO:
        - Declaro la suma y resta de dos números como dos variables.
        - Asigno un valor de verdadero o falso (booleano) con base en si el resultado es mayor que 10.
        - Si es verdadero imprimir:
            - Para la suma: "La suma de _ y _ es mayor que 10".
            - Para la resta: "La resta de _ y _ es mayor que 10".
*/
    int sumDosNum = (35 + 30);
    int restaDosNum = (35 - 30);

    //SI sumDosNum MAYOR QUE 10
    //System.out.println("La suma de 35 y 30 es mayor que 10 y es " + sumDosNum);
    //SINO




    // Si la suma es mayor que 10 imprimirá la operación y el resultado.
    System.out.println("La suma de 35 y 30 es mayor que 10 y es " + sumDosNum);

    // Si la resta de esos mismos números es menor que 10 imprimirá la operación y el resultado.
    System.out.println("La resta de 35 y 30 es menor que 10 y es " + restaDosNum + "\n");

    /*
    * Si un caracter es distinto de una vocal sacar por pantalla "No es una vocal",
    si es una vocal sacar por pantalla "Es una vocal".

        PSEUDOCODIGO
        - Definir una variable tipo char
        - Si esa variable es distinta de a, e, i, o, u imprimir "No es una vocal".
        - En caso contrario, si la variable es alguna de a, e, i, o, u, imprimir "Es una vocal".
    */

    char c = 'r';
    System.out.println("No es una vocal\n");

    /*
    * Si un caracter es una 's' y la resta de dos números es mayor que 0, mostrar el mensaje "OK";
    Si el caracter es una 's' pero la resta de dos nÚmeros es menor que 0, mostrar el mensaje "CASI OK";
    si el caracter no es una 's', mostrar el mensaje "OTRO CASO".

        PSEUDOCODIGO
        - Definir una variable tipo char que puede ser o no igual a 's'.
        - Definir una variable que es la resta de dos números.
        - Si se cumple que la variable tipo char es 's' y que la variable que es la resta
        de dos numeros mayor que 0, mostrar el mensaje "OK".
        - Si se cumple que la variable tipo char es 's' y que la variable que es la resta
        de dos numeros no es mayor que 0, mostrar el mensaje "CASI OK".
        - Si por el contrario, la variable tipo char es NO ES 's'. mostrar el mensaje "OTRO CASO".
*/
    char caracter = 'j';  // Defino las variables, el caracter y la resta.
    int resta = (7 - 3);   // Como la resta es mayor que 0 se va a mostrar "OK".
    System.out.println(caracter);
    System.out.println("OTRO CASO\n");


    /*
    * Partimos de dos números enteros y una cadena de texto. Estudiar e imprimir por pantalla
    las distintas combinaciones de si los números se corresponden con su equivalente en texto (3 sería TRES).

        PSEUDOCODIGO
        - Definir dos variables numéricas y una variable tipo string.
        - Definir las distintas combinaciones y si ocurre que uno de los valores coincide con la cadena de texto.
*/
    int g = 10;
    int l = 17;
    String nombreDelNumero= "Diesisiete";


/*
    * Si una cadena de texto es igual que otra, indicarlo. Para cada una de las cadenas de texto anteriores,
     compararla con otra distinta, si alguna es igual, indicarlo por pantalla. Se busca un programa que indique
     si hay alguna igualdad en las cadenas.

        PSEUDOCODIGO
        Definir dos variables tipo string.
        Definir una tercera y compararla con las otras dos anteriores.
        Si se cumple que alguna es
*/
    String cadena1 = "El sol sale para todos";
    String cadena2 = "La camisa es amarilla";
    String cadena3 = "La camisa es amarilla";

    // Se verifica con un programa que los string son iguales o no para las tres variables.
    // Se cumple que la cadena 2 es igual a la cadena3 por lo tanto se imprime en pantalla.

    System.out.println("La cadena2 es igual a la cadena3\n");

    /*

    * Si la división de dos números da como resultado 1, sacar por pantalla "Mismo número".
    Si esa misma división da como resultado un 4, sacar por pantalla "El resultado es 4".
    */
/*
    int m = 26;
    int n = 26;
    int q = m/n;

    System.out.println("Mismo numero\n");

    /*
    * Si al multiplicar 3 números el resultado fuera menor o igual a 100, comprobar entonces si alguno de los
     números es mayor que 10 y, si alguno lo es, sacar por pantalla: "Un número es mayor que 10".
     En caso de que no sea menor o igual a 100, sacar por pantalla "Otro resultado".

    */
  /*      float variable1  = 0.52f;   // Definir los tres números cuyo producto se verá si es menor o igual que 100.
        float variable2 = 0.15f;
        float variable3 = 40;

    // Defino el producto de las tres variables
    float producto = (variable1 * variable2 * variable3);

    // Evaluo si el producto es igual o menor que 100. Como es menor que 100
    // compruebo si una de las variables es mayor a 10.
    // Efectivamente, una de las variables es mayor a 10.

    System.out.println("Resultado = " + producto + "\n");

    //Como una de las variables es mayor a 10, imprimo en pantalla.
    System.out.println("Un número es mayor que 10");
*/
/*
    EJERCICIOS:

    * Dados dos números enteros y dos caracteres emparejar cada número con un caracter.
    Dado otro caracter, si es igual que alguno de los otros dos caracteres, imprimir su número "emparejado" por pantalla.

            PSEUDOCÓDIGO:

            SIENDO X e Y int, y a y b char
                Formar dos conjuntos de dos elementos compuesto por X y A y otro conjunto formado por Y y B.
                SI c es IGUAL A a o b, ENTONCES imprimir por pantalla el número que le corresponde.
  */
            int num1 = 10;
            int num2 = 8;
            char char1 = 'a';
            char char2 = 'b';
            // lista1 = [num 1, char1];
            // lista2 = [num 2, char2];

            //Dado un tercer caracter
            char char3 = 'a';
            System.out.println(num1);


/*
    * Si una cadena de texto es "Ajustar", entonces si dos números suman más de 150 mostrar el mensaje "Ajuste pendiente",
    * si no, mostrar el mensaje "Ajuste no necesario"; si la cadena no es "Ajustar",
    * mostrar el mensaje "Ajuste no solicitado".

            PSEUDOCODIGO:

            SI una cadena de texto IGUAL QUE "Ajustar" ENTONCES
                SI  x + y MAYOR QUE 150 ENTONCES
                System.out.println("Ajuste pendiente");
                SI NO, ENTONCES
                System.out.println("Ajuste no necesario");
            SI NO, ENTONCES
                System.out.println("Ajuste no solicitado");
*/

/*
    * Si la división de dos números enteros da como resultado un número mayor que 5, si dos cadenas
    * de texto son iguales, indicarlo; si no lo son, indicarlo también; en caso de que sea 5 el
    * resultado de la division, indicarlo.

            PSEUDOCODIGO:

                SI x / y MAYOR QUE 5
                    SI cadena1 IGUAL QUE cadena2, ENTONCES
                      System.out.println("Las cadenas de texto son iguales");
                    SINO
                      System.out.println("Las cadenas de texto NO son iguales");
                SI x / y es IGUAL A 5 ENTONCES
                    System.out.println("El resultado de la division es 5");
     */

    /* El programa recibe una altura expresada en coma flotante y ha de,
    en base a un umbral de altura mínimo, decidir si una persona puede
    subir o no a una atracción, lo que ha de indicar por pantalla.

        PSEUDOCODIGO

        float alturaMinima = 1.20;
        float alturaUsuario = 1.50;
        SI alturaUsuario es MAYOR O IGUAL QUE alturaMinima, ENTONCES
            System.out.println("Puedes subir a la atracción.");
        SI NO
            System.out.println("No te puedes subir a la atracción.");


    * Un programa recibe un volumen de arena en kilos. Si es invierno,
    el volumen de la arena habrá de incrementarse en un diez por ciento.
    Mostrar por pantalla la cantidad de arena total.

        PSEUDOCODIGO

        int volumenArena = 78; //cantidad en kilos
        boolean invierno = true;

        SI invierno ES IGUAL A false ENTONCES
            System.out.println("El volumen de arena es de " + arena + "kilos");
        SI NO
            volumenArena = volumenArena * 1.10;  //Incrementa el volumen de arena en un 10 por ciento.
            System.out.println("El volumen de arena es de " + arena + "kilos");


    * Tenemos un botijo, que tiene una capacidad de agua en litros. Se van a hacer tres extracciones
    de agua del botijo, cada una de un número de litros determinado. Si tras alguna de ellas,
    el botijo se queda sin agua, indicarlo por consola; si no es así, cambiar la cantidad de agua
    que queda en el botijo. Si tras las tres extracciones, sigue quedando agua, mostrarlo por consola
     e indicar cuanta queda.

        PSEUDOCODIGO

        int volumenBotijo = 20;    // magnitud en litros
        int cantAguaExtraida = 5;  //Se define una cantidad fija de agua a extraer.

        SI volumenBotijo MAYOR QUE 0
            SI extracciones IGUAL O MENOR QUE 3
                volumenBotijo = volumenBotijo - cantAguaExtraida; // cantidad de agua extraída del volumen total.
            SI NO
                System.out.println("Han sobrado " + volumenBotijo + "litros de agua.");
        SINO
            System.out.println("No queda más agua.");
     */

/*
    * Un avión depende para poder dirigirse a la pista de despegue de que dos banderas de una persona de tierra
     estén levantadas. Indicar por pantalla si el avión puede ir hacia la pista de despegue o no.

        PSEUDOCODIGO

       boolean bandera1Arriba = true;
       boolean bandera2Arriba = true;

         SI bandera1Arriba = true Y bandera1Arriba = true ENTONCES
            System.out.println("El avión puede ir a la pista de despegue.");
         SINO
            System.out.println("El avión NO puede ir a la pista de despegue.");


     * Un programa ha de gestionar las compras en una tienda. Hay 4 productos disponibles, cada uno con un precio
    asociado. Se podrán hacer dos compras, cada una de un solo producto, pero del que se pueden comprar
    varias unidades. El programa mostrará al final las compras realizadas, incluyendo la cantidad de cada
    producto, el dinero gastado en cada compra y el dinero total gastado.

             PSEUDOCODIGO

            //Definir el precio y las unidades a comprar de cada producto.
                float precioProducto1 = 1000;
                int unidadesProducto1 = 20;

                float precioProducto2 = 70;
                int unidadesProducto2 = 14;

                float precioProducto3 = 500;
                int unidadesProducto3 = 8;

                float precioProducto4 = 90;
                int unidadesProducto4 = 4;

                dineroProducto1 = precioProducto1 * unidadesProducto1;
                dineroProducto2 = precioProducto2 * unidadesProducto2;
                dineroProducto3 = precioProducto3 * unidadesProducto3;
                dineroProducto4 = precioProducto4 * unidadesProducto4;

                dineroTotalGastado = dineroCompra1 + dineroCompra2;


        * Un piano tiene 5 teclas, cada una asociada a una nota distinta. El sistema registrará una sola pulsación
    de tres teclas al mismo tiempo. Si las notas de las teclas pulsadas son "DO", "RE" y "MI", indicar por
    pantalla que es "ESCALA", en otro caso, unir en otra cadena las notas tocadas y mostrarlas por pantalla.

        string tecla1 = "DO";
        string tecla2 = "RE";
        string tecla3 = "MI";
        string tecla4 = "FA";
        string tecla5 = "SOL";

        lista pulsacion = [tomar tres elementos aleatorios entre tecla1 al 5];
        pulsacionEscala = ["DO", "RE", "MI"];

        SI pulsacionEscala = true
            System.out.println("ESCALA");
        SINO
        System.out.println("OTRAS NOTAS TOCADAS");

  */

    /*
      * Una cuenta corriente puede ser de tres tipos: adulto, joven y tercera edad. Cada cuenta tiene
    unas comisiones asociadas según su tipo. Indicando al programa una cantidad de cuentas a contratar
    de cada tipo y las comisiones asociadas a cada tipo de cuenta. Entonces calcular el total de comisiones
    y mostrarlo por pantalla.

        PSEUDOCODIGO

        int comisionAdulto = 20;
        int comisionJoven = 12;
        int comisionTerceraEdad = 8;

        //Cantidad de cuentas a contratar
        int cantidadCuentasAdulto = 200;
        int cantidadCuentasJoven = 170;
        int cantidadCuentasTerceraEdad = 180;

*       //Comisiones parciales y total
        int comisionTotalAdulto = comisionAdulto * cantidadCuentasAdulto;
        int comisionTotalJoven = comisionJoven * cantidadCuentasJoven;
        int comisionTotalTerceraEdad = comisionTerceraEdad * cantidadCuentasTerceraEdad;
        int comisionTotalCuentas = comisionTotalAdulto + comisionTotalJoven + comisionTotalTerceraEdad;

         System.out.println("Total comisiones de todas las cuentas: " + comisionTotalCuentas);


      * Vamos a hacer una tortilla de patata, sin cebolla, si al programa le indicamos que tenemos todos los ingredientes
    (huevos y patatas) mostrar por pantalla el mensaje "Se puede hacer la tortilla", en caso contrario,
    sacar por pantalla "No se puede hacer la tortilla" y también sacar por pantalla los ingredientes que falten.

        PSEUDOCODIGO

        boolean huevos = true;
        boolean patata = true;
        boolean cebolla = false;

        SI huevos IGUAL true Y patata IGUAL true Y cebolla IGUAL false
            System.out.println("Se puede hacer la tortilla");
        SI NO
            System.out.println("No se puede hacer la tortilla.");


      * Simularemos el cálculo de horas invertidas en jornadas al mes para una persona. La persona trabajará un total
    de cuatro jornadas al mes. Si estas jornadas son en un día de diario, el total de horas será de 8;
    en el caso de ser en un fin de semana, será de 4. El programa recibirá indicadas las cuatro jornadas
    que haya trabajado la persona según hayan sido o no en fin de semana, tendrá que asociar entonces el
    número de horas trabajadas en ese día y tendrá que calcular y mostrar el total de horas trabajadas ese mes.

        PSEUDOCODIGO

        // El número máximo de jornadas al mes es 4.
        int jornadaDia1 = 8;
        int jornadaDia2 = 8;
        int jornadaDia3 = 8;
        int jornadaDia4 = 4;

        // Luego de saber cuantas horas corresponden a cada jornada se calculan las horas trabajadas al mes.
        int jornadaMes = jornadaDia1 + jornadaDia2 + jornadaDia3 + jornadaDia4;
        System.out.println("El número de horas totales trabajadas al mes es de " + jornadaMes);

*
        * Si el número de kilómetros recorridos supera un umbral indicado al programa,
        mostrarlo con un mensaje adecuado. Usando un consumo de gasolina por kilómetro indicado al programa,
        determinar si el consumo total hasta ahora supera el 90% del tamaño del depósito indicado al programa,
        en el caso de que sea asi, mostrar un mensaje "Entrando en reserva de gasolina".

*           PSEUDOCODIGO
*
*           float kilometrosMax = 0;
*           float kilometrosRecorridos = 0;
*           float gasolinaPorKm = 0.06f; // litro de gasolina por kilómetro recorrido
*           int tamanoDeposito = 1;
*           int tamanoDeposito90 = tamanoDeposito * 0.9; // 90% del tamaño del depósito
*           float consumoTotal = gasolinaPorKm * kilometrosRecorridos; // Cantidad de gasolina consumida en el recorrido (en litros)

*           SI kilometrosRecorridos ES MAYOR QUE kilometrosMax ENTONCES
*               System.out.println("Has sobrepasado los kilometros máximos permitidos");
*           SI NO
*               SI consumoTotal ES MAYOR QUE tamanoDeposito90 ENTONCES
*                   System.out.println("Entrando en reserva de gasolina");
*
*
        *   Un monitor tiene dos tipos de señales disponibles: HDMI y DisplayPort. El monitor podrá estar recibiendo
        señal por ninguna, una o ambas fuentes. Si recibe señal por ambas fuentes, escogerá qué señal muestra en base a
        una señal preferida que tendrá definida; si recibe señal por una sola fuente, usará esa. Mostrar por pantalla
        las distintas combinaciones posibles, indicando si el monitor está recibiendo señal o no y, en el caso de
        recibirla, cuál usará.

*           PSEUDOCODIGO
*
*           boolean senalHDMI = false;
*           boolean senalDisplayPort = false;
*           String senalPreferida = "HDMI";
*
*
*           SI senalHDMI ES IGUAL A true Y senalDisplayPort ES IGUAL A true ENTONCES
*              System.out.println("La senal en uso será la senal preferida: " + senalPreferida);
*           SI NO
*               SI senalHDMI ES IGUAL A true Y senalDisplayPort ES IGUAL A false ENTONCES
*               System.out.println("La senal en uso es HDMI");
*           SI NO
*               SI senalHDMI ES IGUAL A false Y senalDisplayPort ES IGUAL A true ENTONCES
*               System.out.println("La senal en uso es DisplayPort");
*           SINO
*               System.out.println("El monitor no esta recibiendo ninguna senal");
*
*
        *   Se quiere simular un sistema de control del peso en un ascensor. Al ascensor subirán 4 personas, cada una
        con un peso en kilos. El ascensor tendrá un límite de peso en kilos. Diseñar el programa de tal manera que
        las personas vayan subiendo de una a una al ascensor, indicando este si se supera el umbral de peso y la
        cantidad de peso total con la que se ha superado, con lo que no podrán subir más personas; si no se supera
        el umbral, seguir haciendo que suba gente hasta que el ascensor se llene. Si el ascensor se llena y no se supera
        el peso máximo, indicar por pantalla la cantidad de peso total de las personas que hay subidas y cuanto faltó
        para alcanzar el umbral máximo de peso.


        PSEUDOCODIGO

        float pesoMaximo = 0;
        float pesoAscensor = 0;
        float pesoFaltante = pesoMaximo - pesoAscensor;
        float pesoAscensor = pesoAscensor + persona;
        float pesoPersona1 = 90;
        float pesoPersona2 = 90;
        float pesoPersona3 = 90;
        float pesoPersona4 = 90;

        SI pesoAscensor es MAYOR A pesoMaximo ENTONCES
           pesoExcedente = pesoAscensor - pesoMaximo;
           System.out.println("Se ha excedido el limite de peso. Peso excedente: " + pesoExcedente + "kilos.");
           System.out.println("El ascensor no admite mas personas.");
           BREAK
        SI NO ENTONCES
            System.out.println("El peso total de las personas en el ascensor es de " + pesoAscensor + "kilos.");
            System.out.println("Faltan " + pesoFaltante + " kilos para alcanzar el peso máximo.");
     */
/*
    // OPERADORES LOGICOS

    > Mayor que
    < Menor que
    >= Mayor o igual que
    <= Menor o igual que
    | Negacion
    != Distinto de
    == Igual que

    || OR logico
    && AND logico

    VAriable de control
    byte - short - int - char - string

    char c = 'a';
    switch (c) {
        case 'a':
            System.out.println ("Es una vocal");
            break;
        case 'e':
            System.out.println ("Es una vocal");
            break;
        case 'i':
            System.out.println ("Es una vocal");
            break;
        case 'o':
            System.out.println ("Es una vocal");
            break;
        case 'u':
            System.out.println ("Es una vocal");
            break;
        default:
            System.out.println ("No es una vocal");
            break;
    }


    |TRUE
    · FALSE
    -> FALSE

    TRUE AND FALSE
    FALSE
    --> FALSE

    |FALSE OR |TRUE
    · TRUE OR FALSE
    TRUE
    --> TRUE

    EJERCICIOS

    1) (FALSE OR TRUE) AND (TRUE AND TRUE)
        TRUE AND TRUE
        TRUE

    2) !FALSE AND TRUE
        TRUE AND TRUE
        TRUE

    3) !(TRUE OR FALSE) AND (TRUE OR TRUE)
        !TRUE AND TRUE
        FALSE AND TRUE
        FALSE

    4) FALSE OR !TRUE
        FALSE OR FALSE
        FALSE

    5) (!TRUE OR !FALSE) OR !(TRUE AND TRUE)
        (FALSE OR TRUE) OR !(TRUE)
        TRUE OR FALSE
        TRUE

    6) (FALSE AND TRUE) AND ((FALSE OR FALSE) OR (TRUE AND FALSE))
        FALSE AND (FALSE OR FALSE)
        FALSE AND FALSE
        FALSE

    7) !(TRUE AND TRUE) OR !(FALSE AND TRUE)
        FALSE OR !FALSE
        FALSE OR TRUE
        TRUE

    8) !FALSE AND TRUE
        TRUE AND TRUE
        TRUE

    9) (TRUE AND TRUE) AND (FALSE OR TRUE)
        TRUE AND TRUE
        TRUE

    10) ((FALSE OR TRUE) OR !(FALSE AND FALSE)) OR (!TRUE AND FALSE)
        (TRUE OR !FALSE) OR (FALSE AND FALSE)
        (TRUE OR TRUE) OR FALSE
        TRUE OR FALSE
        TRUE

    11) !(TRUE OR !FALSE) AND (FALSE OR TRUE)
        !(TRUE) AND TRUE
        FALSE AND TRUE
        FALSE

    12) !TRUE OR !FALSE
        FALSE OR TRUE
        TRUE

    13) FALSE OR TRUE AND !FALSE OR TRUE AND (!TRUE OR !TRUE)
        TRUE AND TRUE AND (FALSE)
        TRUE AND FALSE
        FALSE

    14) TRUE OR FALSE OR FALSE OR !FALSE
        TRUE OR TRUE
        TRUE

    15) !(FALSE AND TRUE) OR !(TRUE AND TRUE) AND (!FALSE AND !TRUE) AND (FALSE OR TRUE)
        !FALSE OR !TRUE AND FALSE AND TRUE
        TRUE AND FALSE AND TRUE
        FALSE AND TRUE
        FALSE

    16) !(FALSE AND TRUE) OR !(TRUE AND TRUE) AND ((!FALSE AND !TRUE) AND (FALSE OR TRUE))
        TRUE OR FALSE AND (FALSE AND TRUE)
        TRUE AND FALSE
        FALSE

    17) (TRUE OR !FALSE AND (!FALSE OR TRUE OR (FALSE OR FALSE))) OR !(FALSE AND FALSE OR !(!TRUE AND FALSE OR (TRUE AND TRUE)))
        (TRUE AND (TRUE OR FALSE)) OR !(FALSE OR !(FALSE OR TRUE))
        (TRUE AND TRUE) OR !(FALSE OR FALSE)
        TRUE OR !FALSE
        TRUE OR TRUE
        TRUE


 */


}