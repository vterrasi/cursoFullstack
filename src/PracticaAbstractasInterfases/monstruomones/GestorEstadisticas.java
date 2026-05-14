package practicaAbstractasInterfases.monstruomones;

//CLASE SUGERIDA POR GEMINI PARA SABER CUÁL FUE EL ATAQUE
//MÁS USADO AL FINAL DE LA PARTIDA.

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class GestorEstadisticas {
    private List<RegistroTurno> historial;

    public GestorEstadisticas(List<RegistroTurno> historial) {
        this.historial = historial;
    }

    public void mostrarResumen() {
        System.out.println("\n--- 📊 ESTADÍSTICAS DE LA PARTIDA ---");

        String masUsado = "Ninguno";
        int maxUsos = 0;
        double danioTotal = 0;

        // Mapa para contar cuántas veces se usa cada ataque
        Map<String, Integer> contadorAtaques = new HashMap<>();

        for (RegistroTurno turno : historial) {
            danioTotal += turno.getDanioRealizado();

            // Actualizamos el contador de usos
            int usos = contadorAtaques.getOrDefault(turno.getNombreAtaque(), 0) + 1;
            contadorAtaques.put(turno.getNombreAtaque(), usos);

            if (usos > maxUsos) {
                maxUsos = usos;
                masUsado = turno.getNombreAtaque();
            }
        }

        System.out.println("🔥 Ataque más usado: " + masUsado + " (" + maxUsos + " veces)");
        System.out.println("💥 Daño total causado en el combate: " + danioTotal);
        System.out.println("--------------------------------------\n");
    }
}