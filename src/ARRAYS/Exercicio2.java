package ARRAYS;

import java.util.Scanner;

public class Exercicio2 {
/*
 * um dado � lan�ado 10 vezes e o valor correspondernte
 * � anotado.
 * fa�a um programa que gere um vetor com os lan�amentos
 * escreva esse vetor. A seguir determine e imprima a m�dia aritmetica dos 
 * lan�amentos, contabilize e apresente tamb�m quantas foram as ocorrencias da maior pontua��o
 * 
 */
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int lancamento[] = new int [5];
		double media=0;
		double soma=0;
		int maior=0;
		int contador=0;
		int contador1=0;
		
		for (int x=0; x<lancamento.length; x++) {
			
			System.out.printf("Digite o resultado do lan�amento %d: ", x+1);
			lancamento[x] = ler.nextInt();
			
		}
		for (int x=0; x<lancamento.length; x++) {
			System.out.printf("O valor do lan�amento %d �: %d\n", x+1, lancamento[x]);
		soma=soma+lancamento[x];
		contador++;
		if (lancamento[x]>=maior) {
			
			if (lancamento[x] > maior) {
				contador1 = 0;
			}
			maior = lancamento[x];
			contador1++;
		}
		
		}
		media=soma/contador;
		System.out.printf("Total dos lan�amentos: %.0f", soma);
		System.out.printf("\nA m�dia � %.2f", media);
		System.out.printf("\nO maior valos lan�ado �: %d e foi lan�ado %d vezes", maior, contador1);
	}
	
}
