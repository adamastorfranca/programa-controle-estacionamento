package estacionamento.servicos.consultas;

import java.util.List;

import estacionamento.entidades.Pessoa;

public class ConsultaDePessoa {
	
	public void consultarPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {
				System.out.println("\nPessoa encontrada!\n");
				System.out.println(p);
				return;
			}
		}
		System.out.println("Pessoa não encontrada!");
	}

}
