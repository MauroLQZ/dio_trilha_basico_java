package exercicios;

public record InterfaceRectangle(double height, double base) implements GeometricForm {

	@Override
	public double getArea() {
		return height * base;
	}

}
