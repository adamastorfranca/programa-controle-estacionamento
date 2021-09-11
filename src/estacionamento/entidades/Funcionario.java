package estacionamento.entidades;

import estacionamento.enumerados.Cargos;
import estacionamento.enumerados.TiposDePessoas;

public class Funcionario extends Pessoa {

	private Integer registroDeTrabalho;
	private Cargos cargo;

	public Funcionario(String nome, String cpf, TiposDePessoas tipo, Integer registro, Cargos cargo) {
		super(nome, cpf, tipo);
		this.registroDeTrabalho = registro;
		this.cargo = cargo;
	}

	public Integer getRegistroDeTrabalho() {
		return registroDeTrabalho;
	}

	public Cargos getCargo() {
		return cargo;
	}
	
	public void setRegistroDeTrabalho(Integer registro) {
		this.registroDeTrabalho = registro;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Registro: %-10s ,Cargo: %-25s", registroDeTrabalho, cargo));
		return super.toString() + sb.toString();
	}

}
