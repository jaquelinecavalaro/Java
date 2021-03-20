package ExemploPara;

import java.util.Scanner;

public class DesafioProgramador {
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int tamanho;
	
	System.out.print("Digite um numero inteiro positivo:");	
	tamanho = ler.nextInt();
	linha(tamanho);
}
public static void linha(int tamanho) {
	for (int x=1; x<= tamanho; x++) {
		System.out.print("-");
	}
}
}
