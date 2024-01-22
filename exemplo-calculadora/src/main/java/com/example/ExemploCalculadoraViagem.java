package com.example;

import java.util.Scanner;

public class ExemploCalculadoraViagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtendo informações do usuário
        System.out.print("Informe a velocidade média (km/h): ");
        double velocidadeMedia = scanner.nextDouble();

        System.out.print("Informe o consumo de combustível por litro (km/l): ");
        double consumoCombustivel = scanner.nextDouble();

        // Constantes
        final double DISTANCIA_VIAGEM = 800.0;

        // Calculando o tempo de viagem
        double tempoViagem = DISTANCIA_VIAGEM / velocidadeMedia;

        // Calculando o gasto de combustível
        double gastoCombustivel = DISTANCIA_VIAGEM / consumoCombustivel;

        // Exibindo resultados
        System.out.println("\nResultados da Viagem:");
        System.out.println("Distância da Viagem: " + DISTANCIA_VIAGEM + " km");
        System.out.println("Velocidade Média: " + velocidadeMedia + " km/h");
        System.out.println("Tempo de Viagem: " + tempoViagem + " horas");
        System.out.println("Consumo de Combustível: " + gastoCombustivel + " litros");

        // Fechando o scanner
        scanner.close();
    }
}
