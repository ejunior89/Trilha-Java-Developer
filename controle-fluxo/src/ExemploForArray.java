public class ExemploForArray {
    public static void main(String[] args) {
    // em arrays o indicie se inicia em zero
        String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

        for (int x = 0; x < alunos.length; x++) {

            System.out.println("O Aluno no indice x=" + x + " é " + alunos [x] );
        }
    }
}
