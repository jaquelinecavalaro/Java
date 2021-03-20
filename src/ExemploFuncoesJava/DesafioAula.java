package ExemploFuncoesJava;

import java.util.Scanner;

public class DesafioAula {
public static void main (String[] args) {
	
	Scanner ler = new Scanner (System.in);
	int numero, numeroMaior =0;
	
	System.out.println("Olá, digite um número positivo, caso queira parar, digite um número negativo: ");
	numero = ler.nextInt();
	
	while (numero>=0) {
		if(numero > numeroMaior) {
			
			numeroMaior = numero;
		}
		System.out.println("Digite mais um número: ");
		numero = ler.nextInt();
		}
	System.out.println("Você parou de incluir os números");
	System.out.printf("O maior número é: %d", numeroMaior);
	}
}
