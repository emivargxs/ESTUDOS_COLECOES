import java.util.Objects;

public class Usuario {
    private String userName;
    private String email;
    private boolean ativo;

    public Usuario(String userName, String email){
        this.userName = userName;
        this.email = email;
        this.ativo = false;
    }

    public String getUserName(){
        return userName;
    }

    public String getEmail(){
        return email;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public void setAtivo(boolean ativo){
        this.ativo = ativo;
    }

    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Usuario usuario = (Usuario) obj;
        return userName.equals(usuario.userName);
    }

    public int hashCode(){
        return Objects.hash(userName);
    }
    
    public String toString(){
        String status;
        if(ativo){
            status = "sim";
        }else{
            status = "nao";
        }
        return "[ UserName: " + getUserName() + ", Email: " + getEmail() + ", Situacao: " + status + " ]";
    }
}
