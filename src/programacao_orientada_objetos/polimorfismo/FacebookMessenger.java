package programacao_orientada_objetos.polimorfismo;

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
