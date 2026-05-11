package practicaFunciones;

public class EjemploFunciones {
    public static void main(String[] args) {

        // ------------------- LAS VARIABLES Y UNA COMPROBACIÓN --------------------------
        String miCadena = "     IT GOES LIKE NA NA NA NA, NA NA NA NA NA, NA NA NA NA NA    ";
        String[] misTareas = {"ALL"};

        // Usamos el nombre de la clase para llamar a la función
        System.out.println("Resultado del taller: '" + EjemploFunciones.tallerDeStrings(miCadena, misTareas) + "'");
    }

    /* Crear una función que "analice" un string. Esto es, recibirá un string e indicará qué
caracteres aparecen y cuantas veces aparece cada uno.
- Pensar un tipo de retorno apropiado para esta función, que pueda imprimir por consola el "análisis" del string.
- Los espacios no contarán para el análisis.
- Existen las funciones * Integer.parseInt,
                        * String.valueOf, y
                        * Character.isWhitespace. */

    // ------------------------------- LA FUNCIÓN -------------------------------
    public static String tallerDeStrings(String miCadena, String[] misTareas) {
        // CORRECCIÓN: Usamos 'miCadena' que es como se llama el parámetro de entrada
        String resultado = miCadena;

        // MEJORA: Comprobamos que haya tareas antes de empezar
        if (misTareas == null || misTareas.length == 0) {
            System.out.println("La cadena esta vacia.");

            return resultado;
        }

        for (String tarea : misTareas) {
            // Usamos null check por si alguna posición del array está vacía
            if (tarea == null) continue;

            switch (tarea.toUpperCase()) {
                case "TRIM":
                    resultado = aplicarTrim(resultado);
                    break;
                case "UPPERIZE":
                    resultado = aplicarUpper(resultado);
                    break;
                case "LOWERIZE":
                    resultado = aplicarLower(resultado);
                    break;
                case "ALL":
                    resultado = aplicarTrim(resultado);
                    resultado = aplicarUpper(resultado);
                    resultado = aplicarLower(resultado);
                    break;
                default:
                    System.out.println("Tarea desconocida: " + tarea);
            }
        }
        return resultado;
    }

    public static String aplicarTrim(String s) {
        if (s == null) return "";
        if (s.equals(s.trim())) {
            System.out.println("Aviso: Sin espacios.");
        } else {
            s = s.trim();
        }
        return s;
    }

    public static String aplicarUpper(String s) {
        if (s == null || s.isEmpty()) return s;
        if (s.equals(s.toUpperCase())){
            System.out.println("Aviso: Ya esta en mayusculas.");
        } else {
            s = s.toUpperCase();
        }
        return s.toUpperCase();
    }

    public static String aplicarLower(String s) {
        if (s == null || s.isEmpty()) return s;
        if (s.equals(s.toLowerCase())) {
            System.out.println("Aviso: Ya esta en minusculas.");
        } else {
            s = s.toLowerCase();
        }
        return s.toLowerCase();
    }
}
