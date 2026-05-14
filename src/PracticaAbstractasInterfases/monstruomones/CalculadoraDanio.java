package practicaAbstractasInterfases.monstruomones;

public class CalculadoraDanio {

    public static double obtenerMultiplicador(String tipoAtaque, String tipoDefensor) {
        if (tipoAtaque.equals("neutral") || tipoAtaque.equals(tipoDefensor)) {
            return 1.0;
        }

        // Switch moderno (Java 14+) refactorizado para ser limpio y directo
        return switch (tipoAtaque) {
            case "agua"  -> tipoDefensor.equals("fuego") ? 2.0 : (tipoDefensor.equals("tierra") ? 0.5 : 1.0);
            case "fuego" -> tipoDefensor.equals("tierra") ? 2.0 : (tipoDefensor.equals("agua") ? 0.5 : 1.0);
            case "tierra"-> tipoDefensor.equals("rayo") ? 2.0 : (tipoDefensor.equals("fuego") ? 0.5 : 1.0);
            case "rayo"  -> tipoDefensor.equals("agua") ? 2.0 : (tipoDefensor.equals("tierra") ? 0.5 : 1.0);
            default      -> 1.0;
        };
    }
}