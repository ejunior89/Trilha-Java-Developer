package one.digitalinnovations;

import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class ExemploOrdenacao {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");

        Collections.sort(nomes);
        System.out.println("Nomes ordenados: " + nomes);
        Collections.shuffle(nomes);
        System.out.println("nomes de forma aleatoria: " + nomes);
    }
}
