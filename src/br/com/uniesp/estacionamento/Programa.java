package br.com.uniesp.estacionamento;


import br.com.uniesp.estacionamento.repositorio.PessoaRepositorio;
import br.com.uniesp.estacionamento.veiw.Inicializador;

public class Programa {
	
	public static void main(String[] args) {
		
		PessoaRepositorio b = new PessoaRepositorio();
		Inicializador i = new Inicializador();
		b.backup();
		i.inicializaPrograma(b);
	}

}
