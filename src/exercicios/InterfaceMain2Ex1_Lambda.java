package exercicios;

import java.util.Scanner;

public class InterfaceMain2Ex1_Lambda {

	private final static Scanner scanner = new Scanner(System.in);
	private static String mensagem = null;

	public static void main(String[] args) {
		int option;
		InterfaceMensagemEx01 interfaceMensagemEx01 = null;

		while (true) {
			System.out.println("Sistema de Mensagem de Marketing:");
			System.out.println("---------------------------------");
			System.out.println("1- Enviar mensagem por SMS:");
			System.out.println("2- Enviar mensagem por E-mail:");
			System.out.println("3- Enviar mensagem por Redes Sociais:");
			System.out.println("4- Sair do programa:");

			option = scanner.nextInt();

			switch (option) {

			case 1 -> {
				scanner.nextLine();
				System.out.println("Digitar mensagem para enviar por SMS:");
				mensagem = scanner.nextLine();
				interfaceMensagemEx01 = new InterfaceSMSEx01();
				interfaceMensagemEx01.enviarMensagem(mensagem);
			}
			case 2 -> {
				scanner.nextLine();
				System.out.println("Digitar mensagem para enviar por SMS:");
				mensagem = scanner.nextLine();
				interfaceMensagemEx01 = new InterfaceEMAILEx01();
				interfaceMensagemEx01.enviarMensagem(mensagem);
			}
			case 3 -> {
				scanner.nextLine();
				System.out.println("Digitar mensagem para enviar por SMS:");
				mensagem = scanner.nextLine();
				interfaceMensagemEx01 = new InterfaceREDESOCIAISEx01();
				interfaceMensagemEx01.enviarMensagem(mensagem);
			}
			case 4 -> {
				scanner.nextLine();
				System.out.println("Saindo do Programa!");
				System.exit(0);
			}
			default -> System.out.println("Opcao invalida!");
			}// FIM do switch

			System.out.println("A mensagem enviada foi: " + interfaceMensagemEx01.enviarMensagem(mensagem));
		} // FIM While
	}// FIM main
}// FIM Classe MAIN
