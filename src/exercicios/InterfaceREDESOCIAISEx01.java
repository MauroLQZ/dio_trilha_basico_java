package exercicios;

public record InterfaceREDESOCIAISEx01() implements InterfaceMensagemEx01{

	@Override
	public String enviarMensagem(String mensagem) {
		return "REDE SOCIAIS: "+mensagem;
	}

}
