package ARRAYS;

import java.util.Scanner;

public class Exercicio2 {
/*
 * um dado é lançado 10 vezes e o valor correspondernte
 * é anotado.
 * faça um programa que gere um vetor com os lançamentos
 * escreva esse vetor. A seguir determine e imprima a média aritmetica dos 
 * lançamentos, contabilize e apresente também quantas foram as ocorrencias da maior pontuação
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
			
			System.out.printf("Digite o resultado do lançamento %d: ", x+1);
			lancamento[x] = ler.nextInt();
			
		}
		for (int x=0; x<lancamento.length; x++) {
			System.out.printf("O valor do lançamento %d é: %d\n", x+1, lancamento[x]);
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
		System.out.printf("Total dos lançamentos: %.0f", soma);
		System.out.printf("\nA média é %.2f", media);
		System.out.printf("\nO maior valos lançado é: %d e foi lançado %d vezes", maior, contador1);
	}
	
}
