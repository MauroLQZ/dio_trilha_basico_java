package desafio.iphone;

public class ReprodutorMusical implements IPhone{
    @Override    
	public String getNome() {
		return "Reprodutor Musical: ";
	}

	public String tocar() {
		return ""+getNome()+"tocando musica!";
	}
	public String pausar() {
		return ""+getNome()+"pausando musica!";
	}
	public String selecionarMusica() {
		return ""+getNome()+"selecionando musica!";
	}
}
