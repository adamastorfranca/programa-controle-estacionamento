package estacionamento.servicos.exclusores;

import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Veiculo;

public class ExclusorDeVeiculo {
	
	Scanner sedv = new Scanner(System.in);
	
	public void excluirVeiculo(List<Veiculo> lista, String placaDoVeiculo) {
		for (Veiculo v : lista) {
			if (placaDoVeiculo.equals(v.getPlacaDoVeiculo())) {
				System.out.println("\nVe�culo encontrado!\n");
				System.out.println(v);
				String resposta;
				do {
					System.out.print("\nTem certeza que deseja excluir (s/n): ");
					resposta = sedv.nextLine();
				} while(!resposta.equalsIgnoreCase("s") && !resposta.equalsIgnoreCase("n"));
				
				if (resposta.equalsIgnoreCase("s")) {
					System.out.println("Ve�culo excluido!");
					lista.remove(v);
					return;
				}
				if (resposta.equalsIgnoreCase("n")) {
					return;
				}	
			}
		}
		System.out.println("Ve�culo n�o encontrado!\n");
	}
}