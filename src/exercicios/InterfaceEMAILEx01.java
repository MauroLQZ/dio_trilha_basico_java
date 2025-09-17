package exercicios;

public record InterfaceEMAILEx01() implements InterfaceMensagemEx01{

	@Override
	public String enviarMensagem(String mensagem) {
		return "EMAIL: "+mensagem;
	}

}
