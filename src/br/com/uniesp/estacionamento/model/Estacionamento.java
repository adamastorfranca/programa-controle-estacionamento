package br.com.uniesp.estacionamento.model;

import java.time.LocalDateTime;

public class Estacionamento {
	
	private LocalDateTime dataHora;
	
	public Estacionamento(LocalDateTime dataHora, Veiculo veiculo) {
		this.dataHora = dataHora;
		this.veiculo = veiculo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

}
