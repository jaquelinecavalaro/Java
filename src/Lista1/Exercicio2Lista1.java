package Lista1;
import java.util.Scanner;

public class Exercicio2Lista1 {
	public static void main(String[] args) {
		int idadeDias, idadeAnos, idadeMes, totalDias;

		Scanner ler = new Scanner(System.in);

		System.out.println("Olá, digite sua idade em dias: ");
		totalDias = ler.nextInt();
		idadeAnos = totalDias / 365;
		idadeMes = (totalDias % 365) / 30;
		idadeDias = (totalDias % 365) % 30;
		System.out.println("Você já viveu em dias: " + idadeDias);
		System.out.println("Você já viveu em meses: " + idadeMes);
		System.out.println("Você já viveu em anos: " + idadeAnos);
	}

}
