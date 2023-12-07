import java.util.Date;
import java.util.List;

public class Fatura {
    private Date Data;
    private double UltimaLeitura;
    private double PenultimaLeitura;
    private double Valor;
    private boolean Quitado;
    private List<Pagamento> Pagamentos;

    public Fatura(double ultimaLeitura, double penultimaLeitura) {
        this.Data = new Date();
        this.UltimaLeitura = ultimaLeitura;
        this.PenultimaLeitura = penultimaLeitura;
        this.Valor = (ultimaLeitura - penultimaLeitura) * 10;
        this.Quitado = false;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public double getUltimaLeitura() {
        return UltimaLeitura;
    }

    public void setUltimaLeitura(double ultimaLeitura) {
        UltimaLeitura = ultimaLeitura;
    }

    public double getPenultimaLeitura() {
        return PenultimaLeitura;
    }

    public void setPenultimaLeitura(double penultimaLeitura) {
        PenultimaLeitura = penultimaLeitura;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public boolean isQuitado() {
        return Quitado;
    }

    public void setQuitado(boolean quitado) {
        Quitado = quitado;
    }

    public List<Pagamento> getPagamentos() {
        return Pagamentos;
    }

    public void setPagamentos(List<Pagamento> pagamentos) {
        Pagamentos = pagamentos;
    }
}
