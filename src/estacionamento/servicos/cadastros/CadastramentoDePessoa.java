package estacionamento.servicos.cadastros;

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
	
	private Pessoa pessoa;
	Scanner scp = new Scanner(System.in);
	
	public void cadastrarPessoa(List<Pessoa> listaPessoasCadastradas) {	
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
			pessoa = new Aluno(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), matricula, Cursos.procurarOpcao(curso));
			listaPessoasCadastradas.add(pessoa);			
			break;
		
		case 2:
			System.out.print("Informe o registro de trabalho: ");
			Integer registro = scp.nextInt();
			System.out.print("Cargo: "
					+ "\n	1 - Serviços gerais"
					+ "\n	2 - Segurança"
					+ "\n	3 - Secretária"
					+ "\n	4 - Bibliotecária"
					+ "\n	5 - Telemarketing"
					+ "\n	6 - Técnico de informática"
					+ "\n	7 - RH"
					+ "\n	8 - Tesoreiro"
					+ "\n	9 - Coordenador"
					+ "\n	10 - Professor"
					+ "\n	11 - Gerente"
					+ "\n	12 - Reitor"
					+ "\nInforme a opção: ");
			int cargo = scp.nextInt();
			pessoa = new Funcionario(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), registro, Cargos.procurarOpcao(cargo));
			listaPessoasCadastradas.add(pessoa);
			break;
		
		case 3:
			System.out.print("Informe o nome da empresa: ");
			String nomeEmpresa = scp.next();
			System.out.print("Tipo de serviço: "
					+ "\n	1 - Eletricista"
					+ "\n	2 - Entregador"
					+ "\n	3 - Encanador"
					+ "\n	4 - Jardineiro"
					+ "\n	5 - Motorista"
					+ "\n	6 - Pedreiro"
					+ "\n	7 - Pintor"
					+ "\nInforme a opção: ");
			int tipoServico = scp.nextInt();
			pessoa = new Terceirizado(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), nomeEmpresa, TiposDeServicos.procurarOpcao(tipoServico));
			listaPessoasCadastradas.add(pessoa);
			break;
		
		case 4:
			System.out.print("Informe o número do telefone: ");
			Integer numeroTelefone = scp.nextInt();
			System.out.print("Motivo da visita: "
					+ "\n	1 - Conhecer instalações"
					+ "\n	2 - Obter informações"
					+ "\n	3 - Fazer matrícula"
					+ "\n	4 - Atendimento da clínica escola"
					+ "\n	5 - Falar com funcionário"
					+ "\n	6 - Falar com aluno"
					+ "\n	7 - Outros"
					+ "\nInforme a opção: ");
			int motivo = scp.nextInt();
			listaPessoasCadastradas.add(new Visitante(nome.toUpperCase(), cpf, TiposDePessoas.procurarOpcao(tipo), numeroTelefone, MotivosDaVisita.procurarOpcao(motivo)));
			break;
		default:
			scp.close();
		}		
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
