package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);

	//fa�a um programa que entre com 3 numeros e coloque em ordem crescente.
	int a, b, c;
	int posicao1=0, posicao2=0, posicao3=0;
	
	System.out.printf("Ol�, informe o primeiro n�mero: ");
	a = ler.nextInt();
	System.out.printf("Ol�, informe o segundo n�mero: ");
	b = ler.nextInt();
	System.out.printf("Ol�, informe o terceiro n�mero: ");
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
	System.out.println("Os numeros em ordem crescente s�o: "+a+ +b+ +c);
}
}
