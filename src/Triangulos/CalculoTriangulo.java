package Triangulos;

import java.util.Scanner;

public class CalculoTriangulo {
public static void main (String[] args) {
	Scanner ler = new Scanner (System.in);
	
	//BASE * ALTURA *2 // AREA DO TRIANGULO

//RECEBE DADOS DE 3 TRIANGULOS
//MOSTRA A BASE, ALTURA E A AREA DE CADA TRIANGULO

	double base1=0, base2 =0, base3=0;
	double altura1 =0, altura2=0, altura3=0;
	double area1=0, area2=0, area3=0;
	Triangulo T3 = new Triangulo(); //testando objetos
	Quadrado Q1 = new Quadrado();
	double areaquadrado;
	
	System.out.println("Digite o lado do quadrado : ");
	Q1.lado = ler.nextDouble();
	
	areaquadrado = (Q1.lado*Q1.lado);
	
	
	
	System.out.println("Olá, vamos calcular três triângulos");
	
	System.out.println("Olá, informe a base do 1º triângulo: ");
	base1 = ler.nextDouble();
	System.out.println("Informe a altura do 1º triângulo: ");
	altura1=ler.nextDouble();
	area1=(base1*altura1)/2; //ver se o calculo está correto
	System.out.printf("A base do triângulo 1 é %.2f, a altura é %.2f e a área do triângulo é: %.2f", base1, altura1, area1);
	
	System.out.println("\nOlá, informe a base do 2º triângulo: ");
	base2 = ler.nextDouble();
	System.out.println("Informe a altura do 2º triângulo: ");
	altura2=ler.nextDouble();
	area2=(base2*altura2)/2; //ver se o calculo está correto
	System.out.printf("A base do triângulo 2 é %.2f, a altura é %.2f e a área do triângulo é: %.2f", base2, altura2, area2);
	
	System.out.println("\nOlá, informe a base do 3º triângulo: ");
	base3 = ler.nextDouble();
	System.out.println("Informe a altura do 3º triângulo: ");
	altura3=ler.nextDouble();
	area3=(base3*altura3)/2; //ver se o calculo está correto
	System.out.printf("A base do triângulo 3 é %.2f, a altura é %.2f e a área do triângulo é: %.2f", base3, altura3, area3);
}
	
	
}
