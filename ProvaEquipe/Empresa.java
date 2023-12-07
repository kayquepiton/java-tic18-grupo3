import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
    private List<Cliente> clientes;
    private List<Imovel> imoveis;
    private List<Fatura> faturas;
    private List<Pagamento> pagamentos;
    private List<Reembolso> reembolsos;
    private List<FalhaDistribuicao> falhasDistribuicao;
    private List<FalhaGeracao> falhasGeracao;
    private List<Falha> falhas;
    private List<Reparo> reparos;
    private Scanner scanner;

    public Empresa() {
        this.clientes = new ArrayList<>();
        this.imoveis = new ArrayList<>();
        this.faturas = new ArrayList<>();
        this.pagamentos = new ArrayList<>();
        this.reembolsos = new ArrayList<>();
        this.falhasDistribuicao = new ArrayList<>();
        this.falhasGeracao = new ArrayList<>();
        this.falhas = new ArrayList<>();
        this.reparos = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    // Métodos para gerenciamento de Clientes
    public void incluirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public Cliente consultarClientePorCPF(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCPF().equals(cpf)) {
                return cliente;
            }
        }
        return null;
    }

    public void listarClientes() {
        System.out.println("===== Lista de Clientes =====");
        for (Cliente cliente : clientes) {
            System.out.println("CPF: " + cliente.getCPF() + ", Nome: " + cliente.getNome());
        }
    }

    // Métodos para gerenciamento de Imóveis
    public void incluirImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public Imovel consultarImovelPorMatricula(String matricula) {
        for (Imovel imovel : imoveis) {
            if (imovel.getMatricula().equals(matricula)) {
                return imovel;
            }
        }
        return null;
    }

    public void listarImoveis() {
        System.out.println("===== Lista de Imóveis =====");
        for (Imovel imovel : imoveis) {
            System.out.println("Matrícula: " + imovel.getMatricula() + ", Endereço: " + imovel.getEndereco());
        }
    }

    // Métodos para gerenciamento de Faturas
    public void registrarConsumo(Imovel imovel, double ultimaLeitura, double penultimaLeitura) {
        // Implemente o registro de consumo aqui
        // Nota: Este método está atualmente vazio, você precisará adicionar a lógica adequada.
    }

    public void listarFaturas(Imovel imovel) {
        System.out.println("===== Lista de Faturas =====");
        for (Fatura fatura : imovel.getFaturas()) {
            System.out.println("Data: " + fatura.getData() + ", Valor: " + fatura.getValor() + ", Quitado: " + fatura.isQuitado());
        }
    }

    // Métodos para gerenciamento de Pagamentos
    public void incluirPagamento(Pagamento pagamento) {
        pagamentos.add(pagamento);
    }

    public void listarPagamentos(Imovel imovel) {
        System.out.println("===== Lista de Pagamentos =====");
        for (Fatura fatura : imovel.getFaturas()) {
            for (Pagamento pagamento : fatura.getPagamentos()) {
                System.out.println("Data: " + pagamento.getData() + ", Valor: " + pagamento.getValor());
            }
        }
    }

    public void listarReembolsos(Imovel imovel) {
        System.out.println("===== Lista de Reembolsos =====");
        // Implemente a lógica para listar reembolsos aqui
    }

    // Métodos para gerenciamento de Falhas
    public void incluirFalha(Falha falha) {
        falhas.add(falha);
    }

    public void listarReparosEmAberto() {
        System.out.println("===== Lista de Reparos em Aberto =====");
        for (Reparo reparo : reparos) {
            if (!reparo.isResolvido()) {
                System.out.println("Descrição: " + reparo.getDescricao() + ", Previsão: " + reparo.getPrevisao());
            }
        }
    }
    
    public void encerrarReparo(Reparo reparo) {
        reparo.setResolvido(true);
        // Implemente o encerramento de reparo aqui
    }

    // Outros métodos conforme necessário

    public void exibirMenuClientes() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Clientes =====");
            System.out.println("1. Incluir Cliente");
            System.out.println("2. Consultar Cliente");
            System.out.println("3. Listar Clientes");
            System.out.println("4. Excluir Cliente");
            System.out.println("5. Alterar Cliente");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Lógica para incluir cliente
                    break;
                case 2:
                    // Lógica para consultar cliente
                    break;
                case 3:
                    // Lógica para listar clientes
                    break;
                case 4:
                    // Lógica para excluir cliente
                    break;
                case 5:
                    // Lógica para alterar cliente
                    break;
                case 6:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);
    }

    public void exibirMenuImoveis() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Imóveis =====");
            System.out.println("1. Incluir Imóvel");
            System.out.println("2. Consultar Imóvel");
            System.out.println("3. Listar Imóveis");
            System.out.println("4. Excluir Imóvel");
            System.out.println("5. Alterar Imóvel");
            System.out.println("6. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Lógica para incluir imóvel
                    break;
                case 2:
                    // Lógica para consultar imóvel
                    break;
                case 3:
                    // Lógica para listar imóveis
                    break;
                case 4:
                    // Lógica para excluir imóvel
                    break;
                case 5:
                    // Lógica para alterar imóvel
                    break;
                case 6:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);
    }

    public void exibirMenuFaturas() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Faturas =====");
            System.out.println("1. Registro de Consumo");
            System.out.println("2. Listar Faturas (abertas, todas)");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Lógica para registro de consumo
                    break;
                case 2:
                    // Lógica para listar faturas
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);
    }

    public void exibirMenuPagamentos() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Pagamentos =====");
            System.out.println("1. Inclusão de Pagamentos");
            System.out.println("2. Listar Pagamentos (todos, por fatura)");
            System.out.println("3. Listar Reembolsos (todos, por fatura)");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Lógica para inclusão de pagamentos
                    break;
                case 2:
                    // Lógica para listar pagamentos
                    break;
                case 3:
                    // Lógica para listar reembolsos
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 4);
    }

    public void exibirMenuFalhas() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Falhas =====");
            System.out.println("1. Incluir Falhas (com ou sem matrícula)");
            System.out.println("2. Gestão de Reparos");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    // Lógica para incluir falhas
                    break;
                case 2:
                    exibirMenuReparos();
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);
    }

    public void exibirMenuReparos() {
        int opcao;
        do {
            System.out.println("\n===== Menu de Gestão de Reparos =====");
            System.out.println("1. Listar Reparos em Aberto");
            System.out.println("2. Encerrar Reparo");
            System.out.println("3. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    listarReparosEmAberto();
                    break;
                case 2:
                    // Lógica para encerrar reparo
                    break;
                case 3:
                    System.out.println("Voltando ao Menu Principal...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 3);
    }


    public void exibirMenuPrincipal() {
        int opcao;
        do {
            System.out.println("\n===== Menu Principal =====");
            System.out.println("1. Gestão de Clientes");
            System.out.println("2. Gestão de Imóveis");
            System.out.println("3. Gestão de Faturas");
            System.out.println("4. Gestão de Pagamentos");
            System.out.println("5. Gestão de Falhas");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do teclado

            switch (opcao) {
                case 1:
                    exibirMenuClientes();
                    break;
                case 2:
                    exibirMenuImoveis();
                    break;
                case 3:
                    exibirMenuFaturas();
                    break;
                case 4:
                    exibirMenuPagamentos();
                    break;
                case 5:
                    exibirMenuFalhas();
                    break;
                case 6:
                    System.out.println("Encerrando o programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 6);
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.exibirMenuPrincipal();
    }
}
