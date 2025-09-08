package exercicios;

/*Classe Gerente que terá os atributos: Nome, Email, Senha e um atributo que informa se ele é 
 * administrador, esse último deve ser sempre verdadeiro; */
public non-sealed class Gerente extends Funcionario {
	
	public Gerente() {
		this.setAdministrador(true);
		this.setLogin(false);
	}
	/* A classe Gerente deve ter os métodos Gerar relatório financeiro, Consultar vendas, 
	 * (Realizar login, Realizar logff, alterar dados, alterar senha;):abstract*/
	
	@Override
	protected String gerarRelatorio(Funcionario funcionario) {
		System.out.println("Gerando Relatorio:");
		System.out.println("------------------");
		return "Valor das Vendas: "+Funcionario.getValorVendas()+
				"\nValor das Vendas em Caixa: "+Funcionario.getValorEmCaixa()+
				"\nQuantidade de Vendas: "+Funcionario.getQuantidadeVendas()+"\n";
	}

	@Override
	protected String consultarVendas(Funcionario funcionario) {
		return "Valor das Vendas: "+Funcionario.getValorVendas()+
				"\nValor das Vendas em Caixa: "+Funcionario.getValorEmCaixa()+
				"\nQuantidade de Vendas: "+Funcionario.getQuantidadeVendas()+"\n";
	}
	
	@Override
	public boolean fazerLogin(String senha) {
		System.out.println("Gerente: this.getSenha(): "+this.getSenha());
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
			System.out.println("O nome: "+this.getNome()+" alterado!");
			return true;
		}else if(num == 2) {
			this.setEmail(dado);
			System.out.println("O email: "+this.getEmail()+" alterado!");
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
	
}
