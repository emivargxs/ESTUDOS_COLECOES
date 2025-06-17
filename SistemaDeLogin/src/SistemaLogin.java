import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SistemaLogin {
    private Set<Usuario> usuario = new HashSet<>();
    
    public void adicionarUsuario (Usuario u){
        if(usuario.add(u)){
            System.out.println("Usuario adicionado" + u);
        }else{
            System.out.println("Usuario já adicionado");
        }
    }

    public void removerUsuario(String userName){
        Usuario usuarioRemover = null;
        for (Usuario u : usuario) {
            if (u.getUserName().equals(userName)) {
                usuarioRemover = u;
                break;
            }
        }

        if (usuarioRemover != null && usuario.remove(usuarioRemover)) {
            System.out.println("Usuario Removido: " + userName);
        } else {
            System.out.println("Usuario já removido ou não encontrado");
        }
}

    public boolean ativarUsuario(String userName){
        for(Usuario u : usuario){
            if(u.getUserName().equals(userName)){
                u.setAtivo(true);
                System.out.println("Usuario ativado: " + userName);
                return true;
            }
        }
        System.out.println("Usuario nao encontrado: " + userName);
        return false;
    }

    public List<Usuario> ListarTodosUsuariosAtivos(){
        List<Usuario> lista = new ArrayList<>();
        for(Usuario u : usuario){
            if(u.isAtivo()){
                lista.add(u);
                
            }
        }
        return lista;
    }
}

