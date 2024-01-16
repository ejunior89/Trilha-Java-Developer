class ListaEncadeadaDupla {
    private No primeiro;
    private No ultimo;

    public ListaEncadeadaDupla() {
        this.primeiro = null;
        this.ultimo = null;
    }

    public boolean estaVazia() {
        return primeiro == null;
    }

    public void inserirNoInicio(int dado) {
        No novoNo = new No(dado);
        if (estaVazia()) {
            primeiro = novoNo;
            ultimo = novoNo;
        } else {
            novoNo.proximo = primeiro;
            primeiro.anterior = novoNo;
            primeiro = novoNo;
        }
    }

    public void inserirNoFim(int dado) {
        No novoNo = new No(dado);
        if (estaVazia()) {
            primeiro = novoNovo;
            ultimo = novoNovo;
        } else {
            ultimo.proximo = novoNo;
            novoNo.anterior = ultimo;
            ultimo = novoNovo;
        }
    }

    public void imprimirLista() {
        No atual = primeiro;
        while (atual != null) {
            System.out.println(atual.dado + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

    public void imprimirListaReverso() {
        No atual = ultimo;
        while (atual != null) {
            System.out.println(atual.dado + " ");
            atual = atual.anterior;
        }
        System.out.println();
    }
}