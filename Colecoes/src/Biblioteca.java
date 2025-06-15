import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Biblioteca{
        Set<Livro> livros = new TreeSet<>();

     public void adicionarLivro(Livro livro) {
        if (livros.add(livro)) {
            System.out.println("Livro adicionado: " + livro);
        } else {
            System.out.println("Livro já existe na biblioteca: " + livro);
        }
    }

    public void removerLivroPorIsbn(String isbn) {
        Livro livroParaRemover = null;
        for (Livro livro : livros) {
            if (livro.getIsbn().equals(isbn)) {
                livroParaRemover = livro;
                break;
            }
        }
        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro removido: " + livroParaRemover);
        } else {
            System.out.println("Livro com ISBN " + isbn + " não encontrado.");
        }
    }

    public List<Livro> procurarPorTitulo(String titulo) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                encontrados.add(livro);
            }
        }
        return encontrados;
    }

    public List<Livro> procurarPorAutor(String autor) {
        List<Livro> encontrados = new ArrayList<>();
        for (Livro livro : livros) {
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                encontrados.add(livro);
            }
        }
        return encontrados;
    }

    public List<Livro> listarLivrosOrdenadosPorAno() {
        List<Livro> lista = new ArrayList<>(livros);
        lista.sort(Comparator.comparingInt(Livro::getAnoPublicacao));
        return lista;
    }
}