package one.digitalinnovations;

import java.util.Iterator;
import java.util.Set;
import java.util.HashSet;

public class ExemploIteracaoSet {
    public static void main(String[] args) {
        Set<String> conjunto = new HashSet<>(Set.of("A", "B", "C"));

        // Iteração usando for-each
        for (String elemento : conjunto) {
            System.out.println(elemento);
        }

        // Iteração usando iterator
         Iterator<String> iterator = conjunto.iterator();
         while (((Iterator<?>) iterator).hasNext()) {
           System.out.println(iterator.next());
         }
    }
}

