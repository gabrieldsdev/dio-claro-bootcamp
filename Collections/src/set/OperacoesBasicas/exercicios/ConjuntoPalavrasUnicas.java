package set.OperacoesBasicas.exercicios;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        if (!palavrasUnicas.isEmpty()) {
            if (palavrasUnicas.contains(palavra)) {
                palavrasUnicas.remove(palavra);
            } else {
                System.out.println("Palavra não encontrada no conjunto!");
            }
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("Rasengan");
        conjuntoPalavrasUnicas.adicionarPalavra("Chidori");
        conjuntoPalavrasUnicas.adicionarPalavra("Susanoo");
        conjuntoPalavrasUnicas.adicionarPalavra("Byakugan");
        conjuntoPalavrasUnicas.adicionarPalavra("Chidori");
        conjuntoPalavrasUnicas.adicionarPalavra("Susanoo");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("Rasengan");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        //Removendo uma palavra inexistente
        conjuntoPalavrasUnicas.removerPalavra("Rasenshuriken");

        //Verificando se uma palavra está no conjunto
        System.out.println("A palavra 'Rasengan' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Rasengan"));
        System.out.println("A palavra 'Chidori' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Chidori"));

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();
    }

}
