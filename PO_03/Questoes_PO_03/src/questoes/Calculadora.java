package questoes;

public class Calculadora {
	public void soma(int a, int b) {
		System.out.println(a + b);
	}
	
	public void subtracao(int a, int b) {
		System.out.println(a - b);
	}
	
	public void multiplicacao(int a, int b) {
		System.out.println(a * b);
	}
	
	public void divisaoInt(int a, int b) throws DivisionByZeroException {
		if(b == 0) {
			throw new DivisionByZeroException();
		}
		
		System.out.println(a / b);
	}
	
	public void divisaoFloar(float a, float b) throws DivisionByZeroException {
		if(b == 0) {
			throw new DivisionByZeroException();
		}
		
		System.out.println(a / b);
	}
}
