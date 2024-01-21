package one.digitalinnovation;

import java.util.Set;
import java.util.HashSet;

public class ExemploRemoveIfSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>(Set.of("Maçã", "Banana", "Pêssego","melancia", "uva"));

        conjunto.removeIf(elemento -> elemento.startsWith("B"));

        System.out.println("Conjunto após remover elementos que começam com 'P': " + conjunto);
    }
}
