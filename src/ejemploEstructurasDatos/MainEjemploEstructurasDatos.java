package ejemploEstructurasDatos;

import practicaClases.Jedi;
import practicaClases.Molometro;

import java.util.*;

public class MainEjemploEstructurasDatos {
    public static void main() {
        System.out.println("En MainEjemploEstructurasDatos");

        System.out.println("LIST");

        List<String> lista = new ArrayList<>();

        lista.add("Hola");
        lista.add("Mundo");
        lista.add("!!!");

        for (String elem : lista){
            System.out.println(elem);
        }

        System.out.println("\n\n");
        lista.add("Más");
        lista.add("Cosas");

        for (String elem : lista){
            System.out.println(elem);
        }

        System.out.println(
                "La lista tiene " + lista.size() + " elementos"
        );

        System.out.println(
                "La lista contiene el elemento Hola es " + lista.contains("Hola")
        );

        System.out.println(
                "La lista contiene el elemento Adios es " + lista.contains("Adios")
        );

        System.out.println(
                lista.remove("Mundo")
        );

        System.out.println(
                lista.remove("Curso")
        );

        System.out.println(
                "La lista tiene " + lista.size() + " elementos"
        );

        for (String elem : lista) {
            System.out.println(elem);
        }
        System.out.println("\n\n");

        System.out.println(
            "El elemento en la posición 1 es " + lista.get(1)
        );

        lista.set(1, "Mundo2");
        System.out.println(
            "El elemento en la posición 1 es " + lista.get(1)
        );

        for (String elem : lista) {
            System.out.println(elem);
        }
        System.out.println(
                "El indice del elemento Mundo2 es " + lista.indexOf("Mundo2")
        );

        System.out.println("\n\n");

        lista.add(1, "Mundo");
        for (String elem : lista) {
            System.out.println(elem);
        }
        System.out.println("Quitamos el elemento Mundo2");
        lista.remove("Mundo2");

        for (String elem : lista) {
            System.out.println(elem);
        }
        System.out.println("Vaciamos la lista");
        lista.clear();

        System.out.println(
                "La lista tiene " + lista.size() + " elementos"
        );

        System.out.println("\n\nMAP");
        Map<String, String> completeNames = new HashMap<>();
        //Map<Map<String, List<Molometro>>, Map<List<Jedi>, Map<List<Queso>, List<FanF1>>>> stuff completeNames = new HashMap<>();

        completeNames.put ("Carlos", "Gregorio");
        completeNames.put ("Manolo", "Pérez");
        completeNames.put ("Antonia", "González");

        for (Map.Entry<String, String> entry : completeNames.entrySet()) {
            System.out.println(
                "Key es " + entry.getKey() + " y value es " + entry.getValue()
            );
        }
        System.out.println(
            "El map contiene " + completeNames.size() + " elementos"
        );
        System.out.println("\n\n");

        System.out.println("\nCLAVE");

        for (String key : completeNames.keySet()){
            System.out.println(key);
        }

        System.out.println("\nVALUES");
        for (String values : completeNames.values()){
            System.out.println(values);
        }

        System.out.println(
                "El map contiene la key Carlos es " + completeNames.containsKey("Carlos")
        );

        System.out.println(
                "El map contiene la value Gregorio es " + completeNames.containsValue("Gregorio")
        );

        completeNames.remove("Manolo");

        System.out.println(
                "El map contiene la key Manolo es " + completeNames.containsKey("Manolo")
        );

        completeNames.clear();

        System.out.println("\n\n");
        System.out.println("SET");

        Set<String> set = new HashSet<>();

        set.add("IronMan");
        set.add("es");
        set.add("guay");
        set.add("guay");

        for (Object item : set.toArray()) {
            System.out.println(item);
        }

        System.out.println(
                "El set contiene el elemento IronMan es " + set.contains("IronMan")
        );

        System.out.println("El set tiene " + set.size() + " elementos");
        set.remove("IronMan");

        for (Object item : set.toArray()) {
            System.out.println(item);
        }
        set.clear();
        System.out.println("\n\n");
        System.out.println("ENUM");

        for (TipoAlimento tipoAlimento : TipoAlimento.values()) {
            System.out.println(tipoAlimento);
        }

        System.out.println("\n");

        System.out.println(
            TipoAlimento.valueOf("CARNE")
        );

        System.out.println("\n\n");
        for (TipoAlimento tipoAlimento : TipoAlimento.values()){
            System.out.println(tipoAlimento);
        }
    }
}
