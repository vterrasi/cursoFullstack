package PracticaFunciones;

import java.util.Map;
import java.util.HashMap;

public class analizarString {

    public static void main(String[] args) {
        // Aquí creamos el texto que queremos analizar
        String miTexto = "Hola Mundo";

        // Llamamos a nuestra función y guardamos el resultado en una variable
        String resultado = analizarString(miTexto);

        // Imprimimos el resultado en la consola
        System.out.println("--- RESULTADO DEL ANÁLISIS ---");
        System.out.println(resultado);
    }

    public static String analizarString(String entrada) {
        // SEGURO DE SEGURIDAD:
        // Si alguien nos pasa "nada" (null), no podemos trabajar.
        // Así que avisamos rápido: "Oye, que el texto está vacío".
        if (entrada == null) return "Texto vacío";

        // 1. LA LIBRETA DE NOTAS (Map):
        // Imagina una libreta con dos columnas. 
        // En una ponemos la "Letra" y en la otra "Cuántas veces sale".
        // HashMap es como una libreta que busca superrápido.
        Map<Character, Integer> conteo = new HashMap<>();

        // 2. EL RECORRIDO (Bucle):
        // "entrada.toCharArray()" corta el texto en letras individuales.
        // El "for" es como un dedo que va señalando cada letra una por una.
        for (char letra : entrada.toCharArray()) {

            // EL FILTRO:
            // Si la letra es un espacio (un hueco), le decimos: "¡Pasa de largo!".
            // No nos interesa contar los espacios en blanco.
            if (Character.isWhitespace(letra)) {
                continue; // Salta a la siguiente letra
            }

            // LA ANOTACIÓN:
            // Aquí ocurre la magia. "getOrDefault" hace esto:
            // Mira en la libreta: "¿Ya anoté la letra 'A'?"
            // - Si NO está: empieza en 0 y le suma 1.
            // - Si SÍ está: mira el número que ya tenía y le suma 1 más.
            conteo.put(letra, conteo.getOrDefault(letra, 0) + 1);
        }

        // 3. EL INFORME FINAL:
        // Ya que terminamos de contar, le pedimos a otra parte del código
        // que nos pase esos apuntes a limpio para que se vean bonitos.
        return formatearResultado(conteo);
    }

    private static String formatearResultado(Map<Character, Integer> conteo) {
        // LA MÁQUINA DE ESCRIBIR (StringBuilder):
        // Es mucho más rápido usar esto para "pegar" trozos de texto
        // que intentar sumar palabras una por una.
        StringBuilder sb = new StringBuilder();

        // REVISANDO LA LIBRETA:
        // Vamos renglón por renglón de nuestra libreta de notas (conteo.entrySet).
        for (Map.Entry<Character, Integer> pareja : conteo.entrySet()) {
            // Vamos escribiendo la frase de cada letra en nuestro papel.
            sb.append("La letra '")
                    .append(pareja.getKey())   // Aquí pone la letra
                    .append("' aparece ")
                    .append(pareja.getValue()) // Aquí pone el número
                    .append(" veces\n");       // Salto de línea para la siguiente
        }

        // Entregamos el papel escrito con todo el resultado.
        return sb.toString();
    }
}