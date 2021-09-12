package br.com.uniesp.estacionamento.entidade;

import br.com.uniesp.estacionamento.entidade.enums.Cursos;
import br.com.uniesp.estacionamento.entidade.enums.TiposDePessoas;

public class Aluno extends Pessoa {

	private Integer matricula;
	private Cursos curso;
	
	public Aluno(String nome, String cpf, TiposDePessoas tipo, Integer matricula, Cursos curso) {
		super(nome, cpf, tipo);
		this.matricula = matricula;
		this.curso = curso;
	}
	
	public Aluno getAluno(Aluno aluno) {
		return aluno;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public Cursos getCurso() {
		return curso;
	}

	public void setCurso(Cursos curso) {
		this.curso = curso;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {	
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("Matrícula: %-10s ,Curso: %-25s", matricula, curso));
		return super.toString() + sb.toString();
	}

}
