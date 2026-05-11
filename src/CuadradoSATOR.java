public class CuadradoSATOR {
    public static void main() {
        /*
        Crear un algoritmo para comprobar si un array de caracteres de varias dimensiones
        forma un cuadrado mágico de orden 5. Una estructura de este tipo es aquella
        en la que todas las palabras se leen igual tanto de izquierda a derecha, saltando de línea (array),
        como de derecha a izquierda, y además también de arriba a abajo y de abajo a arriba.
        - El cuadrado mágico de orden 5 más conocido es el siguiente:

        SATOR
        AREPO
        TENET
        OPERA
        ROTAS

        - NOTA: Utilizar un array de varias dimensiones para el ejercicio.
            */

        // Defino el array de caracteres
        char[][] cuadradoSator = {
            {'S', 'A', 'T', 'O', 'R'},
            {'A', 'R', 'E', 'P', 'O'},
            {'T', 'E', 'N', 'E', 'T'},
            {'O', 'P', 'E', 'R', 'A'},
            {'R', 'O', 'T', 'A', 'S'}
        };

        boolean esSimetrica = true;

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 5; j++){
                if (cuadradoSator[i][j] != cuadradoSator[4-i][4-j]){
                esSimetrica = false;
                break;
                }
            }
            if (!esSimetrica) {
                break;
            }
        }
        System.out.println(esSimetrica ? "Se cumple la simetría" : "ERROR! No se cumple la simetría");
    }
}
