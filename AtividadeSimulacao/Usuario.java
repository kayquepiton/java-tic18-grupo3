import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<String> listaPostagens; // Alterado para List<String>
    private List<Sessao> listaSessoes;
    private List<Usuario> amigos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaPostagens = new ArrayList<>(); // Inicializado como ArrayList de String
        this.listaSessoes = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void logar() {
        // Implemente o método de login aqui
    }

    public void deslogar(Sessao sessao) {
        // Implemente o método de logout aqui
    }
}
