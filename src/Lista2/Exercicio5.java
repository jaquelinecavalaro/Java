package Lista2;

import java.util.Scanner;

public class Exercicio5 {
//crie um programa que leia um numero do teclado
	//ate que encontre um n�mero igual a zero. 
	//No final, mostre a soma dos numeros digitados
	public static void main(String [] args) {
		Scanner ler = new Scanner (System.in);
		int numero=0;
		int contador=0;
		
		do {
			System.out.print("Digite um n�mero para contar e 0 para encerrar: ");
			numero = ler.nextInt();
			contador = numero + contador;
		
		
		}while (numero != 0 );
		System.out.printf("Ol�, o valor somado dos n�meros informados s�o: %d", contador);
	}
}
