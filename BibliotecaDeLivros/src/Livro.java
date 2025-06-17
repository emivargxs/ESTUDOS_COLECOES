import java.util.Objects;

public class Livro implements Comparable <Livro> {
    private String titulo;
    private String autor;
    private int anoPublicacao;
 
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass()!= obj.getClass()) return false;
        Livro livro = (Livro) obj;
        return titulo.equals(livro.titulo);
    }

    public int hashCode(){
        return Objects.hash(titulo);
    }
    @Override
    public int compareTo(Livro outro){
        return Integer.compare(outro.anoPublicacao, this.anoPublicacao);
    }

    @Override
    public String toString(){
        return "[ Titulo: " + getAnoPublicacao() + "| Autor : " + getAutor() + "| Ano Publicacao: " + getAnoPublicacao() + "]";
    }

}
