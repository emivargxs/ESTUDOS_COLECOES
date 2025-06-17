public class App {
    public static void main(String[] args) throws Exception {
    SistemaLogin sistemaLogin = new SistemaLogin();

    Usuario u1 = new Usuario("Emile", "emile.bordinvargas@gmail.com");
    Usuario u2 = new Usuario("Natan", "NatanMuller@gmail.com");

    sistemaLogin.adicionarUsuario(u1);
    sistemaLogin.adicionarUsuario(u2);

    sistemaLogin.ativarUsuario("Emile");
    sistemaLogin.ativarUsuario("bob");
    sistemaLogin.ativarUsuario("Natan");

    System.out.println("Listando ativos:");
    for(Usuario u : sistemaLogin.ListarTodosUsuariosAtivos()){
        System.out.println(u);
    }
    }
}
