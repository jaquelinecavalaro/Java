package HerancaPolimorfismo;

public class Preguica extends Animal{
	

	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	
	}
	
	
	//metodo
	@Override
	public void EmiteSom () { //void n retorna nada, só roda
		System.out.println("ZzzzZzzZz");
	}
	public void Acao() {
		System.out.println("Subir em arvore");
	}
}
