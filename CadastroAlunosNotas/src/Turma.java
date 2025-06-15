import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Turma {
    private Set<Aluno> alunos = new HashSet<>();

    //adiciona Aluno em alunos.
    public void adicionarAluno(Aluno aluno){
      alunos.add(aluno);
    }

    //remove aluno
    public void removerAluno(String matricula){
        Aluno alunoParaRemover = null;
        for(Aluno a : alunos){
            if(a.getMatricula().equals(matricula)){
                alunoParaRemover = a;
                break;
            }
        }if(alunoParaRemover != null){
            alunos.remove(alunoParaRemover);
        }
    }

    public Aluno buscarAluno(String matricula){
     for (Aluno a : alunos) {
        if (a.getMatricula().equals(matricula)) {
            return a;
        }
    }
    return null; // não encontrado
    }   

    public List<Aluno> alunsoComMediaAcimaDe(double valor){
        List<Aluno> resultado = new ArrayList<>();
        for(Aluno a : alunos){
            if(a.calcularMedia() > valor){
                resultado.add(a);
            }
        }
        return resultado;
    }

     public List<Aluno> listarTodosOrdenadosPorMedia() {
        List<Aluno> listarMedia = new ArrayList<>(alunos); // cria uma cópia da lista para não modificar a original

        // Ordena pelo resultado de calcularMedia(), do menor para o maior
        Collections.sort(listarMedia, Comparator.comparingDouble(Aluno::calcularMedia));

        // Se quiser ordem decrescente, use:
        // Collections.sort(listarMedia, Comparator.comparingDouble(Aluno::calcularMedia).reversed());

        return listarMedia;
    }
}
