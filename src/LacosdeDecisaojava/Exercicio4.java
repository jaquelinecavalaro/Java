package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio4 {
public static void main(String[]args) {
	//*4- Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este
	/*n�mero � par ou �mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for
	/*�mpar exiba o n�mero elevado ao quadrado*/

	Scanner ler = new Scanner(System.in);
	
	int numero;
	
	System.out.println("Digite um n�mero: ");
	numero = ler.nextInt();
	
	if (numero % 2 ==0) {
		System.out.println("O n�mero "+ numero + " � par. E sua raiz quadrado � " + Math.sqrt(numero));
		}
	else {
		System.out.println("O n�mero "+ numero + " � impar. E sua eleva��o ao quadrado � "+ Math.pow(numero, 2));
	}
	ler.close();
}
}
