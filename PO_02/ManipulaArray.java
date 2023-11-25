package manipulaArray;
import java.util.Random;
import java.util.Scanner;

import java.util.Scanner;
import java.util.Random;

public class ManipulaArray {
	private int[] lista = new int[10];
	
	public void numUsuario() {
		for(int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Digite o " + (i+1) + " numero inteiro da lista: ");
			this.lista[i] = sc.nextInt();
		}
	}
	
	public void numAleatorio() {
		Random rand = new Random();
		for(int i = 0; i < 10; i++) {
			int n = (rand.nextInt(100));
			n++;
			this.lista[i] = n;
		}
	}
	
	public int somaArray() {
		int total = 0;
		for(int i = 0; i < 10; i++) {
			total += this.lista[i];
		}
		
		return total;
	}
	
	public int numMaior() {
		int maior = this.lista[0];
		for(int i = 0; i < 10; i++) {
			if(maior < this.lista[i])
				maior = this.lista[i];
		}
		
		return maior;
	}

	public int numMenor() {
		int menor = this.lista[0];
		for(int i = 0; i < 10; i++) {
			if(menor > this.lista[i])
				menor = this.lista[i];
		}
		
		return menor;
	}
	
	public static void main(String[] args) {
		ManipulaArray arr1 = new ManipulaArray();
		ManipulaArray arr2 = new ManipulaArray();
		
		arr1.numUsuario();
		arr2.numAleatorio();
		
		System.out.println("Soma do array 1: " + arr1.somaArray());
		System.out.println("Maior numero: " + arr1.numMaior());
		System.out.println("Menor numero: " + arr1.numMenor() + "\n");
		
		System.out.println("Soma do array 2: " + arr2.somaArray());
		System.out.println("Maior numero: " + arr2.numMaior());
		System.out.println("Menor numero: " + arr2.numMenor());
		
	}
}
