package practicaFunciones;

import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class analizarStringPro {
    public static void main(String[] args) {

        String texto = "hola mundo moderno";
        String resultadoAnalisis = analizarStringPro(texto);
        System.out.println(resultadoAnalisis);
    }
    /**
     * Analiza la frecuencia de caracteres excluyendo espacios en blanco.
     * * POR QUÉ USAR STREAMS:
     * 1. Declarativo: Describe el "qué" y no el "cómo".
     * 2. Inmutabilidad: Evitamos efectos colaterales al procesar el flujo.
     * 3. Escalabilidad: Es trivial pasar a .parallelStream() si el volumen de datos crece.
     */
    public static String analizarStringPro(final String entrada) {
        return Optional.ofNullable(entrada)
                .filter(s -> !s.isBlank()) // Validación fail-fast funcional
                .map(s -> s.chars() // IntStream para mejor performance en primitiva char
                        .filter(c -> !Character.isWhitespace(c))
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting() // Retorna Long, más seguro para strings masivos
                        ))
                )
                .map(analizarStringPro::formatearResultado)
                .orElse("Texto vacío");
    }

    /**
     * Formatea el mapa de frecuencias.
     * * MEJOR PRÁCTICA: Separación de intereses (Separation of Concerns).
     * El procesamiento de datos y la representación visual deben estar aislados.
     */
    private static String formatearResultado(Map<Character, Long> conteo) {
        if (conteo.isEmpty()) return "Sin caracteres válidos";

        // StringBuilder es imprescindible en loops para evitar la creación
        // de objetos String innecesarios en el String Pool.
        StringBuilder sb = new StringBuilder();
        conteo.forEach((caracter, total) ->
                sb.append(String.format("La letra '%c' aparece %d veces%n", caracter, total))
        );

        return sb.toString();
    }
}