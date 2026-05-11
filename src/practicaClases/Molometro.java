package practicaClases;

public class Molometro {

    int contadorMolines;
    String resultado = "";

    public Molometro() {
        this.contadorMolines = 0;
    }

    public void mola() {
        contadorMolines++;
    }

    public void noMola() {
        contadorMolines--;
    }

    public String molaONoMola() {
        if (contadorMolines > 0) {
            resultado = "Moooola!";
        } else if (contadorMolines < 0) {
            resultado = "no mola";
        } else {
            resultado = "Ni fu ni fa";
        }
        return resultado;
    }
}
    /*3) Crear la clase molometro
Atributos:
    · int contadorMolines.
Constructor:
    · Uno sin parametros inicializa por defecto el contadorMolines a 0.
Metodos
    · Metodo "mola", no devuelve nada e incrementa el contador de molines.
    · Metodo "noMola", no devuelve nada y decrementa el contador de molines.
    · Metodo "molaONoMola", devuelve una cadena de texto tal que:
        · Si el contador de molines es mayor a 0 "Moooola!".
        · Si el contador de molines es menor a 0 "no mola".
        · Si el contador de molines es igual que 0 "Ni fu ni fa".
Probar a cambiar el estado del Molometro para que aparezcan los distintos mensajes.*/
