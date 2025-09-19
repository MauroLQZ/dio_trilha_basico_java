package exercicios;

public record InterfaceQuadrado(double lado) implements InterfaceGeometria{

	@Override
	public String getNome() {
		return "Quadrado:";
	}

	@Override
	public double calcularArea() {		
		return lado * lado;
	}

}
