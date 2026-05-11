public class RomboAnchoMaximo {
    public static void main(String[] args) {
   /*     int n = 21; // Ancho máximo (debe ser impar)
        char c = '*'; // Caracter a usar

        // 1. Parte superior (incluye la línea del medio)
        for (int i = 1; i <= n; i += 2) {
            // Imprimir espacios para centrar
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Imprimir estrellas
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }

        // 2. Parte inferior
        for (int i = n - 2; i >= 1; i -= 2) {
            // Imprimir espacios para centrar
            for (int j = 0; j < (n - i) / 2; j++) {
                System.out.print(" ");
            }
            // Imprimir estrellas
            for (int j = 0; j < i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

*/

/*
    // Crear un programa que genere un rombo de un ancho máximo indicado por un número variable.
    // El ancho mínimo será de 7 y el máximo de 80 (no hace falta comprobar estos valores).
    // El programa tendrá que ser capaz de crear cualquier rombo dentro de los valores indicados.

        int anchoTotal = 33;
        int medio = anchoTotal / 2;
        int posicionInicialPintarAsteriscos;

        // Ajusto con + 2 para completar figura.
        for (int alto = 0, desplazamiento = 0; alto < anchoTotal + 2; alto++) {

            posicionInicialPintarAsteriscos = medio + 1 - desplazamiento;

            for (int posicionFila = 0; posicionFila <= posicionInicialPintarAsteriscos + desplazamiento * 2; posicionFila++) {
                System.out.print(
                    posicionFila >= posicionInicialPintarAsteriscos ? "*" : " "
                );
            }
            System.out.print("\n");

            desplazamiento = alto <= medio ? ++desplazamiento : --desplazamiento;
        }*/

    }
}