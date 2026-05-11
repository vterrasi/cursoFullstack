package practicaClases;

/*5) Vamos a modelar el comportamiento de una puerta, que podrá estar abierta o cerrada.
    · La puerta empezará cerrada.
    · La puerta se podrá abrir o cerrar, avisando por pantalla en caso de que
    se pueda hacer.
    · La puerta no se podrá cerrar si ya está cerrada, lo que habrá que avisar
    por pantalla y lo mismo pasaría si queremos abrirla si ya está abierta.
    · Se le podrá "preguntar" a la puerta su estado (si está abierta o cerrada) de
    lo cual informará evolviendo un mensaje como resultado.
*/
public class Puerta {
    // 1. EL ESTADO (Atributo)
    // Usamos un boolean: true = abierta, false = cerrada
    boolean estaAbierta;

    // 2. EL CONSTRUCTOR
    // El enunciado dice que la puerta "empezará cerrada"
    public Puerta() {
        this.estaAbierta = false;
        System.out.println("Puerta instalada. Estado inicial: Cerrada.");
    }

    // 3. MÉT0DO PARA ABRIR
    public void abrir() {
        if (estaAbierta) {
            System.out.println("¡Ojo! No puedes abrirla porque YA está abierta.");
        } else {
            estaAbierta = true;
            System.out.println("Abriendo la puerta... ¡Hecho!");
        }
    }

    // 4. MÉT0DO PARA CERRAR
    public void cerrar() {
        if (!estaAbierta) { // "!estaAbierta" es lo mismo que decir "estaAbierta == false"
            System.out.println("¡Ojo! No puedes cerrarla porque YA está cerrada.");
        } else {
            estaAbierta = false;
            System.out.println("Cerrando la puerta... ¡Hecho!");
        }
    }

    // 5. MÉT0DO PARA "PREGUNTAR" EL ESTADO
    // Este devuelve un mensaje (String)
    public String consultarEstado() {
        if (estaAbierta) {
            return "La puerta se encuentra actualmente: ABIERTA.";
        } else {
            return "La puerta se encuentra actualmente: CERRADA.";
        }
    }
}