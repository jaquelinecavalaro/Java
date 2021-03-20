package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);

	//faça um programa que entre com 3 numeros e coloque em ordem crescente.
	int a, b, c;
	int posicao1=0, posicao2=0, posicao3=0;
	
	System.out.printf("Olá, informe o primeiro número: ");
	a = ler.nextInt();
	System.out.printf("Olá, informe o segundo número: ");
	b = ler.nextInt();
	System.out.printf("Olá, informe o terceiro número: ");
	c = ler.nextInt();
	
	if (c<b) {
		var aux = b;
		b=c;
		c=aux;
	}
	if (b<a) {
		var aux = a;
		a=b;
		b=aux;
	}
	if (c<b) {
		var aux = b;
		b=c;
		c=aux;
	}
	System.out.println("Os numeros em ordem crescente são: "+a+ +b+ +c);
}
}
