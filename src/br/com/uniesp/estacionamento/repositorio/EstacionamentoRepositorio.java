package br.com.uniesp.estacionamento.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.uniesp.estacionamento.model.Veiculo;

public class EstacionamentoRepositorio {
	
private List<Veiculo> listaDeEntradasNoEstacionamento = new ArrayList<>();
	
	public void adicionarEntradaDeVeiculoAoBandoDeDados(Veiculo veiculo) {
		listaDeEntradasNoEstacionamento.add(veiculo);
	}

	public List<Veiculo> getListaDeEntradasNoEstacionamento() {
		return listaDeEntradasNoEstacionamento;
	}

}
