package PracticaHerencia;

public class FanDeporte {
    protected String deporte;

    public FanDeporte(String deporte) {
        this.deporte = deporte;
    }

    @Override
    public String toString() {
        return "Soy un fan del " + deporte;
    }
}
// --- Clases Hijas ---

class FanF1 extends FanDeporte {
        private String pilotoFavorito;


    public FanF1(String pilotoFavorito, String deporte) {
        super(deporte);
        this.pilotoFavorito = pilotoFavorito;

    }

    @Override
    public String toString() {
        return "Soy un fan de la " + deporte + " y mi piloto favorito es " + pilotoFavorito;
    }
}

class FanTenis extends FanDeporte {
    private String tenistaFavorito;

    public FanTenis(String tenistaFavorito, String deporte) {
        super(deporte);
        this.tenistaFavorito = tenistaFavorito;

    }

    @Override
    public String toString() {
        return "Soy un fan del " + deporte + " y mi tenista favorito es " + tenistaFavorito;
    }
}