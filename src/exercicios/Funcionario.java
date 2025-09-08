package exercicios;

public sealed abstract class Funcionario permits Gerente, Vendedor, Atendente {

	private String nome;
	private String email;
	private String senha;
	private boolean login;
	private boolean administrador;
	protected static double valorVendas;
	protected static int quantidadeVendas;
	protected static double valorEmCaixa;
	protected static boolean statusCaixa;

	public abstract boolean fazerLogin(String senha);

	protected abstract String consultarVendas(Funcionario funcionario);
	
	public abstract String fazerLogoff();

	public abstract boolean alterarDados(int num, String dado);

	public abstract String alterarSenha(String senha);
	
	protected boolean realizarVendas(double valor) {
		//Funcionario.setValorVendas(valor);
		//Funcionario.setQuantidadeVendas(getQuantidadeVendas() + 1);
		return false;
	}

	protected String gerarRelatorio(Funcionario funcionario) {
	    return "";	
	}
	
	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
	}
	public static boolean isStatusCaixa() {
		return statusCaixa;
	}

	public static void setStatusCaixa(boolean statusCaixa) {
		Funcionario.statusCaixa = statusCaixa;
	}
	public static double getValorVendas() {
		return valorVendas;
	}

	public static void setValorVendas(double valorVendas) {
		Funcionario.valorVendas = valorVendas;
	}

	public static int getQuantidadeVendas() {
		return quantidadeVendas;
	}

	public static void setQuantidadeVendas(int quantidadeVendas) {
		Funcionario.quantidadeVendas = quantidadeVendas;
	}

	public static double getValorEmCaixa() {
		return valorEmCaixa;
	}

	public static void setValorEmCaixa(double valorEmCaixa) {
		Funcionario.valorEmCaixa += valorEmCaixa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAdministrador() {
		return administrador;
	}

	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

}
