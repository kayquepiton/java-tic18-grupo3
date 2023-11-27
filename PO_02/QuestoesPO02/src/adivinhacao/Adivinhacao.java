package adivinhacao;
import java.util.Random;
import java.util.Scanner;

public class Adivinhacao {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int n = (rand.nextInt(100));
		n++;
		int resposta;
		System.out.println("Jogo da adivinhacao");
		
		do {
			System.out.println("Digite um numero de 1 a 100: ");
			resposta = sc.nextInt();
			
			if(resposta > n)
				System.out.println("Errado! O numero sorteado e menor do que o seu");
			else if(resposta < n)
				System.out.println("Errado! O numero sorteado e maior do que o seu");	
		} while (resposta != n);
		
		System.out.println("Parabens, voce acertou!");
	}
}
