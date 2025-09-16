package exercicios;

public record InterfaceSquare(double side) implements GeometricForm{

	@Override
	public double getArea() {
		return side * side;
	}

}
