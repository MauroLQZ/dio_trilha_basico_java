package desafio.iphone;

import java.util.Scanner;

public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static IPhone iphone = null;
	public static int opcao = 0;
	public static String resposta = null;

	public static void main(String[] args) {
		do {
			System.out.println("Utilizando o iPhone:");
			System.out.println("--------------------");
			System.out.println("Escolha um da opções!");
			System.out.println("1- Utilizar o Reprodutor Musical:");
			System.out.println("2- Utilizar o Aparelho Telefonico:");
			System.out.println("3- Utilizar o Navegado Internet:");
			System.out.println("0- SAIR:");
			opcao = scanner.nextInt();

			if (opcao < 0 || opcao > 3) {
				System.out.println("Opção Inválida!");
				continue;
			}
			if (opcao == 0) {
				System.out.println("Saindo do iPhone!");
				break;
			}
			if (opcao == 1)
				iphone = new ReprodutorMusical();
			if (opcao == 2)
				iphone = new AparelhoTelefonico();
			if (opcao == 3)
				iphone = new NavegadorInternet();

			switch (iphone) {

			case ReprodutorMusical reprodutor -> {
				musicaApp(reprodutor);
			}
			case AparelhoTelefonico telefone -> {
				telefoneApp(telefone);
			}
			case NavegadorInternet navegador -> {
				navegadorApp(navegador);
			}
			default -> {
				System.out.println("Saindo do iPhone!");
				break;
			}

			}// FIM switch
		} while (opcao != 0);
	}// FIM do main(){}

	protected static void navegadorApp(NavegadorInternet navegador) {
		int opcaoNavegador = 0;     

		do {
			System.out.println("Navegador Internet:");
			System.out.println("-------------------");
			System.out.println("Escolha a opção:");
			scanner.nextLine();
			System.out.println("1- Exibir Pagina no Navegador:");
			System.out.println("2- Adicionar Nova Aba no Navegador:");
			System.out.println("3- Atualizar Pagina no Navegador:");
			System.out.println("0- SAIR:");
			opcaoNavegador = scanner.nextInt();

			if (opcaoNavegador < 0 || opcaoNavegador > 3) {
				System.out.println("Opção Inválida!");
				continue;
			}
			if (opcaoNavegador == 0) {
				System.out.println("Saindo do Navegador de Internet!\n");
				break;
			}

			switch (opcaoNavegador) {
			case 1 -> {
				System.out.println(navegador.exibirPagina());
			}
			case 2 -> {
				System.out.println(navegador.adicionarNovaAba());
			}
			case 3 -> {
				// resposta = musical.tocar();
				System.out.println(navegador.atualizarPagina());
			}
			default -> {
				System.out.println("\n");
				break;
			}
			}// FIM switch
		} while (opcaoNavegador != 0);
	}// FIM metodo navegadorApp(NavegadorInternet navegador) {

	protected static void telefoneApp(AparelhoTelefonico telefone) {
		int opcaoTelefone = 0;

		do {
			System.out.println("Aparelho Telefonico:");
			System.out.println("-------------------");
			System.out.println("Escolha a opção:");
			scanner.nextLine();
			System.out.println("1- Fazer Ligação:");
			System.out.println("2- Atender o Telefone:");
			System.out.println("3- Iniciar o Correio de Voz:");
			System.out.println("0- SAIR:");
			opcaoTelefone = scanner.nextInt();

			if (opcaoTelefone < 0 || opcaoTelefone > 3) {
				System.out.println("Opção Inválida!");
				continue;
			}
			if (opcaoTelefone == 0) {
				System.out.println("Saindo do Aparelho Telefonico!\n");
				break;
			}

			switch (opcaoTelefone) {
			case 1 -> {
				System.out.println(telefone.ligar());
			}
			case 2 -> {
				System.out.println(telefone.atender());
			}
			case 3 -> {
				// resposta = musical.tocar();
				System.out.println(telefone.iniciarCorreioDeVoz());
			}
			default -> {
				System.out.println("\n");
				break;
			}
			}// FIM switch
		} while (opcaoTelefone != 0);
	}// FIM do metodo telefoneApp(AparelhoTelefonico telefone) {

	protected static void musicaApp(ReprodutorMusical musical) {
		int opcaoMusica = 0;

		do {
			System.out.println("Reprodutor Musical:");
			System.out.println("-------------------");
			System.out.println("Escolha a opção:");
			scanner.nextLine();
			System.out.println("1- Tocar Musica:");
			System.out.println("2- Pausar Musica:");
			System.out.println("3- Selecionar Musica:");
			System.out.println("0- SAIR:");
			opcaoMusica = scanner.nextInt();

			if (opcaoMusica < 0 || opcaoMusica > 3) {
				System.out.println("Opção Inválida!");
				continue;
			}
			if (opcaoMusica == 0) {
				System.out.println("Saindo do Reprodutor Musical!\n");
				break;
			}

			switch (opcaoMusica) {
			case 1 -> {
				System.out.println(musical.tocar());
			}
			case 2 -> {
				System.out.println(musical.pausar());
			}
			case 3 -> {
				// resposta = musical.tocar();
				System.out.println(musical.selecionarMusica());
			}
			default -> {
				System.out.println("\n");
				break;
			}
			}// FIM switch
		} while (opcaoMusica != 0);
	}// FIM musicaApp(ReprodutorMusical musical)
}// FIM classe Main
