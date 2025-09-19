package exercicios;

public record InterfaceRetangulo(double base, double altura) implements InterfaceGeometria{
	@Override
	public String getNome() {
		return "Retangulo:";
	}

	@Override
	public double calcularArea() {		
		return base * altura;
	}
}
