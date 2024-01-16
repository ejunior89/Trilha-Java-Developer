package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<Integer> lista = new ListaCircular<>();

        // Adiciona elementos à lista
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);

        // Imprime a lista
        System.out.println("Lista: " + lista.toString());

        // Remove um elemento da lista
        lista.remove(1);

        // Imprime a lista após remoção
        System.out.println("Lista após remoção: " + lista.toString());

        // Obtém um elemento da lista
        int elemento = lista.get(0);
        System.out.println("Elemento na posição 0: " + elemento);

        // Imprime o tamanho da lista
        System.out.println("Tamanho da lista: " + lista.size());

        // Verifica se a lista está vazia
        System.out.println("A lista está vazia? " + lista.isEmpty());
    }
}
