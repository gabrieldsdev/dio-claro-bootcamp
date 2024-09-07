package list.Pesquisa.exercicio;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listInteiros = new ArrayList<>();

    public SomaNumeros() {
        this.listInteiros = listInteiros;
    }

    public void adicionarNumero(int numero) {
        listInteiros.add(numero);
    }

    public Integer calcularSoma() {
        int soma = 0;
        if (!listInteiros.isEmpty()) {
            for (Integer n : listInteiros) {
                soma = soma + n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!listInteiros.isEmpty()) {
            for (Integer numero : listInteiros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!listInteiros.isEmpty()) {
            for (Integer numero : listInteiros) {
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros() {
        if (!listInteiros.isEmpty()) {
            System.out.println(this.listInteiros);
        }else{
            System.out.println("A lista está vazia!");
        }
    }


    public static void main(String[] args) {
        SomaNumeros numeros = new SomaNumeros();
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(30);
        numeros.adicionarNumero(25);

        System.out.println(numeros.calcularSoma());
        System.out.println(numeros.encontrarMaiorNumero());
        System.out.println(numeros.encontrarMenorNumero());

        System.out.println("--------------------");
        numeros.exibirNumeros();
    }
}
