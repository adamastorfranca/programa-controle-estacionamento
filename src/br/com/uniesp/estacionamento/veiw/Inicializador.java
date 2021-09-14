package br.com.uniesp.estacionamento.veiw;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.uniesp.estacionamento.repositorio.EstacionamentoRepositorio;
import br.com.uniesp.estacionamento.repositorio.PessoaRepositorio;
import br.com.uniesp.estacionamento.repositorio.VeiculoRepositorio;
import br.com.uniesp.estacionamento.service.EstacionamentoService;
import br.com.uniesp.estacionamento.service.PessoaService;
import br.com.uniesp.estacionamento.service.VeiculoService;

public class Inicializador {

	private PessoaService ps = new PessoaService();
	private VeiculoService vs = new VeiculoService();
	private EstacionamentoService es = new EstacionamentoService();
	Scanner sc = new Scanner(System.in);
	
	public void inicializaPrograma(PessoaRepositorio dadosPessoa, VeiculoRepositorio dadosVeiculo, EstacionamentoRepositorio dadosEstacionamento) {
		System.out.println("\n\n======================================  E S T A C I O N A M E N T O   U N I E S P  ======================================");
		System.out.print("\nSERVI�OS:\n" 
				+ "\n- VE�CULOS:" 
				+ "\n	1  - Cadastrar" 	//ok
				+ "\n	2  - Consultar" 	//ok
				+ "\n	3  - Editar" 		//ok
				+ "\n	4  - Excluir\n" 	//ok
				+ "\n- PESSOAS:" 
				+ "\n	5  - Cadastrar" 	//ok
				+ "\n	6  - Consultar"		//ok
				+ "\n	7  - Editar" 		//ok
				+ "\n	8  - Excluir\n" 	//ok 
				+ "\n- ESTACIONAMENTO:"
				+ "\n	9  - Entrada de ve�culo"
				+ "\n	10 - Sa�da de ve�culo\n" 
				+ "\n- RELAT�RIOS:"
				+ "\n	11 - Total de ve�culos" 	//ok
				+ "\n	12 - Total de pessoas" 		//ok
				+ "\n	13 - Por tipo de ve�culo"
				+ "\n	14 - Por tipo de pessoa\n" 
				+ "\n- ENCERRAR:" 
				+ "\n	15 - Encerrar programa\n"); //ok
		List<String> opcoes = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15");
		System.out.print("\nInforme a op��o: ");
		String opcao = sc.next();
		if (!opcoes.contains(opcao)) {
			System.out.println("Op��o inv�lida!");
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		}
		System.out.println("\n=========================================================================================================================");

		switch (opcao) {
		case "1":
			System.out.println("\n\n- CADASTRO DE VE�CULO:\n");
			vs.cadastraVeiculo(dadosVeiculo, dadosPessoa);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "2":
			System.out.println("\n\n- CONSULTA DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String nomePlaca = sc.next();
			vs.consultaVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), nomePlaca);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "3":
			System.out.println("\n\n- EDITOR DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String nomeEditorVeiculo = sc.next();
			vs.editaVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), nomeEditorVeiculo);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "4":
			System.out.println("\n\n- EXCLUSOR DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String placaParaExcluir = sc.next();
			vs.excluiVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), placaParaExcluir);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "5":
			System.out.println("\n\n- CADASTRO DE PESSOA:\n");
			ps.cadastraPessoa(dadosPessoa.getListaPessoasCadastradas());
			System.out.println("\nPessoa cadastrada com sucesso!\n");
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "6":
			System.out.println("\n\n- CONSULTA DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeConsulta = sc.next();
			ps.consultaPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeConsulta);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "7":
			System.out.println("\n\n- EDITOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeEditor = sc.next();
			ps.editaPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeEditor);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "8":
			System.out.println("\n\n- EXCLUSOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeExclusor = sc.next();
			ps.excluiPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeExclusor);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "9":
			System.out.println("\n\n- ENTRADA DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String placaEntrada = sc.next();
			es.entradaDeVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), dadosEstacionamento.getListaDeEntradasNoEstacionamento(), placaEntrada);
			System.out.println("\nEntrada cadastrada com sucesso!\n");
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "10":
		
		case "11":
			System.out.println("\n\n- LISTA DE VE�CULOS:");
			System.out.println(dadosVeiculo.getListaVeiculosCadastrados());
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "12":
			System.out.println("\n\n- LISTA DE PESSOAS:");
			System.out.println(dadosPessoa.getListaPessoasCadastradas());
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "13":
		
		case "14":
		
		case "15":
			System.out.println("\n\nSistema encerrado!");
			break;
		}
	}
}
