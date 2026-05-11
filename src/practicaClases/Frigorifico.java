package practicaClases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * CLASE: Frigorifico
 * Es el cerebro de la aplicación.
 * Gestiona el hardware (temperatura), la estructura (bandejas) y la inteligencia de compra.
 */
public class Frigorifico {
    private String modelo;
    private double temperatura;
    private double tMin, tMax;
    private int capacidadBandejas;
    private List<Bandeja> bandejas = new ArrayList<>();

    public Frigorifico(String modelo, double tInicial, double min, double max, int maxB) {
        System.out.println("[TRAZA-FRIGO] Iniciando sistema: Modelo " + modelo);
        this.modelo = modelo;
        this.temperatura = tInicial;
        this.tMin = min;
        this.tMax = max;
        this.capacidadBandejas = maxB;
        System.out.println("[TRAZA-FRIGO] Temperatura actual: " + tInicial + "ºC (Rango: " + min + " a " + max + ")");
    }

    public void ajustarTemperatura(double nueva) {
        System.out.println("[TRAZA-FRIGO] Solicitud de cambio térmico a " + nueva + "ºC");
        if (nueva < tMin || nueva > tMax) {
            System.out.println("MENSAJE CONSOLA: No se puede ajustar a " + nueva + "ºC. Fuera de límites operativos.");
            return;
        }
        this.temperatura = nueva;
        System.out.println("[TRAZA-FRIGO] Temperatura estabilizada en " + temperatura + "ºC");

        // Regla de seguridad alimentaria
        if (this.temperatura > 8.0) {
            System.out.println("⚠️ ATENCIÓN: Temperatura de riesgo detectada. Iniciando protocolo de caducidad...");
            ejecutarProtocoloCaducidad();
        }
    }

    private void ejecutarProtocoloCaducidad() {
        for (Bandeja b : bandejas) {
            for (Alimento a : b.getAlimentos()) {
                if (a.getTipo() == TipoAlimento.CARNE || a.getTipo() == TipoAlimento.EMBUTIDO) {
                    a.marcarComoCaducado();
                }
            }
        }
    }

    public void añadirBandeja(Bandeja b) {
        System.out.println("\n[TRAZA-FRIGO] Intentando instalar bandeja '" + b.getNombre() + "'");
        if (bandejas.size() >= capacidadBandejas) {
            System.out.println("MENSAJE CONSOLA: El frigorífico está completo. No caben más bandejas.");
            return;
        }
        if (b.contarAlimentos() > 0) {
            System.out.println("ERROR: Protocolo de higiene corrompido. La bandeja debe estar vacía para instalarla.");
            return;
        }
        bandejas.add(b);
        System.out.println("[TRAZA-FRIGO] Bandeja instalada. Espacios libres: " + (capacidadBandejas - bandejas.size()));
    }

    public Bandeja buscarBandeja(String nombre) {
        System.out.println("[TRAZA-FRIGO] Buscando compartimento '" + nombre + "'...");
        for (Bandeja b : bandejas) {
            if (b.getNombre().equalsIgnoreCase(nombre)) return b;
        }
        System.out.println("ERROR: No se encuentra ninguna bandeja con ese nombre.");
        return null;
    }
    /**
     * Muestra por consola únicamente los nombres de las bandejas instaladas.
     */

    public void listarBandejas() {
        System.out.println("\n[TRAZA-FRIGO] Solicitado listado de bandejas...");
        System.out.println("--- BANDEJAS EN EL FRIGORÍFICO ---");

        if (bandejas.isEmpty()) {
            System.out.println("(El frigorífico no tiene bandejas)");
            return;
        }

        for (Bandeja b : bandejas) {
            System.out.println("- " + b.getNombre());
        }
        System.out.println("----------------------------------");
    }
    public void listarContenidoTotal() {
        System.out.println("\n--- INVENTARIO ACTUAL (" + modelo + ") ---");
        for (Bandeja b : bandejas) {
            if (b.getAlimentos().isEmpty()) {
                System.out.println("Bandeja [" + b.getNombre() + "]: (Vacía)");
            } else {
                b.getAlimentos().forEach(a -> System.out.println("Bandeja [" + b.getNombre() + "] -> " + a));
            }
        }
    }

    /**
     * Procesa la lista de la compra comparándola con el stock actual.
     */
    public void analizarNecesidades(ListaCompra lista) {
        System.out.println("\n=== ANÁLISIS LOGÍSTICO DE COMPRA ===");
        double costeFinal = 0;

        // Contamos t0do lo que hay en el frigo
        Map<String, Integer> stockReal = new HashMap<>();
        for (Bandeja b : bandejas) {
            for (Alimento a : b.getAlimentos()) {
                String n = a.getNombre().toLowerCase();
                stockReal.put(n, stockReal.getOrDefault(n, 0) + 1);
            }
        }

        // Comparamos con lo deseado
        for (String prod : lista.deseado.keySet()) {
            int tengo = stockReal.getOrDefault(prod, 0);
            int necesito = lista.deseado.get(prod);

            if (tengo < necesito) {
                int aComprar = necesito - tengo;
                double subtotal = aComprar * lista.precios.get(prod);
                costeFinal += subtotal;
                System.out.println("- Producto: " + prod + " | Tengo: " + tengo + " | Faltan: " + aComprar + " | Coste: " + subtotal + "€");
            } else {
                System.out.println("- Producto: " + prod + " | Tengo: " + tengo + " | ESTADO: Cubierto");
            }
        }
        System.out.println(">>> TOTAL PRESUPUESTO COMPRA: " + costeFinal + "€\n");
    }
}