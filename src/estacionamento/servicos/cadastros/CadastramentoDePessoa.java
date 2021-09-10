package estacionamento.servicos.cadastros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Aluno;
import estacionamento.entidades.Funcionario;
import estacionamento.entidades.Pessoa;
import estacionamento.entidades.Terceirizado;
import estacionamento.entidades.Visitante;
import estacionamento.enumerados.Cargos;
import estacionamento.enumerados.Cursos;
import estacionamento.enumerados.MotivosDaVisita;
import estacionamento.enumerados.TiposDePessoas;
import estacionamento.enumerados.TiposDeServicos;

public class CadastramentoDePessoa {
	
	private List<Pessoa> pessoasCadastradas = new ArrayList<>();
	
	Scanner scp = new Scanner(System.in);
	
	public void cadastrarPessoa() {	
		System.out.print("Informe o nome: ");
		String nome = scp.next();
		System.out.print("Informe o CPF: ");
		String cpf = scp.next();
		System.out.print("Tipo: "
				+ "\n	1  - Aluno"
				+ "\n	2  - Funcionário"
				+ "\n	3  - Terceirizado"
				+ "\n	4  - Visitante"
				+ "\nInforme a opção: ");
		int tipo = scp.nextInt();
		switch(tipo) {
		
		case 1:
			System.out.print("Informe a matrícula: ");
			Integer matricula = scp.nextInt();
			System.out.print("Curso: "
					+ "\n	1  - Administração"
					+ "\n	2  - Arquitetura e Urbanismo"
					+ "\n	3  - Ciências Contábeis"
					+ "\n	4  - Direito"
					+ "\n	5  - Educação Física"
					+ "\n	6  - Enfermagem"
					+ "\n	7  - Engenharia Civil"
					+ "\n	8  - Farmácia"
					+ "\n	9  - Fisioterapia"
					+ "\n	10 - Nutrição"
					+ "\n	11 - Odontologia"
					+ "\n	12 - Psicologia"
					+ "\n	13 - Sistemas de Informação"
					+ "\n	14 - Sistemas para Internet"
					+ "\nInforme a opção: ");
			int curso = scp.nextInt();
			pessoasCadastradas.add(new Aluno(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), matricula, Cursos.procurarOpcao(curso)));			
			break;
		
		case 2:
			System.out.print("Informe o registro de trabalho: ");
			Integer registro = scp.nextInt();
			System.out.print("Cargo: "
					+ "\n1 - Serviços gerais"
					+ "\n2 - Segurança"
					+ "\n3 - Secretária"
					+ "\n4 - Bibliotecária"
					+ "\n5 - Telemarketing"
					+ "\n6 - Técnico de informática"
					+ "\n7 - RH"
					+ "\n8 - Tesoreiro"
					+ "\n9 - Coordenador"
					+ "\n10 - Professor"
					+ "\n11 - Gerente"
					+ "\n12 - Reitor"
					+ "\nInforme a opção: ");
			int cargo = scp.nextInt();
			pessoasCadastradas.add(new Funcionario(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), registro, Cargos.procurarOpcao(cargo)));
			break;
		
		case 3:
			System.out.print("Informe o nome da empresa: ");
			String nomeEmpresa = scp.next();
			System.out.print("Tipo de serviço: "
					+ "\n1 - Eletricista"
					+ "\n2 - Entregador"
					+ "\n3 - Encanador"
					+ "\n4 - Jardineiro"
					+ "\n5 - Motorista"
					+ "\n6 - Pedreiro"
					+ "\n7 - Pintor"
					+ "\nInforme a opção: ");
			int tipoServico = scp.nextInt();
			pessoasCadastradas.add(new Terceirizado(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), nomeEmpresa, TiposDeServicos.procurarOpcao(tipoServico)));
			break;
		
		case 4:
			System.out.print("Informe o número do telefone: ");
			Integer numeroTelefone = scp.nextInt();
			System.out.print("Motivo da visita: "
					+ "\n1 - Conhecer instalações"
					+ "\n2 - Obter informações"
					+ "\n3 - Fazer matrícula"
					+ "\n4 - Atendimento da clínica escola"
					+ "\n5 - Falar com funcionário"
					+ "\n6 - Falar com aluno"
					+ "\n7 - Outros"
					+ "\nInforme a opção: ");
			int motivo = scp.nextInt();
			pessoasCadastradas.add(new Visitante(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), numeroTelefone, MotivosDaVisita.procurarOpcao(motivo)));
			break;
		default:
			scp.close();
		}		
	}

	public List<Pessoa> getPessoasCadastrados() {
		return pessoasCadastradas;
	}
}
