public class Repeticao {

    public static void main(String[] args) {
        // For
        for (int carneirinhos = 1; carneirinhos <= 20; carneirinhos++) {
            System.out.println("Contando carneirinhos " + carneirinhos);
        }
        System.out.println("Joaozinho dormiu");

        // Arrays
        System.out.println("------------------------------------");
        String[] alunos = {"Felipe", "Jonas", "Julia", "Marcos"};
        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        }

        // Break/Continue
        System.out.println("------------------------------------");
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                // Não irá imprimir o 3
                continue;
            }
            System.out.println(numero);
        }
    }
}
