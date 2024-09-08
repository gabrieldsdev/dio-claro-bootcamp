package set.Pesquisa.exercicios;

public class Tarefa {
    private String descricao;
    private boolean foiConcluida;

    public Tarefa(String descricao) {
        this.descricao = descricao;
        this.foiConcluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFoiConcluida() {
        return foiConcluida;
    }

    public void setFoiConcluida(boolean foiConcluida) {
        this.foiConcluida = foiConcluida;
    }

    @Override
    public String toString() {
        String status;
        if(foiConcluida){
            status = "Concluída";
        }else{
            status = "Pendente";
        }
        return "{" + descricao + "," + "Status: " + status + "}";
    }
}
