package estacionamento.entidades;

import estacionamento.enumerados.Cargos;
import estacionamento.enumerados.TiposDePessoas;

public class Funcionario extends Pessoa {

	private Integer registro;
	private Cargos cargo;

	public Funcionario(String nome, String cpf, TiposDePessoas tipo, Integer registro, Cargos cargo) {
		super(nome, cpf, tipo);
		this.registro = registro;
		this.cargo = cargo;
	}

	public Integer getRegistro() {
		return registro;
	}

	public Cargos getCargo() {
		return cargo;
	}

	public void setCargo(Cargos cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nRegistro: " + registro +
				"\nCargo: " + cargo + "\n";
	}

}
