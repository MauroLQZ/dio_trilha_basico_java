package exercicios;

import java.util.Scanner;

public class FuncionarioMain {
	private final static Scanner scan = new Scanner(System.in);
	private static Funcionario funcionario = null;
	// private static Funcionario funcionarioGerente = null;
	// private static Funcionario funcionarioVendedor = null;
	// private static Funcionario funcionarioAtendente = null;
	static int option = -1;

	public static void main(String[] args) {
		do {
			System.out.println("Sistema de Vendas:");
			System.out.println("------------------");

			System.out.println("1- Cadastre o Gerente:");
			System.out.println("2- Cadastre o Vendedor:");
			System.out.println("3- Cadastre o Atendente:");
			System.out.println("4- Fazer Login:");
			System.out.println("5- Abrir o caixa:");
			System.out.println("6- Realizar venda:");
			System.out.println("7- Receber pagamentos:");
			System.out.println("8- Consultar vendas:");
			System.out.println("9- Fechar o caixa:");
			System.out.println("10- Gerar Relatório Financeiro:");
			System.out.println("11- Alterar Dados:");
			System.out.println("12- Alterar Senha:");
			System.out.println("13- Fazer Logoff:");
			System.out.println("0- SAIR:");

			option = scan.nextInt();
			switch (option) {
			case 1:// 1- Cadastre o Gerente
				cadastrarGerente();
				break;
			case 2:// 2- Cadastre o Vendedor:
				cadastrarVendedor();
				break;
			case 3:// 3- Cadastre o Atendente:
				cadastrarAtendente();
				break;
			case 4:// 4- Fazer Login:
				System.out.println(fazerLogin());
				break;
			case 5:// 5- Abrir o caixa:
				System.out.println(abrirCaixa());
				break;
			case 6:// 6- Realizar venda:
				System.out.println(fazendoVendas());
				break;
			case 7:// 7- Receber pagamentos:
				System.out.println(receberPagamentos());
				break;
			case 8:// 8- Consultar vendas:
				System.out.println(consultarVendas());
				break;
			case 9:// 9- Fechar o caixa:
				System.out.println(fecharCaixa());
				break;
			case 10:// 10- Gerar Relatório Financeiro:
				System.out.println(gerarRelatorioFinanceiro());
				break;
			case 11:// 11- Alterar Dados:
				System.out.println(alterarDados());
				break;
			case 12:// 12- Alterar Senha
				System.out.println(alterarSenha());
				break;
			case 13:// 13- Fazer Logoff:
				System.out.println(fazerLogoff());
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opcao invalida!");
			}
		} while (true);

	}// FIM main(String[] args)

	protected static void cadastrarGerente() {
		System.out.println("Cadastrando Gerente!");
		System.out.println("---------------------");
		funcionario = new Gerente();
		System.out.println("Informe o nome do Gerente:");
		String nome = scan.nextLine();
		funcionario.setNome(nome);
		scan.nextLine();
		System.out.println("Informe o email:");
		String email = scan.nextLine();
		funcionario.setEmail(email);
		scan.nextLine();
		System.out.println("Informe a Senha:");
		String senha = scan.nextLine();
		funcionario.setSenha(senha);
		scan.nextLine();
		System.out.println("CLASSE: " + funcionario.getClass()+"\n");
	}// FIM cadastrarGerente()

	protected static void cadastrarVendedor() {
		System.out.println("Cadastrando Vendedor!");
		System.out.println("---------------------");
		funcionario = new Vendedor();
		System.out.println("Informe o nome do Vendedor:");
		String nome = scan.nextLine();
		funcionario.setNome(nome);
		scan.nextLine();
		System.out.println("Informe o email:");
		String email = scan.nextLine();
		funcionario.setEmail(email);
		scan.nextLine();
		System.out.println("Informe a Senha:");
		String senha = scan.nextLine();
		funcionario.setSenha(senha);
		scan.nextLine();
		System.out.println("CLASSE: " + funcionario.getClass()+"\n");
	}// FIM cadastrarVendedor()

	protected static void cadastrarAtendente() {
		System.out.println("Cadastrando Atendente!");
		System.out.println("----------------------");
		funcionario = new Atendente();
		System.out.println("Informe o nome do Atendente:");
		String nome = scan.nextLine();
		funcionario.setNome(nome);
		scan.nextLine();
		System.out.println("Informe o email:");
		String email = scan.nextLine();
		funcionario.setEmail(email);
		scan.nextLine();
		System.out.println("Informe a Senha:");
		String senha = scan.nextLine();
		funcionario.setSenha(senha);
		scan.nextLine();
		System.out.println("CLASSE: " + funcionario.getClass()+"\n");
	}// cadastrarAtendente()

	protected static String fazerLogin() {
		String senha = null;
		boolean entrar = false;
		
		System.out.println("Fazendo Login!");
		System.out.println("--------------");
		
		if (funcionario == null)
			return "Tem que instanciar a classe!";
		scan.nextLine();
		System.out.println("Digite a senha:");
		senha = scan.nextLine();
		//scan.close();
		//System.out.println("1-scan.nextLine(): "+scan.nextLine());
		//System.out.println("2- SENHA: "+senha);
		if(senha != null) {
			entrar = funcionario.fazerLogin(senha);
			
			if (entrar) {
				return "LOGIN FEITO!!!!!!!!!!!!!\n";
			} else {
				return "Não foi possivel fazer Login!";
			}			
		}
		return "Valor da senha: "+senha+" nao foi incrementado";		
	}// FIM fazerLogin()

	protected static String abrirCaixa() {
		System.out.println("Abrindo o Caixa!");
		System.out.println("----------------");
		if ((funcionario == null))
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == true) {
			funcionario.setStatusCaixa(true);
			return "Caixa aberto!";
		} else {
			return "Favor, fazer Login!";
		}
	}// FIM abrirCaixa()

	protected static String fazendoVendas() {
		System.out.println("Realizando Vendas!");
		System.out.println("------------------");
		if (funcionario == null)
			return "Tem que instanciar a classe!";
		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";

		System.out.println("Informe valor da venda:");
		double vendaValor = scan.nextDouble();

		if (funcionario.realizarVendas(vendaValor))
			return "Venda Realizada!";
		return "Não foi possivel fazer a venda!";

	}// FIM realizarVendas()

	protected static String receberPagamentos() {
		System.out.println("Recebendo Pagamentos!");
		System.out.println("---------------------");

		if ((funcionario == null))
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";

		if (funcionario.isStatusCaixa() == false)
			return "Favor, abrir o caixa!";

		funcionario.setValorEmCaixa(funcionario.getValorVendas());
		funcionario.setValorVendas(0);
		return "Pagamento Recebido!";
	}// FIM receberPagamentos()

	protected static String consultarVendas() {
		System.out.println("Consultando Vendas!");
		System.out.println("-------------------");
		if ((funcionario == null))
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";

		return "" + funcionario.consultarVendas(funcionario);

	}// FIM consultarVendas()

	protected static String fecharCaixa() {
		System.out.println("Fechando o Caixa!");
		System.out.println("-----------------");
		if (funcionario == null)
			return "Tem que instanciar a classe!";
		if (funcionario.isLogin()) {
			funcionario.setStatusCaixa(false);
			return "Caixa Fechado!";
		} else {
			return "Favor fazer Login!";
		}
		// fecharCaixa();
	}// FIM fecharCaixa()

	protected static String gerarRelatorioFinanceiro() {
		System.out.println("Gerando Relatorio Financeiro!");
		System.out.println("-----------------------------");
		if (funcionario == null)
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";

		return " " + funcionario.gerarRelatorio(funcionario);
	}// FIM gerarRelatorioFinanceiro();

	protected static String alterarDados() {
		System.out.println("Alterando os Dados!");
		System.out.println("-------------------");
		boolean altera = false;
		if (funcionario == null)
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";
		scan.nextLine();
		System.out.println("Digite para alterar:1- Nome / 2- Email");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("Informe o nome/email que vc quer alterar:");
		String nome = scan.nextLine();
		altera = funcionario.alterarDados(num, nome);
		if (altera) {
			return "Dados alterados! ";
		} else {
			return "Não foi possivel alterar dados!";
		}

	}// FIM alterarDados()

	protected static String alterarSenha() {
		System.out.println("Alterando a Senha!");
		System.out.println("------------------");

		if (funcionario == null)
			return "Tem que instanciar a classe!";

		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";
        scan.nextLine();
	
		System.out.println("Informe a senha que vc quer alterar:");
		String senha = scan.nextLine();
		scan.nextLine();
		String altera = funcionario.alterarSenha(senha);
		return altera;
	}// FIM alterarSenha()

	protected static String fazerLogoff() {
		System.out.println("Fazendo Logoff!");
		System.out.println("---------------");
		if (funcionario == null)
			return "Tem que instanciar a classe!";
		
		if (funcionario.isLogin() == false)
			return "Favor, fazer Login!";
		
		funcionario.setLogin(false);
		return "Feito LOGOFF!";
	}// fazerLogof()

}// FIM class FuncionarioMain
