package one.digitalinnovation;

import java.util.Set;
import java.util.HashSet;

public class ExemploRetainAllSet {
    public static void main(String[] args) {
        Set<String> conjuntoA = new HashSet<>(Set.of("Maçã", "Banana", "Pêssego"));
        Set<String> conjuntoB = new HashSet<>(Set.of("Banana", "Pêssego", "Uva"));

        conjuntoA.retainAll(conjuntoB);

        System.out.println("Interseção dos conjuntos: " + conjuntoA);
    }
}
