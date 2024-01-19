package one.digitalinnovations;

import java.util.List;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;

class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String toString() {
        return nome + " - " + idade + " anos";
    }
}

public class ExemploComparator {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 25));
        pessoas.add(new Pessoa("Bob", 30));
        pessoas.add(new Pessoa("Charlie", 28));
        pessoas.add(new Pessoa("Junior", 34));
        pessoas.add(new Pessoa("Jorginho", 44));

        // Ordena as pessoas por idade usando um Comparator
        pessoas.sort(Comparator.comparingInt(p -> p.idade));
        System.out.println("Pessoas ordenadas por idade: " + pessoas);
    }
}
