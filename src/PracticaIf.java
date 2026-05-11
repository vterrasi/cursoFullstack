public class PracticaIf {
    public static void main() {
        System.out.println("EnPracticaIf");
/*

            // Declarar las variables apropiadas y diseñar las siguientes condiciones para comprobar los siguientes enunciados.
            // Utilizar un mensaje por consola para comprobar que las condiciones son correctas.

            // Si una cantidad se corresponde con otra cantidad en una variable.
            int cantidad1 = 10;
            int cantidad2 = 10;

            if (cantidad1 == cantidad2) {
                System.out.println("Las variables son iguales");
            }

            // Si una cadena de texto es igual a otra.
            String texto1 = "miralaluna";
            String texto2 = "miralaluna";

            if (texto1 == texto2){
                System.out.println("Los dos textos son iguales");
            }

            // Si la suma de dos números es menor o igual que otra cantidad variable.
            int cantidad3 = 21;
            int suma1y2 = cantidad1 + cantidad2;

            if (suma1y2 <= cantidad3){
                System.out.println("La suma de cantidad1 + cantidad2 es menor que la cantidad3.");
            }

            //Si un carácter es igual a otro y un número es distinto de otro.
            char caracter1 = 'f';
            char caracter2 = 'f';
            float num1 = 6.7f;
            float num2 = 8.4f;

            if (caracter1 == caracter2 && num1 != num2){
                    System.out.println("Los caracteres son iguales y los numeros son distintos.");
            }

            //Si la multiplicación y la suma de dos números iguales, sumados sus resultados,
            // es mayor o igual que otro número.
            int producto1y2= cantidad1 * cantidad2;
            int sumaProductoySuma = 420;
            int cantidad4 = 450;

            if (sumaProductoySuma >= cantidad4) {
                System.out.println("La multiplicación y la suma, sumadas, de cantidad1 y cantidad2 es igual a cantidad4");
            }

            //Si una variable es verdadera y además una cadena de texto es igual a otra.
            boolean variable1 = true;
            if (variable1 && texto1.equals(texto2)){
                    System.out.println("La variable1 es verdadera y texto1 es igual a texto2.");
            }

            //Si la división de dos números da como resultado un número positivo o
            // si la resta de esos dos números es mayor que 2.
                float division1 = num1 / num2;
                float resta1 = num1 - num2;
                if (division1 > 0 || resta1 > 2) {
                    System.out.println("la division de num1 y num2 es un numero positivo y su resta es mayor que 2.");
                }

            //Si un carácter es igual a uno de dos caracteres distintos en variables.
                char caracter3 = 'm';
                if (caracter1 == caracter2 || caracter1 == caracter3){
                    System.out.println("El caracter3 es igual a uno de los dos caracteres dados.");
                }

            //Si una variable booleana u otra son verdaderas, además de que un carácter sea distinto de uno a comparar.
                boolean variable2 = true;
                char caracter4 = 'r';

                if ((variable1 == true || variable2 == true) && ((caracter1) != (caracter4))){
                System.out.println("Una de las variables es verdadera y además el caracter1 es distinto del caracter4.");
            }

            //Si la multiplicación de tres números da un resultado que sea menor o igual que 20 o mayor o igual que 30,
            // o si una cadena de texto es igual que otra.
                float num3 = 1.3f;
                float producto1_2_3 = num1 * num2 * num3;
                String texto3 = "lallamaquellama";
                String texto4 = "lallamaquellama";

                if ((producto1_2_3 <= 20 || producto1_2_3 >= 30) || (texto3.equals(texto4))){
                    System.out.println("El producto cumple una de las dos condiciones.");
                }


            // Si un número es mayor que 10 o, si no, si es menor o igual que 3. Indicar ambos casos.

            */
/*          int num1 = 11;
            if (num1 >= 10) {
                System.out.println("El numero es mayor o igual que 10");
            } else if (num1 <= 3) {
                System.out.println("El numero es menor o igual que 3");
            }*//*



            // Si un carácter es una c, o una d, o una f indicarlo, incluyendo qué carácter es;
            // indicar también en cualquier otro caso, que no es ninguno de los anteriores.

            char char1 = 'c';

            if (char1 == 'c') {
                System.out.println("El caracter es una 'c'.");
            } else if (char1 == 'd') {
                System.out.println("El caracter es una 'd'.");
            } else if (char1 == 'f') {
                System.out.println("El caracter es una 'f'.");
            } else {
                System.out.println("El caracter no es c, d o f");
            }

            //Si un booleano es true, si un número es mayor que 10, indicarlo.
            // En el caso de que no sea true el booleano, indicarlo.

            boolean bool1 = false;
            float numf = 12;

            if (bool1) {
                if (numf > 10) {
                    System.out.println("La variable es verdadera y el numero es igual o mayor que 10");
                } else {
                    System.out.println("La variable es falsa");
                }
            }

            // Si un booleano es true y si un número es mayor que 10, indicarlo.
            // En el caso de que no sea true el booleano, indicarlo.

            if (numf > 10) {
                if (bool1) {
                    System.out.println("La variable es verdadera y el numero es igual o mayor que 10");
                } else {
                    System.out.println("La variable es falsa");
                }
            }

            //Si un booleano es true, si un número es mayor que 10, indicarlo
            // si no es mayor que 10, indicarlo. En el caso de que no sea true el booleano, indicarlo.

            */
/*          boolean bool2 = true;
            float num2 = 14.1;

            if (bool2 && num2 > 10) {
                System.out.println("La variable es verdadera y el numero es igual o mayor que 10");
            } else if (bool2 == true && num2 <= 10) {
                System.out.println("el numero es menor que 10");
            } else if (bool2 == false) {
                System.out.println("La variable es falsa");
            }
            *//*

            // Si un carácter es una r o si un número es distinto de 234, si el número es menor que 100, indicarlo,
            // en cualquier otro caso, indicarlo.

            */
/*          char r = 'r';
            float num3 = 60;

            if (r == 'r' || x != 234) {
                if (num3 < 100) {
                    System.out.println("El numero es menor que 100");
                } else {
                    System.out.println("El numero es mayor o igual que 100");
                }
            }*//*

            //Si una cadena de texto es "precio" y un booleano es falso, indicarlo. Si esto no se cumple, comprobar
            //si la cadena de texto es precio o si no lo es, indicando ambos casos.

            String cadena1 = "precio";
            boolean b1 = false;
            if (cadena1.equals("precio") && !b1) {
                System.out.println("La cadena de texto es 'precio' y el booleano es falso.");
            } else if (b1 && cadena1.equals("precio")) {
                System.out.println("La cadena de texto es 'precio' y el valor bool1 es verdadero.");
            } else if (b1 && cadena1 != "precio") {
                System.out.println("La cadena de texto es distinta de 'precio' y el valor bool1 es verdadero.");
            }


            // Si dos números son mayores que 100, indicarlo; si además de ser mayores que 100,
            // un booleano es true, indicarlo; si no lo es, indicarlo. Si no son mayores que 100, indicarlo.

             */
/*              int num1 = 40;
                int num2 = 98;
                boolean bool1 = true;

                if (num1 > 100 && num2 > 100) {
                    System.out.println("Los numeros son ambos mayores que 100.");
                } else if (num1 < 100 && num2 < 100){
                    System.out.println("Los numeros son ambos menores que 100.");
                }*//*


            //System.out.println("\n");

            //  Hay tres números. Comprobar si el primero es mayor que el segundo y el tercero. Si es así,
            // indicarlo y comprobar entonces si el segundo es mayor que el tercero, indicándolo, o si es el tercero
            // el que es mayor que el segundo, indicándolo. Si no es así (el primero es mayor que el segundo y el tercero),
            // comprobar si el segundo es mayor que el primero, indicándolo, o si el tercero es mayor que el primero,
            // indicandolo.

                int valorNum1 = 60;
                int valorNum2 = 48;
                int valorNum3 = 35;

                if ((valorNum1 > valorNum2) && (valorNum1 > valorNum3)) {
                    System.out.println("El primer numero es el mayor.");
                } else if ((valorNum1 > valorNum2) && (valorNum2 > valorNum3)) {
                    System.out.println("El segundo numero es mayor que el tercero.");
                } else if ((valorNum1 > valorNum2) && (valorNum3 > valorNum2)) {
                    System.out.println("El tercer numero es mayor que el segundo.");
                } else if (valorNum2 > valorNum1)  {
                    System.out.println("El segundo numero es mayor que el primero.");
                } else if (valorNum3 > valorNum1) {
                    System.out.println("El tercer numero es mayor que el primero.");
                }

                System.out.println("\n");

            //  Disponemos (o no) de los siguientes ingredientes para hacer una paella: arroz, pollo, judías verdes.
            // Indicar si se puede hacer la paella (disponemos de todos los ingredientes) o si no se puede hacer.
            // Indicar qué ingredientes faltan.

            boolean arroz = false;        boolean pollo = false;
            boolean judiasverdes = false;

            if (arroz && pollo && judiasverdes) {
                System.out.println("Se puede hacer la paella ya que tenemos todos los ingredientes.");
            } else if (!arroz && pollo && judiasverdes) {
                System.out.println("No se puede hacer la paella ya que falta arroz.");
            } else if (!arroz && !pollo && judiasverdes) {
                System.out.println("No se puede hacer la paella ya que falta pollo y arroz.");
            } else if (!arroz && !judiasverdes && pollo) {
                System.out.println("No se puede hacer la paella ya que faltan judías verdes y arroz.");
            } else if (arroz && judiasverdes && !pollo) {
                System.out.println("No se puede hacer la paella ya que falta pollo.");
            } else if (arroz && !judiasverdes && !pollo) {
                System.out.println("No se puede hacer la paella ya que falta pollo y judías verdes.");
            } else {
                System.out.println("No se puede hacer la paella ya que faltan todos los ingredientes.");

            }

            System.out.println("\n");

            //  Una persona dispone de una cantidad de dinero para pedir una hipoteca. La hipoteca ha de determinar
            //  una cantidad para abonar como entrada. Además, se comprobará si el cliente ha pasado
            //  la evaluación de riesgos. El programa ha de indicar los distintos casos: se concede la hipoteca o,
            //  si la persona no tiene dinero para la entrada o no pasa la evaluación de riesgos.
            //  Usa mensajes apropiados.

                int dineroSolicitudHipoteca = 3000;
                int dineroEntradaHipoteca = 700;
                boolean evaluacionRiesgos = false;

                if (dineroEntradaHipoteca < dineroSolicitudHipoteca) {
                    if (evaluacionRiesgos) {
                        System.out.println("Se concede la hipoteca.");
                    } else {
                        System.out.println("La persona no ha superado la evaluacion de riesgos. No se le concederá la hipoteca.");
                    }
                } else {
                    System.out.println("La persona no tiene dinero suficiente.");
                }

            System.out.println("\n");


            // Se desea que un programa muestre el nombre real de algunos de Los Vengadores.
            // En base a un nombre de vengador que se le pase al programa, este sacará por pantalla el nombre real.
            // Los nombres de "vengador" son: Iron Man, Capitán América, Viuda Negra y Hulk;
            // los nombres reales son: Tony Stark, Steve Rogers, Natasha Romanoff y Bruce Banner.

            String nombreVengador = "Capitán América";
            switch (nombreVengador) {
                case "Iron Man":
                    System.out.println("El nombre real de Iron Man es Tony Stark .");
                    break;
                case "Capitán América":
                    System.out.println("El nombre real de Capitán América es Steve Rogers.");
                    break;
                case "Viuda Negra":
                    System.out.println("El nombre real de Viuda Negra es Natasha Romanoff.");
                    break;
                case "Hulk":
                    System.out.println("El nombre real de Hulk es Bruce Banner.");
                    break;
            }
*/


        //El programa hará una evaluación de riesgos para una operación. Usará para elaborarlo un ratio de endeudamiento
        // proporcionado, que irá del 0% al 100% y una cantidad de dinero disponible.
        // El resultado podrá ser "CONCEDER", "DENEGAR" O "CONSULTAR" y las reglas para elaborarlo:
        //· Si el ratio de endeudamiento es igual o superior al 80%, en cualquier caso, denegar.
        //· Si el ratio de endeudamiento es inferior al 20%, si el dinero disponible es menor que 10.000, consultar;
        //si es igual o superior a 10.000, conceder.
        //· Si el ratio de endeudamiento está entre el 20% y el 50%, si el dinero disponible es mayor que 20.000,
        // conceder, en caso contrario consultar.
        //· Si el ratio de endeudamiento está entre el 50% y el 80%, consultar.
        //Mostrar el resultado de la evaluación por pantalla.

     /*   float dineroDisponible = 35000;
        float ratioEndeudamiento = 36;    // En porcentaje.
        boolean evaluacionRiesgoOperacion = false;

        if (ratioEndeudamiento >= 80) {
            System.out.println("DENEGAR");
        } else if (ratioEndeudamiento <= 20) {
            if (dineroDisponible < 10000) {
                System.out.println("CONSULTAR");
            } else if (dineroDisponible > 10000) {
                System.out.println("CONCEDER");
            }

        } else if (ratioEndeudamiento > 20 && ratioEndeudamiento < 50) {
            if (dineroDisponible > 20000) {
                System.out.println("CONCEDER");
            } else {
                System.out.println("CONSULTAR");
            }
        } else if (ratioEndeudamiento >= 50 && ratioEndeudamiento < 80) {
            System.out.println("CONSULTAR");
        }

        // Una persona dispone de una cartera de inversiones, en la que ha invertido una cantidad de dinero.
        // En esta cartera habrá cuatro empresas incluidas, cada una representando un porcentaje de lo invertido hasta
        // llegar al 100%. Además cada una de estas empresas repartirá una cantidad en dividendos al año.
        // El programa ha de usar esta cantidad de dividendos y, en base al porcentaje invertido en esa cartera en
        // esa empresa, determinar qué cantidad le corresponde al cliente. El programa calculará los dividendos
        // que le tocan al cliente de las cuatro empresas. Además el programa otorgará un ratio de desempeño a la cartera.
        // Si la cantidad de dividendos es superior a 1.000, ese ratio será "BUENO", si está entre 500 y 1000,
        // será de "ESTÁNDAR" y, si es inferior a 500 "BAJO".

        // El programa indicará al cliente:
        // El total de dinero disponible (lo invertido más los dividendos).
        //El ratio de desempeño de su cartera.

        double capital = 20000;

        // Porcentaje de inversion de las 4 empresas
        float fraccionEmpresa1 = 0.20f;
        float fraccionEmpresa2 = 0.30f;
        float fraccionEmpresa3 = 0.15f;
        float fraccionEmpresa4 = 0.35f;

        double dividendosEmpresa1 = 5.37e3;
        double dividendosEmpresa2 = 2.15e3;
        double dividendosEmpresa3 = 15e3;
        double dividendosEmpresa4 = 5.01e3;

        //Cantidad de dinero que gana el cliente.
        double dividendos = ((dividendosEmpresa1 * fraccionEmpresa1) + (dividendosEmpresa2 * fraccionEmpresa2) + (dividendosEmpresa3 * fraccionEmpresa3) + (dividendosEmpresa4 * fraccionEmpresa4));

        System.out.printf("El dinero total disponible es: %,.2f euros", (capital + dividendos));

        System.out.println("\n");
        if (dividendos > 1000) {
            System.out.println("Ratio de desempeño: BUENO");
        } else if ((dividendos >= 500) && (dividendos <= 1000)) {
            System.out.println("Ratio de desempeño: ESTÁNDAR");
        } else if (dividendos < 500) {
            System.out.println("Ratio de desempeño: BAJO");
        }

        System.out.println("\n");*/
        /*La familia Roy se prepara para La Sucesión. El padre, Logan, ha de escoger entre sus 4 hijos, Kendall, Roman,
        Shiv y Connor, quién tomará el timón de su empresa. Para ello, hemos de conocer de cada hijo si quiere ser sucesor
        o no. Además, Logan indicará un favorito. El programa ha de determinar qué persona sucederá a Logan. Para ello
        comprobará si la persona desea suceder a Logan y, además, quien es el favorito/a de Logan. El favorito/a siempre
        prevalecerá sobre el resto y solo si este no desea sucederle, entonces el sistema indicará por mensaje entre
        quienes ha de elegir. Contemplar también el caso de que nadie quiera suceder y también el de que no haya un
        sucesor claro, lo que el programa indicará, mostrando los posibles sucesores pero sin elegir ninguno.*/


        //Indica si cada hijo quiere o no suceder a su padre.
        boolean sucederKendall = false;
        boolean sucederRoman = true;
        boolean sucederShiv = false;
        boolean sucederConnor = false;
/*
        //Indica el favorito del padre para la sucesion.
        String favoritoLogan = "Kendall";

            if ((favoritoLogan.equals("Kendall") || (favoritoLogan.equals("Roman")) || favoritoLogan.equals("Shiv") || favoritoLogan.equals("Connor")) && (!sucederRoman && !sucederConnor && !sucederKendall && !sucederShiv)){

                System.out.println("Ninguno de los 4 hijos desea ser el sucesor.");

            } else if (favoritoLogan.equals("Roman")){
               if (sucederRoman) {
                   System.out.println("El sucesor es Roman.");
               } else {
                   if (!sucederKendall) {
                       if (!sucederShiv) {
                           System.out.println("Roman no desea ser el sucesor. Connor desea ser el sucesor pero no es el favorito.");
                       } else if (!sucederConnor) {
                           System.out.println("Roman no desea ser el sucesor. Shiv desea ser el sucesor pero no es el favorito.");
                       }

                   } else if (sucederKendall) {
                       if (!sucederShiv) {
                           System.out.println("Roman no desea ser el sucesor. Kendall y Connor desean ser el sucesor pero ninguno es el favorito.");
                       } else {
                           System.out.println("Roman no desea ser el sucesor. Kendall y Shiv desean ser el sucesor pero ninguno es el favorito.");
                       }

                   }
               }

           } else if (favoritoLogan.equals("Kendall")) {
                if (sucederKendall) {
                    System.out.println("El sucesor es Kendall.");
                } else {
                    if (!sucederRoman) {
                        if (!sucederShiv) {
                            System.out.println("Kendall no desea ser el sucesor. Connor desea ser el sucesor pero no es el favorito.");
                        } else if (!sucederConnor) {
                            System.out.println("Kendall no desea ser el sucesor. Shiv desea ser el sucesor pero no es el favorito.");
                        }

                    } else {
                        if (!sucederShiv) {
                            System.out.println("Kendall no desea ser el sucesor. Roman y Connor desean ser el sucesor pero ninguno es el favorito.");
                        } else {
                            System.out.println("Kendall no desea ser el sucesor. Roman y Shiv desean ser el sucesor pero ninguno es el favorito.");
                        }

                    }

                }
           }


        //-----------------------------------------------------------------------------------------------------

           } else if (favoritoLogan.equals("Kendall")){
               if (sucederKendall) {
                   System.out.println("El sucesor es Kendall.");
               } else {
                   System.out.println("Kendall no desea ser el sucesor. Debes elegir entre Roman, Shiv y Connor.");
               }
           } else if (favoritoLogan.equals("Shiv")){
               if (sucederShiv) {
                   System.out.println("El sucesor es Shiv.");
               } else {
                   System.out.println("Shiv no desea ser el sucesor. Debes elegir entre Kendall, Roman y Connor.");
               }
           } else if (favoritoLogan.equals("Connor")){
               if (sucederConnor) {
                   System.out.println("El sucesor es Connor.");
               } else {
                   System.out.println("Connor no desea ser el sucesor. Debes elegir entre Kendall, Shiv y Roman.");
               }
       }
       */

       /* Crear 3 variables enteras, peras, manzanas, uvas y asignarles los valores que se deseen.
        Codificar la/s siguiente/s comprobación/es:

            * Si tengo más manzanas que peras, y además tengo 10 manzanas,
            mostrar el mensaje, "Tengo más manzanas que peras y son 10 justas".

            * Si tengo más manzanas que peras, y no son 10 manzanas,
            mostrar el mensaje, "Tengo más manzanas que peras".

            * Si no tengo más manzanas que peras, pero tengo más manzanas que uvas y son 10 manzanas,
            mostrar el mensaje, "Tengo más manzanas que uvas y son 10 justas".

            * Si no tengo más manzanas que peras, y no tengo más manzanas que uvas y son 10 manzanas,
            mostrar el mensaje, "¿De qué me sirven estas 10 manzanas?".

            * Si no tengo más manzanas que peras, y no tengo más manzanas que uvas y tengo menos de 5 manzanas,
            mostrar el mensaje, "Tengo que comprar manzanas, que se me acaban".


                Comprobar que aparezcan todos mensajes variando los valores de las variables.
            */
            int manzanas = 12;
            int peras = 4;
            int uvas = 6;

            if (manzanas > peras) {
                if (manzanas == 10) {
                    System.out.println("Tengo más manzanas que peras y son 10 justas.");
                } else {
                    System.out.println("Tengo más manzanas que peras.");
                }
            } else if (manzanas < peras) {
                if (manzanas > uvas) {
                    if (manzanas == 10) {
                        System.out.println("Tengo más manzanas que uvas y son 10 justas.");
                    }
                } else {
                    if (manzanas < 5) {
                        System.out.println("Tengo que comprar manzanas, que se me acaban.");
                    }
                }
            }
        System.out.println("\n");

        /* Crear las variables booleanas perasBaratas, uvasBaratas, uvasEstanricas y perasEstanRicas.
        Inicializarlas a false. Ahora se pide modelar estos requisitos, expresados en lenguaje de alto nivel (humano)
        en comprobaciones: Me gustan más las uvas que las peras, así que si están baratas las dos, sin duda compraría uvas;
        aunque si las uvas no están baratas y las peras si, buf, entonces compraría las peras antes
        que las uvas ¡qué hay que ahorrar!, pero solo si las peras están ricas, si no nada.
            Y vamos, es que las uvas me gustan un montón, así que aunque no estén baratas las compraría igual antes que las
        peras, pero si están ricas claro; aunque si están baratas y no están ricas las compraría también.
        Mostrar un mensaje apropiado en cada decisión. */


        boolean perasBaratas = true;
        boolean uvasBaratas = true;
        boolean uvasEstanricas = false;
        boolean perasEstanRicas = false;

        if (perasBaratas) {
            if (uvasBaratas) {
                System.out.println("Compraré uvas.");
            } else {
                if (perasEstanRicas) {
                    System.out.println("Compraré peras.");
                } else {
                    if (uvasEstanricas || !uvasEstanricas) {
                        System.out.println("Compraré uvas de todas maneras.");
                    }
                }
            }

        }

        /* Se nos pide modelar una estructura de decisión en base a las siguientes reglas de negocio:

            * Dado un número entero, si este es negativo, solo si un caracter es una vocal, mostrar que es una vocal.
            Si el carácter no es una vocal, mostrarla por pantalla.

            * Dado un número entero y si el carácter es una vocal, si este es igual a 0, indicarlo por pantalla.

            * Dado un número entero, si este es positivo, solo si un carácter es una vocal, comprobar
            si una cadena de texto recibida como variable es "POSITIVO", si es así, mostrar por pantalla "POSITIVO",
            si no es así, mostrar "CASI POSITIVO".

        */
        System.out.println("\n");

        int numEntero = 20;
        char esVocaloNo = 'e';
        String cadenaDeTexto = "masquenada";

        if (numEntero < 0) {
            switch (esVocaloNo) {
                case 'a':
                    System.out.println("Es una vocal");
                    break;
                case 'e':
                    System.out.println("Es una vocal");
                    break;
                case 'i':
                    System.out.println("Es una vocal");
                    break;
                case 'o':
                    System.out.println("Es una vocal");
                    break;
                case 'u':
                    System.out.println("Es una vocal");
                    break;
                default:
                    System.out.println("'" + esVocaloNo + "'" + ". No es una vocal.");

            }
        } else if (numEntero == 0) {
            switch (esVocaloNo) {
                case 'a':
                    System.out.println("El numero es igual a 0");
                    break;
                case 'e':
                    System.out.println("El numero es igual a 0");
                    break;
                case 'i':
                    System.out.println("El numero es igual a 0");
                    break;
                case 'o':
                    System.out.println("El numero es igual a 0");
                    break;
                case 'u':
                    System.out.println("El numero es igual a 0");
                    break;
            }

        } else {
            if (cadenaDeTexto.equals("POSITIVO")){
                switch (esVocaloNo){
                    case 'a':
                        System.out.println("POSITIVO");
                        break;
                    case 'e':
                        System.out.println("POSITIVO");
                        break;
                    case 'i':
                        System.out.println("POSITIVO");
                        break;
                    case 'o':
                        System.out.println("POSITIVO");
                        break;
                    case 'u':
                        System.out.println("POSITIVO");
                        break;
                }
            } else {
                System.out.println("CASI POSITIVO");
            }
        }








    }
}
