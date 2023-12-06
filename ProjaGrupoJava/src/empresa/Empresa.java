package empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Empresa {
	private List<Cliente> listaClientes = new ArrayList<Cliente>();
    private List<Imovel> listaImoveis = new ArrayList<Imovel>();
    private List<Fatura> listaFaturas = new ArrayList<Fatura>();
    private List<Falha> listaFalhas = new ArrayList<Falha>();
    private List<Reembolso> listaReembolsos = new ArrayList<Reembolso>();

    
    //MENUS
    public void menuEmpresa() {
    	
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	 while (!acao.equals("0")) {
    		System.out.println("-----Menu Geral-----");
        	System.out.println("1 - Menu de Clientes");
        	System.out.println("2 - Menu de Imoveis");
        	System.out.println("3 - Menu de Faturas");
        	System.out.println("4 - Menu de Pagamentos");
        	System.out.println("5 - Menu de Falhas");
        	System.out.println("0 - Sair");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Finalizando operacao...");
            	break;
            	
        	case "1":
        		menuCliente();
            	break;
            	
        	case "2":
        		menuImovel();
            	break;
            	
        	case "3":
        		menuFatura();
            	break;
            	
        	case "4":
        		menuPagamento();
            	break;
            	
        	case "5":
        		menuFalha();
            	break;
            	
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuCliente() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	 while (!acao.equals("0")) {
    		System.out.println("-----Menu de Clientes-----");
        	System.out.println("1 - Incluir cliente");
        	System.out.println("2 - Consultar cliente");
        	System.out.println("3 - Listar clientes");
        	System.out.println("4 - Excluir cliente");
        	System.out.println("5 - Alterar cliente");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		incluirCliente();
            	break;
            	
        	case "2":
        		consultarCliente();
            	break;
            	
        	case "3":
        		listarCliente();
            	break;
            	
        	case "4":
        		excluirCliente();
            	break;
            	
        	case "5":
        		alterarCliente();
            	break;

        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuImovel() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Imoveis-----");
        	System.out.println("1 - Incluir imovel");
        	System.out.println("2 - Consultar imovel");
        	System.out.println("3 - Listar imovel");
        	System.out.println("4 - Excluir imovel");
        	System.out.println("5 - Alterar imovel");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		incluirImovel();
            	break;
            	
        	case "2":
        		consultarImovel();
            	break;
            	
        	case "3":
        		listarImovel();
            	break;
            	
        	case "4":
        		excluirImovel();
            	break;
            	
        	case "5":
        		alterarImovel();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuFatura() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Faturas-----");
        	System.out.println("1 - Incluir fatura");
        	System.out.println("2 - Listar todas as faturas");
        	System.out.println("3 - Listar todas as faturas em aberto");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		incluirFatura();
            	break;
            	
        	case "2":
        		listarTodasFaturas();
            	break;
            	
        	case "3":
        		listarFaturasAbertas();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuPagamento() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Pagamentos-----");
        	System.out.println("1 - Incluir pagamentos");
        	System.out.println("2 - Listar todos os pagamentos");
        	System.out.println("3 - Listar todos os pagamentos de uma fatura");
        	System.out.println("4 - Listar todos os reembolsos");
        	System.out.println("5 - Consultar reembolso de uma fatura");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		incluirPagamento();
            	break;
            	
        	case "2":
        		listarTodosPagamentos();
            	break;
            	
        	case "3":
        		listarPagamentosFatura();
            	break;
            	
        	case "4":
        		ListarReembolsos();
            	break;
            	
        	case "5":
        		consultarReembolsoFatura();
            	break;
            
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuFalha() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Menu de Falhas-----");
        	System.out.println("1 - Incluir falha (com matricula)");
        	System.out.println("2 - Incluir falha (sem matricula)");
        	System.out.println("3 - Sub-menu de Reparos");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		incluirFalhaComMatricula();
            	break;
            	
        	case "2":
        		incluirFalhaSemMatricula();
            	break;
            	
        	case "3":
        		menuReparo();
            	break;
            	
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    public void menuReparo() {
    	String acao = "";
    	Scanner sc = new Scanner(System.in);
    	while(acao != "0") {
    		System.out.println("-----Sub-Menu de Reparos-----");
        	System.out.println("1 - Listar todos os reparos abertos");
        	System.out.println("2 - Encerrar um reparo");
        	System.out.println("0 - Voltar");
        	System.out.println("Digite uma opcao: ");
        	
        	acao = sc.nextLine();
        	System.out.println();
        	switch(acao) {
        	case "0":
        		System.out.println("Voltando...");
            	break;
            	
        	case "1":
        		listarReparosAbertos();
            	break;
            	
        	case "2":
        		encerrarReparo();
            	break;
            	
        	default:
            	System.out.println("Opcao invalida, insira novamente");
            	break;
        	}
    	}
    }
    
    
    //FUNCOES QUE PRECISAM SER IMPLEMENTADAS
    
    //PESSOA 1 - CLIENTE
    public void incluirCliente() {
    	
    }
    
    public void consultarCliente() {
    	
    }
    
    public void listarCliente() {
    	
    }
    
    public void excluirCliente() {
    	
    }
    
    public void alterarCliente() {
    	
    }
    
    
    
    
    
    //PESSOA 2 - IMOVEL
    public void incluirImovel() {
    	
    }
    
    public void consultarImovel() {
    	
    }
    
    public void listarImovel() {
    	
    }
    
    public void excluirImovel() {
    	
    }
    
    public void alterarImovel() {
    	
    }
    
    
    
    
    
    //PESSOA 3 - FATURA
    public void incluirFatura() {
    	
    }

    public void listarTodasFaturas() {
    	
    }
    
    public void listarFaturasAbertas() {
    	
    }
    
	
    
    
    
    //PESSOA 4 - PAGAMENTO
    public void incluirPagamento() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o ID da fatura:");
        String idFatura = sc.nextLine();

        System.out.println("Informe o valor do pagamento:");
        float valorPagamento = Float.parseFloat(sc.nextLine());

        Pagamento pagamento = new Pagamento();
        pagamento.setValor(valorPagamento);
        pagamento.setData(LocalDate.now());

        Fatura faturaEncontrada = null;
        for (Fatura fatura : listaFaturas) {
            if (fatura.getId().equals(idFatura)) {
                faturaEncontrada = fatura;
                break;
            }
        }

        if (faturaEncontrada != null) {
            faturaEncontrada.getPagamentos().add(pagamento);
            System.out.println("Pagamento incluído com sucesso!");
        } else {
            System.out.println("Fatura não encontrada. Pagamento não incluído.");
        }
    }
    
    public void listarTodosPagamentos() {
    	
        if (listaFaturas.isEmpty()) {
            System.out.println("Não há faturas disponíveis.");
        } else {
            for (Fatura fatura : listaFaturas) {
                System.out.println("ID da Fatura: " + fatura.getId());
                
                if (fatura.getPagamentos().isEmpty()) {
                    System.out.println("Não há pagamentos para esta fatura.");
                } else {
                    System.out.println("Pagamentos:");
                    for (Pagamento pagamento : fatura.getPagamentos()) {
                        System.out.println("  Valor: " + pagamento.getValor());
                        System.out.println("  Data: " + pagamento.getData());
                        System.out.println("------");
                    }
                }
            }
        }
    }
    
   public void ListarReembolsos() {
	   
   }
   
   public void listarPagamentosFatura() {
	   
   }
   public void consultarReembolsoFatura() {
	   
   }
    
	
    
    
    
    //PESSOA 5 - FALHA E REPARO
    public void incluirFalhaComMatricula() {
    	
    }
    
    public void incluirFalhaSemMatricula() {
    	
    }
    
    //Parte do Submenu de reparo*
    public void listarReparosAbertos() {
    	
    }
    
    public void encerrarReparo() {
    	
    }
    
}
