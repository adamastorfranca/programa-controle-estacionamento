package estacionamento.servicos;

import java.util.ArrayList;
import java.util.List;

import estacionamento.entidades.Aluno;
import estacionamento.entidades.Pessoa;
import estacionamento.entidades.Veiculo;
import estacionamento.enumerados.Cursos;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDePessoas;
import estacionamento.enumerados.TiposDeVeiculos;

public class BancoDeDados {
	
	private List<Pessoa> listaPessoasCadastradas = new ArrayList<>();
	private List<Veiculo> listaVeiculosCadastrados = new ArrayList<>();
	
	public void adicionarAoPessoaBandoDeDados(Pessoa pessoa) {
		listaPessoasCadastradas.add(pessoa);
	}
	
	public void adicionarAoVeiculoAoBandoDeDados(Veiculo veiculo) {
		listaVeiculosCadastrados.add(veiculo);
	}
	
	public List<Pessoa> getListaPessoasCadastradas() {
		return listaPessoasCadastradas;
	}
	
	public List<Veiculo> getListaVeiculosCadastrados() {
		return listaVeiculosCadastrados;
	}
	
	public void backup() {
		listaPessoasCadastradas.add(new Aluno("ADA", "083", TiposDePessoas.procurarOpcao(1), 20211, Cursos.procurarOpcao(1)));
		listaPessoasCadastradas.add(new Aluno("BOB", "082", TiposDePessoas.procurarOpcao(1), 20212, Cursos.procurarOpcao(2)));
		listaPessoasCadastradas.add(new Aluno("BEL", "081", TiposDePessoas.procurarOpcao(1), 20213, Cursos.procurarOpcao(3)));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.CARRO, Marcas.AUDI, "OGE-5622", new Aluno("TED", "080", TiposDePessoas.procurarOpcao(1), 20214, Cursos.procurarOpcao(4))));
	}

}
