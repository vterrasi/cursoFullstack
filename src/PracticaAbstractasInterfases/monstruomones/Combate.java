package practicaAbstractasInterfases.monstruomones;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combate {
    private List<RegistroTurno> log = new ArrayList<>(); // El historial de la partida
    private Monstruomon jugador;
    private Monstruomon rival;

    public Combate(Monstruomon jugador, Monstruomon rival) {
        this.jugador = jugador;
        this.rival = rival;
    }

    public void iniciar() {
        System.out.println("¡Inicia el combate: " + jugador.getNombre() + " VS " + rival.getNombre() + "!");

        while (jugador.estaVivo() && rival.estaVivo()) {
            turnoJugador();
            if (rival.estaVivo()) turnoRival();
        }

        System.out.println("El ganador es: " + (jugador.estaVivo() ? jugador.getNombre() : rival.getNombre()));
    }

    private void ejecutarAccion(Monstruomon atacante, Ataque ataque, Monstruomon defensor) {
        double mult = CalculadoraDanio.obtenerMultiplicador(ataque.getTipo(), defensor.getTipo());
        double danioTotal = (atacante.getFuerza() + ataque.getDanioBase()) * mult;

        System.out.println(atacante.getNombre() + " usa " + ataque.getNombre() + " (" + ataque.getTipo() + ")");
        defensor.recibirDanio(danioTotal);
    }

    // Esta variante del método es para el extra de Estadísticas
//    private void ejecutarAccion(Monstruomon atacante, Ataque ataque, Monstruomon defensor) {
//        double mult = CalculadoraDanio.obtenerMultiplicador(ataque.getTipo(), defensor.getTipo());
//        double danioTotal = (atacante.getFuerza() + ataque.getDanioBase()) * mult;
//
//        // REGISTRAMOS EL TURNO
//        log.add(new RegistroTurno(ataque.getNombre(), atacante.getNombre(), danioTotal));
//
//        defensor.recibirDanio(danioTotal);
//        ataque.reducirUso(); // Aplicamos el extra de usos limitados
//    }

    private void turnoJugador() {
        // Aquí iría la lógica del Scanner para elegir el ataque de la lista del Monstruomon
        Ataque elegido = jugador.getAtaques().get(0); // Ejemplo simplificado
        ejecutarAccion(jugador, elegido, rival);

//        4. Extra: Cambiar Monstruomones durante el combate
//        Añadiríamos una opción en el menú del jugador:
//
//        System.out.println("1. Atacar | 2. Cambiar Monstruomon");
//        int opcion = scanner.nextInt();
//
//        if (opcion == 2) {
//            cambiarMonstruomonActivo();
//        } else {
//            // Lógica de ataque normal
//        }
    }

    private void turnoRival() {
        // La computadora elige al azar según el enunciado
        int indiceAleatorio = (int) (Math.random() * rival.getAtaques().size());
        Ataque elegido = rival.getAtaques().get(indiceAleatorio);
        ejecutarAccion(rival, elegido, jugador);
    }

    //Este metodo es para hacer el extra de Estadísticas
    public void finalizarCombate() {
        GestorEstadisticas stats = new GestorEstadisticas(log);
        stats.mostrarResumen();
    }
}