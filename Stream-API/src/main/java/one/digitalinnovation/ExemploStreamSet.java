package one.digitalinnovation;

import java.util.Set;
import java.util.stream.Collectors;

public class ExemploStreamSet {
    public static void main(String[] args) {
        Set<String> conjunto = Set.of("Maçã", "Banana", "Pêssego");

        // Filtrar elementos que começam com a letra 'P'
        Set<String> resultado = conjunto.stream()
                .filter(elemento -> elemento.startsWith("P"))
                .collect(Collectors.toSet());

        System.out.println("Resultado: " + resultado);
    }
}
