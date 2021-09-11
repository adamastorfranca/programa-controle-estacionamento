package estacionamento.servicos;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import estacionamento.servicos.cadastros.CadastramentoDePessoa;
import estacionamento.servicos.cadastros.CadastramentoDeVeiculo;
import estacionamento.servicos.consultas.ConsultaDePessoa;
import estacionamento.servicos.consultas.ConsultaDeVeiculo;
import estacionamento.servicos.editores.EditorDePessoa;
import estacionamento.servicos.exclusores.ExclusorDePessoa;

public class Inicializador {

	BancoDeDados dados;
	Scanner sci = new Scanner(System.in);
	
	public void inicializacaoPrincipal(BancoDeDados dados) {
		System.out.println("\n\n======================================  E S T A C I O N A M E N T O   U N I E S P  ======================================");
		System.out.print("\nSERVIÇOS:\n" 
				+ "\n- VEÍCULOS:" 
				+ "\n	1  - Cadastrar" 
				+ "\n	2  - Consultar"
				+ "\n	3  - Editar" 
				+ "\n	4  - Excluir\n" 
				+ "\n- PESSOAS:" 
				+ "\n	5  - Cadastrar"
				+ "\n	6  - Consultar" 
				+ "\n	7  - Editar" 
				+ "\n	8  - Excluir\n" 
				+ "\n- ESTACIONAMENTO:"
				+ "\n	9  - Entrada de veículo" 
				+ "\n	10 - Saída de veículo\n" 
				+ "\n- RELATÓRIOS:"
				+ "\n	11 - Total de veículos" 
				+ "\n	12 - Total de pessoas" 
				+ "\n	13 - Por tipo de veículo"
				+ "\n	14 - Por tipo de pessoa\n" 
				+ "\n- ENCERRAR:" 
				+ "\n	15 - Encerrar progrma\n");
		List<String> opcoes = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15");
		System.out.print("\nInforme a opção: ");
		String opcao = sci.next();
		if (!opcoes.contains(opcao)) {
			System.out.println("Opção inválida!");
			inicializacaoPrincipal(dados);
		}
		System.out.println("\n=========================================================================================================================");

		switch (opcao) {
		case "1":
			CadastramentoDeVeiculo cdv = new CadastramentoDeVeiculo();
			System.out.println("\n\n- CADASTRO DE VEÍCULO:\n");
			cdv.cadastrarVeiculo(dados);
			System.out.println("\nVeículo cadastrado com sucesso!\n");
			inicializacaoPrincipal(dados);
		case "2":
			ConsultaDeVeiculo cdvs = new ConsultaDeVeiculo();
			System.out.println("\n\n- CONSULTA DE VEÍCULO:\n");
			System.out.print("Informe a placa do veículo: ");
			String nomePlaca = sci.next();
			cdvs.consultarVeiculo(dados.getListaVeiculosCadastrados(), nomePlaca.toUpperCase());
			inicializacaoPrincipal(dados);
		case "5":
			CadastramentoDePessoa cdp = new CadastramentoDePessoa();
			System.out.println("\n\n- CADASTRO DE PESSOA:\n");
			cdp.cadastrarPessoa(dados.getListaPessoasCadastradas());
			System.out.println("\nPessoa cadastrada com sucesso!\n");
			inicializacaoPrincipal(dados);
		case "6":
			ConsultaDePessoa cdps = new ConsultaDePessoa();
			System.out.println("\n\n- CONSULTA DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeConsulta = sci.next();
			cdps.consultarPessoa(dados.getListaPessoasCadastradas(), nomeConsulta.toUpperCase());
			inicializacaoPrincipal(dados);
		case "7":
			EditorDePessoa edp = new EditorDePessoa();
			System.out.println("\n\n- EDITOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeEditor = sci.next();
			edp.editarPessoa(dados.getListaPessoasCadastradas(), nomeEditor.toUpperCase());
			inicializacaoPrincipal(dados);
		case "8":
			ExclusorDePessoa edps = new ExclusorDePessoa();
			System.out.println("\n\n- EXCLUSOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeExclusor = sci.next();
			edps.excluirPessoa(dados.getListaPessoasCadastradas(), nomeExclusor.toUpperCase());
			inicializacaoPrincipal(dados);
		case "11":
			System.out.println("\n\n- LISTA DE VEÍCULOS:");
			System.out.println(dados.getListaVeiculosCadastrados());
			inicializacaoPrincipal(dados);
		case "12":
			System.out.println("\n\n- LISTA DE PESSOAS:");
			System.out.println(dados.getListaPessoasCadastradas());
			inicializacaoPrincipal(dados);
		case "15":
			System.out.println("\n\nSistema encerrado!");
			break;
		}
	}
}
