package Lista1;
import java.util.Scanner;

public class Exercicio1Lista1 {
	static public void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int idadeAnos, idadeMes, idadeDias;

		System.out.println("Digite sua idade em anos: ");
		idadeAnos = ler.nextInt();
		System.out.println(
				"Digite a sua idade em meses, isto �, quantos meses se passaram desde seu ultimo anivers�rio: ");
		idadeMes = ler.nextInt();
		System.out.println("A contar da data do dia do seu anivers�rio, quantos dias se passaram at� a data atual? ");
		idadeDias = ler.nextInt();
		idadeDias = idadeDias + idadeMes * 30 + idadeAnos * 365;

		System.out.println("A sua idade em dias �: " + idadeDias);

	}
}
