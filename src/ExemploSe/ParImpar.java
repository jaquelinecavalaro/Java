package ExemploSe;

import java.util.Scanner;

public class ParImpar {
	public static void main (String[] args) {
		
		int numero= 0;
		
		System.out.println("Digite um numero: ");
		Scanner ler = new Scanner (System.in);
		numero = ler.nextInt();
		
		if (numero%2 == 0) {
			
			System.out.println("O número "+ numero +" é par");		
		}
		else
		{
		System.out.println("O numero "+ numero +" é impar");
	}
	}
	
	
	
}
