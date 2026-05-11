package PracticaHerencia;

// 1. Clase principal que define un Queso
public class Queso {
    private String tipoLeche;
    private double porcentajeGrasa;
    private String notaDeCataBase;

    // Constructor de nuestro queso
    public Queso(String tipoLeche, double porcentajeGrasa, String notaDeCataBase) {
        this.tipoLeche = tipoLeche;
        this.porcentajeGrasa = porcentajeGrasa;
        this.notaDeCataBase = notaDeCataBase;
    }

    // Mét0do para obtener el índice de contenido graso (ICG)
    public String obtenerICG() {
        if (this.porcentajeGrasa <= 25.0) {
            return "A";
        } else if (this.porcentajeGrasa > 25.0 && this.porcentajeGrasa < 50.0) {
            return "B";
        } else {
            return "C";
        }
    }

    // Mét0do para obtener la nota de cata (se puede ampliar en los tipos específicos)
    public String obtenerNotaDeCata() {
        return this.notaDeCataBase;
    }

    public String getTipoLeche() {
        return tipoLeche;
    }

    public double getPorcentajeGrasa() {
        return porcentajeGrasa;
    }
}

// 2. Clase especializada para obtener matices de oveja
class AsistenteDeMatices {
    public static String matizNotaDeCata(String tipoOveja) {
        switch (tipoOveja.toLowerCase()) {
            case "manchega":
                return "Sabor intenso, fuerte y sabroso, con un toque ligeramente ácido y picante al final.";
            case "churra":
                return "Sabor intenso, complejo y bouquet muy grato.";
            case "castellana":
                return "Sabor profundo y aromas persistentes de alta calidad.";
            case "latxa":
                return "Sabor intenso, equilibrado, con un marcado carácter ahumado.";
            case "merina":
                return "Sabor muy noble y definido, destaca por su sabor láctico y profundo.";
            default:
                return "Sabor clásico de oveja.";
        }
    }
}

// 3. Clase para el queso de vaca (maneja los días de maduración)
class QuesoDeVaca extends Queso {
    private int diasMaduracion;

    public QuesoDeVaca(double porcentajeGrasa, String notaDeCataBase, int diasMaduracion) {
        super("Vaca", porcentajeGrasa, notaDeCataBase);
        this.diasMaduracion = diasMaduracion;
    }

    // Calcula el matiz según el tiempo de maduración
    public String matizMaduracionVaca() {
        if (diasMaduracion <= 7) {
            return " Queso muy ligero y fresco.";
        } else if (diasMaduracion <= 30) {
            return " Queso tierno y suave.";
        } else if (diasMaduracion <= 90) {
            return " Queso semicurado, más denso.";
        } else if (diasMaduracion <= 180) {
            return " Queso curado, intenso.";
        } else {
            return " Queso viejo/añejo muy concentrado y potente.";
        }
    }

    @Override
    public String obtenerNotaDeCata() {
        return super.obtenerNotaDeCata() + matizMaduracionVaca();
    }
}