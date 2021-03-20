package HerancaPolimorfismo;

public class Cachorro extends Animal {

	
	
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}

	
	//metodo
	@Override
	public void EmiteSom () { //void n retorna nada, só roda
		System.out.println("Latido: AUAU");
	}
	public void Acao() {
		System.out.println("Corre");
	}
}
