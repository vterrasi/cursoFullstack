package practicaAbstractasInterfases.monstruomones;
//ESTA CLASE ES UN EXTRA
import java.util.ArrayList;
import java.util.List;

//2. Extra: MaestroMonstruomon
//Creamos una clase para el "entrenador" que llevará su equipo de monstruos.

public class MaestroMonstruomon {
    private String nombre;
    private List<Monstruomon> equipo;

    public MaestroMonstruomon(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>();
    }

    public void capturar(Monstruomon m) {
        if (equipo.size() < 6) equipo.add(m); // Límite típico de 6
    }

    public List<Monstruomon> getEquipo() { return equipo; }
    public String getNombre() { return nombre; }
}