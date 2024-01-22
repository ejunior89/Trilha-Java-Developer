package one.digitalinnovation;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um mapa para armazenar informações sobre carros
        Map<String, Carro> carros = new HashMap<>();

        // Adicionando carros ao mapa
        carros.put("Carro1", new Carro("Ford Ka", 12.5, 50000));
        carros.put("Carro2", new Carro("Gol", 15.0, 60000));
        carros.put("Carro3", new Carro("Argo", 10.5, 45000));

        // Imprimindo informações sobre os carros
        System.out.println("Informações sobre os carros:");

        for (Entry<String, Carro> entry : carros.entrySet()) {
            System.out.println("Nome: " + entry.getKey() +
                    ", Marca: " + entry.getValue().getMarca() +
                    ", Consumo Médio: " + entry.getValue().getConsumoMedio() +
                    " km/l, Preço: R$ " + entry.getValue().getPreco());
        }

        // Encontrando o carro mais econômico
        Carro maisEconomico = encontrarCarroMaisEconomico(carros);
        System.out.println("\nCarro mais econômico: " + maisEconomico);

        // Encontrando o carro mais barato
        Carro maisBarato = encontrarCarroMaisBarato(carros);
        System.out.println("Carro mais barato: " + maisBarato);

        // Encontrando o carro com melhor custo-benefício
        Carro melhorCustoBeneficio = encontrarMelhorCustoBeneficio(carros);
        System.out.println("Carro com melhor custo-benefício: " + melhorCustoBeneficio);
    }

    // Método para encontrar o carro mais econômico
    private static Carro encontrarCarroMaisEconomico(Map<String, Carro> carros) {
        Carro maisEconomico = null;
        double menorConsumo = Double.MAX_VALUE;

        for (Carro carro : carros.values()) {
            if (carro.getConsumoMedio() < menorConsumo) {
                menorConsumo = carro.getConsumoMedio();
                maisEconomico = carro;
            }
        }

        return maisEconomico;
    }

    // Método para encontrar o carro mais barato
    private static Carro encontrarCarroMaisBarato(Map<String, Carro> carros) {
        Carro maisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        for (Carro carro : carros.values()) {
            if (carro.getPreco() < menorPreco) {
                menorPreco = carro.getPreco();
                maisBarato = carro;
            }
        }

        return maisBarato;
    }

    // Método para encontrar o carro com melhor custo-benefício (mais econômico e mais barato)
    private static Carro encontrarMelhorCustoBeneficio(Map<String, Carro> carros) {
        Carro melhorCustoBeneficio = null;
        double melhorIndiceCustoBeneficio = Double.MAX_VALUE;

        for (Carro carro : carros.values()) {
            double indiceCustoBeneficio = carro.getConsumoMedio() / carro.getPreco();

            if (indiceCustoBeneficio < melhorIndiceCustoBeneficio) {
                melhorIndiceCustoBeneficio = indiceCustoBeneficio;
                melhorCustoBeneficio = carro;
            }
        }

        return melhorCustoBeneficio;
    }

    // Classe para representar informações sobre um carro
    static class Carro {
        private String marca;
        private double consumoMedio;
        private double preco;

        public Carro(String marca, double consumoMedio, double preco) {
            this.marca = marca;
            this.consumoMedio = consumoMedio;
            this.preco = preco;
        }

        public String getMarca() {
            return marca;
        }

        public double getConsumoMedio() {
            return consumoMedio;
        }

        public double getPreco() {
            return preco;
        }

        @Override
        public String toString() {
            return "Marca: " + marca + ", Consumo Médio: " + consumoMedio + " km/l, Preço: R$ " + preco;
        }
    }
}

