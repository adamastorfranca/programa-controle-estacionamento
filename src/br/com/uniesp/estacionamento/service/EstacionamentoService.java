package br.com.uniesp.estacionamento.service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.com.uniesp.estacionamento.model.VagaEstacionamento;
import br.com.uniesp.estacionamento.model.Veiculo;
import br.com.uniesp.estacionamento.repositorio.EstacionamentoRepositorio;
import br.com.uniesp.estacionamento.repositorio.PessoaRepositorio;
import br.com.uniesp.estacionamento.repositorio.VeiculoRepositorio;

public class EstacionamentoService {
	
	private Veiculo veiculo;
	private VagaEstacionamento vaga;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");
	private VeiculoService vs = new VeiculoService();
	
	public void entradaDeVeiculo(PessoaRepositorio dadosPessoa, VeiculoRepositorio dadosVeiculos, EstacionamentoRepositorio dadosEstacionamento, String placaDoVeiculo) {
		consultaVeiculoEstacionado(dadosEstacionamento.getListaDeVagasEmUso(), placaDoVeiculo);
		if (veiculo != null) {
			System.out.println("\nO ve�culo j� est� estacionado!");
			return;
		}
		vs.consultaVeiculo(dadosVeiculos.getListaVeiculosCadastrados(), placaDoVeiculo);
		LocalDateTime dataHoraEntrada = LocalDateTime.now();
		veiculo = vs.getVeiculo();
		if (veiculo == null) {
			vs.cadastraVeiculo(dadosVeiculos, dadosPessoa);
			veiculo = vs.getVeiculo();
			dadosEstacionamento.adicionarEntradaDeVeiculoAoBandoDeDados(new VagaEstacionamento(veiculo, dataHoraEntrada));
			dadosEstacionamento.adicionarUsoDeVaga(new VagaEstacionamento(veiculo, dataHoraEntrada));
			System.out.println("\nData e hora da entrada: " + dataHoraEntrada.format(dtf));
			System.out.println("\nEntrada cadastrada com sucesso!\n");
			return;
		}
		dadosEstacionamento.adicionarEntradaDeVeiculoAoBandoDeDados(new VagaEstacionamento(veiculo, dataHoraEntrada));
		dadosEstacionamento.adicionarUsoDeVaga(new VagaEstacionamento(veiculo, dataHoraEntrada));
		System.out.println("\nData e hora da entrada: " + dataHoraEntrada.format(dtf));
		System.out.println("\nEntrada cadastrada com sucesso!\n");
	}

	public void saidaDeVeiculo(EstacionamentoRepositorio dadosEstacionamento, String placaDoVeiculo) {
		consultaVeiculo(dadosEstacionamento.getListaDeVagasEmUso(), placaDoVeiculo);
		LocalDateTime dataHoraSaida = LocalDateTime.now();
		if (veiculo == null) {
			return;
		}
		System.out.println("\nData e hora da sa�da: " + dataHoraSaida.format(dtf));
		System.out.println("\nSa�da cadastrada com sucesso!\n");
		dadosEstacionamento.encerrarUsoDeVaga(vaga);
	}
	
	public void consultaVeiculo(List<VagaEstacionamento> lista, String placa) {
		for (VagaEstacionamento v : lista) {
			if (placa.toUpperCase().equals(v.getVeiculo().getPlacaDoVeiculo())) {
				System.out.println("\nVe�culo encontrado!");
				vaga = v;
				veiculo = v.getVeiculo();
				System.out.println(v);
				return;
			}
		}
		veiculo = null;
		System.out.println("\nVe�culo n�o encontrado!\n");
	}

	public void consultaVeiculoEstacionado(List<VagaEstacionamento> lista, String placa) {
		for (VagaEstacionamento v : lista) {
			if (placa.toUpperCase().equals(v.getVeiculo().getPlacaDoVeiculo())) {	
				vaga = v;
				veiculo = v.getVeiculo();
				System.out.println(v);
				return;
			}
		}
		veiculo = null;
	}
	
	public Veiculo getVeiculo() {
		return veiculo;
	}
}
