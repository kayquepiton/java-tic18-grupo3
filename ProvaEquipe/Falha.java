import java.util.Date;

public class Falha {
    private String Descricao;
    private String Previsao;
    private Date DataInicio;
    private Date DataFim;
    private boolean Resolvido;
    private Imovel Imovel;
    private FalhaDistribuicao FalhaDistribuicao;
    private FalhaGeracao FalhaGeracao;

    public Falha(String descricao, String previsao, Imovel imovel) {
        this.Descricao = descricao;
        this.Previsao = previsao;
        this.DataInicio = new Date();
        this.Imovel = imovel;
        this.FalhaDistribuicao = new FalhaDistribuicao(descricao, previsao);
        this.FalhaGeracao = new FalhaGeracao(descricao, previsao);
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

    public Imovel getImovel() {
        return Imovel;
    }

    public void setImovel(Imovel imovel) {
        Imovel = imovel;
    }

    public FalhaDistribuicao getFalhaDistribuicao() {
        return FalhaDistribuicao;
    }

    public void setFalhaDistribuicao(FalhaDistribuicao falhaDistribuicao) {
        FalhaDistribuicao = falhaDistribuicao;
    }

    public FalhaGeracao getFalhaGeracao() {
        return FalhaGeracao;
    }

    public void setFalhaGeracao(FalhaGeracao falhaGeracao) {
        FalhaGeracao = falhaGeracao;
    }
}
