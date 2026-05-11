package vasomatic2000plus;

public class MainPracticaVasomatic {
    public static void main(String[] args) {
    // Probamos la función con un vaso de altura 6
            crearVasomatic(4);
    }

    /* Crear la función Vasomatic 2.000K+
    - La función recibirá por parámetro un número entero (mínimo 4 y máximo 10) y no devolverá nada.
    - Se pintará en consola un "vaso" de 3 caracteres de ancho y un alto indicado por el número pasado como parámetro.
    - El vaso empezará vacío.
    - El vaso se irá llenando de agua (caracteres apropiados en color azul) a razón de un "nivel" cada vez.
    - Cada vez que se llene un "nivel" del vaso, hacer que el programa espere al menos un segundo.
    - Seguir llenando el vaso hasta que alcance el máximo de llenado.
    - Cuando el vaso esté "lleno" el programa terminará.
     */

    public static void crearVasomatic(int altura) {
        if (altura < 4 || altura > 10) {
            System.out.println("Error: El tamaño debe ser entre 4 y 10.");
            return;
        }

        String azul = "\u001B[34m";
        String verde = "\u001B[32m";
        String amarillo = "\u001B[33m";
        String reset = "\u001B[0m";

        // El bucle empieza en 0 (vacío) hasta la altura total
        for (int nivelAgua = 0; nivelAgua <= altura; nivelAgua++) {

            // Limpiamos la pantalla (efecto animación)
            for (int i = 0; i < 20; i++) System.out.println();

            // Dibujamos el vaso según el nivel de agua actual
            for (int piso = altura; piso >= 1; piso--) {
                System.out.print("|");
                if (piso <= nivelAgua) {
                    System.out.print(azul + "ooo" + reset);
                } else {
                    System.out.print("   ");
                }
                System.out.println("|");
            }
            System.out.println("+---+");

            // LÓGICA DE ESPERA:
            // Si acabamos de pintar el vaso vacío (nivelAgua 0), NO esperamos un segundo,
            // porque el enunciado dice que se espera CADA VEZ QUE SE LLENE UN NIVEL.
            // Tampoco esperamos cuando ya está lleno del todo (nivelAgua == altura).
            if (nivelAgua < altura) {
                try {
                    // Si el nivel es 0, la primera vez pasará casi instantáneo al nivel 1
                    // Para que se vea el llenado real, solo dormimos cuando hay agua entrando.
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Error en la pausa.");
                }
            }
        }

        // Mensaje final
        System.out.println("\n" + amarillo + "***************************" + reset);
        System.out.println(verde + "   ¡VASO LLENO AL MAXIMO!   " + reset);
        System.out.println(verde + "      Vasomatic 2.000K+     " + reset);
        System.out.println(amarillo + "***************************" + reset);
        System.out.print("\007");
    }
}