package one.digitalinnovation;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cauda.setNoProximo(this.cabeca);
        } else {
            novoNo.setNoProximo(this.cauda.getNoProximo());
            this.cauda.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista || index < 0)
            throw new IndexOutOfBoundsException("O índice é maior que o tamanho da lista ou menor que zero");

        No<T> noAuxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else {
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    private No<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A Lista está vazia..");

        if (index == 0) {
            return this.cabeca;
        }

        No<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index) && (noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public boolean isEmpty() {
        return this.tamanhoLista == 0;
    }

    public int size() {
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        StringBuilder resultado = new StringBuilder("[");
        No<T> noAtual = this.cauda;

        for (int i = 0; i < this.tamanhoLista; i++) {
            resultado.append(noAtual.getConteudo());

            if (i < this.tamanhoLista - 1) {
                resultado.append(", ");
            }

            noAtual = noAtual.getNoProximo();
        }

        resultado.append("]");
        return resultado.toString();
    }
}
