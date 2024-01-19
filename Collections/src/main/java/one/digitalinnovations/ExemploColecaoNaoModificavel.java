package one.digitalinnovations;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ExemploColecaoNaoModificavel {
    public static void main(String[] args) {
        List<String> cores = new ArrayList<>();
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Azul");

        List<String> colecaoNaoModificavel = Collections.unmodifiableList(cores);

        // Tentativa de modificar resultará em exceção UnsupportedOperationException
         colecaoNaoModificavel.add("Amarelo");
        System.out.println(colecaoNaoModificavel);
    }
}

