package co.jmurillo.tarea30;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PalabraMasRepetida {
    public static void main(String[] args) {
        String texto = "este es un texto de ejemplo este texto es un buen ejemplo de texto repetido";

        // 1. Convertimos la frase en un Stream de palabras
        Function<String, Map<String, Long>> contarPalabras = frase ->
                Arrays.stream(frase.toLowerCase().split("\\s+")) // Dividimos en palabras
                        .collect(Collectors.groupingBy(                // Agrupamos palabras
                                palabra -> palabra,                    // Llave: la palabra misma
                                Collectors.counting()                  // Valor: cantidad de repeticiones
                        ));

        // 2. Encontrar la palabra más repetida
        Function<Map<String, Long>, String> encontrarMasRepetida = mapa ->
            mapa.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())   // Encontramos la entrada con mayor valor
                    .map(Map.Entry::getKey)             // Obtenemos la palabra
                    .orElse("");                 // Valor por defecto si no hay palabras

        // 3. Componemos las funciones
        Function<String, String> palabraMasRepetida = contarPalabras
                .andThen(encontrarMasRepetida);

        // 4. Aplicamos la función
        String resultado = palabraMasRepetida.apply(texto);

        // 5. Mostramos el resultado completo
        Map<String, Long> frecuencias = contarPalabras.apply(texto);
        System.out.println("Frecuencia de cada palabra: " + frecuencias);
        System.out.println("Palabra más repetida: " + resultado);
    }
}
