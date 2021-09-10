package estacionamento.veiculos;

import estacionamento.enumerados.Cores;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;

public abstract class Veiculo {

	private Marcas marca;
	private String placaDoVeiculo;
	private Cores cor;
	private TiposDeVeiculos tipo;
	private Integer qntDeOcupantes;

	public Veiculo(Marcas marca, String placaDoVeiculo, Cores cor, TiposDeVeiculos tipo, Integer qntDeOcupantes) {
		this.marca = marca;
		this.placaDoVeiculo = placaDoVeiculo;
		this.cor = cor;
		this.tipo = tipo;
		this.qntDeOcupantes = qntDeOcupantes;
	}

	public Marcas getMarca() {
		return marca;
	}

	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}

	public Cores getCor() {
		return cor;
	}
	
	public TiposDeVeiculos getTipo() {
		return tipo;
	}
	
	public Integer getQntDeOcupantes() {
		return qntDeOcupantes;
	}
	
	public abstract int getQuantidadeDeOcupantes();
	
	public abstract void getInformacoesDosOcupantes();
	
	public abstract void imprimirInformacoes();

	@Override
	public String toString() {
		return "\nINFORMAÇÕES DO VEÍCULO:" +
				"\nTipo: " + tipo +
				"\nMarca: " + marca +
				"\nPlaca: " + placaDoVeiculo +
				"\nCor: " + cor +
				"\nQnt de ocupantes: " + qntDeOcupantes + "\n";		
	}

}
