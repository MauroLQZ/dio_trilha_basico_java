package exercicios;

public record InterfaceCirculo(double raio) implements InterfaceGeometria{
	@Override
	public String getNome() {
		return "Circulo:";
	}

	@Override
	public double calcularArea() {		
		return 3.14159 * (raio * raio);
	}

}
