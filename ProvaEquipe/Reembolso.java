import java.util.Date;

public class Reembolso {
    private Date Data;
    private double Valor;
    private Pagamento Pagamento;

    public Reembolso(double valor) {
        this.Data = new Date();
        this.Valor = valor;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date data) {
        Data = data;
    }

    public double getValor() {
        return Valor;
    }

    public void setValor(double valor) {
        Valor = valor;
    }

    public Pagamento getPagamento() {
        return Pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        Pagamento = pagamento;
    }
}
