package co.jmurillo.tarea29;

import java.util.function.Function;

public class procesadorDeTexto {
    public static void main(String[] args) {
        // Definimos transformaciones individuales
        Function<String, String> removerEspacios = str -> str.replace(" ", "");
        Function<String, String> removerCommas = str -> str.replace(",", "");
        Function<String, String> removerDost = str -> str.replace(".", "");
        Function<String, String> toUpperCase = String::toUpperCase;

        // Componemos todas las transformaciones
        Function<String, String> procesarTexto = removerEspacios
                .andThen(removerCommas)
                .andThen(removerDost)
                .andThen(toUpperCase);

        // Ejemplo de uso
        String miFrase = "Hola, esto es una prueba. Con espacios";
        String resultado = procesarTexto.apply(miFrase);
        System.out.println("Mi Frase: " + miFrase);
        System.out.println("Resultado Texto Procesado: " + resultado);
    }
}
