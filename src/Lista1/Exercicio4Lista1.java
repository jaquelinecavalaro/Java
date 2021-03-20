package Lista1;
import java.util.Scanner;

public class Exercicio4Lista1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int A, B, C;
		float R, S, D;
		System.out.print("Digite o valor de A: ");
		A = ler.nextInt();
		System.out.print("Digite o valor de B: ");
		B = ler.nextInt();
		System.out.print("Digite o valor de C: ");
		C = ler.nextInt();

		R = ((A * A) + 2 * (A * B) + (B * B));
		System.out.println("(A + B)^2 =" + R);
		S = ((B * B) + 2 * (B * C) + (C * C));
		System.out.println("(B+C)^2 = " + S);
		D = ((R + S) / 2);
		System.out.println("(R+S) / 2 =" + D);
	}

}
