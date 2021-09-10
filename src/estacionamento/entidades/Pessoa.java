package estacionamento.entidades;

import estacionamento.enumerados.TiposDePessoas;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private TiposDePessoas tipo;

	public Pessoa(String nome, String cpf, TiposDePessoas tipo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public TiposDePessoas getTipo() {
		return tipo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTipo(TiposDePessoas tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "INFORMAÇÕES PESSOAIS:" +
				"\nNome: " + nome +
				"\nCPF: " + cpf +
				"\nTipo: " + tipo;
	}
}
