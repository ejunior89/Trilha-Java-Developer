package one.digitalinnovations;

import java.util.Queue;
import java.util.LinkedList;

// A interface Queue representa filas, onde o primeiro elemento adicionado é o primeiro a ser removido (FIFO - First In, First Out).

public class ExemploQueue {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Tarefa 1");
        fila.add("Tarefa 2");
        fila.add("Tarefa 3");

        System.out.println("Próxima tarefa: " + fila.poll());
        System.out.println("Fila após a remoção: " + fila);
    }
}
