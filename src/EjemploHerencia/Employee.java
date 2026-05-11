package EjemploHerencia;

public class Employee extends Person{
    String position;

    public Employee() {

    }

    public Employee(String name, String surname, String position) {
        super(name, surname);
        this.position = position;
    }

}
