package estacionamento.servicos.editores;

import java.util.List;
import java.util.Scanner;

import estacionamento.entidades.Veiculo;
import estacionamento.enumerados.Marcas;
import estacionamento.enumerados.TiposDeVeiculos;

public class EditorDeVeiculo {

	Scanner sev = new Scanner(System.in);

	public void editarVeiculo(List<Veiculo> lista, String placaDoVeculo) {
		for (Veiculo v : lista) {
			if (placaDoVeculo.equals(v.getPlacaDoVeiculo())) {	
				System.out.println("\nVeículo encontrado!\n");
				System.out.println(v);
				
				String respostaEditor;
				do {
					System.out.print("\nTem certeza que deseja editar os dados do veículo (s/n): ");
					respostaEditor = sev.nextLine();
				} while(!respostaEditor.equalsIgnoreCase("s") && !respostaEditor.equalsIgnoreCase("n"));
				
				if (respostaEditor.equalsIgnoreCase("s")) {
					System.out.print("Tipo: "
							+ "\n	1  - Carro"
							+ "\n	2  - Moto"
							+ "\n	3  - Onibus"
							+ "\n	4  - Van"
							+ "\nInforme a opção: ");
					int novoTipo = sev.nextInt();
					System.out.print("Nova placa: ");
					String novoPlaca = sev.next();
					System.out.print("Marca: "
							+ "\n	1  - Audi"
							+ "\n	2  - BMW"
							+ "\n	3  - Chevrolet"
							+ "\n	4  - Citroen"
							+ "\n	5  - FIAT"
							+ "\n	6  - Ford"
							+ "\n	7  - Hyundai"
							+ "\n	8  - Honda"
							+ "\n	9  - Jaguar"
							+ "\n	10 - Land Rover"
							+ "\n	11 - Peugeot"
							+ "\n	12 - Toyota"
							+ "\n	13 - Volkswagen"
							+ "\n	14 - Volvo"
							+ "\n	15 - Outro"
							+ "\nInforme a opção: ");
					int novaMarca = sev.nextInt();
					v.setTipo(TiposDeVeiculos.procurarOpcao(novoTipo));
					v.setPlacaDoVeiculo(novoPlaca);
					v.setMarca(Marcas.procurarOpcao(novaMarca));
					String respostaEditorDono;
					do {
						System.out.print("Deseja editar os dados pessoais do dono (s/n): ");
						respostaEditorDono = sev.next();
					} while(!respostaEditorDono.equalsIgnoreCase("s") && !respostaEditorDono.equalsIgnoreCase("n"));
					
					if (respostaEditorDono.equalsIgnoreCase("s")) {
						EditorDePessoa edp = new EditorDePessoa();
						edp.editarPessoa(v);
						System.out.println("Dados do veículo e do dono editados!");
						return;
					}
					if (respostaEditorDono.equalsIgnoreCase("n")) {
						System.out.println("Dados do veículo editados!");
						return;
					}	
				}
				if (respostaEditor.equalsIgnoreCase("n")) {
					return;
				}	
			}
			System.out.println("Veículo não encontrado!");
		}
	}
}

