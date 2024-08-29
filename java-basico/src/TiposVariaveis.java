public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;

        long numeroLongo = 10000L;
        float numeroDecimal = 150.684F;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 5;

        numero = 10;

        System.out.println(numero);

        //Constantes devem ser declaradas em caixa alta e com o final
        final double VALOR_DE_PI = 3.14;
    }
}
