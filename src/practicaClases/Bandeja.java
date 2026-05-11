package practicaClases;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * CLASE: Bandeja
 * Actúa como contenedor intermedio.
 * Su función principal es validar que los alimentos que entran cumplan con los
 * requisitos de espacio, peso y tipo permitido.
 */
class Bandeja {
    private String nombre;
    private int maxAlimentos;
    private double maxPeso;
    private TipoAlimento tipoProhibido;
    private List<Alimento> alimentos = new ArrayList<>();

    public Bandeja(String nombre, int maxAlimentos, double maxPeso, TipoAlimento tipoProhibido) {
        System.out.println("[TRAZA-BANDEJA] Creando '" + nombre + "' (Capacidad: " + maxAlimentos + " unidades, Carga máx: " + maxPeso + "kg)");
        this.nombre = nombre;
        this.maxAlimentos = maxAlimentos;
        this.maxPeso = maxPeso;
        this.tipoProhibido = tipoProhibido;
    }

    /**
     * Intenta añadir un alimento validando todas las restricciones de la bandeja.
     */
    public boolean añadirAlimento(Alimento a) {
        System.out.println("[TRAZA-BANDEJA] " + nombre + " evaluando ingreso de: " + a.getNombre());

        // Regla 1: Capacidad por unidades
        if (alimentos.size() >= maxAlimentos) {
            System.out.println("   ERROR: '" + nombre + "' no admite más unidades (Máx: " + maxAlimentos + ").");
            return false;
        }

        // Regla 2: Capacidad por peso
        double pesoActual = alimentos.stream().mapToDouble(Alimento::getPeso).sum();
        if (pesoActual + a.getPeso() > maxPeso) {
            System.out.println("   ERROR: Peso excesivo para '" + nombre + "'. Actual: " + pesoActual + "kg, Nuevo: " + a.getPeso() + "kg.");
            return false;
        }

        // Regla 3: Tipo de alimento prohibido
        if (a.getTipo() == tipoProhibido) {
            System.out.println("   ERROR: Esta bandeja tiene prohibido almacenar " + tipoProhibido);
            return false;
        }

        alimentos.add(a);
        System.out.println("[TRAZA-BANDEJA] " + a.getNombre() + " añadido correctamente a " + nombre);
        return true;
    }

    /**
     * EXTRA: Mét0do de filtrado avanzado.
     */
    public List<Alimento> obtenerAlimentosFiltrados(TipoAlimento tipo, double pesoMinimo) {
        System.out.println("[TRAZA-BANDEJA] Buscando en '" + nombre + "' productos de tipo " + tipo + " con peso >= " + pesoMinimo);
        return alimentos.stream()
                .filter(a -> a.getTipo() == tipo && a.getPeso() >= pesoMinimo)
                .collect(Collectors.toList());
    }

    public List<Alimento> getAlimentos() { return new ArrayList<>(alimentos); }
    public String getNombre() { return nombre; }
    public int contarAlimentos() { return alimentos.size(); }
}

/**
 * CLASE: ListaCompra
 * Objeto auxiliar que define qué queremos tener en el frigorífico y cuánto cuesta.
 */
class ListaCompra {
    protected Map<String, Integer> deseado = new HashMap<>();
    protected Map<String, Double> precios = new HashMap<>();

    public void definirRequisito(String nombre, int cantidad, double precioUnidad) {
        System.out.println("[TRAZA-LISTA] Añadido a la lista: " + cantidad + "x " + nombre + " (a " + precioUnidad + "€/u)");
        deseado.put(nombre.toLowerCase(), cantidad);
        precios.put(nombre.toLowerCase(), precioUnidad);
    }
}