package practicaAbstractasInterfases.monstruomones;

import java.util.ArrayList;
import java.util.List;

public abstract class Monstruomon implements Atacable {
    private String nombre;
    private String tipo;
    private int vida;
    private int fuerza;
    private int defensa;
    private List<Ataque> ataques;

    public Monstruomon(String nombre, String tipo, int vida, int fuerza, int defensa) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.vida = vida;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.ataques = new ArrayList<>();
    }

    // Método que implementa la lógica de recibir porrazos
    @Override
    public void recibirDanio(double danio) {
        int danioFinal = (int) Math.max(0, danio - this.defensa);
        this.vida -= danioFinal;
        System.out.println(nombre + " recibió " + danioFinal + " de daño. Vida restante: " + Math.max(0, vida));
    }

    @Override
    public boolean estaVivo() {
        return this.vida > 0;
    }

    // Getters y Setters necesarios
    public String getTipo() { return tipo; }
    public String getNombre() { return nombre; }
    public int getFuerza() { return fuerza; }
    public List<Ataque> getAtaques() { return ataques; }
}