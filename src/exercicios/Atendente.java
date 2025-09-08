package exercicios;

/*Classe Atendente que terá os seguintes atributos: Nome, Email, Senha, Valor em caixa e um 
 * atributo que informa se ele é administrador, esse ultimo deve ser sempre falso*/
public non-sealed class Atendente extends Funcionario{
	private static boolean statusCaixa;
	
	public Atendente() {
		super();
		this.setAdministrador(false);
		this.setLogin(false);
		this.setStatusCaixa(false);
	}
/* A classe Atendente deve ter os métodos Receber pagamentos (onde o método recebe um valor que
 *  deve ser incrementado no valor em caixa), Fechar o caixa, 
 *  (Realizar Login, Realizar logoff, alterar dados e alterar senha;)*/
	public void receberPagamentos(double valor) {
		Funcionario.setValorEmCaixa(valor);
	}
    public void abrirCaixa() {
    	setStatusCaixa(true);
    }
	public void fecharCaixa() {
		setStatusCaixa(false);
	}
	public static boolean isStatusCaixa() {
		return statusCaixa;
	}

	public static void setStatusCaixa(boolean statusCaixa) {
		Atendente.statusCaixa = statusCaixa;
	}
	
	@Override
	public boolean fazerLogin(String senha) {
		System.out.println("Atendente: this.getSenha(): "+this.getSenha());
		System.out.println("**************** senha: "+senha);
		System.out.println("this.getSenha() == senha: "+(this.getSenha() == senha));
		System.out.println("this.getSenha().equals(senha): "+this.getSenha().equals(senha));
		if(this.getSenha().equals(senha)) {
			this.setLogin(true);
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public String fazerLogoff() {
		if(this.isLogin() == true) {
			this.setLogin(false);
		    return "Logoff feito!";
		}
		return "Não foi possivel fazer Logoff!";
	}

	@Override
	public boolean alterarDados(int num, String dado) {
		if(num == 1) {
			this.setNome(dado);
			return true;
		}else if(num == 2) {
			this.setEmail(dado);
			return true;
		}
		return false;
	}

	@Override
	public String alterarSenha(String senha) {
		if(this.getSenha().equals(senha))
			return "Senha igual!Não foi possivel alterar.";
		this.setSenha(senha);
		return "Senha alterada!";
	}
	@Override
	protected String consultarVendas(Funcionario funcionario) {
		// TODO Auto-generated method stub
		return null;
	}
}
