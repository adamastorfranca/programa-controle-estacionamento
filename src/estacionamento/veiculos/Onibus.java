package estacionamento.veiculos;

import java.util.ArrayList;
import java.util.List;

import estacionamento.entidades.Pessoa;
import estacionamento.enumerados.Cores;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;

public class Onibus extends Veiculo {
	
	private List<Pessoa> listaDeOcupantes = new ArrayList<Pessoa>();
	
	public Onibus(Marcas marca, String placaDoVeiculo, Cores cor, TiposDeVeiculos tipo, Integer qntDeOcupantes) {
		super(marca, placaDoVeiculo, cor, tipo, qntDeOcupantes);
	}	
	
	public List<Pessoa> getListaDeOcupantes() {
		return listaDeOcupantes;
	}

	@Override
	public int getQuantidadeDeOcupantes() {
		return listaDeOcupantes.size();
	}
	
	@Override
	public void getInformacoesDosOcupantes() {
		System.out.println("INFORMAÇÕES DOS OCUPANTES:");
		for (Pessoa pessoa : listaDeOcupantes) {
			System.out.println(pessoa.toString());
		}
	}

	@Override
	public void imprimirInformacoes() {
		System.out.println(super.toString());
		getInformacoesDosOcupantes();
	}
}
