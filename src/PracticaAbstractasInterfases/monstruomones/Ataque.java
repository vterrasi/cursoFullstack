package practicaAbstractasInterfases.monstruomones;

public class Ataque {
    private String nombre;
    private String tipo;
    private String descripcion;
    private int danioBase;
    private int usosRestantes; // Usaremos este para la lógica de los PP

    public Ataque(String nombre, String tipo, String descripcion,int danioBase, int usosMaximos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.danioBase = danioBase;
        this.usosRestantes = usosMaximos;
    }

    // --- AL AÑADIR ESTOS GETTERS, LOS AVISOS DE LA IMAGEN DESAPARECEN ---

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo; // Ahora que lo "accedemos" aquí, IntelliJ dejará de quejarse
    }

    public String getDescripcion() {
        return descripcion;
    }
    public int getDanioBase() {
        return danioBase;
    }

    // Lógica para el extra de usos
    public boolean puedeUsarse() {
        return usosRestantes == -1 || usosRestantes > 0;
    }

    public void reducirUso() { if (usosRestantes > 0) { usosRestantes--; }
    }

    public void mostrarDetalle() {
        System.out.println("\n--- 📋 FICHA DE ATAQUE ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Daño Base: " + danioBase);
        System.out.println("Usos restantes: " + (usosRestantes == -1 ? "Infinitos" : usosRestantes));
        System.out.println("--------------------------");
    }
}