package estacionamento.servicos.editores;

import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Aluno;
import estacionamento.entidades.Pessoa;
import estacionamento.enumerados.Cursos;
import estacionamento.enumerados.TiposDePessoas;

public class EditorDePessoa {
	
	Aluno aluno;
	Scanner sep = new Scanner(System.in);
	
	public void editarPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {
				System.out.println("\nPessoa encontrada!\n");
				System.out.println(p);
				System.out.print("\nNovo nome: ");
				String novoNome = sep.next();
				System.out.print("Novo CPF: ");
				String novoCpf = sep.next();
				System.out.print("Tipo: "
						+ "\n	1  - Aluno"
						+ "\n	2  - Funcion�rio"
						+ "\n	3  - Terceirizado"
						+ "\n	4  - Visitante"
						+ "\nInforme a op��o: ");
				int tipo = sep.nextInt();
				if(p instanceof Aluno) {
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
					int curso = sep.nextInt();
					System.out.println("\nDados pessoais editados!");
					aluno = (Aluno) p;
					aluno.setNome(novoNome);
					aluno.setCpf(novoCpf);
					aluno.setTipo(TiposDePessoas.procurarOpcao(tipo));
					aluno.setMatricula(novaMatricula);
					aluno.setCurso(Cursos.procurarOpcao(curso));
				}
				return;
			}
		}
		System.out.println("Pessoa n�o encontrada!");
	}

}
