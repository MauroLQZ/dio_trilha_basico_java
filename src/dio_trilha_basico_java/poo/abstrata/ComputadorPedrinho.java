package dio_trilha_basico_java.poo.abstrata;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		// abrindo MSN Messenger
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();

		FacebookMessenger fcb = new FacebookMessenger();
		fcb.enviarMensagem();
		fcb.receberMensagem();

		Telegram tlg = new Telegram();
		tlg.enviarMensagem();
		tlg.receberMensagem();
	}
}
