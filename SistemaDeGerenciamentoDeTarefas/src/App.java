public class App {
    public static void main(String[] args) {
        ListaTarefas lista = new ListaTarefas();

        Tarefa t1 = new Tarefa("Apagar dados", 5);
        Tarefa t2 = new Tarefa("Carregar dados", 2);
        Tarefa t3 = new Tarefa("Atualizar banco", 4);
        Tarefa t4 = new Tarefa("Verificar logs", 3);

        lista.adicionarTarefa(t1);
        lista.adicionarTarefa(t2);
        lista.adicionarTarefa(t3);
        lista.adicionarTarefa(t4);

        lista.marcarComoConcluida("Carregar dados");
        lista.marcarComoConcluida("Verificar logs");

        System.out.println("\n Tarefas por prioridade:");
        for (Tarefa tarefa : lista.listarPorPrioridade()) {
            System.out.println(tarefa);
        }

        System.out.println("\n Tarefas pendentes:");
        for (Tarefa tarefa : lista.listarPorPrioridadeEPendentes()) {
            System.out.println(tarefa);
        }
    }
}
