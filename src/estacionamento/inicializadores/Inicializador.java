package estacionamento.inicializadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Pessoa;
import estacionamento.servicos.cadastros.CadastramentoDePessoa;
import estacionamento.servicos.consultas.ConsultaDePessoa;
import estacionamento.servicos.editores.EditorDePessoa;

public class Inicializador {
	
	List<Pessoa> listaPessoas = new ArrayList<>();
	Scanner sci = new Scanner(System.in);
	
	public void inicializacaoPrincipal() {
		System.out.println("\n=================== ESTACIONAMENTO UNIESP ===================");
		int opcao = 0;
		while (opcao != 15) {
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
			opcao = sci.nextInt();
			System.out.println("\n=============================================================");
			
			switch(opcao) {
			case 1: 
				CadastramentoDePessoa cdp = new CadastramentoDePessoa();		
				System.out.println("\n- CADASTRO DE PESSOA:\n");
				cdp.cadastrarPessoa();
				System.out.println("\nPessoa cadastrada com sucesso!\n");
				listaPessoas.addAll(cdp.getPessoasCadastrados());
				inicializacaoPrincipal();			
			case 2:
				ConsultaDePessoa cdps = new ConsultaDePessoa();
				System.out.println("\n- CONSULTA DE PESSOA:\n");
				System.out.print("Informe o nome: ");
				String nomeConsulta = sci.next();
				cdps.consultarPessoa(listaPessoas, nomeConsulta.toUpperCase());
				inicializacaoPrincipal();
			case 3:
				EditorDePessoa edp = new EditorDePessoa();
				System.out.println("\n- EDITOR DE PESSOA:\n");
				System.out.print("Informe o nome: ");
				String nomeEditor = sci.next();
				edp.editarPessoa(listaPessoas, nomeEditor.toUpperCase());
				inicializacaoPrincipal();
			}
		}
	}

}
