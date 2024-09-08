package set.Pesquisa.exercicios;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> agenda;

    public AgendaContatos() {
        this.agenda = new HashSet<>();
    }

    public void adicionarContato(String nome, int numeroTelefone) {
        agenda.add(new Contato(nome, numeroTelefone));
    }

    public void exibirContatos() {
        if (!agenda.isEmpty()) {
            System.out.println(agenda);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : agenda) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        // Primeiro vai atualizar o contato,
        // depois vai fazer a referência para contatoAtualizado.
        // Por enquanto apenas inicia vazio
        Contato contatoAtualizado = null;
        for(Contato c : agenda){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumeroTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Gabriel", 123456);
        agendaContatos.adicionarContato("Gabriel", 5665);
        agendaContatos.adicionarContato("Gabriel Dutra", 1111111);
        agendaContatos.adicionarContato("Gabriel Silva", 654987);
        agendaContatos.adicionarContato("Fabiano", 654987);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Gabriel "));
        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Fabiano" , 11111111));

        agendaContatos.exibirContatos();

    }
}
