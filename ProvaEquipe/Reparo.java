import java.util.Date;
import java.util.List;

public class Reparo {
    private String Descricao;
    private String Previsao;
    private Date DataInicio;
    private Date DataFim;
    private boolean Resolvido;
    private FalhaDistribuicao FalhaDistribuicao;
    private List<Reparo> ReparosNecessarios;

    public Reparo(String descricao, String previsao, FalhaDistribuicao falhaDistribuicao) {
        this.Descricao = descricao;
        this.Previsao = previsao;
        this.DataInicio = new Date();
        this.FalhaDistribuicao = falhaDistribuicao;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public String getPrevisao() {
        return Previsao;
    }

    public void setPrevisao(String previsao) {
        Previsao = previsao;
    }

    public Date getDataInicio() {
        return DataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        DataInicio = dataInicio;
    }

    public Date getDataFim() {
        return DataFim;
    }

    public void setDataFim(Date dataFim) {
        DataFim = dataFim;
    }

    public boolean isResolvido() {
        return Resolvido;
    }

    public void setResolvido(boolean resolvido) {
        Resolvido = resolvido;
    }

    public FalhaDistribuicao getFalhaDistribuicao() {
        return FalhaDistribuicao;
    }

    public void setFalhaDistribuicao(FalhaDistribuicao falhaDistribuicao) {
        FalhaDistribuicao = falhaDistribuicao;
    }

    public List<Reparo> getReparosNecessarios() {
        return ReparosNecessarios;
    }

    public void setReparosNecessarios(List<Reparo> reparosNecessarios) {
        ReparosNecessarios = reparosNecessarios;
    }
}
