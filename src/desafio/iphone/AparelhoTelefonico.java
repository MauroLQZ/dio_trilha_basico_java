package desafio.iphone;

public class AparelhoTelefonico implements IPhone {
    @Override
	public String getNome() {
		return "Aparelho Telefonico: ";
	} 
    public String ligar() {
    	return ""+getNome()+"fazendo ligação no iPhone!";
    }
    public String atender() {
    	return ""+getNome()+"atendendo ligação no iPhone!";
    }
    public String iniciarCorreioDeVoz() {
    	return ""+getNome()+"iniciando correio de voz no iPhone!";
    }
}
