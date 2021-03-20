package Lista2;

import java.util.Scanner;

public class Exercicio3 {
public static void main (String[] args) {
	Scanner ler = new Scanner(System.in);
	//while
	
	int idade=0;
	int menor=0;
	int maior = 0;
	
	while (idade != - 99) {
		System.out.println("Digite uma idade, ou -99 para terminar: ");
		idade = ler.nextInt();
		if ((idade<=21)&&(idade !=99)) {
			menor = (menor + 1);			
		}
		else if (idade>=50) {
			maior = maior + 1;
		}
	}
	System.out.printf("O número total de pessoas com menos de 21 anos é: %d", menor-1);
	System.out.printf("\nO número total de pessoas com mais de 50 anos é: %d", maior);
	
}
}
