package REVISAO;

import java.util.Scanner;

public class RevisaoPeople {
public static void main (String[] args) {
	Scanner ler = new Scanner (System.in); //objeto leia
	String nome;
	int anoNascimento;
	char genero;
	
	//People cliente = new People ("Juliana")objeto cliente
	
	
	System.out.print("Digite o nome do amigo: ");
	nome = ler.next();
	People amigo = new People (nome); //objeto amigo
	
	System.out.println("Digite o ano de nascimento: ");
	anoNascimento = ler.nextInt();
	
	System.out.println("Digite M-masculino F-femino ou O-outros: ");
	genero = ler.next().toUpperCase().charAt(0);
	
	People cliente = new People (nome, anoNascimento, genero);
	
	System.out.println("O nome da amizade �: "+amigo.getNome());

	System.out.println("O nome do cliente �: "+cliente.getNome()+ " E seu ano de nascimento � "+ cliente.getAnoNascimento());
	
	if (cliente.idade()>=18) {
		System.out.println("Cliente � adulto!");
		System.out.println("Sua idade atual �:"+cliente.idade());
	}
	else {
		System.out.println("Cliente � menor de idade!");
		System.out.println("Sua idade atual �:"+cliente.idade());
	}
}
}
