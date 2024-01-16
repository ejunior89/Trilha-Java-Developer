package one.digitalinnovation;

public class Main {
    public static void main(String[] args) {
        ListaCircular<String> listaComida = new ListaCircular<>();

        // Adiciona elementos à lista
        listaComida.add("Arroz");
        listaComida.add("Feijão");
        listaComida.add("Carne");
        listaComida.add("Peixe");
        listaComida.add("Sabão");

        // Imprime a lista
        System.out.println("Lista de Comida: " + listaComida.toString());

        // Remove um elemento da lista
        listaComida.remove(1);

        // Imprime a lista após remoção
        System.out.println("Lista de Comida após remoção: " + listaComida.toString());

        // Obtém um elemento da lista
        String elemento = listaComida.get(0);
        System.out.println("Elemento na posição 0: " + elemento);

        // Imprime o tamanho da lista
        System.out.println("Tamanho da lista de Comida: " + listaComida.size());

        // Verifica se a lista está vazia
        System.out.println("A lista de Comida está vazia? " + listaComida.isEmpty());
    }
}
