package exercicios;

public record InterfaceAlimentacaoEx2(String nome) implements InterfaceImpostoEx2{

	@Override
	public double calcularImposto(double preco) {
		
		return preco * 0.01;
	}

	@Override
	public String getNome() {
		return nome;
	}

}
