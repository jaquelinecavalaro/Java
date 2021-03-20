package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[]args) {
	//*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
	/*número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
	/*ímpar exiba o número elevado ao quadrado*/

	Scanner ler = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Digite um número: ");
	numero = ler.nextInt();
	
	if (numero % 2 ==0) {
		System.out.println("O número "+ numero + " é par. E sua raiz quadrado é " + Math.sqrt(numero));
		}
	else {
		System.out.println("O número "+ numero + " é impar. E sua elevação ao quadrado é "+ Math.pow(numero, 2));
	}
	ler.close();
}
}
