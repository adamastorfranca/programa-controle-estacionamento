package estacionamento.servicos.cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estacionamento.enumerados.Cores;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;
import estacionamento.veiculos.Carro;
import estacionamento.veiculos.Moto;
import estacionamento.veiculos.Onibus;
import estacionamento.veiculos.Van;
import estacionamento.veiculos.Veiculo;

public class CadastramentoDeVeiculo {
	
	private Moto moto;
	private Carro carro;
	private Van van;
	private Onibus onibus;
	private List<Veiculo> veiculosCadastrados = new ArrayList<>();
	
	Scanner scv = new Scanner(System.in);
	
	public void cadastrarVeiculo() {
		System.out.println("CADASTRAMENTO DE VEÍCULO:");
		System.out.print("Marca: "
				+ "\n	1  - Audi"
				+ "\n	2  - BMW"
				+ "\n	3  - Chevrolet"
				+ "\n	4  - Citroen"
				+ "\n	5  - FIAT"
				+ "\n	6  - Ford"
				+ "\n	7  - Hyundai"
				+ "\n	8  - Honda"
				+ "\n	9  - Jaguar"
				+ "\n	10 - Land Rover"
				+ "\n	11 - Peugeot"
				+ "\n	12 - Toyota"
				+ "\n	13 - Volkswagen"
				+ "\n	14 - Volvo"
				+ "\n	15 - Outro"
				+ "\nInforme a opção: ");
		int marca = scv.nextInt();
		System.out.print("Informe a placa do veículo: ");
		String placa = scv.next();
		System.out.print("Cor: "
				+ "\n	1  - Amarela"
				+ "\n	2  - Azul"
				+ "\n	3  - Branco"
				+ "\n	4  - Prata"
				+ "\n	5  - Preto"
				+ "\n	6  - Verde"
				+ "\n	7  - Vermelho"
				+ "\n	8  - Outra"
				+ "\nInforme a opção: ");
		int cor = scv.nextInt();
		System.out.print("Tipo: "
				+ "\n	1  - Carro"
				+ "\n	2  - Moto"
				+ "\n	3  - Onibus"
				+ "\n	4  - Van"
				+ "\nInforme a opção: ");
		int tipo = scv.nextInt();
		
		CadastramentoDePessoa cdp = new CadastramentoDePessoa();	
		switch (tipo) {	
		case 1:
			System.out.print("Informe a quantidade de ocupantes (1 à 5): ");
			int quantidadeC = scv.nextInt();
			for(int i = 1; i <= quantidadeC; i++) {		
				cdp.cadastrarPessoa();
				carro = new Carro(Marcas.procurarOpcao(marca), placa, Cores.procurarOpcao(cor), TiposDeVeiculos.procurarOpcao(tipo), quantidadeC);
				veiculosCadastrados.add(carro);
			}
			break;
		case 2:
			System.out.print("Informe a quantidade de ocupantes (1 ou 2): ");
			int quantidadeM = scv.nextInt();
			for(int i = 1; i <= quantidadeM; i++) {	
				cdp.cadastrarPessoa();
				moto = new Moto(Marcas.procurarOpcao(marca), placa, Cores.procurarOpcao(cor), TiposDeVeiculos.procurarOpcao(tipo), quantidadeM);
				veiculosCadastrados.add(moto);
			}	
			break;
		case 3:
			System.out.print("Informe a quantidade de ocupantes (1 à 30): ");
			int quantidadeO = scv.nextInt();
			for(int i = 1; i <= quantidadeO; i++) {	
				cdp.cadastrarPessoa();
				onibus = new Onibus(Marcas.procurarOpcao(marca), placa, Cores.procurarOpcao(cor), TiposDeVeiculos.procurarOpcao(tipo), quantidadeO);
				veiculosCadastrados.add(onibus);
			}
		break;
		case 4:
			System.out.print("Informe a quantidade de ocupantes (1 à 20): ");
			int quantidadeV = scv.nextInt();
			for(int i = 1; i <= quantidadeV; i++) {
				cdp.cadastrarPessoa();
				van = new Van(Marcas.procurarOpcao(marca), placa, Cores.procurarOpcao(cor), TiposDeVeiculos.procurarOpcao(tipo), quantidadeV);
				veiculosCadastrados.add(van);
			}
		break;
		default:
			scv.close();
		}			
	}

	public Moto getMoto() {
		return moto;
	}

	public Carro getCarro() {
		return carro;
	}

	public Van getVan() {
		return van;
	}

	public Onibus getOnibus() {
		return onibus;
	}

	public List<Veiculo> getVeiculosCadastrados() {
		return veiculosCadastrados;
	}

}
