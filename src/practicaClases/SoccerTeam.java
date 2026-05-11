package practicaClases;

 /* 1) Crear la clase SoccerTeam
    Atributos
        ·String name · String goalKeeper · String defense · String midfielder · String striker
        ·boolean inChampions · boolean inCup
        ·Int yearFounded
    Constructor:
        · Uno con todos los parametros
    Metodos:
        · Metodo ShowTeamData, muestra por pantalla
        todos los atributos del menu.
        · Para los atributos tipo boolean,
        mostrar un mensaje apropiado; no el valor booleano directamente.*/

public class SoccerTeam {
    // 1. Atributos
    String name;
    String goalKeeper;
    String defense;
    String midfielder;
    String striker;
    boolean inChampions;
    boolean inCup;
    int yearFounded;

    // 2. Constructor (La "receta" que ya teníamos)
    public SoccerTeam(String name, String goalKeeper, String defense, String midfielder,
                      String striker, boolean inChampions, boolean inCup, int yearFounded) {
        this.name = name;
        this.goalKeeper = goalKeeper;
        this.defense = defense;
        this.midfielder = midfielder;
        this.striker = striker;
        this.inChampions = inChampions;
        this.inCup = inCup;
        this.yearFounded = yearFounded;
    }

    // 3. El nuevo mét0do: ShowTeamData
    public void showTeamData() {
        System.out.println("--- DATOS DEL EQUIPO ---");
        System.out.println("Nombre: " + name);
        System.out.println("Portero: " + goalKeeper);
        System.out.println("Defensa: " + defense);
        System.out.println("Mediocentro: " + midfielder);
        System.out.println("Delantero: " + striker);
        System.out.println("Año de fundación: " + yearFounded);

        // Lógica para los booleanos (el "mensaje apropiado")
        if (inChampions) {
            System.out.println("Champions League: ¡Sí, este equipo está clasificado!");
        } else {
            System.out.println("Champions League: No, este año no la juega.");
        }

        if (inCup) {
            System.out.println("Copa del Rey/Nacional: Sí, sigue en la competición.");
        } else {
            System.out.println("Copa del Rey/Nacional: Eliminado o no participa.");
        }
        System.out.println("------------------------");
    }
}