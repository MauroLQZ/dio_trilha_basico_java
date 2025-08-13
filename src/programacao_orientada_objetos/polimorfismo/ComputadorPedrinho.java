package programacao_orientada_objetos.polimorfismo;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;
		/* Ñ se sabe qual app,mas qualquer um devera enviar/receber msg */
		String appEscolhido = "tlg";
		if (appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if (appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		if (appEscolhido.equals("tlg"))
			smi = new Telegram();

		smi.enviarMensagem();
		smi.receberMensagem();
	}

}
