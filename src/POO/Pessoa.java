package POO;

public class Pessoa {
	private String primeiroNome;
	private String ultimoNome;
	private String nomeMeio;
	
	public Pessoa (String primeiro, String meio, String ultimo) //parametro
	{
		primeiroNome=primeiro;
		ultimoNome=ultimo;
		nomeMeio = meio;
	}
	public String getNomeCompleto()
	{
		String nomeCompleto = primeiroNome+  " " + nomeMeio + " "+ultimoNome;
	return nomeCompleto;
	}
}
