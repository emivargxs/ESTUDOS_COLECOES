Exercício 1: Sistema de Login

📝 Classe Usuario

Atributos:

username (String)
email (String)
ativo (boolean)

Requisitos:

Implemente equals e hashCode com base no username.
Implemente toString.
Considere dois usuários iguais se tiverem o mesmo username.

📂 Classe SistemaLogin
Use um HashSet<Usuario> para armazenar os usuários.

Métodos:

adicionarUsuario(Usuario u)
removerUsuario(String username)
ativarUsuario(String username)
listarUsuariosAtivos(): retorna apenas usuários ativos.