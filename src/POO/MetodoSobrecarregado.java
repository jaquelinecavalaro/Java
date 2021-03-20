package POO;

public class MetodoSobrecarregado {
	public void testaMetodosSobrecarregados() {
		System.out.printf("Salário em número inteiro: %d \n", salario (1000));
		System.out.printf("Salário em número double: %f \n", salario (7.500));
	}
	public int salario(int valorInt) {
		System.out.printf("Salário inteiro: %d \n", salario (valorInt));
	return valorInt * valorInt;
	}
	public double salario(double valorDouble) {
		System.out.printf("Salário fracionario: %d \n", salario (valorDouble));
	return valorDouble*valorDouble;
	}
}
