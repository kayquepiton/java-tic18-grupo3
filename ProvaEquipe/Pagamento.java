import java.util.Date;

public class Pagamento {
    private Date Data;
    private double Valor;
    private Fatura Fatura;
    private Reembolso Reembolso;

    public Pagamento(double valor) {
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

    public Fatura getFatura() {
        return Fatura;
    }

    public void setFatura(Fatura fatura) {
        Fatura = fatura;
    }

    public Reembolso getReembolso() {
        return Reembolso;
    }

    public void setReembolso(Reembolso reembolso) {
        Reembolso = reembolso;
    }
}
