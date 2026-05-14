package practicaAbstractasInterfases.monstruomones;
// ESTA CLASE ESTA MODIFICADA PARA EL GESTOR DE ESTADISTICAS

//3. Extra: Estadísticas y Registro de Turnos
//Para este extra, necesitamos una clase que guarde qué pasó en cada momento.

public class RegistroTurno {
    private String nombreAtaque;
    private String nombreAtacante;
    private double danioRealizado;

    public RegistroTurno(String nombreAtaque, String nombreAtacante, double danioRealizado) {
        this.nombreAtaque = nombreAtaque;
        this.nombreAtacante = nombreAtacante;
        this.danioRealizado = danioRealizado;
    }

    public String getNombreAtaque() { return nombreAtaque; }
    public double getDanioRealizado() { return danioRealizado; }
}