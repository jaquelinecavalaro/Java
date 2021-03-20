package Lista2;

import java.util.Scanner;

public class Exercicio1 {
public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	
	int x;
	System.out.println("Os números que possuem o resto da divisão 5 são:");
	for (x = 1000; x<=1999; x++) {
		
		if (x%11 == 5) {
			System.out.println(x);
		}
		}
	}
}

