import java.util.Objects;

public class Tarefa {
    private String descricao;
    private int prioridade;
    private boolean concluida;

    public Tarefa(String descricao, int prioridade){
        this.descricao = descricao;
        if(prioridade < 1 || prioridade> 5){
            throw new IllegalArgumentException("Prioridade deve ser entre 1 e 5.");
        }
        this.prioridade= prioridade;
        this.concluida = false;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getPrioridade(){
        return prioridade;
    }

    public boolean isConcluida(){
            return concluida;
    }

    public void setConcluida(boolean concluida) {
    this.concluida = concluida;
}

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Tarefa tarefa = (Tarefa) obj;
        return descricao.equals(tarefa.descricao);
    }
     
    @Override
    public int hashCode(){
        return Objects.hash(descricao);
    }


    @Override
    public String toString(){
        String status;
        if(concluida){
            status = "sim";
        }else{
            status = "nao";
        }
        return "Tarefa [Descricao: " + getDescricao() + ", Prioridade: " + getPrioridade() + ", Situacao: " + status;
    }

}