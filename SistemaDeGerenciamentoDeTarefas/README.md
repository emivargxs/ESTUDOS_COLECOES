📝 Classe Tarefa:
A classe deve conter os seguintes atributos:

descricao (String)
prioridade (int – 1 a 5)
concluida (boolean)

Requisitos:

Implemente equals e hashCode com base na descrição da tarefa.
Implemente toString.

📂 Classe ListaTarefas:

Deve conter uma coleção de tarefas e os seguintes métodos:
adicionarTarefa(Tarefa tarefa)
removerTarefa(String descricao)
marcarComoConcluida(String descricao)
listarTarefasPorPrioridade(): retorna as tarefas ordenadas da maior para a menor prioridade.
listarTarefasPendentes(): retorna apenas as tarefas que ainda não foram concluídas.

🧪 Classe Main:

Crie tarefas com diferentes prioridades.
Marque algumas como concluídas.
Liste tarefas por prioridade e pendentes.

