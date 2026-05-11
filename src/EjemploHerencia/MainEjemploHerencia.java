package EjemploHerencia;

public class MainEjemploHerencia {
    public static void main() {
        System.out.println("En MainEjemploHerencia");
        User kirenaUser =
                new User(
                    "Velia"
                    , "Kirena"
                    , "velia@email.com"
        );
        System.out.println(kirenaUser);
        System.out.println(kirenaUser.doWork());

        Employee kirenaEmployee =
                new Employee(
                        "Velia"
                        ,"Kirena"
                        , "Fullstack"
               );
        System.out.println(kirenaEmployee);
        System.out.println(kirenaEmployee.doWork());
    }
}
