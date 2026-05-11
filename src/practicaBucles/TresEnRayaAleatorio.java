package practicaBucles;

public class TresEnRayaAleatorio {
    public static void main() {
        char[][] tableroAleatorio = new char[3][3];

        for (int filas = 0; filas < 3; filas++){
            for (int columnas = 0; columnas < 3; columnas++) {
                tableroAleatorio[filas][columnas] = '_';
                System.out.println(tableroAleatorio[filas][columnas]);
            }
        }
    }
}