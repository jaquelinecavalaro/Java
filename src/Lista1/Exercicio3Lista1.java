package Lista1;
import java.util.Scanner;

public class Exercicio3Lista1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int TempoDuracao, TempoMinuto, TempoHora, TempoSegundo;

		System.out.println("Informe os segundos trabalhados: ");
		TempoDuracao = ler.nextInt();
		TempoHora = TempoDuracao / 3600;
		TempoMinuto = (TempoHora % 3600) / 60;
		TempoSegundo = (TempoMinuto % 3600) % 60;

		System.out.println(
				"A duração em horas é: " + TempoHora + " Minutos: " + TempoMinuto + " Segundos: " + TempoSegundo);
	}
}
