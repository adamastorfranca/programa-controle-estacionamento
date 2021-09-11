package estacionamento;

import estacionamento.servicos.BancoDeDados;
import estacionamento.servicos.Inicializador;

public class Programa {
	
	public static void main(String[] args) {
		
		BancoDeDados b = new BancoDeDados();
		Inicializador i = new Inicializador();
		b.backup();
		i.inicializacaoPrincipal(b);
	}

}
