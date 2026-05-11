package PracticaHerencia;

import java.util.Arrays;

public class AparatoElectrico {
    public int voltaje;

    public AparatoElectrico(int voltaje) {
        this.voltaje = voltaje;
    }

    @Override
    public String toString() {
        return "El voltaje es de " + voltaje + "V";
    }
}
// --- Clases Hijas ---

class Tostadora extends AparatoElectrico {
    private String modelo;
    private final int tiempoTostado;
    private boolean bandejaExtraible;

    public Tostadora(int voltaje, String modelo, int tiempoTostado, boolean bandejaExtraible) {
        super(voltaje);
        this.modelo = modelo;
        this.tiempoTostado = tiempoTostado;
        this.bandejaExtraible = bandejaExtraible;
    }
    public void tostar(int tiempoTostado) {
        System.out.println("Tostando el pan, tardará " + tiempoTostado + " minutos");
        if (bandejaExtraible) {
            System.out.println("Al terminar, puede retirar las migas con la bandeja extraíble");
        }
    }
}

class Horno extends AparatoElectrico {
    private final String modelo;
    private final int potencia;
    private String[] funciones;

    public Horno(int voltaje, String modelo, int potencia, String[] funciones) {
        super(voltaje);
        this.modelo = modelo;
        this.potencia = potencia;
        this.funciones = funciones;
    }

    public void mostrar(){
        System.out.println("Este es un horno " + modelo + ", con "
                + potencia + " vatios de potencia, " + voltaje + " voltios " +
                "y sus funciones son: " + Arrays.toString(funciones));
    }
}