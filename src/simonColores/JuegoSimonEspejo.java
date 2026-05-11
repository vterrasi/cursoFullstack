package simonColores;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class JuegoSimonEspejo {

    // --- EL DIRECTOR DE ORQUESTA (MAIN) ---
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<String> memoria = new ArrayList<>();
        String[] colores = {"rojo", "amarillo", "verde", "azul"};

        // El usuario elige su destino
        int meta = elegirDificultad(lector);
        boolean vivo = true;

        while (vivo && memoria.size() < meta) {
            añadirColor(memoria, colores);
            mostrarSecuencia(memoria);

            vivo = comprobarTurno(memoria, lector);

            if (!vivo) {
                System.out.println("💥 ¡Error! Te quedaste en " + (memoria.size() - 1) + " colores.");
            } else if (memoria.size() == meta) {
                System.out.println("👑 ¡VICTORIA TOTAL! Superaste el modo elegido.");
            } else {
                System.out.println("✅ ¡Siguiente nivel!");
                esperar(1000);
            }
        }
        lector.close();
    }

    // 1. FUNCIÓN EXTRA: El Selector Visual
    public static int elegirDificultad(Scanner lector) {
        System.out.println("Elige dificultad: [facil] [medio] [dificil]");
        String eleccion = lector.nextLine().toLowerCase().trim();

        System.out.println("\nHas seleccionado:");
        // Dibujamos las opciones y ponemos el asterisco debajo de la elegida
        System.out.println(" FACIL   MEDIO   DIFICIL");

        int turnos = 6; // Por defecto

        if (eleccion.equals("facil")) {
            System.out.println("   *");
            turnos = 4;
        } else if (eleccion.equals("medio")) {
            System.out.println("           *");
            turnos = 8;
        } else if (eleccion.equals("dificil")) {
            System.out.println("                   *");
            turnos = 12;
        } else {
            System.out.println("No te entendí, jugaremos en FACIL por defecto.");
            System.out.println("   *");
            turnos = 4;
        }

        esperar(1500);
        return turnos;
    }

    // 2. FUNCIÓN: Generar color
    public static void añadirColor(ArrayList<String> lista, String[] opciones) {
        Random dado = new Random();
        lista.add(opciones[dado.nextInt(opciones.length)]);
    }

    // 3. FUNCIÓN: Mostrar secuencia
    public static void mostrarSecuencia(ArrayList<String> lista) {
        System.out.println("\n--- ¡ATENCIÓN! ---");
        for (String color : lista) {
            System.out.println(">>> " + color.toUpperCase() + " <<<");
            esperar(1000);
        }
        for (int i = 0; i < 30; i++) System.out.println(); // Limpiar pantalla
    }

    // 4. FUNCIÓN: Comprobar Turno
    public static boolean comprobarTurno(ArrayList<String> lista, Scanner lector) {
        System.out.println("Repite la secuencia:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print((i + 1) + "º: ");
            if (!lector.nextLine().toLowerCase().trim().equals(lista.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (Exception e) {
        }
    }
}