package br.com.uniesp.estacionamento.service;

import java.util.List;

import br.com.uniesp.estacionamento.model.Estacionamento;
import br.com.uniesp.estacionamento.model.Veiculo;

public class EstacionamentoService {
	
	private Veiculo veiculo;
	private PessoaService ps = new PessoaService();
	private VeiculoService vs = new VeiculoService();
	
	public void entradaDeVeiculo(List<Veiculo> dadosVeiculos, List<Estacionamento> dadosEstacionamento, String placaDoVeiculo) {
		vs.consultaVeiculo(dadosVeiculos, placaDoVeiculo);
		veiculo = vs.getVeiculo();
		dadosEstacionamento.add(new Estacionamento(null, veiculo, veiculo.getDono()))
	}

}
