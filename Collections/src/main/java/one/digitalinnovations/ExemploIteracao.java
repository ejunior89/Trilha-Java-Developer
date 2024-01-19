package one.digitalinnovations;

import java.util.List;
import java.util.Arrays;

// Para iterar sobre coleções, Java fornece a estrutura de loop for-each e a interface Iterator.
// Além disso, a classe Collections oferece métodos úteis para ordenação e inversão de coleções.

public class ExemploIteracao {
    public static void main(String[] args) {
        List<String> cores = Arrays.asList("Vermelho", "Verde", "Azul");

        for (String cor : cores) {
            System.out.println(cor);
        }
    }
}
