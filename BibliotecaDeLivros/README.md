📝 Classe Livro

Atributos:
titulo (String)
autor (String)
anoPublicacao (int)

Requisitos:

Implemente equals e hashCode com base no titulo.
Implemente Comparable<Livro> para ordenar pelo ano (mais recente primeiro).
Implemente toString.

📂 Classe Biblioteca

Use um TreeSet<Livro> para armazenar os livros ordenados.

Métodos:
adicionarLivro(Livro l)
removerLivro(String titulo)
listarLivros(): imprime os livros por ordem de ano (decrescente).

🧪 Main:
Crie livros com anos diferentes.

Liste os livros ordenadamente.