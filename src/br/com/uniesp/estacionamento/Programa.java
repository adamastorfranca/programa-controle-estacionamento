package br.com.uniesp.estacionamento;


import br.com.uniesp.estacionamento.repositorio.EstacionamentoRepositorio;
import br.com.uniesp.estacionamento.repositorio.PessoaRepositorio;
import br.com.uniesp.estacionamento.repositorio.VeiculoRepositorio;
import br.com.uniesp.estacionamento.veiw.Inicializador;

public class Programa {
	
	public static void main(String[] args) {
		
		PessoaRepositorio pr = new PessoaRepositorio();
		VeiculoRepositorio vr = new VeiculoRepositorio();
		EstacionamentoRepositorio er = new EstacionamentoRepositorio();
		Inicializador i = new Inicializador();
		pr.backup();
		vr.backup();
		i.inicializaPrograma(pr, vr, er);
	}

}
