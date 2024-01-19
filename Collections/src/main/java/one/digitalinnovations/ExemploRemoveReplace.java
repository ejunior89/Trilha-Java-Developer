package one.digitalinnovations;

import java.util.List;
import java.util.ArrayList;

public class ExemploRemoveReplace {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        // Remove os números pares
        numeros.removeIf(n -> n % 2 == 0);
        System.out.println("Lista após remover números pares: " + numeros);

        // Substitui todos os números por seus quadrados
        numeros.replaceAll(n -> n * n);
        System.out.println("Lista após substituir por quadrados: " + numeros);
    }
}
