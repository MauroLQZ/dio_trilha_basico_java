package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class InterfaceMainEx02 {
    static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    static double preco = 0;
    static double imposto = 0;
    static String nome = null;
    
	public static void main(String[] args) {
		int option;
		InterfaceImpostoEx2 interfaceImposto = null;

		while (true) {
			System.out.println("Calcular o imposto dos produtos:");
			System.out.println("---------------------------------");
			System.out.println("1- Calcular o imposto dos Alimentos:");
			System.out.println("2- Calcular o imposto da Saude:");
			System.out.println("3- Calcular o imposoto do Vestuario:");
			System.out.println("4- Calcular o imposoto da Cultura:");
			System.out.println("5- Sair do programa:");

			option = scanner.nextInt();

			switch (option) {

			case 1 -> {//Alimentação
				scanner.nextLine();
				System.out.println("Digitar o valor do Alimento para calcular o imposto da Alimentação:");
				preco = scanner.nextDouble();
				interfaceImposto = new InterfaceAlimentacaoEx2("Alimentação");
				imposto = interfaceImposto.calcularImposto(preco);
			}
			case 2 -> {//Saude
				scanner.nextLine();
				System.out.println("Digitar o valor do tratamento da saude para calcular o imposto da Saude:");
				preco = scanner.nextDouble();
				interfaceImposto = new InterfaceSaudeEx2("Saude");
				imposto = interfaceImposto.calcularImposto(preco);
			}
			case 3 -> {//Vestuario
				scanner.nextLine();
				System.out.println("Digitar o valor da Roupa para calcular o imposto do Vestuario:");
				preco = scanner.nextDouble();
				interfaceImposto = new InterfaceVestuarioEx2("Vestuario");
				imposto = interfaceImposto.calcularImposto(preco);
			}
			case 4 -> {//Cultura
				scanner.nextLine();
				System.out.println("Digitar o valor do Evento para calcular o imposto da Cultura:");
				preco = scanner.nextDouble();
				interfaceImposto = new InterfaceVestuarioEx2("Cultura");
				imposto = interfaceImposto.calcularImposto(preco);
			}
			case 5 -> {
				scanner.nextLine();
				System.out.println("Saindo do Programa!");
				System.exit(0);
			}
			default -> {
				System.out.println("Opcao invalida!");
			     continue;
			}
			}// FIM do switch

			System.out.println(""+interfaceImposto.getNome()+": O valor do imposto "+imposto);
		} // FIM Wh

	}
}
