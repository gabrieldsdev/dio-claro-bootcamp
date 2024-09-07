package list.Ordenacao.exercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> listaNumeros;

    public OrdenacaoNumeros() {
        this.listaNumeros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "OrdenacaoNumeros{" +
                "listaNumeros=" + listaNumeros +
                '}';
    }

    public void adicionarNumero(int numero) {
        listaNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            Collections.sort(numerosAscendente);
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosAscendente = new ArrayList<>(listaNumeros);
        if (!listaNumeros.isEmpty()) {
            numerosAscendente.sort(Collections.reverseOrder());
            return numerosAscendente;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            System.out.println(this.listaNumeros);
        }else{
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //Criando uma instância da classe OrdenaçãoNumeros
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        //Adicionando números à lista
        numeros.adicionarNumero(2);
        numeros.adicionarNumero(5);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(99);

        //Exibindo a lista de números adicionados
        numeros.exibirNumeros();

        //Ordenando e exibindo em ordem ascendente
        System.out.println(numeros.ordenarAscendente());

        //Exibindo a lista
        numeros.exibirNumeros();

        //Ordenando e exibindo em ordem descendente
        System.out.println(numeros.ordenarDescendente());

        //Exibindo a lista
        numeros.exibirNumeros();
    }

}
