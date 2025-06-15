public class App {
    public static void main(String[] args) {
        Turma turma = new Turma();

        // Criar alunos
        Aluno a1 = new Aluno("Emile", "23111271");
        Aluno a2 = new Aluno("Felipe", "5255454151");
        Aluno a3 = new Aluno("Natan", "258214515");

        // Adicionar notas para cada aluno
        a1.adicionarNota(8.0);
        a1.adicionarNota(7.5);
        a1.adicionarNota(9.0);

        a2.adicionarNota(5.0);
        a2.adicionarNota(6.0);
        a2.adicionarNota(6.5);

        a3.adicionarNota(9.0);
        a3.adicionarNota(9.5);
        a3.adicionarNota(10.0);

        // Adicionar alunos à turma
        turma.adicionarAluno(a1);
        turma.adicionarAluno(a2);
        turma.adicionarAluno(a3);

        // Mostrar alunos com média acima de 7.0
        System.out.println("Alunos com média acima de 7.0:");
        for (Aluno aluno : turma.alunsoComMediaAcimaDe(7.0)) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
        }

        // Listar todos os alunos ordenados pela média (crescente)
        System.out.println("\nAlunos ordenados pela média (crescente):");
        for (Aluno aluno : turma.listarTodosOrdenadosPorMedia()) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
        }
    }
}
