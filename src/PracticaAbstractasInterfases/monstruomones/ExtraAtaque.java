package practicaAbstractasInterfases.monstruomones;
//ESTA CLASE ES UN EXTRA
//1. Extra: Límite de usos (PP) y Ataques Infinitos
//Añadimos un atributo a la clase Ataque para controlar cuántas veces se puede usar.

public class ExtraAtaque {
    private String nombre;
    private String tipo;
    private int danioBase;
    private int usosRestantes; // -1 significa que es infinito

    public ExtraAtaque(String nombre, String tipo, int danioBase, int usosMaximos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.danioBase = danioBase;
        this.usosRestantes = usosMaximos;
    }

    public boolean puedeUsarse() {
        return usosRestantes == -1 || usosRestantes > 0;
    }

    public void reducirUso() {
        if (usosRestantes > 0) usosRestantes--;
    }
}
