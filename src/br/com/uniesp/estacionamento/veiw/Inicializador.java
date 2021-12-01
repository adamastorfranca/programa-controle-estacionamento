package br.com.uniesp.estacionamento.veiw;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.uniesp.estacionamento.model.Pessoa;
import br.com.uniesp.estacionamento.model.VagaEstacionamento;
import br.com.uniesp.estacionamento.model.Veiculo;
import br.com.uniesp.estacionamento.model.enums.TiposDePessoas;
import br.com.uniesp.estacionamento.model.enums.TiposDeVeiculos;
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
		System.out.println("\n\n=====================================  E S T A C I O N A M E N T O   U N I E S P  =====================================");
		System.out.print("\nSERVI�OS:\n" 				
				+ "\n- ESTACIONAMENTO:"
				+ "\n	 1 - Entrada de ve�culo"
				+ "\n	 2 - Sa�da de ve�culo"
				+ "\n	 3 - Lista de ve�culos ainda estacionados"
				+ "\n	 4 - Lista por tipo de ve�culo"  
				+ "\n	 5 - Lista por tipo de pessoa"
				+ "\n	 6 - Lista de todas entradas no estacionamento"
				+ "\n	 7 - Lista de todas sa�das do estacionamento\n"				
				+ "\n- VE�CULOS:" 
				+ "\n	 8 - Cadastrar"
				+ "\n	 9 - Consultar"
				+ "\n	10 - Editar"
				+ "\n	11 - Excluir"
				+ "\n	12 - Lista por tipo de ve�culo cadastrado"
				+ "\n	13 - Lista de todos ve�culos cadastrados\n"			
				+ "\n- PESSOAS:" 
				+ "\n	14 - Cadastrar"
				+ "\n	15 - Consultar"
				+ "\n	16 - Editar"
				+ "\n	17 - Excluir"
				+ "\n	18 - Lista por tipo de pessoa cadastrada"
				+ "\n	19 - Lista de todas pessoas cadastradas\n"	 			
				+ "\n- ENCERRAR:" 
				+ "\n	20 - Encerrar programa\n");
		
		List<String> opcoes = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20");
		System.out.print("\nInforme a op��o: ");
		String opcao = sc.next();
		if (!opcoes.contains(opcao)) {
			System.out.println("Op��o inv�lida!");
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		}
		System.out.println("\n=======================================================================================================================");

		switch (opcao) {
		case "1":
			System.out.println("\n\n- ENTRADA DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String placaEntrada = sc.next();
			es.entradaDeVeiculo(dadosPessoa, dadosVeiculo, dadosEstacionamento, placaEntrada);		
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "2":
			System.out.println("\n\n- SA�DA DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String placaSaida = sc.next();
			es.saidaDeVeiculo(dadosEstacionamento, placaSaida);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "3":
			System.out.println("\n\n- LISTA DE VE�CULOS AINDA ESTACIONADOS:\n");
			for(VagaEstacionamento v : dadosEstacionamento.getListaDeVagasEmUso()) {			
				System.out.println(v);
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "4":
			System.out.println("\n\n- LISTA POR TIPO DE VE�CULO ESTACIONADOS:\n");
			System.out.print("Tipo: "
					+ "\n	1  - Carro"
					+ "\n	2  - Moto"
					+ "\n	3  - Onibus"
					+ "\n	4  - Van"
					+ "\nInforme a op��o: ");
			int tipo = sc.nextInt();
			if (dadosEstacionamento.getListaTotalDeEntradasNoEstacionamento().isEmpty()) {
				System.out.println("\nN�o entraram ve�culos desde tipo no estacionamento");
				inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
			}
			for(VagaEstacionamento v : dadosEstacionamento.getListaTotalDeEntradasNoEstacionamento()) {
				if (v.getVeiculo().getTipo() == TiposDeVeiculos.procurarOpcao(tipo)) {
					System.out.println(v);
				}
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "5":			
			System.out.println("\n\n- LISTA POR TIPO DE PESSOA QUE ENTRARAM NO ESTACIONAMENTO:\n");
			System.out.print("Tipo: "
					+ "\n	1 - Aluno"
					+ "\n	2 - Funcion�rio"
					+ "\n	3 - Terceirizado"
					+ "\n	4 - Visitante"
					+ "\nInforme a op��o: ");	
			int novoTipo = sc.nextInt();
			if (dadosEstacionamento.getListaTotalDeEntradasNoEstacionamento().isEmpty()) {
				System.out.println("\nN�o entraram ve�culos desde tipo no estacionamento");
				inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
			}
			for(VagaEstacionamento v : dadosEstacionamento.getListaTotalDeEntradasNoEstacionamento()) {
				if (v.getVeiculo().getDono().getTipo() == TiposDePessoas.procurarOpcao(novoTipo)) {
					System.out.println(v);
				}
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "6":			
			System.out.println("\n\n- LISTA DE TODAS ENTRADAS NO ESTACIONAMENTO:\n");
			for(VagaEstacionamento v : dadosEstacionamento.getListaDeVagasEmUso()) {			
				System.out.println(v);
			}
			for(VagaEstacionamento v : dadosEstacionamento.getListaTotalDeSaidasNoEstacionamento()) {			
				System.out.println(v);
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "7":			
			System.out.println("\n\n- LISTA DE TODAS SA�DAS NO ESTACIONAMENTO:\n");
			for(VagaEstacionamento v : dadosEstacionamento.getListaTotalDeSaidasNoEstacionamento()) {			
				System.out.println(v);
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "8":
			System.out.println("\n\n- CADASTRO DE VE�CULO:\n");
			vs.cadastraVeiculo(dadosVeiculo, dadosPessoa);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "9":
			System.out.println("\n\n- CONSULTA DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String nomePlaca = sc.next();
			vs.consultaVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), nomePlaca);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "10":
			System.out.println("\n\n- EDITOR DE VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String nomeEditorVeiculo = sc.next();
			vs.editaVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), nomeEditorVeiculo);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "11":
			System.out.println("\n\n- EXCLUIR VE�CULO:\n");
			System.out.print("Informe a placa do ve�culo: ");
			String placaParaExcluir = sc.next();
			vs.excluiVeiculo(dadosVeiculo.getListaVeiculosCadastrados(), placaParaExcluir);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "12":
			System.out.println("\n\n- LISTA POR TIPO DE VE�CULO CADASTRADO:\n");
			System.out.print("Tipo: "
					+ "\n	1  - Carro"
					+ "\n	2  - Moto"
					+ "\n	3  - Onibus"
					+ "\n	4  - Van"
					+ "\nInforme a op��o: ");
			int tipoVeiculo = sc.nextInt();
			for(Veiculo v : dadosVeiculo.getListaVeiculosCadastrados()) {
				if (v.getTipo() == TiposDeVeiculos.procurarOpcao(tipoVeiculo)) {
					System.out.println(v);
				}
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "13":
			System.out.println("\n\n- LISTA DE TODOS VE�CULOS CADASTRADOS:\n");
			System.out.println(dadosVeiculo.getListaVeiculosCadastrados());
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "14":
			System.out.println("\n\n- CADASTRO DE PESSOA:\n");
			ps.cadastraPessoa(dadosPessoa.getListaPessoasCadastradas());
			System.out.println("\nPessoa cadastrada com sucesso!\n");
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "15":
			System.out.println("\n\n- CONSULTA DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeConsulta = sc.next();
			ps.consultaPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeConsulta);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "16":
			System.out.println("\n\n- EDITOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeEditor = sc.next();
			ps.editaPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeEditor);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "17":
			System.out.println("\n\n- EXCLUIR PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeExclusor = sc.next();
			ps.excluiPessoa(dadosPessoa.getListaPessoasCadastradas(), nomeExclusor);
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "18":		
			System.out.println("\n\n- LISTA POR TIPO DE PESSOA CADASTRADA:\n");
			System.out.print("Tipo: "
					+ "\n	1 - Aluno"
					+ "\n	2 - Funcion�rio"
					+ "\n	3 - Terceirizado"
					+ "\n	4 - Visitante"
					+ "\nInforme a op��o: ");	
			int novoTipoP = sc.nextInt();
			for(Pessoa p : dadosPessoa.getListaPessoasCadastradas()) {
				if (p.getTipo() == TiposDePessoas.procurarOpcao(novoTipoP)) {
					System.out.println(p);
				}
			}
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);
		case "19":
			System.out.println("\n\n- LISTA DE TODAS PESSOAS CADASTRADOS:\n");
			System.out.println(dadosPessoa.getListaPessoasCadastradas());
			inicializaPrograma(dadosPessoa, dadosVeiculo, dadosEstacionamento);	
		case "20":
			System.out.println("\n\nSistema encerrado!");
			break;
		}
	}
}
