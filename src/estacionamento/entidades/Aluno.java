package estacionamento.entidades;

import estacionamento.enumerados.Cursos;
import estacionamento.enumerados.TiposDePessoas;

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
		return super.toString() +
				"\nMatrícula: " + matricula +
				"\nCurso: " + curso;
	}

}
