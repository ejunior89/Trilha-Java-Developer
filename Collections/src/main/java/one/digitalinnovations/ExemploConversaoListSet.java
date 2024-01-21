package one.digitalinnovations;

import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;

public class ExemploConversaoListSet {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>(List.of("A", "B", "C"));

        // Convertendo List para Set
        Set<String> conjunto = new HashSet<>(lista);

        // Convertendo Set para List
        List<String> novaLista = new ArrayList<>(conjunto);
        System.out.println(novaLista);
    }
}
