package one.digitalinnovations;

import java.util.Set;
import java.util.HashSet;

// A interface Set representa conjuntos, o que significa que não permite elementos duplicados.
public class ExemploSet {
    public static void main(String[] args) {
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(2); // Duplicado, não será adicionado

        System.out.println("Contém o número 3? " + numeros.contains(3));
        System.out.println("Após adicionar elementos: " + numeros);
    }
}
