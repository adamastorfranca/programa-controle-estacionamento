package estacionamento.servicos.editores;

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

public class EditorDePessoa {
	
	Scanner sep = new Scanner(System.in);

	public void editarPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {	
				System.out.println("\nPessoa encontrada!\n");
				System.out.println(p);
				
				String respostaEditor;
				do {
					System.out.print("\nTem certeza que deseja excluir (s/n): ");
					respostaEditor = sep.nextLine();
				} while(!respostaEditor.equalsIgnoreCase("s") && !respostaEditor.equalsIgnoreCase("n"));
				
				if (respostaEditor.equalsIgnoreCase("s")) {
					lista.remove(p);
					System.out.print("\nNovo nome: ");
					String novoNome = sep.next();
					System.out.print("Novo CPF: ");
					String novoCpf = sep.next();
					System.out.print("Tipo: "
								+ "\n	1 - Aluno"
								+ "\n	2 - Funcion�rio"
								+ "\n	3 - Terceirizado"
								+ "\n	4 - Visitante"
								+ "\nInforme a op��o: ");	
					int novoTipo = sep.nextInt();
				
					if(novoTipo == 1) {
						System.out.print("Nova matr�cula: ");
						Integer novaMatricula = sep.nextInt();
						System.out.print("Curso: "
								+ "\n	1  - Administra��o"
								+ "\n	2  - Arquitetura e Urbanismo"
								+ "\n	3  - Ci�ncias Cont�beis"
								+ "\n	4  - Direito"
								+ "\n	5  - Educa��o F�sica"
								+ "\n	6  - Enfermagem"
								+ "\n	7  - Engenharia Civil"
								+ "\n	8  - Farm�cia"
								+ "\n	9  - Fisioterapia"
								+ "\n	10 - Nutri��o"
								+ "\n	11 - Odontologia"
								+ "\n	12 - Psicologia"
								+ "\n	13 - Sistemas de Informa��o"
								+ "\n	14 - Sistemas para Internet"
								+ "\nInforme a op��o: ");
						int novoCurso = sep.nextInt();
						System.out.println("\nDados pessoais editados!");
						lista.add(new Aluno(novoNome.toUpperCase(), novoCpf, TiposDePessoas.procurarOpcao(novoTipo), novaMatricula,Cursos.procurarOpcao(novoCurso)));
						return;
					}
					if(novoTipo == 2) {
						System.out.print("Novo registro de trabalho: ");
						Integer novoRegistro = sep.nextInt();
						System.out.print("Cargo: "
								+ "\n	1  - Servi�os gerais"
								+ "\n	2  - Seguran�a"
								+ "\n	3  - Secret�ria"
								+ "\n	4  - Bibliotec�ria"
								+ "\n	5  - Telemarketing"
								+ "\n	6  - T�cnico de inform�tica"
								+ "\n	7  - RH"
								+ "\n	8  - Tesoreiro"
								+ "\n	9  - Coordenador"
								+ "\n	10 - Professor"
								+ "\n	11 - Gerente"
								+ "\n	12 - Reitor"
								+ "\nInforme a op��o: ");
						int novoCargo = sep.nextInt();
						System.out.println("\nDados pessoais editados!");
						lista.add(new Funcionario(novoNome.toUpperCase(), novoCpf, TiposDePessoas.procurarOpcao(novoTipo), novoRegistro,Cargos.procurarOpcao(novoCargo)));
						return;
					}
					if(novoTipo == 3) {
						System.out.print("Novo nome da empresa: ");
						String novaEmpresa = sep.next();
						System.out.print("Tipo de servi�o: "
								+ "\n	1 - Eletricista"
								+ "\n	2 - Entregador"
								+ "\n	3 - Encanador"
								+ "\n	4 - Jardineiro"
								+ "\n	5 - Motorista"
								+ "\n	6 - Pedreiro"
								+ "\n	7 - Pintor"
								+ "\nInforme a op��o: ");
						int novoTipoServico = sep.nextInt();
						System.out.println("\nDados pessoais editados!");
						lista.add(new Terceirizado(novoNome.toUpperCase(), novoCpf, TiposDePessoas.procurarOpcao(novoTipo), novaEmpresa, TiposDeServicos.procurarOpcao(novoTipoServico)));
						return;
					}
					if(novoTipo == 4) {
						System.out.print("Novo n�mero do telefone: ");
						Integer novoNumeroTelefone = sep.nextInt();
						System.out.print("Motivo da visita: "
								+ "\n	1 - Conhecer instala��es"
								+ "\n	2 - Obter informa��es"
								+ "\n	3 - Fazer matr�cula"
								+ "\n	4 - Atendimento da cl�nica escola"
								+ "\n	5 - Falar com funcion�rio"
								+ "\n	6 - Falar com aluno"
								+ "\n	7 - Outros"
								+ "\nInforme a op��o: ");
						int novoMotivo = sep.nextInt();
						System.out.println("\nDados pessoais editados!");
						lista.add(new Visitante(novoNome.toUpperCase(), novoCpf, TiposDePessoas.procurarOpcao(novoTipo), novoNumeroTelefone, MotivosDaVisita.procurarOpcao(novoMotivo)));
						return;
					}
				}
				if (respostaEditor.equalsIgnoreCase("n")) {
					return;
				}	
			}
			System.out.println("Pessoa n�o encontrada!");
		}
	}
}
