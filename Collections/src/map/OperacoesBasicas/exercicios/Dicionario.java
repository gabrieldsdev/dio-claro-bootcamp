package map.OperacoesBasicas.exercicios;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioPalavras;

    public Dicionario() {
        this.dicionarioPalavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioPalavras.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioPalavras.isEmpty()) {
            dicionarioPalavras.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioPalavras);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicao = dicionarioPalavras.get(palavra);
        ;
        if (definicao != null) {
            return definicao;
        } else {
            return "Linguagem não encontrada.";
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.exibirPalavras();

        dicionario.adicionarPalavra("java", "Linguagem de programação orientada a objetos.");
        dicionario.adicionarPalavra("typescript", "Superset da linguagem JavaScript que adiciona tipagem estática.");
        dicionario.adicionarPalavra("kotlin", "Linguagem moderna de programação para a JVM.");

        dicionario.exibirPalavras();

        String definicaoJava = dicionario.pesquisarPorPalavra("java");
        System.out.println("Definilçao da Linguagem Java: " + definicaoJava);

        String definicaoCSharp = dicionario.pesquisarPorPalavra("csharp");
        System.out.println(definicaoCSharp);

        dicionario.removerPalavra("typescript");
        dicionario.exibirPalavras();
    }
}
