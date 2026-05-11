package EjemploHerencia;

public class User extends Person{
    String email;

    public User() {
    }

    public User(String name, String surname, String email) {
        super(name, surname);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return super.toString()
            + " y mi email es " + this.email;
    }

    @Override
    public String doWork() {
        return super.doWork()
                + " y trabajando como User";
    }
}


