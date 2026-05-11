package practicaClases;

/* 2) Crear la clase Jedi
      Atributos:
          String name ·String lightSaberColor
      Constructor:
          · Uno con todos los parametros
      Metodos:
          · Metodo ShowInfo que muestre el
           siguiente mensaje por pantalla:
              "Soy un Jedi, mi nombre es NOMBRE y
              el color de mi sable de luz es COLOR"

      Crea a los siguientes Jedi:
          Luke Skywalker, azul | Mace Windu, morado |
          Yoda, verde | Qui-Gon Jinn, verde | Obi Wan Kenobi, azul
          y muestra sus datos por pantalla */

public class Jedi {
// 1. Definimos cómo es un Jedi

    // Atributos (lo que sabe el Jedi)
    String name;
    String lightSaberColor;

    // Constructor (cómo se crea un Jedi nuevo)
    public Jedi(String name, String lightSaberColor) {
        this.name = name;
        this.lightSaberColor = lightSaberColor;
    }

    // Mét0do ShowInfo (lo que hace el Jedi)
    public void showInfo() {
        System.out.println(
                "Soy un Jedi, mi nombre es " + name + " y " +
                        "el color de mi sable de luz es " + lightSaberColor
        );
    }
}
