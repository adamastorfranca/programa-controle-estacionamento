package br.com.uniesp.estacionamento.model;

import br.com.uniesp.estacionamento.model.enums.MotivosDaVisita;
import br.com.uniesp.estacionamento.model.enums.TiposDePessoas;

public class Visitante extends Pessoa {
	
	private Integer telefone;
	private MotivosDaVisita motivo;
	
	public Visitante(String nome, String cpf, TiposDePessoas tipo, Integer telefone, MotivosDaVisita motivo) {
		super(nome, cpf, tipo);
		this.telefone = telefone;
		this.motivo = motivo;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public MotivosDaVisita getMotivo() {
		return motivo;
	}

	public void setMotivo(MotivosDaVisita motivo) {
		this.motivo = motivo;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Telefone: %-11s ,Motivo: %-24s", telefone, motivo));
		return super.toString() + sb.toString();
	}
	

}
