public class Condicionais {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 17.0;

        // Condição Simples
        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

        //Condição Composta
        int nota = 10;
        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Prova Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Condição Ternária
        nota = 4;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

        // Switch case
        String sigla = "M";
        switch (sigla) {
            case "P":
                System.out.println("Pequeno");
                break;
            case "M":
                System.out.println("Medio");
                break;
            case "G":
                System.out.println("Grande");
                break;
            default:
                System.out.println("Indefinido");
        }
    }
}

