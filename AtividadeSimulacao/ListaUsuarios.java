import java.util.ArrayList;
import java.util.List;

public class ListaUsuarios {
    private String nomeDaLista;
    private List<Usuario> usuarios;

    public ListaUsuarios(String nomeDaLista) {
        this.nomeDaLista = nomeDaLista;
        this.usuarios = new ArrayList<>();
    }

    public void criarUsuario(Usuario usuario) {
        // Implemente o método para adicionar usuário à lista
    }

    public void removerUsuario(Usuario usuario) {
        // Implemente o método para remover usuário da lista
    }
}
