package dio_trilha_basico_java.poo.abstrata;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
		// primeiro confirmar se esta conectado a internet
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook!");
		// depois de enviada,salva o histórico da msg
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook!");
	}

	private void validarConectadoInternet() {
		System.out.println("Validando se esta Conectado a Internet!");
	}

	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o Histórico de  mensagens do Facebook!");
	}

}
