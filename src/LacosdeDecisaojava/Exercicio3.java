package LacosdeDecisaojava;

import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	//faça um programa que receba a idade de uma pessoa
	//e mostre na saida em qual categoria ela se encontra
	//10-14 infantil
	//15-17 juvenil
	//18-25 adulto
		
		int IdadeCliente;
		
		//Entrada
		System.out.println("Digite a idade do cliente: ");
		IdadeCliente = ler.nextInt();
		
		if (IdadeCliente <10) {
			
			System.out.println("Infelizmente não podemos atender!");		
		}
		else if (IdadeCliente <=14){
			System.out.println("Infantil");		
		}
		else if (IdadeCliente <=17) {
			System.out.println("juvenil");
		}
		else if (IdadeCliente <=25) {
			System.out.println("adulto");
		}
		else {
			System.out.println("Mais que adultos = maiores de 25 anos");
		}
		System.out.println("Obrigado, volte sempre!");
	
	
	
}
}
