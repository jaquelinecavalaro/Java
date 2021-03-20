package OrientacaoObejetosLista;

public class CLIENTE {

	public String nome;
	public char sexo;
	public String cpf;
	char tipo;
	public int anoNascimento;
	
	
	
	//metodo (quero verificar a idade do cliente)
	public int idade() {
		return 2020 - anoNascimento;
	}
		//construtor
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getTipo() {
		return tipo;
	}

	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
}
