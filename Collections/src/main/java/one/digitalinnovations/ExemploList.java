package one.digitalinnovations;

import java.util.List;
import java.util.ArrayList;

// A interface List estende Collection e adiciona funcionalidades específicas de listas, como acesso por índice e ordenação.
public class ExemploList {
    public static void main(String[] args) {
        List<String> frutas = new ArrayList<>();
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Morango");

        System.out.println("Elemento no índice 1: " + frutas.get(1));
        frutas.remove("Banana");
        System.out.println("Após remover Banana: " + frutas);
    }
}

