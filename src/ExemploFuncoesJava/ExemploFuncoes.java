package ExemploFuncoesJava;

import java.util.Locale;
import java.util.Scanner;

public class ExemploFuncoes {
public static void main (String[] args) {
	
Scanner leia = new Scanner (System.in);	
Locale.setDefault(Locale.US);	//define teclado como americano

int tamanho;

pula();
System.out.println("---------------------------");


}
public static void pula() {
	System.out.println("Vou pular linha");
	System.out.println();
	System.out.println("Pulei linha");
}
}
