import java.util.Date;
import java.util.List;

public class FalhaDistribuicao {
    private String Descricao;
    private String Previsao;
    private Date DataInicio;
    private Date DataFim;
    private boolean Resolvido;
    private List<Reparo> Reparos;

    public FalhaDistribuicao(String descricao, String previsao) {
        this.Descricao = descricao;
        this.Previsao = previsao;
        this.DataInicio = new Date();
        this.Resolvido = false;
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

    public List<Reparo> getReparos() {
        return Reparos;
    }

    public void setReparos(List<Reparo> reparos) {
        Reparos = reparos;
    }
}
