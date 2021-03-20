package Lista2;

import java.util.Scanner;

public class Exercicio4 {
public static void main (String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int idade=0;
	int pessoaCalma = 0;
	int mulherNervosa = 0, homemAgressivo = 0, outroCalmos = 0;
	int pessoaNervosaMais40=0, pessoaCalmaMenos18=0;
	char sexo;
	char humor;
	char opcao = 'S';
	int contador = 1;
	//entrada
	while (opcao == 'S' || contador<150) {
	System.out.printf("Digite a idade da pessoa %d:", contador);
	idade = ler.nextInt();
	
	System.out.println("Digite seu sexo: 1-F 2-M 3-O");
		sexo=ler.next().charAt(0);
		
		System.out.println("A pessoa é:");
		System.out.println("1 - Calma");
		System.out.println("2 - Nervosa");
		System.out.println("3 - Agressiva");
		humor = ler.next().charAt(0);
		
		
	
	if (humor == '1' ) {
		pessoaCalma ++;
	}
	if (humor == '2' && sexo == '1') {
		mulherNervosa++;
	}
	if (sexo == '2' && humor == '3') {
		homemAgressivo++;
	}
	if(humor=='1' && sexo == '3') {
		outroCalmos++;
	}
	if(humor == '2' && idade>= 40) {
		pessoaNervosaMais40++;		
	}
	if (humor =='1' && idade< 18) {
		pessoaCalmaMenos18++;
	}
	System.out.println("Continua? S-sim ou N-não:");
	opcao = ler.next().toUpperCase().charAt(0);
	contador++;
	if (opcao !='S') {
		break;
	}
}
	System.out.println("Pessoas calmas:"+ pessoaCalma);
	System.out.println("Mulher nervosa:");
	System.out.println("Pessoas calmas:");//arrumar
	System.out.println("Pessoas calmas abaixo de 18:");
}
}


