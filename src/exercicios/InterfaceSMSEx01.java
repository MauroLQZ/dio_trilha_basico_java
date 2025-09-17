package exercicios;

public record InterfaceSMSEx01() implements InterfaceMensagemEx01 {
	
	@Override
	public String enviarMensagem(String mensagem) {
		return "SMS: "+mensagem;
	}

}
