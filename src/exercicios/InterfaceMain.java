package exercicios;

import java.util.Scanner;

public class InterfaceMain {

	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int option;
        GeometricForm geometricForm;
		while (true) {
			System.out.println("Escolha a forma geometrica para calcular:");
			System.out.println("-----------------------------------------");
			System.out.println("1- Quadrado:");
			System.out.println("2- Retangulo:");
			System.out.println("3- Circulo:");
			System.out.println("4- Sair do programa:");

			option = scanner.nextInt();

			if (option == 1) {
				geometricForm = createSquare();
			} else if (option == 2) {
				geometricForm = createRectangle();
			} else if (option == 3) {
				geometricForm = createCircle();
			} else if (option == 4) {
				break;
			} else {
				System.out.println("Opção Inválida!");
				continue;
			}
            System.out.println("O resultado do calculo da area foi de: "+
			                     +geometricForm.getArea());
		} // FIM do while
	}// FIM do main

	private static GeometricForm createSquare() {
		System.out.println("Informe os tamanho dos lados:");
		var side = scanner.nextDouble();
		return new InterfaceSquare(side);
	}

	private static GeometricForm createRectangle() {
		System.out.println("Informe a base:");
		var base = scanner.nextDouble();
		System.out.println("Informe a altura:");
		var height = scanner.nextDouble();
		return new InterfaceRectangle(height, base);
	}

	private static GeometricForm createCircle() {
		System.out.println("Informe o raio:");
		var radius = scanner.nextDouble();
		return new InterfaceCircle(radius);
	}
}// FIM da classe InterfaceMain
