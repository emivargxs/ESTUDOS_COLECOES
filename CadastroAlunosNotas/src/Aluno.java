import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;
    private String matricula;
    private List<Double> notas;
    
    public Aluno(String nome, String matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new ArrayList<>();
    }
    
    public void adicionarNota(double nota){
        this.notas.add(nota);

    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Aluno aluno = (Aluno) obj;
        return matricula.equals(aluno.matricula);
    }
    
    public int hashCode(){
        return Objects.hash(matricula);
    }

    public double calcularMedia(){
        if(notas.isEmpty()) return 0.0;
        double soma = 0.0;
        for(double nota : notas){
            soma = soma + nota;
        }
        return soma/notas.size();
    }
    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public List<Double> getNotas() {
        return notas;
    }
}
