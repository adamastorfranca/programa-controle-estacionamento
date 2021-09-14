package br.com.uniesp.estacionamento.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.uniesp.estacionamento.entidade.Aluno;
import br.com.uniesp.estacionamento.entidade.Funcionario;
import br.com.uniesp.estacionamento.entidade.Pessoa;
import br.com.uniesp.estacionamento.entidade.Terceirizado;
import br.com.uniesp.estacionamento.entidade.Visitante;
import br.com.uniesp.estacionamento.entidade.enums.Cargos;
import br.com.uniesp.estacionamento.entidade.enums.Cursos;
import br.com.uniesp.estacionamento.entidade.enums.MotivosDaVisita;
import br.com.uniesp.estacionamento.entidade.enums.TiposDePessoas;
import br.com.uniesp.estacionamento.entidade.enums.TiposDeServicos;

public class PessoaRepositorio {
	
	private List<Pessoa> listaPessoasCadastradas = new ArrayList<>();
	
	public void adicionarAoPessoaBandoDeDados(Pessoa pessoa) {
		listaPessoasCadastradas.add(pessoa);
	}
	
	public List<Pessoa> getListaPessoasCadastradas() {
		return listaPessoasCadastradas;
	}

	public void backup() {
		listaPessoasCadastradas.add(new Aluno("Aluno1", "000.000.000-01", TiposDePessoas.procurarOpcao(1), 20211, Cursos.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Aluno("Aluno2", "000.000.000-02", TiposDePessoas.procurarOpcao(1), 20212, Cursos.procurarOpcao(2)));
		listaPessoasCadastradas.add(new Aluno("Aluno3", "000.000.000-03", TiposDePessoas.procurarOpcao(1), 20213, Cursos.procurarOpcao(3)));
		
		listaPessoasCadastradas.add(new Funcionario("Funcionário1", "000.000.000-04", TiposDePessoas.procurarOpcao(2), 000001, Cargos.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Funcionario("Funcionário2", "000.000.000-05", TiposDePessoas.procurarOpcao(2), 000002, Cargos.procurarOpcao(2)));
		listaPessoasCadastradas.add(new Funcionario("Funcionário3", "000.000.000-06", TiposDePessoas.procurarOpcao(2), 000003, Cargos.procurarOpcao(3)));
		
		listaPessoasCadastradas.add(new Terceirizado("Tercerizado1", "000.000.000-07", TiposDePessoas.procurarOpcao(3), "Empresa1" , TiposDeServicos.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Terceirizado("Tercerizado2", "000.000.000-08", TiposDePessoas.procurarOpcao(3), "Empresa2" , TiposDeServicos.procurarOpcao(2)));
		listaPessoasCadastradas.add(new Terceirizado("Tercerizado3", "000.000.000-09", TiposDePessoas.procurarOpcao(3), "Empresa3" , TiposDeServicos.procurarOpcao(3)));
		
		listaPessoasCadastradas.add(new Visitante("Visitante1", "000.000.000-10", TiposDePessoas.procurarOpcao(4), 99999997, MotivosDaVisita.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Visitante("Visitante2", "000.000.000-11", TiposDePessoas.procurarOpcao(4), 99999998, MotivosDaVisita.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Visitante("Visitante3", "000.000.000-12", TiposDePessoas.procurarOpcao(4), 99999999, MotivosDaVisita.procurarOpcao(1)));
	}

}
