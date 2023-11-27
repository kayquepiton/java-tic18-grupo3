import java.util.ArrayList;
import java.util.List;

public class Sessao {
    private String dataHoraInicio;
    private String dataHoraFim;

    public Sessao(String dataHoraInicio, String dataHoraFim) {
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
    }

    public void logar() {
        // Lógica de login de sessão
        System.out.println("Usuário logado na sessão");
    }

    public void deslogar() {
        // Lógica de logout de sessão
        System.out.println("Usuário deslogado da sessão");
    }

    public void solicitaAutenticacao() {
        // Lógica de autenticação
        System.out.println("Solicitação de autenticação");
    }

    public void criarAmizade(Usuario usuario1, Usuario usuario2) {
        usuario1.adicionarAmigo(usuario2);
        usuario2.adicionarAmigo(usuario1);
    }

    public void desfazerAmizade(Usuario usuario1, Usuario usuario2) {
        usuario1.removerAmigo(usuario2);
        usuario2.removerAmigo(usuario1);
    }

    public void criarPostagem(Usuario usuario, String conteudo, List<Postagem> listaPostagens) {
        Postagem postagem = new Postagem(usuario, conteudo);
        listaPostagens.add(postagem);
    }

    public void listarPostagens(List<Postagem> listaPostagens) {
        for (Postagem postagem : listaPostagens) {
            // Exibir informações da postagem
            System.out.println(postagem);
        }
    }
}
