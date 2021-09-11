package estacionamento.entidades;

import java.util.ArrayList;
import java.util.List;

import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;

public class Veiculo {

	private TiposDeVeiculos tipo;
	private Marcas marca;
	private String placaDoVeiculo;
	private Pessoa dono;
	private List<Pessoa> listaOcupantes = new ArrayList<>();
	
	public Veiculo(TiposDeVeiculos tipo, Marcas marca, String placaDoVeiculo, Pessoa dono) {
		this.tipo = tipo;
		this.marca = marca;
		this.placaDoVeiculo = placaDoVeiculo;
		this.dono = dono;
	}

	public TiposDeVeiculos getTipo() {
		return tipo;
	}

	public void setTipo(TiposDeVeiculos tipo) {
		this.tipo = tipo;
	}

	public Marcas getMarca() {
		return marca;
	}

	public void setMarca(Marcas marca) {
		this.marca = marca;
	}

	public String getPlacaDoVeiculo() {
		return placaDoVeiculo;
	}

	public void setPlacaDoVeiculo(String placaDoVeiculo) {
		this.placaDoVeiculo = placaDoVeiculo;
	}

	public Pessoa getDono() {
		return dono;
	}

	public void setDono(Pessoa dono) {
		this.dono = dono;
	}

	public List<Pessoa> getListaOcupantes() {
		return listaOcupantes;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("\nTipo: %-6s, Placa: %-8s, Marca: %-10s, Nome do dono: %-15s, CPF: %-14s, Tipo: %-12s", tipo, placaDoVeiculo, marca, dono.getNome(), dono.getCpf(), dono.getTipo()));
		return sb.toString();
	}
	

}
