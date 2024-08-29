public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM " + "JAVA";
        System.out.println(nomeCompleto);
        System.out.println("---------------");
        System.out.println(1+1+1+"1");
        System.out.println(1+"1"+1+1);
        System.out.println(1+"1"+1+"1");
        System.out.println("1"+1+1+1);
        System.out.println("1"+(1+1+1));
        System.out.println("---------------");
        int numero = 5;
        numero = - numero;
        System.out.println(numero);
        numero = numero * -1;
        System.out.println(numero);
        System.out.println("---------------");
        //Ternário
        int a, b;
        a = 6;
        b = 6;
        String resultado = a == b ? "verdadeiro" : "falso";
        System.out.println(resultado);
        System.out.println("---------------");
        // Comparação de objetos utilizando equals
        String nomeUm = "Gabriel";
        String nomeDois = "Gabriel";
        System.out.println(nomeUm.equals(nomeDois));
    }
}
