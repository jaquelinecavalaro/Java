package OrientacaoObejetosLista;

import java.util.Scanner;

public class Exercico1Cliente {
public static void main(String[] args) {
	
	/*
	 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
	 * em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
	 * informações deste objeto no console.
	 */
	
	Scanner ler = new Scanner (System.in);
	
	CLIENTE cliente = new CLIENTE();
	
	System.out.print("Digite o seu nome: ");
	cliente.nome = ler.next();
	
	System.out.print("Digite M para masculino, F para feminino ou O para outro: ");
	cliente.sexo = ler.next().toUpperCase().charAt(0);
	
	System.out.print("Informe seu CPF: ");
	cliente.cpf = ler.next();
	
	System.out.print("Ano de nascimento: ");
	cliente.anoNascimento = ler.nextInt();
	
	System.out.println("Tipo de conta que deseja:");
	System.out.print("N - normal ou E - empresarial: ");
	cliente.tipo = ler.next().toUpperCase().charAt(0);
	
	System.out.println("Dados do cliente: ");
	System.out.println("Nome: "+ cliente.nome);
	System.out.print("Sexo: ");
	System.out.println((cliente.sexo == 'F')? "Feminino":(cliente.sexo == 'M')?"Masculino":"Outros");
	System.out.println("Idade: "+cliente.idade());
	System.out.println("Tipo de conta escolhida: "+cliente.tipo);
}
}
