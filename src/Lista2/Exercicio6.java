package Lista2;

import java.util.Scanner;

public class Exercicio6 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	
	//Escrever um programa que receba varios numeros inteiros no teclado
	//e no final imprimir a media dos numeros multiplos de 3.
	//para sair digitar 0(zero) do while
	
	double numero=0;
	double contador=0;
	double qtdnumero=0;
	double media=0;
	
	do 
	{
		System.out.print("Digite um número para adicionar e 0 para encerrar: ");
		numero = ler.nextInt();
		
		if(numero%3 == 0) 
		{
		contador = numero + contador;
		qtdnumero++;
		}
	}while (numero != 0 );
	media = contador/(qtdnumero-1);
	
	System.out.printf("Olá, a média dos valores multiplos de 3 são: %.2f", media);
}
}
