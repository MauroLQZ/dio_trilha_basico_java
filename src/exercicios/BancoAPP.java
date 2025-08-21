package exercicios;

import java.util.Scanner;

/**
 * A conta bancária deve ter um limite de cheque especial somado ao saldo da
 * conta; O valor do cheque especial é definido no momento da criação da conta,
 * de acordo com o valor depositado na conta em sua criação; Se o valor
 * depositado na criação da conta for de R$500,00 ou menos o cheque especial
 * deve ser de R$50,00 Para valores acima de R$500,00 o cheque especial deve ser
 * de 50% do valor depositado; Caso o limite de cheque especial seja usado,
 * assim que possível a conta deve cobrar uma taxa de 20% do valor usado do
 * cheque especial.
 */
public class BancoAPP {

	private final static Scanner scanner = new Scanner(System.in);
	private static Banco bancoApp;
	private static final Cliente cliente = new Cliente();
	private static int cpfCliente = 0;
	private static double valorDeposito = 0.0;
	static int option = -1;

	public static void main(String[] args) {
		do {
			System.out.println("Banco Progresso:");
			System.out.println("================");
			System.out.println("Selecione uma das Opções:");
			System.out.println("-------------------------");
			System.out.println("1- Criar uma Conta.");
			System.out.println("2- Consultar saldo.");
			System.out.println("3- Consultar cheque especial.");
			System.out.println("4- Depositar dinheiro.");
			System.out.println("5- Sacar dinheiro.");
			System.out.println("6- Pagar um boleto.");
			System.out.println("7- Verificar se a conta está usando cheque especial.");
			System.out.println("8- Informação da Conta.");
			System.out.println("0- SAIR.");
			option = scanner.nextInt();

			switch (option) {
			case 1:// 1- Criar uma Conta.
				criaContaBanco();
				break;
			case 2:// 2- Consultar saldo.
				consultarSaldoConta();
				break;
			case 3:// Consultar cheque especial
				consultaChequeEspecial();
				break;
			case 4:// 4- Depositar dinheiro
				depositaNaConta();
				break;
			case 5:// 5- Sacar dinheiro.
				sacaNaConta();
				break;
			case 6:// 6- Pagar um boleto.
				pagamentoDoBoleto();
				break;
			case 7:// 7- Verificar se a conta está usando cheque especial.
				if (bancoApp == null) {
					System.out.println("Para verificar cheque especial,é necessário criar uma conta primeiro!\n");
					break;
				} else {
					System.out.println(bancoApp.verificaTaxaChequeEspecial());
					break;
				}
			case 8:
				if (bancoApp == null) {
					System.out.println("Para informações da conta,é necessário criar uma conta primeiro!\n");
					break;
				} else {
					InformacaoDaConta();
					break;
				}
			case 0:
				// sai do aplicativo
				System.exit(0);
			default:
				System.out.println("Opcao invalida!");
			}
		} while (true);
	}

	private static void pagamentoDoBoleto() {
		if (bancoApp == null) {
			System.out.println("Para pagar boleto,é necessário criar uma conta primeiro!\n");
			return;
		} else {
			System.out.println("Informe o valor para pagar boleto:");
			double valorBoleto = scanner.nextDouble();
			bancoApp.pagarBoleto(valorBoleto);
			return;
		}
	}

	private static void sacaNaConta() {
		if (bancoApp == null) {
			System.out.println("Para sacar,é necessário criar uma conta primeiro!\n");
			return;
		} else {
			System.out.println("Informe o valor para sacar:");
			double valor = scanner.nextDouble();
			bancoApp.saca(valor);
			return;
		}
	}

	private static void depositaNaConta() {
		if (bancoApp == null) {
			System.out.println("Para depositar,é necessário criar uma conta primeiro!\n");
			return;
		} else {
			System.out.println("Informe o valor para depositar:");
			double valor = scanner.nextDouble();
			bancoApp.deposita(valor);
			return;
		}
	}

	private static void consultaChequeEspecial() {
		if (bancoApp == null) {
			System.out.println("Para consultar chque especial,é necessário criar uma conta primeiro!\n");
			return;
		} else {
			System.out.println("Saldo da conta NOME: " + bancoApp.getCliente().getNome());
			System.out.println("O valor do cheque especial: " + bancoApp.getChequeEspecial());
			return;
		}

	}

	private static void consultarSaldoConta() {
		if (bancoApp == null) {
			System.out.println("Para consultar saldo da conta,é necessário criar uma conta primeiro!\n");
			return;
		} else {
			System.out.println("Saldo da conta NOME: " + bancoApp.getCliente().getNome());
			System.out.println("O saldo da conta: " + bancoApp.getSaldo());
			return;
		}
	}

	private static void InformacaoDaConta() {
		// System.out.println(bancoApp.infoConta());
		System.out.println(bancoApp.toString());
		System.out.println("\n");
	}

	/*
	 * Para evitar isso, você pode consumir a quebra de linha com scanner.nextLine()
	 * após a leitura do inteiro. Ou, em muitos casos, é preferível usar nextLine()
	 * para todo o processamento de entrada, convertendo as strings para os tipos de
	 * dados desejados usando métodos como Integer.parseInt(), Double.parseDouble(),
	 * etc.
	 */
	private static void criaContaBanco() {
		
		/*while(nomeCliente == null || nomeCliente.isEmpty()) {
			System.out.println("Informe o nome do Cliente:");
			nomeCliente = scanner.nextLine();
		}*/	
		Scanner scan = new Scanner(System.in);
		System.out.println("Informe o nome do Cliente:");
		String nomeCliente = scan.nextLine();
		//scanner.nextLine();
		cliente.setNome(nomeCliente);
		
		System.out.println("*********Nome do cliente: "+nomeCliente);
		System.out.println("Informe CPF do cliente:");
		cpfCliente = scan.nextInt();
		cliente.setCpf(cpfCliente);
		
		System.out.println("Nome Cliente: "+cliente.getNome());
		System.out.println("CPF Cliente: "+cliente.getCpf());
		System.out.println("ID Cliente: "+cliente.getIdCliente());
		System.out.println("-------------------------------------------\n");
		
		System.out.println("Informe o valor do primeiro deposito:");
		valorDeposito = scan.nextDouble();
		
		bancoApp = new Banco(cliente, valorDeposito);
		System.out.println("********** Nome nomeCliente: "+nomeCliente);
		System.out.println();
	}
}
