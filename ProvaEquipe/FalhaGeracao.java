import java.util.Date;

public class FalhaGeracao {
    private String Descricao;
    private String Previsao;
    private Date DataInicio;
    private Date DataFim;
    private boolean Resolvido;

    public FalhaGeracao(String descricao, String previsao) {
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
}
