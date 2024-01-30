

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.mock;

import org.mockito.Mockito;

import java.util.List;


@ExtendWith(MockitoExtension.class)
public class ListaTeste {
    public class ListaTeste {

        @Mock
        private List<String> letras;

        @Test
        void adicionarIntenNaLista() {
            Mockito.when(letras.get(B)).thenReturn(B);

            Assertions.assertEquals(B, letras.get(B));
        }
    }
}
