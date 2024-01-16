public class Main {
    public static void main(String[] args) {
        ListaEncadeadaDupla lista = new ListaEncadeadaDupla();

        lista.inserirNoInicio(3);
        lista.inserirNoInicio(2);
        lista.inserirNoInicio(1);

        lista.inserirNoFim(4);
        lista.inserirNoFim(5);

        System.out.println("Listas:");
        lista.imprimirLista(); 
        
        System.out.println("Lista Reverso:");
        lista.imprimirListaReverso(); 
    }
}
