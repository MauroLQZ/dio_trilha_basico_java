package exercicios;

public record InterfaceCircle(double radius) implements GeometricForm{
	private static final double pi = 3.14;

	@Override
	public double getArea() {
		return pi * (radius * radius);
	}

}
