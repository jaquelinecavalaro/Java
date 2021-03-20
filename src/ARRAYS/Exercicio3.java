package ARRAYS;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	final int linha = 4, coluna = 6;
	int matN1[][] = new int [linha][coluna];
	int matN2[][] = new int [linha][coluna];
	int matM1[][] = new int [linha][coluna];
	int matM2[][] = new int [linha][coluna];
	int l, c;
	int soma =0;
	
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {

			matN2[l][c] = (int) (Math.random()*10)+1;
			matN1[l][c] = (int) (Math.random()*10)+1;
			
			}
		
	}
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			matM1[l][c]=matN1[l][c]+matN2[l][c];
			matM2[l][c]=matN1[l][c]-matN2[l][c];
		}
		}
		System.out.println("Matriz N1: ");
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			System.out.print(matN1[l][c]);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println("Matriz N2: ");
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			System.out.print(matN2[l][c]);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println("Matriz M1: ");
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			System.out.print(matM1[l][c]);
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println("Matriz M2: ");
	for (l=0; l<linha; l++) {
		for (c=0; c<coluna; c++) {
			System.out.print(matM2[l][c]);
			System.out.print(" ");
		}
		System.out.println();
	}
	//limpa()
    
    //System.out.printf("A soma dos valores da diagonal é: %d", soma);
    //escreva("\nA soma dos valores da diagonal é: "+soma)	
}
}
	
	//escreva um programa q le 2 matrizes n1 (4,6 e n2 (4,6)
	//uma matriz m1 cujos elementos serão as somas dos elementos de mesma posicao
	//das matrizes n1 e n2
	//uma matriz m2 cujos elementos serao as diferencas dos elementos
	//de mesma posicao n1 e n2
	
	
	

