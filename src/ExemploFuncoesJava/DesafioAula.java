package ExemploFuncoesJava;

import java.util.Scanner;

public class DesafioAula {
public static void main (String[] args) {
	
	Scanner ler = new Scanner (System.in);
	int numero, numeroMaior =0;
	
	System.out.println("Ol�, digite um n�mero positivo, caso queira parar, digite um n�mero negativo: ");
	numero = ler.nextInt();
	
	while (numero>=0) {
		if(numero > numeroMaior) {
			
			numeroMaior = numero;
		}
		System.out.println("Digite mais um n�mero: ");
		numero = ler.nextInt();
		}
	System.out.println("Voc� parou de incluir os n�meros");
	System.out.printf("O maior n�mero �: %d", numeroMaior);
	}
}
