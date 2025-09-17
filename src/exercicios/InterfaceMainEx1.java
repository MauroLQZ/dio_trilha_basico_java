package exercicios;

import java.util.Scanner;

public class InterfaceMainEx1 {

	private final static Scanner scanner = new Scanner(System.in);
	private static String mensagem = null;

	public static void main(String[] args) {

		int option;
		InterfaceMensagemEx01 interfaceMensagemEx01 = null;
		while (true) {
			System.out.println("Sistema de Mensagem de Marketing:");
			System.out.println("---------------------------------");
			System.out.println("1- Digite a mensagem:");
			System.out.println("2- Enviar mensagem por SMS:");
			System.out.println("3- Enviar mensagem por E-mail:");
			System.out.println("4- Enviar mensagem por Redes Sociais:");
			System.out.println("5- Sair do programa:");

			option = scanner.nextInt();
            
			if (option == 1) {
				digitarMensagem();
				continue;
			} else if (option == 2) {
				if(mensagem == null) {
					System.out.println("É preciso digitar a mensagem primeiro!");
					continue;
				}
				interfaceMensagemEx01 = enviarMensagemSMS();
			} else if (option == 3) {
				if(mensagem == null) {
					System.out.println("É preciso digitar a mensagem primeiro!");
					continue;
				}
				interfaceMensagemEx01 = enviarMensagemEMAIL();
			} else if (option == 4) {
				if(mensagem == null) {
					System.out.println("É preciso digitar a mensagem primeiro!");
					continue;
				}
				interfaceMensagemEx01 = enviarMensagemREDESSOCIAIS();
			} else if (option == 5) {
				break;
			} else {
				System.out.println("Opção Inválida!");
				continue;
			}
			System.out.println("A mensagem enviada foi: "+
                                    interfaceMensagemEx01.enviarMensagem(mensagem));
		} // FIM do while
	}// FIM do main
    
	private static void digitarMensagem() {
		scanner.nextLine();
		System.out.println("Digitar mensagem para enviar:");
		mensagem = scanner.nextLine();		
	}
	
	private static InterfaceMensagemEx01 enviarMensagemSMS() {
		System.out.println("SMS:");
		return new InterfaceSMSEx01();
	}

	private static InterfaceMensagemEx01 enviarMensagemEMAIL() {
		System.out.println("EMAIL:");
		return new InterfaceEMAILEx01();
	}

	private static InterfaceMensagemEx01 enviarMensagemREDESSOCIAIS() {
		System.out.println("REDES SOCIAIS:");
		return new InterfaceREDESOCIAISEx01();
	}
}// FIM da classe InterfaceMain
