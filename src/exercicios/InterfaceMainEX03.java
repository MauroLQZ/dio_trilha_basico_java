package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class InterfaceMainEX03 {
	static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
	static double lado = 0;
	static double base = 0;
	static double altura = 0;
	static double raio = 0;
	static double area = 0;

	public static void main(String[] args) {
		int option;
		InterfaceGeometria geometria = null;

		while (true) {
			System.out.println("Calcular a area geometrica:");
			System.out.println("---------------------------");
			System.out.println("1- Calcular a area do Quadrado:");
			System.out.println("2- Calcular a area do Retangulo:");
			System.out.println("3- Calcular a area do Circulo:");
			System.out.println("4- Sair do programa:");

			option = scanner.nextInt();

			switch (option) {

			case 1 -> {// Quadrado
				scanner.nextLine();
				System.out.println("Digitar o valor do lado:");
				lado = scanner.nextDouble();
				geometria = new InterfaceQuadrado(lado);
				area = geometria.calcularArea();
			}
			case 2 -> {// Retangulo
				scanner.nextLine();
				System.out.println("Digitar o valor da base:");
				base = scanner.nextDouble();
				System.out.println("Digitar o valor da altura:");
				altura = scanner.nextDouble();
				geometria = new InterfaceRetangulo(base, altura);
				area = geometria.calcularArea();
			}
			case 3 -> {// Circulo
				scanner.nextLine();
				System.out.println("Digitar o valor do raio:");
				raio = scanner.nextDouble();
				geometria = new InterfaceCirculo(raio);
				area = geometria.calcularArea();
			}
			case 4 -> {
				scanner.nextLine();
				System.out.println("Saindo do Programa!");
				System.exit(0);
			}
			default -> {
				System.out.println("Opcao invalida!");
				continue;
			}
			}// FIM do switch
			System.out.println("" + geometria.getNome() + " O valor da area: " + area);
		} // FIM Wh
	}
}
