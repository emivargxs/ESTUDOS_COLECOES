import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefas = new HashSet<>();

    public void adicionarTarefa(Tarefa tarefa){
        if(tarefas.add(tarefa)){
            System.out.println(tarefa + " : ADICIONADA.");
        }else{
            System.out.println("Já adicionado.");
        }
    }

    public void removerTarefa(Tarefa tarefa){
        if(tarefas.remove(tarefa)){
        System.out.println(tarefa + " : Removida.");
        } else{
        System.out.println("Já removida");
        }
    }

    public boolean marcarComoConcluida(String descricao){
        for(Tarefa tarefa : tarefas){
            if(tarefa.getDescricao().equals(descricao)){
                tarefa.setConcluida(true);
                return true;
            }
        }
        return false;
    }

        public List<Tarefa> listarPorPrioridade() {
        List<Tarefa> listaOrdenada = new ArrayList<>(tarefas);
        Collections.sort(listaOrdenada, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa t1, Tarefa t2) {
                return Integer.compare(t2.getPrioridade(), t1.getPrioridade()); // decrescente
            }
        });
        return listaOrdenada;
    }

   public List<Tarefa> listarPorPrioridadeEPendentes() {
        List<Tarefa> listaFiltrada = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            if (!tarefa.isConcluida()) {
                listaFiltrada.add(tarefa);
            }
        }

        Collections.sort(listaFiltrada, new Comparator<Tarefa>() {
            @Override
            public int compare(Tarefa t1, Tarefa t2) {
                return Integer.compare(t2.getPrioridade(), t1.getPrioridade()); // decrescente
            }
        });

        return listaFiltrada;
    }
}