package estacionamento.servicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Aluno;
import estacionamento.entidades.Pessoa;
import estacionamento.enumerados.Cursos;
import estacionamento.enumerados.TiposDePessoas;
import estacionamento.servicos.cadastros.CadastramentoDePessoa;
import estacionamento.servicos.consultas.ConsultaDePessoa;
import estacionamento.servicos.editores.EditorDePessoa;
import estacionamento.servicos.exclusores.ExclusorDePessoa;

public class Inicializador {

	List<Pessoa> listaPessoas = new ArrayList<>();
	List<String> opcoes = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14",
			"15");
	Scanner sci = new Scanner(System.in);

	public void inicializacaoPrincipal() {
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
		System.out.print("\nInforme a opção: ");
		String opcao = sci.next();
		if (!opcoes.contains(opcao)) {
			System.out.println("Opção inválida!");
			inicializacaoPrincipal();
		}
		System.out.println("\n=========================================================================================================================");

		switch (opcao) {
		case "1":
			CadastramentoDePessoa cdp = new CadastramentoDePessoa();
			System.out.println("\n\n- CADASTRO DE PESSOA:\n");
			cdp.cadastrarPessoa();
			System.out.println("\nPessoa cadastrada com sucesso!\n");
			listaPessoas.addAll(cdp.getPessoasCadastrados());
			inicializacaoPrincipal();
		case "2":
			ConsultaDePessoa cdps = new ConsultaDePessoa();
			System.out.println("\n\n- CONSULTA DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeConsulta = sci.next();
			cdps.consultarPessoa(listaPessoas, nomeConsulta.toUpperCase());
			inicializacaoPrincipal();
		case "3":
			EditorDePessoa edp = new EditorDePessoa();
			System.out.println("\n\n- EDITOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeEditor = sci.next();
			edp.editarPessoa(listaPessoas, nomeEditor.toUpperCase());
			listaPessoas.addAll(edp.getListaAuxiliar());
			inicializacaoPrincipal();
		case "4":
			ExclusorDePessoa edps = new ExclusorDePessoa();
			System.out.println("\n\n- EXCLUSOR DE PESSOA:\n");
			System.out.print("Informe o nome: ");
			String nomeExclusor = sci.next();
			edps.excluirPessoa(listaPessoas, nomeExclusor.toUpperCase());
			listaPessoas = edps.getListaAuxiliar();
			inicializacaoPrincipal();
		case "12":
			System.out.println("\n\n- LISTA DE PESSOAS:");
			System.out.println(listaPessoas);
			inicializacaoPrincipal();
		case "15":
			System.out.println("\n\nSistema encerrado!");
			break;
		}
	}
	
	public void backup() {
		listaPessoas.add(new Aluno("ADA", "083", TiposDePessoas.procurarOpcao(1), 20211, Cursos.procurarOpcao(1)));
		listaPessoas.add(new Aluno("BOB", "082", TiposDePessoas.procurarOpcao(1), 20212, Cursos.procurarOpcao(2)));
		listaPessoas.add(new Aluno("BEL", "081", TiposDePessoas.procurarOpcao(1), 20213, Cursos.procurarOpcao(3)));
	}
}
