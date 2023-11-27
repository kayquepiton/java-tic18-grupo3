import java.util.List;
import java.util.ArrayList;

public class ListaSessoes {
    private List<Sessao> sessoes;

    public ListaSessoes() {
        this.sessoes = new ArrayList<>();
    }

    public List<Sessao> getSessoes() {
        return sessoes;
    }

    public void setSessoes(List<Sessao> sessoes) {
        this.sessoes = sessoes;
    }

    public void adicionarSessao(Sessao sessao) {
        // Implemente o método para adicionar uma sessão à lista
    }
}
