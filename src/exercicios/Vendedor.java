package exercicios;

/*Classe Vendedor que terá os seguintes atributos: Nome, Email, Senha, Quantidade de vendas e 
 * um atributo que informa se ele é administrador, esse útimo deve ser sempre falso*/
public non-sealed class Vendedor extends Funcionario {
	
	public Vendedor() {
		super();
		this.setAdministrador(false);
		this.setLogin(false);
	}
/* A classe Vendedor deve ter métodos Realizar venda(incrementar nº d/vendas quando acionado),
 * Consultar vendas, (Realizar login, Realizar logoff, alterar dados, alterar senha;)*/	
	@Override
	public boolean realizarVendas(double valor) {
		if(valor != 0) {
			Funcionario.setValorVendas(valor);
			Funcionario.setQuantidadeVendas(getQuantidadeVendas() + 1);
			return true;
		}else {
			return false;
		}
	}
	@Override
	protected String consultarVendas(Funcionario funcionario) {
		return "Valor das Vendas: "+Funcionario.getValorVendas()+
				"\nValor das Vendas em Caixa: "+Funcionario.getValorEmCaixa()+
				"\nQuantidade de Vendas: "+Funcionario.getQuantidadeVendas();
	}
	
	@Override
	public boolean fazerLogin(String senha) {
		//System.out.println("\nVendedor: this.getSenha(): "+this.getSenha());
		//System.out.println("**************** senha: "+senha);
		//System.out.println("this.getSenha() == senha: "+(this.getSenha() == senha));
		//System.out.println("this.getSenha().equals(senha): "+this.getSenha().equals(senha));
		if(this.getSenha().equals(senha)) {
			this.setLogin(true);
			System.out.println();
			return true;
		}else {
			System.out.println("VENDEDOR:(this.getSenha().equals(senha): "+
					this.getSenha().equals(senha));
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
	
}
