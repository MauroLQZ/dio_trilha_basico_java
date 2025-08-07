package dio_trilha_basico_java.poo.polimorfismo;

public class FacebookMessenger extends ServicoMensagemInstantanea {
	  public void enviarMensagem() {
	//primeiro confirmar se esta conectado a internet
	  validarConectadoInternet();
	    System.out.println("Enviando mensagem pelo Facebook!");
	  }
	  public void receberMensagem() {
	    System.out.println("Recebendo mensagem pelo Facebook!");
	  }  
  }
