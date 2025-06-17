import java.util.Set;
import java.util.TreeSet;

public class Biblioteca2 {
    private Set<Livro> livros = new TreeSet<>();

    public void adicionarLivro(Livro l){
        if(livros.add(l)){
            System.out.println("Livro adicionado: " + l);
        }else{
            System.out.println("Livro Já adicionado");
        }
    }

    public void removerLivro(String titulo){
        Livro livrosParaRemover = null;
        for(Livro u : livros){
            if(u.getTitulo().equals(titulo)){
                livrosParaRemover = u;
                break;
            }
        }
        if(livrosParaRemover != null && livros.remove(livrosParaRemover)){
            System.out.println("Livro Removido: " + titulo);
        }else{
            System.out.println("Livro Já removido ou nao encontrado");
        }
    }

    public void listarLivros(){
        if(livros.isEmpty()){
            System.out.println("Nenhum livro");
            return;
        }
        System.out.println("\n--- Livros na Biblioteca (ordem decrescente de ano) ---");
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
