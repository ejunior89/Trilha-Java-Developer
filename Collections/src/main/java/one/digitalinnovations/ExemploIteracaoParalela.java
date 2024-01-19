package one.digitalinnovations;

import java.util.List;
import java.util.Arrays;

public class ExemploIteracaoParalela {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("Vermelho", "Verde", "Azul");

        // Iteração em paralelo para imprimir cada cor
        cores.parallelStream().forEach(System.out::println);
    }
}
