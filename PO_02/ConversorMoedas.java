package conversorMoedas;

import java.util.Scanner;

public class ConversorMoedas {
	public static void main(String[] args) {
		double qtde, taxa;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de dinheiro em dolares: ");
		qtde = sc.nextDouble();
		
		System.out.println("Digite a taxa de cambio para reais: ");
		taxa = sc.nextDouble();
		
		System.out.println(qtde + " dolares = " + (qtde*taxa) + " reais");
	}
	
}
