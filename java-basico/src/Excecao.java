import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;

public class Excecao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        boolean inputValid = false;

        while (!inputValid) {
            try {
                System.out.println("Digite seu nome");
                String nome = scanner.nextLine();

                System.out.println("Digite seu sobrenome");
                String sobrenome = scanner.nextLine();

                System.out.println("Digite sua idade");
                int idade = scanner.nextInt();

                System.out.println("Digite sua altura");
                double altura = scanner.nextDouble();

                //Imprimindo os dados obtidos pelo usuário
                System.out.println("Ola, me chamo " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
                System.out.println("Tenho " + idade + " anos ");
                System.out.println("Minha altura é " + altura + "cm ");
                inputValid = true;
            } catch (InputMismatchException e) {
                System.err.println("Os campos idade e altura precisam ser numéricos");
                scanner.nextLine();
            }

        }
        scanner.close();
    }
}
