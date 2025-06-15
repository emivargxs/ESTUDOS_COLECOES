import java.util.Objects;

public class Livro implements Comparable <Livro> {
    private String titulo;
    private String autor;
    private String isbn;
    private int anoPublicacao;

    public Livro(String titulo, String autor, String isbn, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.anoPublicacao = anoPublicacao;
    }

    //getters
    public String getTitulo(){
        return titulo;
    }
    
    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getAnoPublicacao(){
        return anoPublicacao;
    }

    @Override 
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;

        Livro outro = (Livro) obj;
        return isbn == outro.isbn;

    }
    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }


    public String toString(){
        return "Titulo: " + getTitulo() + " Autor: " + getAutor() + " ISBN: " + getIsbn() + " Ano Publicacao: " + getAnoPublicacao();
    }

    @Override
    public int compareTo(Livro outra){
        return this.isbn.compareTo(outra.isbn);
    }
}

