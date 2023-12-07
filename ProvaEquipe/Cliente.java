import java.util.List;

public class Cliente {
    private String CPF;
    private String Nome;
    private List<Imovel> Imoveis;

    public Cliente(String cpf, String nome) {
        this.CPF = cpf;
        this.Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Imovel> getImoveis() {
        return Imoveis;
    }

    public void setImoveis(List<Imovel> imoveis) {
        Imoveis = imoveis;
    }
}
