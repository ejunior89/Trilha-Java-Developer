package one.digitalinnovations;

import java.util.Map;
import java.util.HashMap;

// A interface Map representa mapeamentos chave-valor, onde cada chave está associada a um valor único.

public class ExemploMap {
    public static void main(String[] args) {
        Map<String, Integer> idades = new HashMap<>();
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Charlie", 28);

        System.out.println("Idade de Bob: " + idades.get("Bob"));
        System.out.println("Contém chave 'Alice'? " + idades.containsKey("Alice"));
        System.out.println("idade da Alice: " + idades.get("Alice"));
    }
}

