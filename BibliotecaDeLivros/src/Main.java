public class Main {
    public static void main(String[] args) {
        Biblioteca2 biblioteca = new Biblioteca2();

        Livro l2 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
        Livro l3 = new Livro("O Código Da Vinci", "Dan Brown", 2003);
        Livro l4 = new Livro("A Revolução dos Bichos", "George Orwell", 1945);

        biblioteca.adicionarLivro(l1);
        biblioteca.adicionarLivro(l2);
        biblioteca.adicionarLivro(l3);
        biblioteca.adicionarLivro(l4);

        biblioteca.listarLivros();

        biblioteca.removerLivro("1984");

        System.out.println("\nApós remover o livro '1984':");
        biblioteca.listarLivros();
    }
}
