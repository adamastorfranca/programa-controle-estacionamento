package estacionamento.servicos.consultas;

import java.util.List;

import estacionamento.entidades.Pessoa;

public class ConsultaDePessoa {
	
	private Pessoa pessoa;
	
	public void consultarPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {
				System.out.println("\nPessoa encontrada!");
				pessoa = p;
				System.out.println(p);
				return;
			}
		}
		System.out.println("Pessoa não encontrada!\n");
	}

	public Pessoa getPessoa() {
		return pessoa;
	}
}
