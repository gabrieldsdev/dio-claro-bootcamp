import java.util.Scanner;

public class TesteDesafioPlano {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        System.out.print("Informe o plano a ser verificado:");
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Informe o nome do cliente, e os serviços contratados separados por virgula");
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;

        // TODO: Verifique se o serviço está na lista de serviços contratados
        for(int i = 1; i < partes.length;i++){
            if(partes[i].equals(servico)){
                contratado = true;
                break;
            }else{
                contratado = false;
            }
        }
        scanner.close();

        if(contratado){
            System.out.print("Possui serviço contratado.");
        }else{
            System.out.print("Nao possui plano contratado.");
        }
    }
}