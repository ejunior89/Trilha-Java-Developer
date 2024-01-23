package one.digitalinnovation;

import java.util.*;
import java.util.stream.Collectors;

public class ProgramaGerenciamentoCarros {
    public static void main(String[] args) {
        // Criando uma lista de carros
        List<Carro> carros = Arrays.asList(
                new Carro("Toyota", "Corolla", 12.5, 80000),
                new Carro("Honda", "Civic", 14.0, 75000),
                new Carro("Volkswagen", "Golf", 10.5, 90000),
                new Carro("Ford", "Focus", 11.8, 82000)
                // Adicione mais carros conforme necessário
        );

        // Criando um conjunto de carros
        Set<Carro> conjuntoCarros = new HashSet<>(carros);

        // Criando um mapa de carros por modelo
        Map<String, Carro> mapaCarrosPorModelo = carros.stream()
                .collect(Collectors.toMap(Carro::getModelo, carro -> carro));

        // Criando um TreeSet de carros ordenados por preço
        Set<Carro> treeSetCarrosPorPreco = new TreeSet<>(Comparator.comparingDouble(Carro::getPreco));

        // Adicionando carros ao TreeSet
        treeSetCarrosPorPreco.addAll(carros);

        // Exibindo todos os carros ordenados por preço usando Iterator
        System.out.println("Todos os carros ordenados por preço (usando Iterator):");
        Iterator<Carro> iteratorCarrosPorPreco = treeSetCarrosPorPreco.iterator();
        while (iteratorCarrosPorPreco.hasNext()) {
            System.out.println(iteratorCarrosPorPreco.next());
        }

        // Utilizando Comparator.reverseOrder para inverter a ordenação por preço
        Set<Carro> treeSetCarrosPorPrecoReverso = new TreeSet<>(Comparator.comparingDouble(Carro::getPreco).reversed());
        treeSetCarrosPorPrecoReverso.addAll(carros);

        // Exibindo todos os carros ordenados por preço de forma reversa usando forEach e expressão lambda
        System.out.println("\nTodos os carros ordenados por preço de forma reversa (usando forEach e expressão lambda):");
        treeSetCarrosPorPrecoReverso.forEach(System.out::println);

        // Utilizando métodos de List para ordenar por marca e exibir
        List<Carro> carrosOrdenadosPorMarca = new ArrayList<>(carros);
        carrosOrdenadosPorMarca.sort(Comparator.comparing(Carro::getMarca));

        // Exibindo todos os carros ordenados por marca usando forEach e expressão lambda
        System.out.println("\nTodos os carros ordenados por marca (usando forEach e expressão lambda):");
        carrosOrdenadosPorMarca.forEach(System.out::println);

        // Aplicando um filtro para exibir apenas carros com consumo médio superior a 12 km/l usando Stream
        System.out.println("\nCarros com consumo médio superior a 12 km/l (usando Stream):");
        carros.stream()
                .filter(carro -> carro.getConsumoMedio() > 12)
                .forEach(System.out::println);

        // Utilizando Map.Entry para iterar sobre pares chave-valor no mapa
        System.out.println("\nMapa de carros por modelo (usando Map.Entry):");
        for (Map.Entry<String, Carro> entry : mapaCarrosPorModelo.entrySet()) {
            System.out.println("Modelo: " + entry.getKey() + ", Carro: " + entry.getValue());
        }
    }
}

class Carro {
    private String marca;
    private String modelo;
    private double consumoMedio;
    private double preco;

    public Carro(String marca, String modelo, double consumoMedio, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumoMedio = consumoMedio;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getConsumoMedio() {
        return consumoMedio;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumoMedio=" + consumoMedio +
                ", preco=" + preco +
                '}';
    }
}
