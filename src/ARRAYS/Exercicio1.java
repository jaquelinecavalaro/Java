package ARRAYS;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		/*
		 * fa�a um programa que crie um vetor por leitura com 5 valores
		 * de pontua��o de uma atividade e o escreva em seguida.
		 * ap�s a maior pontuacao e apresente
		 */

		Scanner ler = new Scanner (System.in);
		int valores[]=new int [5];
		int maior = 0;
		
		
		System.out.println("Ol�, vamos verificar sua maior pontua��o!");
		
		for (int x = 0; x<=4; x++) {
		
		System.out.printf("Digite a nota da sua atividade %d: ", (x+1));
		valores[x] = ler.nextInt();
		}
		for (int x = 0; x<=4; x++) {
			System.out.printf("Atividade %d, nota: %d \n", x+1, valores[x]);
			
			if (maior <=valores[x]) {
				maior = valores[x];
			}
		}
		System.out.printf("Sua maior nota foi: %d", maior);
		
	}

}
