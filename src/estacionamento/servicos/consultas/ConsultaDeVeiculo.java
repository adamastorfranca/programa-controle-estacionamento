package estacionamento.servicos.consultas;

import java.util.List;

import estacionamento.entidades.Veiculo;

public class ConsultaDeVeiculo {
	
	private Veiculo veiculo;

	public void consultarVeiculo(List<Veiculo> lista, String placa) {
		for (Veiculo v : lista) {
			if (placa.equals(v.getPlacaDoVeiculo())) {
				System.out.println("\nVe�culo encontrado!");
				veiculo = v;
				System.out.println(v);
				return;
			}
		}
		System.out.println("Ve�culo n�o encontrado!\n");
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}
}
