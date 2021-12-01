package br.com.uniesp.estacionamento.repositorio;

import java.util.ArrayList;
import java.util.List;

import br.com.uniesp.estacionamento.model.Aluno;
import br.com.uniesp.estacionamento.model.Funcionario;
import br.com.uniesp.estacionamento.model.Terceirizado;
import br.com.uniesp.estacionamento.model.Veiculo;
import br.com.uniesp.estacionamento.model.Visitante;
import br.com.uniesp.estacionamento.model.enums.Cargos;
import br.com.uniesp.estacionamento.model.enums.Cursos;
import br.com.uniesp.estacionamento.model.enums.Marcas;
import br.com.uniesp.estacionamento.model.enums.MotivosDaVisita;
import br.com.uniesp.estacionamento.model.enums.TiposDePessoas;
import br.com.uniesp.estacionamento.model.enums.TiposDeServicos;
import br.com.uniesp.estacionamento.model.enums.TiposDeVeiculos;

public class VeiculoRepositorio {

	private List<Veiculo> listaVeiculosCadastrados = new ArrayList<>();
	
	public void adicionarAoVeiculoAoBandoDeDados(Veiculo veiculo) {
		listaVeiculosCadastrados.add(veiculo);
	}

	public List<Veiculo> getListaVeiculosCadastrados() {
		return listaVeiculosCadastrados;
	}
	
	public void backup() {
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.CARRO, Marcas.AUDI, "AAA-0001", new Aluno("Dono1", "000.000.000-13", TiposDePessoas.procurarOpcao(1), 20214, Cursos.procurarOpcao(4))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.CARRO, Marcas.BMW, "AAA-0002", new Funcionario("Dono2", "000.000.000-14", TiposDePessoas.procurarOpcao(2), 000004, Cargos.procurarOpcao(4))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.CARRO, Marcas.CHEVROLET, "AAA-0003", new Terceirizado("Dono3", "000.000.000-15", TiposDePessoas.procurarOpcao(3), "Empresa4" , TiposDeServicos.procurarOpcao(4))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.CARRO, Marcas.CITROEN, "AAA-0004", new Visitante("Dono4", "000.000.000-16", TiposDePessoas.procurarOpcao(4), 99999996, MotivosDaVisita.procurarOpcao(4))));
		
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.MOTO, Marcas.HONDA, "AAA-0005", new Aluno("Dono5", "000.000.000-17", TiposDePessoas.procurarOpcao(1), 20215, Cursos.procurarOpcao(5))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.MOTO, Marcas.HONDA, "AAA-0006", new Funcionario("Dono6", "000.000.000-18", TiposDePessoas.procurarOpcao(2), 000005, Cargos.procurarOpcao(5))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.MOTO, Marcas.HONDA, "AAA-0007", new Terceirizado("Dono7", "000.000.000-19", TiposDePessoas.procurarOpcao(3), "Empresa5" , TiposDeServicos.procurarOpcao(5))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.MOTO, Marcas.HONDA, "AAA-0008", new Visitante("Dono8", "000.000.000-20", TiposDePessoas.procurarOpcao(4), 99999995, MotivosDaVisita.procurarOpcao(5))));
		
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.VAN, Marcas.FORD, "AAA-0009", new Aluno("Dono9", "000.000.000-21", TiposDePessoas.procurarOpcao(1), 20216, Cursos.procurarOpcao(6))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.VAN, Marcas.FIAT, "AAA-0010", new Funcionario("Dono10", "000.000.000-22", TiposDePessoas.procurarOpcao(2), 000006, Cargos.procurarOpcao(6))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.VAN, Marcas.HYUNDAI, "AAA-0011", new Terceirizado("Dono11", "000.000.000-23", TiposDePessoas.procurarOpcao(3), "Empresa6" , TiposDeServicos.procurarOpcao(6))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.VAN, Marcas.PEUGEOT, "AAA-0012", new Visitante("Dono12", "000.000.000-24", TiposDePessoas.procurarOpcao(4), 99999994, MotivosDaVisita.procurarOpcao(6))));
		
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.ONIBUS, Marcas.VOLKSWAGEN, "AAA-0013", new Aluno("Dono13", "000.000.000-25", TiposDePessoas.procurarOpcao(1), 20217, Cursos.procurarOpcao(7))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.ONIBUS, Marcas.VOLVO, "AAA-0014", new Funcionario("Dono14", "000.000.000-26", TiposDePessoas.procurarOpcao(2), 000007, Cargos.procurarOpcao(7))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.ONIBUS, Marcas.OUTRO, "AAA-0015", new Terceirizado("Dono15", "000.000.000-27", TiposDePessoas.procurarOpcao(3), "Empresa7" , TiposDeServicos.procurarOpcao(7))));
		listaVeiculosCadastrados.add(new Veiculo(TiposDeVeiculos.ONIBUS, Marcas.CHEVROLET, "AAA-0016", new Visitante("Dono16", "000.000.000-28", TiposDePessoas.procurarOpcao(4), 99999993, MotivosDaVisita.procurarOpcao(7))));
	}

}