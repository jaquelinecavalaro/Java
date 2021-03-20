package Lista1;
import java.util.Scanner;

public class Exercicio5Lista1 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		float nota1, nota2, nota3;
		double media;

		System.out.println("Digite a nota1: ");
		nota1 = ler.nextFloat();
		System.out.println("Digite a nota2: ");
		nota2 = ler.nextFloat();
		System.out.println("Digite a nota3: ");
		nota3 = ler.nextFloat();
		media = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);
		System.out.println("A média do aluno é: " + media);

	}

}
