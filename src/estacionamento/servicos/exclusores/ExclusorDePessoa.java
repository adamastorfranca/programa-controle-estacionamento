package estacionamento.servicos.exclusores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Pessoa;

public class ExclusorDePessoa {
	
	List<Pessoa> listaAuxiliar = new ArrayList<Pessoa>();
	Scanner sedp = new Scanner(System.in);
	
	public void excluirPessoa(List<Pessoa> lista, String nome) {
		for (Pessoa p : lista) {
			if (nome.equals(p.getNome())) {
				listaAuxiliar = lista;
				System.out.println("\nPessoa encontrada!\n");
				System.out.println(p);
				String resposta;
				do {
					System.out.print("\nTem certeza que deseja excluir (s/n): ");
					resposta = sedp.nextLine();
				} while(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
				
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Pessoa excluida!");
					listaAuxiliar.remove(p);
					return;
				}
				if (resposta.equalsIgnoreCase("n")) {
					return;
				}	
			}
		}
		System.out.println("Pessoa não encontrada!\n");
	}
	
	public List<Pessoa> getListaAuxiliar() {
		return listaAuxiliar;
	}

}
