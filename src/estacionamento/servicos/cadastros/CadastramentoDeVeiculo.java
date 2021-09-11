package estacionamento.servicos.cadastros;

import java.util.Scanner;

import estacionamento.entidades.Pessoa;
import estacionamento.entidades.Veiculo;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;
import estacionamento.servicos.BancoDeDados;
import estacionamento.servicos.consultas.ConsultaDePessoa;

public class CadastramentoDeVeiculo {
	
	private Pessoa donoDoCarro;
	private Veiculo veiculo;
	
	Scanner scv = new Scanner(System.in);
	
	public void cadastrarVeiculo(BancoDeDados dados) {
		System.out.print("Tipo: "
				+ "\n	1  - Carro"
				+ "\n	2  - Moto"
				+ "\n	3  - Onibus"
				+ "\n	4  - Van"
				+ "\nInforme a opção: ");
		int tipo = scv.nextInt();
		System.out.print("Informe a placa do veículo: ");
		String placa = scv.next();
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
		String respostaCadastro;
		do {
			System.out.print("O dono tem cadastro no sistema (s/n): ");
			respostaCadastro = scv.next();
		} while(!respostaCadastro.equalsIgnoreCase("s") && !respostaCadastro.equalsIgnoreCase("n"));
		
		CadastramentoDePessoa cdp = new CadastramentoDePessoa();
		if(respostaCadastro.equalsIgnoreCase("n")) {
			System.out.println("\nPreencha dados pessoais do dono:");
			cdp.cadastrarPessoa(dados.getListaPessoasCadastradas());
			donoDoCarro = cdp.getPessoa();
			veiculo = new Veiculo(TiposDeVeiculos.procurarOpcao(tipo), Marcas.procurarOpcao(marca), placa.toUpperCase(), donoDoCarro);
			dados.adicionarAoVeiculoAoBandoDeDados(veiculo);
		}
		if(respostaCadastro.equalsIgnoreCase("s")) {
			ConsultaDePessoa cdps = new ConsultaDePessoa();
			System.out.print("Informe o nome: ");
			String nome = scv.next();
			cdps.consultarPessoa(dados.getListaPessoasCadastradas(), nome.toUpperCase());
			donoDoCarro = cdps.getPessoa();
			if (donoDoCarro == null) {
				System.out.println("Preencha dados pessoais do dono:");
				cdp.cadastrarPessoa(dados.getListaPessoasCadastradas());
				donoDoCarro = cdp.getPessoa();
				veiculo = new Veiculo(TiposDeVeiculos.procurarOpcao(tipo), Marcas.procurarOpcao(marca), placa.toUpperCase(), donoDoCarro);
				dados.adicionarAoVeiculoAoBandoDeDados(veiculo);
				return;
			}
			veiculo = new Veiculo(TiposDeVeiculos.procurarOpcao(tipo), Marcas.procurarOpcao(marca),placa.toUpperCase(), donoDoCarro);
			dados.adicionarAoVeiculoAoBandoDeDados(veiculo);
		}
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public Pessoa getDonoDoCarro() {
		return donoDoCarro;
	}

}
