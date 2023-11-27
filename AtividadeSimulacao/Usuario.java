import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Postagem> listaPostagens;
    private List<Sessao> listaSessoes;
    private List<Usuario> amigos;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.listaPostagens = new ArrayList<>();
        this.listaSessoes = new ArrayList<>();
        this.amigos = new ArrayList<>();
    }

    public void logar() {
        // Lógica de login
        System.out.println(nome + " entrou no sistema.");
    }

    public void deslogar(Sessao sessao) {
        // Lógica de logout
        System.out.println(nome + " saiu do sistema.");
    }

    public void adicionarAmigo(Usuario amigo) {
        amigos.add(amigo);
    }

    public void removerAmigo(Usuario amigo) {
        amigos.remove(amigo);
    }

    public void criarPostagem(String conteudo) {
        Postagem postagem = new Postagem(this, conteudo);
        listaPostagens.add(postagem);
    }

    public void listarPostagens() {
        System.out.println("Postagens de " + nome + ":");
        for (Postagem postagem : listaPostagens) {
            System.out.println(postagem);
        }
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public List<Postagem> getListaPostagens() {
        return listaPostagens;
    }

    public List<Sessao> getListaSessoes() {
        return listaSessoes;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }
}
