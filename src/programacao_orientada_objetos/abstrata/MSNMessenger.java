package programacao_orientada_objetos.abstrata;

public class MSNMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		// primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Messenger!");
		// depois de enviada,salva o histórico da msg
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Messenger!");
	}

	private void validarConectadoInternet() {
		System.out.println("Validando se esta Conectado a Internet!");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o Histórico de  mensagens!");
	}

}
