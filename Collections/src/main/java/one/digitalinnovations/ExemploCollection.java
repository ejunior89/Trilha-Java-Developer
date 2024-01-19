//A interface Collection é a raiz da hierarquia de coleções.
// Ela define métodos comuns para todas as coleções, como add, remove, size e contains.
package one.digitalinnovations;

import java.util.Collection;
import java.util.ArrayList;

public class ExemploCollection {
    public static void main(String[] args) {
        Collection<String> nomes = new ArrayList<>();
        nomes.add("Alice");
        nomes.add("Bob");
        nomes.add("Charlie");

        System.out.println("Tamanho da coleção: " + nomes.size());
        System.out.println("Contém Bob? " + nomes.contains("Bob"));
        nomes.remove("Alice");
        System.out.println("Após remover Alice: " + nomes);
    }
}

