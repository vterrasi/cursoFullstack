package practicaClases;
    /*4) Queremos modelar el uso de un grifo.
    · El grifo tendra un deposito de agua asociado, con una cantidad de litros
    disponibles (indicar el numero que se desee)
    · El grifo se podra abrir, gastando cada vez que se abra 1 litro de agua.
    · Además el grifo tendra una valvula asociada que puede estar abierta o cerrada,
    pudiendo variar su estado, usando una funcion para ello.
    · Si la valvula esta cerrada, el grifo no se podra abrir y no gastara agua.
    · Si no queda agua en el deposito el grifo no se podra abrir tampoco.*/

public class Grifo3000 {
    // 1. CARACTERÍSTICAS (Atributos)
    int depositoAgua;      // Cuántos litros quedan
    boolean valvulaAbierta; // ¿Está la llave de paso abierta?

    // 2. EL CONSTRUCTOR (Fabricación)
    // Le decimos cuánta agua tiene al empezar
    public Grifo3000(int litrosIniciales) {
        this.depositoAgua = litrosIniciales;
        this.valvulaAbierta = false; // Por defecto, la válvula viene cerrada
        System.out.println("Grifo instalado con " + litrosIniciales + " litros.");
    }

    // 3. LA FUNCIÓN PARA LA VÁLVULA (Variar estado)
    public void cambiarValvula(boolean estado) {
        this.valvulaAbierta = estado;
        if (estado) {
            System.out.println("Válvula abierta. El agua puede pasar.");
        } else {
            System.out.println("Válvula cerrada. Paso bloqueado.");
        }
    }

    // 4. EL MÉT0DO PARA ABRIR EL GRIFO (Gastar agua)
    public void abrirGrifo() {
        // Comprobamos las dos reglas del enunciado
        if (valvulaAbierta == false) {
            System.out.println("ERROR: No sale agua porque la válvula está cerrada.");
        }
        else if (depositoAgua <= 0) {
            System.out.println("ERROR: No queda agua en el depósito.");
        }
        else {
            // Si t0do está bien, gastamos 1 litro
            depositoAgua = depositoAgua - 1;
            System.out.println("¡Saliendo agua! Quedan " + depositoAgua + " litros.");
        }
    }
}