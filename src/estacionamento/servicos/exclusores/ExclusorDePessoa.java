package estacionamento.servicos.exclusores;

import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Pessoa;

public class ExclusorDePessoa {
	
	Scanner sedp = new Scanner(System.in);
	
	public void excluirPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {
				System.out.println("\nPessoa encontrada!\n");
				System.out.println(p);
				String resposta;
				do {
					System.out.print("\nTem certeza que deseja excluir (s/n): ");
					resposta = sedp.nextLine();
				} while(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
				
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Pessoa excluida!");
					lista.remove(p);
					return;
				}
				if (resposta.equalsIgnoreCase("n")) {
					return;
				}	
			}
		}
		System.out.println("Pessoa não encontrada!\n");
	}
}
