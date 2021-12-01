package br.com.uniesp.estacionamento.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class VagaEstacionamento {
	
	private Veiculo veiculo;
	private LocalDateTime dataHoraEntrada;
	private LocalDateTime dataHoraSaida;
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
	
	public VagaEstacionamento(Veiculo veiculo, LocalDateTime dataHoraEntrada) {
		this.veiculo = veiculo;
		this.dataHoraEntrada = dataHoraEntrada;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
		this.dataHoraSaida = dataHoraSaida;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if(dataHoraSaida != null) {		
			sb.append("\nEntrada: " + dataHoraEntrada.format(dtf) + ", Saída: " + dataHoraSaida.format(dtf));
	    } 
		else {
			sb.append("\nEntrada: " + dataHoraEntrada.format(dtf) + ", Saída: AINDA ESTACIONADO");		
		}
		return veiculo + sb.toString();
	}

}
