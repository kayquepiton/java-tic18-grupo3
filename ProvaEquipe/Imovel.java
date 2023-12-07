import java.util.List;

public class Imovel {
    private String Matricula;
    private String Endereco;
    private double UltimaLeitura;
    private Cliente Cliente;
    private List<Fatura> Faturas;
    private List<Falha> Falhas;

    public Imovel(String matricula, String endereco, double ultimaLeitura, Cliente cliente) {
        this.Matricula = matricula;
        this.Endereco = endereco;
        this.UltimaLeitura = ultimaLeitura;
        this.Cliente = cliente;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        Matricula = matricula;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public double getUltimaLeitura() {
        return UltimaLeitura;
    }

    public void setUltimaLeitura(double ultimaLeitura) {
        UltimaLeitura = ultimaLeitura;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente cliente) {
        Cliente = cliente;
    }

    public List<Fatura> getFaturas() {
        return Faturas;
    }

    public void setFaturas(List<Fatura> faturas) {
        Faturas = faturas;
    }

    public List<Falha> getFalhas() {
        return Falhas;
    }

    public void setFalhas(List<Falha> falhas) {
        Falhas = falhas;
    }
}
