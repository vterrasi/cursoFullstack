package practicaAbstractasInterfases.monstruomones;

public class Ataque {
    private String nombre;
    private String tipo;
    private int danioBase;
    private int usosRestantes; // Usaremos este para la lógica de los PP

    public Ataque(String nombre, String tipo, int danioBase, int usosMaximos) {
        this.nombre = nombre;
        this.tipo = tipo;
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

    public int getDanioBase() {
        return danioBase;
    }

    // Lógica para el extra de usos
    public boolean puedeUsarse() {
        return usosRestantes == -1 || usosRestantes > 0;
    }

    public void reducirUso() {
        if (usosRestantes > 0) {
            usosRestantes--;
        }
    }
}