package one.digitalinnovation;

import java.util.Map;
import java.util.HashMap;

public class ExemploMergeCompute {
    public static void main(String[] args) {
        Map<String, Integer> pontos = new HashMap<>();
        pontos.put("TimeA", 10);

        // merge: Adiciona 5 pontos ao TimeA
        pontos.merge("TimeA", 5, Integer::sum);

        // compute: Multiplica os pontos do TimeA por 2
        pontos.compute("TimeA", (key, value) -> value * 2);

        System.out.println("Pontos: " + pontos);
    }
}

