package HerancaPolimorfismo;

public class Cavalo extends Animal{
	
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	
	//metodo
	
	@Override
	public void EmiteSom () { //void n retorna nada, só roda
		System.out.println("Relinchar:hinn in in");
	}
	public void Acao() {
		System.out.println("Correr");
	}
}
