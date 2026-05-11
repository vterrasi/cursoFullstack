package practicaClases;

/**
 * ENUM: TipoAlimento
 * Define las categorías básicas que el sistema reconoce.
 * Ayuda a evitar errores de escritura y facilita las validaciones de las bandejas.
 */
enum TipoAlimento {
    VERDURA, CARNE, FRUTA, EMBUTIDO, QUESO, LACTEOS
}

/**
 * CLASE: Alimento
 * Representa la unidad básica del sistema.
 * Contiene información sobre qué es, cuánto pesa y si sigue siendo apto para consumo.
 */
class Alimento {
    private String nombre;
    private TipoAlimento tipo;
    private double peso;
    private boolean caducado = false; // Por defecto, t0do alimento nace fresco.

    public Alimento(String nombre, TipoAlimento tipo, double peso) {
        System.out.println("[TRAZA-ALIMENTO] Fabricando: " + nombre + " [" + tipo + "] de " + peso + "kg");
        this.nombre = nombre;
        this.tipo = tipo;
        this.peso = peso;
    }

    // Métodos para gestionar el estado de salud del alimento
    public void marcarComoCaducado() {
        System.out.println("[TRAZA-ALIMENTO] Peligro: " + nombre + " ha pasado a estado CADUCADO.");
        this.caducado = true;
    }

    public boolean isCaducado() { return caducado; }
    public String getNombre() { return nombre; }
    public TipoAlimento getTipo() { return tipo; }
    public double getPeso() { return peso; }

    @Override
    public String toString() {
        String estado = caducado ? " [¡CADUCADO!]" : " [Fresco]";
        return String.format("%s (%s) - %.2fkg %s", nombre, tipo, peso, estado);
    }
}