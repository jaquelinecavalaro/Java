package ExemploSe;

import java.util.Scanner;

public class DesafioProgramador1 {
public static void main(String[] args) {
	
	Scanner ler = new Scanner (System.in);
	
	int IdadeNadador;
	
	//Entrada
	System.out.println("Digite a idade do nadador: ");
	IdadeNadador = ler.nextInt();
	
	if (IdadeNadador <5) {
		
		System.out.println("Infelizmente não podemos atender!");		
	}
	else if (IdadeNadador <=7){
		System.out.println("Infantil A = 5 a 7 anos");		
	}
	else if (IdadeNadador <=11) {
		System.out.println("Infantil B = 8 a 11 anos");
	}
	else if (IdadeNadador <=13) {
		System.out.println("Juvenil A = 12 a 13 anos");
	}
	else if (IdadeNadador <=17) {
		System.out.println("Juvenil B = 14 a 17 anos");
	}
	else {
		System.out.println("Adultos = maiores de 18 anos");
	}
	System.out.println("Obrigado, volte sempre!");
}
}
