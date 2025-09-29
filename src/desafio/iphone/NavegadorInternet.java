package desafio.iphone;

public class NavegadorInternet implements IPhone{
	@Override
	public String getNome() {
		return "Navegador Internet: ";
	} 
	public String exibirPagina() {
		return ""+getNome()+"exibindo pagina no navegador internet!!";
	}
	public String adicionarNovaAba() {
		return ""+getNome()+"adicionando nova aba!";
	}
	public String atualizarPagina() {
		return ""+getNome()+"atualizando pagina!";
	}
	
}
