package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	//fa�a um programa que receba 3 inteiros e indique qual deles � o maior
	
	Scanner ler = new Scanner (System.in);
	
	int a, b, c, maior;
	
	System.out.print("Ol�, digite o primeiro numero: ");
	a = ler.nextInt();
	System.out.print("Digite o segundo n�mero: ");
	b = ler.nextInt();
	System.out.print("Digite o terceiro n�mero: ");
	c = ler.nextInt();
	
	if (a>b && a>c) {
		maior = a;
		System.out.println("O n�mero maior � o primeiro: "+maior);
	}
	else if (b>a && b>c) {
		maior = b;
		System.out.println("O n�mero maior � o segundo: "+ maior);
	}
	else if (c>a && c>b) {
		maior = c;
		System.out.println("O n�mero maior � o terceiro: "+ maior);
	}
	else {
		System.out.println("Dois ou mais n�meros possuem o mesmo valor!");
	}
	
}
}
