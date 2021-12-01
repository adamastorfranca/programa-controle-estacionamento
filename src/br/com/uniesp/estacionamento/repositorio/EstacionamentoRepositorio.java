package br.com.uniesp.estacionamento.repositorio;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import br.com.uniesp.estacionamento.model.VagaEstacionamento;

public class EstacionamentoRepositorio {

	private List<VagaEstacionamento> listaTotalDeEntradasNoEstacionamento = new ArrayList<>();
	private List<VagaEstacionamento> listaTotalDeSaidasNoEstacionamento = new ArrayList<>();
	private List<VagaEstacionamento> listaDeVagasEmUso = new ArrayList<>();

	public void adicionarEntradaDeVeiculoAoBandoDeDados(VagaEstacionamento entrada) {
		listaTotalDeEntradasNoEstacionamento.add(entrada);
	}
	
	public void adicionarUsoDeVaga(VagaEstacionamento entrada) {
		listaDeVagasEmUso.add(entrada);
	}
	
	public void encerrarUsoDeVaga(VagaEstacionamento saida) {
		saida.setDataHoraSaida(LocalDateTime.now());
		listaDeVagasEmUso.remove(saida);
		listaTotalDeSaidasNoEstacionamento.add(saida);
	}

	public List<VagaEstacionamento> getListaTotalDeEntradasNoEstacionamento() {
		return listaTotalDeEntradasNoEstacionamento;
	}

	public List<VagaEstacionamento> getListaDeVagasEmUso() {
		return listaDeVagasEmUso;
	}
	
	public List<VagaEstacionamento> getListaTotalDeSaidasNoEstacionamento() {
		return listaTotalDeSaidasNoEstacionamento;
	}
}
