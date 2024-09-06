package list.OperacoesBasicas.exercicio;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //Atributo
    private List<Item> carrinhoCompras;

    public CarrinhoDeCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!carrinhoCompras.isEmpty()) {
            for (Item i : carrinhoCompras) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            carrinhoCompras.removeAll(itensParaRemover);
        } else {
            System.out.println("A listta está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!carrinhoCompras.isEmpty()) {
            for (Item i : carrinhoCompras) {
                double valorItem = i.getPreco() * i.getQuantidade();
                valorTotal += valorItem;
            }
            return valorTotal;
        } else {
            //System.out.println("A lista está vazia!");
            throw new RuntimeException("A lista está vazia!");
        }
    }


    public void exibirItens() {
        if (!carrinhoCompras.isEmpty()) {
            System.out.println(this.carrinhoCompras);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    @Override
    public String toString() {
        return "CarrinhoDeCompras{" +
                "carrinhoCompras=" + carrinhoCompras +
                '}';
    }


    public static void main(String[] args) {
        // Criando uma instância do carrinho de compras
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Adicionando itens no carrinho
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
        carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
        carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

        //Exibindo os itens do carrinho
        carrinhoDeCompras.exibirItens();

        //Removendo um item do carrinho
        carrinhoDeCompras.removerItem("Lápis");

        //Exibindo os itens atualizados no carrinho
        carrinhoDeCompras.exibirItens();

        //Calculando e exibindo o valor total da compra
        System.out.println("O valor total da compra é = " + carrinhoDeCompras.calcularValorTotal());
    }
}

