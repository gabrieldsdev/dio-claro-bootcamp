import java.util.Scanner;

public class MenorPalavra {
    public static void main(String[] args) {
        String[] frase;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase:");
        frase = scanner.nextLine().split("\\s+");

        String mPalavra = frase[0];
        System.out.println(frase[0]);

        System.out.println("Verificando menor palavra...");
        for (String palavra : frase){
            if(palavra.length() < mPalavra.length()){
                mPalavra = palavra;
            }
        }

        System.out.println("A menor palavra da frase é: " + mPalavra);

    }
}
