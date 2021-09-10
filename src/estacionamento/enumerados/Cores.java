package estacionamento.enumerados;

public enum Cores {
	
	AMARELO(1),
	AZUL(2),
	BRANCO(3),
	PRATA(4),
	PRETO(5),
	VERDE(6),
	VERMELHO(7),
	OUTRA(8);
	
	private int opcao;

	Cores(int opcaoEscolhida) {
		opcao = opcaoEscolhida;
	}

	public int getOpcao() {
		return opcao;
	}
	
	public static Cores procurarOpcao(int opcao) {
		for(Cores cor : values()) {
            if (cor.getOpcao() == opcao)
                return cor;
        }
        return null;
	}

}
