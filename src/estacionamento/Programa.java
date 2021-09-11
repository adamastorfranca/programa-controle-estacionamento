package estacionamento;

import estacionamento.servicos.Inicializador;

public class Programa {
	
	public static void main(String[] args) {
		
		Inicializador i = new Inicializador();
		i.backup();
		i.inicializacaoPrincipal();
	}

}
