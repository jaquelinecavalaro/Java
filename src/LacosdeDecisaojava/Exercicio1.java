package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio1 {
public static void main(String[] args) {
	//faça um programa que receba 3 inteiros e indique qual deles é o maior
	
	Scanner ler = new Scanner (System.in);
	
	int a, b, c, maior;
	
	System.out.print("Olá, digite o primeiro numero: ");
	a = ler.nextInt();
	System.out.print("Digite o segundo número: ");
	b = ler.nextInt();
	System.out.print("Digite o terceiro número: ");
	c = ler.nextInt();
	
	if (a>b && a>c) {
		maior = a;
		System.out.println("O número maior é o primeiro: "+maior);
	}
	else if (b>a && b>c) {
		maior = b;
		System.out.println("O número maior é o segundo: "+ maior);
	}
	else if (c>a && c>b) {
		maior = c;
		System.out.println("O número maior é o terceiro: "+ maior);
	}
	else {
		System.out.println("Dois ou mais números possuem o mesmo valor!");
	}
	
}
}
