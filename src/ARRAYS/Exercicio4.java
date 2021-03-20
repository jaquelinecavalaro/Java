package ARRAYS;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[] args) {
	/*
	 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
	 *  em seguida, exiba a soma dos valores dela e 
	 * a soma dos valores da primeira diagonal, ou seja, diagonal principal.
	 */
	Scanner ler = new Scanner (System.in);
	
	final int linha = 3, coluna = 3;
	int mat[][] = new int [linha][coluna];
	int l, c;
	int soma =0;
	
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {

			//System.out.printf("Olá, digite o valor da linha %d, e da coluna %d:", l, c);
			
			//mat[l][c] = ler.nextInt();
			mat[l][c] = (int) (Math.random()*10)+1;
			
			if (l==c) {
				soma = soma + (mat[l][c]);
			}
		}
		
	}
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			System.out.print(mat[l][c]);
			System.out.print(" ");
		}
		System.out.println();
	}
	//limpa()
    
    System.out.printf("A soma dos valores da diagonal é: %d", soma);
    //escreva("\nA soma dos valores da diagonal é: "+soma)	
}
}
