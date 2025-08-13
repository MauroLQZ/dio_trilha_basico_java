package programacao_orientada_objetos.polimorfismo;

public class MSNMessenger extends ServicoMensagemInstantanea {
	   public void enviarMensagem() {
	     //primeiro confirmar se esta conectado a internet
	     validarConectadoInternet();
	     System.out.println("Enviando mensagem pelo Messenger!");
	   }
	   public void receberMensagem() {
	     System.out.println("Recebendo mensagem pelo Messenger!");
	   }
 }
	
