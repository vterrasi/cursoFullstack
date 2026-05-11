package ejemploClases;

public class NameDisplay {
    String name;
    boolean speakerOn = false;
    public static final String DEFAULT_DISPLAY_NAME = "LAPEGANOPEGA";
    static int displayCount = 0;

    //Hay dos métodos que tienen el mismo nombre, esto se
    //le conoce como polimorfismo. En este caso, es de sobrecarga.

    public NameDisplay() {
        System.out.println(
            "Se está creando un display sin nombre"
        );
        this.name = NameDisplay.DEFAULT_DISPLAY_NAME;
        this.speakerOn = false;
        NameDisplay.displayCount++;
    }

    public NameDisplay(String name) {
        System.out.println(
            "Se está creando un display CON nombre"
        );
        this.name = name;
        this.speakerOn = false;
        NameDisplay.displayCount++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getDisplayCount() {
        return NameDisplay.displayCount;
    }

    public void sayName() {
        turnSpeakerOn();
        System.out.println("El nombre es " + this.name);
        turnSpeakerOff();
    }

    private void turnSpeakerOn() {
        System.out.println("Encendiendo el altavoz");
        this.speakerOn = true;
    }

    private void turnSpeakerOff() {
        System.out.println("Apagando el altavoz");
        this.speakerOn = false;
    }

    public String getStatus() {
        String speakerStatus = this.speakerOn ?
                " y el altavoz esta encendido"
                : " y el altavoz esta apagado";
        return "El visor tiene el nombre de "
                + this.name + speakerStatus;
    }
}