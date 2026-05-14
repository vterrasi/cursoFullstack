package practicaAbstractasInterfases.monstruomones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combate {
    private List<RegistroTurno> log = new ArrayList<>();
    private Monstruomon jugador;
    private Monstruomon rival;

    public Combate(Monstruomon jugador, Monstruomon rival) {
        this.jugador = jugador;
        this.rival = rival;
    }

    public void iniciar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Inicia el combate: " + jugador.getNombre() + " VS " + rival.getNombre() + "!");

        while (jugador.estaVivo() && rival.estaVivo()) {
            boolean turnoFinalizado = false;

            // --- SUB-BUCLE PARA EL MENÚ DE VELIA ---
            while (!turnoFinalizado) {
                System.out.println("\n--- 🐉 TURNO DE " + jugador.getNombre().toUpperCase() + " 🐉 ---");
                System.out.println("1. ⚔️ Atacar");
                System.out.println("2. 📋 Ver detalle de ataques");
                System.out.print("Elige una opción: ");

                int opcionPrincipal = sc.nextInt();

                if (opcionPrincipal == 2) {
                    // SECCIÓN: CONSULTAR INFO
                    System.out.println("\n¿De qué ataque quieres ver el detalle?");
                    for (int i = 0; i < jugador.getAtaques().size(); i++) {
                        System.out.println(i + ". " + jugador.getAtaques().get(i).getNombre());
                    }
                    System.out.print("Selecciona un número: ");
                    int infoSeleccion = sc.nextInt();

                    // Llamamos al mét0do que creamos en la clase Ataque
                    jugador.getAtaques().get(infoSeleccion).mostrarDetalle();
                    // No cambiamos turnoFinalizado, así que el bucle vuelve arriba para que pueda atacar

                } else if (opcionPrincipal == 1) {
                    // SECCIÓN: LANZAR ATAQUE
                    System.out.println("\nSelecciona el ataque para lanzar:");
                    for (int i = 0; i < jugador.getAtaques().size(); i++) {
                        Ataque ataq = jugador.getAtaques().get(i);
                        System.out.println(i + ". " + ataq.getNombre() + (ataq.puedeUsarse() ? "" : " ❌ (SIN USOS)"));
                    }

                    System.out.print("Elección: ");
                    int seleccion = sc.nextInt();
                    Ataque elegido = jugador.getAtaques().get(seleccion);

                    if (elegido.puedeUsarse()) {
                        ejecutarAccion(jugador, elegido, rival);
                        turnoFinalizado = true; // Salimos del menú y vamos al turno del rival
                    } else {
                        System.out.println("⚠️ ¡Ese ataque no tiene usos! Elige otro.");
                    }
                } else {
                    System.out.println("❌ Opción no válida.");
                }
            }

            // --- TURNO DEL RIVAL (Si sigue vivo tras tu porrazo) ---
            if (rival.estaVivo()) {
                System.out.println("\n--- 🤖 TURNO DEL RIVAL ---");
                turnoRival();
            }
        }

        System.out.println("\n====================================");
        System.out.println("🏆 EL GANADOR ES: " + (jugador.estaVivo() ? jugador.getNombre() : rival.getNombre()));
        System.out.println("====================================\n");
    }

    private void ejecutarAccion(Monstruomon atacante, Ataque ataque, Monstruomon defensor) {
        double mult = CalculadoraDanio.obtenerMultiplicador(ataque.getTipo(), defensor.getTipo());
        double danioTotal = (atacante.getFuerza() + ataque.getDanioBase()) * mult;

        System.out.println(atacante.getNombre() + " usa " + ataque.getNombre() + "!");

        // REGISTRAMOS EL TURNO para las estadísticas
        log.add(new RegistroTurno(ataque.getNombre(), atacante.getNombre(), danioTotal));

        defensor.recibirDanio(danioTotal);
        ataque.reducirUso(); // Aplicamos el extra de usos limitados
    }

    private void turnoRival() {
        // La computadora elige al azar según el enunciado
        int indiceAleatorio = (int) (Math.random() * rival.getAtaques().size());
        Ataque elegido = rival.getAtaques().get(indiceAleatorio);
        ejecutarAccion(rival, elegido, jugador);
    }

    public void finalizarCombate() {
        GestorEstadisticas stats = new GestorEstadisticas(log);
        stats.mostrarResumen();
    }
}