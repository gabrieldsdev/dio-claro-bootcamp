import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("Programa Conta Terminal Bancario");
        System.out.print("Por favor, informe o seu nome completo: ");
        String nomeCliente = entrada.nextLine();
        System.out.print("Agora digite o número da sua Agência: ");
        String agencia = entrada.nextLine();
        System.out.print("Informe o número da sua Conta bancária: ");
        int numeroConta = entrada.nextInt();
        System.out.print("Por fim, informe o saldo da sua conta: ");
        double saldoBancario = entrada.nextDouble();
        System.out.println("------------------------------------");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de R$ " + saldoBancario + " já está disponível para saque.");
    }
}
