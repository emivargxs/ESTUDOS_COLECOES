public class Main {
    public static void main(String[] args) {
        Biblioteca2 biblioteca = new Biblioteca2();

        // Adicionando livros
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123", 1954);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", "456", 1899);
        Livro livro3 = new Livro("1984", "George Orwell", "789", 1949);
        Livro livro4 = new Livro("O Hobbit", "J.R.R. Tolkien", "321", 1937);

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);
        biblioteca.adicionarLivro(livro4);

        // Tentando adicionar um livro duplicado
        biblioteca.adicionarLivro(new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123", 1954));

        // Removendo um livro
        biblioteca.removerLivroPorIsbn("456");

        // Buscando por título
        System.out.println("\nBusca por título 'O':");
        for (Livro l : biblioteca.procurarPorTitulo("O")) {
            System.out.println(l);
        }

        // Buscando por autor
        System.out.println("\nBusca por autor 'J.R.R. Tolkien':");
        for (Livro l : biblioteca.procurarPorAutor("J.R.R. Tolkien")) {
            System.out.println(l);
        }

        // Listando livros ordenados por ano de publicação
        System.out.println("\nLivros ordenados por ano de publicação:");
        for (Livro l : biblioteca.listarLivrosOrdenadosPorAno()) {
            System.out.println(l);
        }
    }
}