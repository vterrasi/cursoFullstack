package practicaClases;

import java.util.ArrayList;
import java.util.List;

 /*6) Queremos hacer una clase que nos gestione las recetas para nuestro caldo de pollo.
· El caldo tendrá un listado de ingredientes asociado de como máximo 10 ingredientes.
· El caldo podrá tener o no "sustancia".
· El caldo empezará sin ingredientes ni sustancias y se le podran ir añadiendo ingredientes.
· El caldo tendrá un número de ingredientes a partir del cual se considerará que tiene sustancia,
que el propio caldo de pollo "conocerá" de sí mismo ya cuando se cree.
· Que el caldo tenga sustancia se cambiará solo cuando se llegue al número de ingredientes apropiado.
No se podrá cambiar que el caldo tiene o no sustancia directamente, solo a través de añadir ingredientes.
· Se podrá pedir al caldo que nos diga la receta, lo que incluirá si tiene sustancia o no,
devuelto como String.
NOTA: Si hace falta alguna propiedad más para resolver el ejercicio, añadirla.
*/

public class ConsomeDePollo {
    // Propiedades (Atributos)
    private List<String> ingredientes;
    private boolean sustancia;
    private int umbralSustancia;

    // EL CONSTRUCTOR: En Java se llama igual que la clase
    public ConsomeDePollo(int umbralSustancia) {
        this.ingredientes = new ArrayList<>(); // Empezará sin ingredientes
        this.sustancia = false;                // ni sustancias
        this.umbralSustancia = umbralSustancia; // El caldo lo "conoce" al crearse
    }

    // Mét0do para añadir ingredientes
    public void añadirIngrediente(String ingrediente) {
        if (this.ingredientes.size() < 10) {
            this.ingredientes.add(ingrediente);

            // Verificamos si ya alcanzó la "sustancia"
            if (this.ingredientes.size() >= this.umbralSustancia) {
                this.sustancia = true;
            }
        } else {
            System.out.println("No se pueden añadir más de 10 ingredientes.");
        }
    }

    // Mét0do que devuelve la receta como String
    public String getReceta() {
        String estadoSustancia = this.sustancia ? "con sustancia" : "sin sustancia";

        // Convertimos la lista de ingredientes a un texto bonito
        String listaTexto = this.ingredientes.isEmpty() ? "ninguno" : String.join(", ", this.ingredientes);

        return "Receta del caldo: " + listaTexto + ". El caldo está " + estadoSustancia + ".";
    }
}