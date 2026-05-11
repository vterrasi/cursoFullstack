package PracticaHerencia;

// --- Clase Padre ---
class Helado {
    // Usamos 'protected' para que sus "hijos" puedan tocar este dato directamente
    protected String sabor;

    // Constructor que recibe el sabor
    public Helado(String sabor) {
        this.sabor = sabor;
    }
}

// --- Clases Hijas ---

class Frigopie extends Helado {
    public Frigopie(String sabor) {
        super(sabor); // Reutiliza el constructor del padre
    }

    @Override
    public String toString() {
        return "Soy un Frigopie de " + sabor;
    }
}

class SandwichNata extends Helado {
    public SandwichNata(String sabor) {
        super(sabor);
    }

    @Override
    public String toString() {
        return "Soy un SandwichNata de " + sabor;
    }
}

class Calippo extends Helado {
    public Calippo(String sabor) {
        super(sabor);
    }

    @Override
    public String toString() {
        return "Soy un Calippo de " + sabor;
    }
}