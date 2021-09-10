package estacionamento.entidades;

import estacionamento.enumerados.TiposDePessoas;
import estacionamento.enumerados.TiposDeServicos;

public class Terceirizado extends Pessoa {
	
	private String nomeDaEmpresa;
	private TiposDeServicos servico;
	
	public Terceirizado(String nome, String cpf, TiposDePessoas tipo, String nomeDaEmpresa, TiposDeServicos servico) {
		super(nome, cpf, tipo);
		this.nomeDaEmpresa = nomeDaEmpresa;
		this.servico = servico;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public TiposDeServicos getServico() {
		return servico;
	}

	public void setServico(TiposDeServicos servico) {
		this.servico = servico;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nNome da Empresa: " + nomeDaEmpresa +
				"\nTipo do Serviço: " + servico + "\n";
	}
	

}
