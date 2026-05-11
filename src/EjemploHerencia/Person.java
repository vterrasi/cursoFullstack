package EjemploHerencia;

// POJO plain old Java object
// JAVA BEAN
// JAR (Java ARchive)
public class Person {
    String name;
    protected String surname;

    public Person() {
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Mi nombre es " + this.name
                + " y mi apellido es " + this.surname;
    }
    public String doWork(){
        return "Trabajando como Person";
    }
}