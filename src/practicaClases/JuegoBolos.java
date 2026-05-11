package practicaClases;

import java.util.ArrayList;
import java.util.Random;

// --- CLASE BOLO ---
// Esta clase representa al elemento 'bolo' en el juego.
class Bolo {
    private int id;
    private boolean derribado;
    private boolean esEspecial;

    public Bolo(int id) {
        this.id = id;
        this.derribado = false;
        this.esEspecial = false;
    }

    // Getters y Setters
    public int getId() { return id; }
    public boolean isDerribado() { return derribado; }
    public void setDerribado(boolean derribado) { this.derribado = derribado; }
    public boolean isEsEspecial() { return esEspecial; }
    public void setEsEspecial(boolean esEspecial) { this.esEspecial = esEspecial; }
}


// --- CLASE JUEGOBOLOS ---
// Esta clase representa el juego de bolos con sus reglas.
public class JuegoBolos {
    private ArrayList<Bolo> bolos;
    private ArrayList<String> historial; // Para el resumen final
    private int puntuacionTotal;
    private Random random;

    public JuegoBolos() {
        bolos = new ArrayList<>();
        historial = new ArrayList<>();
        puntuacionTotal = 0;
        random = new Random();
    }

    public void nuevoJuego() {
        // 1. Crear 10 bolos
        for (int i = 1; i <= 10; i++) {
            bolos.add(new Bolo(i));
        }

        // 2. Elegir el bolo especial al azar
        int indiceEspecial = random.nextInt(10);
        bolos.get(indiceEspecial).setEsEspecial(true);

        System.out.println("--- ¡COMIENZA EL JUEGO! ---");
        boolean victoria = false;

        // 3. Simular 4 lanzamientos
        for (int i = 1; i <= 4; i++) {
            ejecutarLanzamiento(i);

            // Comprobar si todos los bolos han caído
            if (contarBolosDePie() == 0) {
                victoria = true;
                break;
            }
        }

        // 4. Mostrar resultado y resumen
        mostrarResumen(victoria);
    }

    private void ejecutarLanzamiento(int numLanzamiento) {
        int bolosADerribar = random.nextInt(5); // Entre 0 y 4
        int caidosEnEsteTiro = 0;
        int puntosEsteTiro = 0;
        boolean especialEnEsteTiro = false;

        // Intentar derribar bolos
        int intentos = 0;
        while (caidosEnEsteTiro < bolosADerribar && intentos < 20) {
            int pos = random.nextInt(10);
            Bolo b = bolos.get(pos);

            if (!b.isDerribado()) {
                b.setDerribado(true);
                caidosEnEsteTiro++;

                // Calcular puntos
                int puntosBolo = 10;
                if (b.isEsEspecial()) {
                    puntosBolo = 20; // Puntos doble
                    especialEnEsteTiro = true;
                }
                puntosEsteTiro += puntosBolo;
            }
            intentos++;
        }

        puntuacionTotal += puntosEsteTiro;

        // Guardar en el historial
        String infoTiro = "Tiro " + numLanzamiento + ": " + caidosEnEsteTiro +
                " bolos (Especial: " + (especialEnEsteTiro ? "SI" : "NO") +
                ") -> +" + puntosEsteTiro + " pts";
        historial.add(infoTiro);

        // Mostrar info inmediata
        System.out.println("\n>>> LANZAMIENTO Nº " + numLanzamiento);
        System.out.println("Bolos derribados ahora: " + caidosEnEsteTiro);
        System.out.println("¿Cayó el especial?: " + (especialEnEsteTiro ? "¡SÍ!" : "No"));
        System.out.println("Bolos que quedan: " + contarBolosDePie());
        System.out.println("Puntos del tiro: " + puntosEsteTiro);
        System.out.println("Puntuación total: " + puntuacionTotal);
    }

    private int contarBolosDePie() {
        int cuenta = 0;
        for (Bolo b : bolos) {
            if (!b.isDerribado()) cuenta++;
        }
        return cuenta;
    }

    private void mostrarResumen(boolean gano) {
        System.out.println("\n============================");
        System.out.println("      RESUMEN FINAL");
        System.out.println("============================");
        for (String linea : historial) {
            System.out.println(linea);
        }
        System.out.println("----------------------------");
        System.out.println("PUNTUACIÓN FINAL: " + puntuacionTotal);
        System.out.println("RESULTADO: " + (gano ? "¡VICTORIA! :D" : "DERROTA :("));
    }
}