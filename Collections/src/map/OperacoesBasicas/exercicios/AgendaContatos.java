package map.OperacoesBasicas.exercicios;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Gabriel", 123456);
        agendaContatos.adicionarContato("Gabriel", 5665);
        agendaContatos.adicionarContato("Gabriel Dutra", 1111111);
        agendaContatos.adicionarContato("Gabriel Silva", 654987);
        agendaContatos.adicionarContato("Fabio Santos", 1111111);
        agendaContatos.adicionarContato("Gabriel", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Gabriel Silva");
        agendaContatos.exibirContatos();

        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Gabriel Dutra"));
    }
}
