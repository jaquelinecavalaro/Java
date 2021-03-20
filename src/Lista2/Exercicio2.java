package Lista2;

import java.util.Scanner;

public class Exercicio2 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int numero;
	int x, par = 0, impar = 0;
	
	
	
	for (x=1; x<=10; x++) {
		System.out.print("Olá, informe o numero:");
		numero=ler.nextInt();
		if (numero % 2 == 0 ) {
			par = par + 1;
		}
		else {
			impar = impar + 1 ;
		}
	}
	System.out.printf("Quantos são pares: %d \nQuantos são impares: %d", par, impar );
}
}
