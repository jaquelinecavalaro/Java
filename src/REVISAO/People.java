package REVISAO;

public class People {
private String nome;
private int anoNascimento;
private boolean vivo;
private char genero;

//construtor
public People(String nome) {
	super();
	this.nome = nome;
}
//contrutor sobrecarga

public People(String nome, int anoNascimento, char genero) {
	super();
	this.nome = nome;
	this.anoNascimento = anoNascimento;
	this.genero = genero;
}
//metodo de encapsulamento get e set
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getAnoNascimento() {
	return anoNascimento;
}

public void setAnoNascimento(int anoNascimento) {
	this.anoNascimento = anoNascimento;
}

public boolean isVivo() {
	return vivo;
}

public void setVivo(boolean vivo) {
	this.vivo = vivo;
}

public char getGenero() {
	return genero;
}

public void setGenero(char genero) {
	this.genero = genero;
}

//agora o metodo, ex metodo para descobrir a idade atual
public int idade() {
	return (2021 - anoNascimento);
}
public int idade(int anoAtual) {
	return anoAtual - anoNascimento;
}
}
