package questoes;

public class DivisionByZeroException extends Exception {
    
	private static final long serialVersionUID = 1149241039409861914L;
	
	public DivisionByZeroException() {
        super("Erro: nao e permitido a divisao por zero");
    }
}