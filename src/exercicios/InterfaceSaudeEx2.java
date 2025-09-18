package exercicios;

public record InterfaceSaudeEx2(String nome) implements InterfaceImpostoEx2{

	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public double calcularImposto(double preco) {
		
		return preco * 0.015;
	}

}
