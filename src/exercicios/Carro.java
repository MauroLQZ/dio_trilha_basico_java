package exercicios;

public class Carro {
	private boolean ligado;
	private int acelerar;
	private int velocidade;
	private String sentido;
	private int marcha;

	// Quando o carro for criado ele deve começar desligado,em ponto morto e
	// velocidade em 0
	public Carro() {
		super();
		this.ligado = false;
		this.velocidade = 0;
		this.marcha = 0;
		this.sentido = "frente";
	}

	// O carro desligado não pode realizar nenhuma função;
	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public int isAcelerar() {
		return this.acelerar;
	}

	public void setAcelerar() {
		this.acelerar++;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setSentido(String sentido) {
		this.sentido = sentido;
	}

	public String getSentido() {
		return this.sentido;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public String ligarCarro() {
		if (this.ligado == false) {
			this.ligado = true;
			this.velocidade++;
			this.marcha++;
			return "Carro ligado!\n";
		} else {
			return "Não foi possivel ligar o carro!\n";
		}
	}
	/*
	 * O carro podera ser desligado se estiver em ponto morto (marcha 0) e sua
	 * velocidade em 0 km - O carro desligado não pode realizar nenhuma função
	 */

	public String desLigarCarro() {
		if (this.ligado == false)
			return "Para desligar o carro, o carro precisa ser ligado primeiro!";
		if (this.marcha != 0)
			return "Para desligar,é preciso colocar o carro em ponto morto(Marcha=0)!\n";
		if (this.velocidade != 0)
			return "Para desligar,a velocidade precisa estar em zero km!\n";

		if (this.ligado == true) {
			this.ligado = false;
			return "Carro desligado\n";
		} else {
			return "O carro não pode ser desligado!\n";
		}
	}// fim metodo desligarCarro()
	/*
	 * O carro só pode virar para esquerda/direita se sua velocidade for de no
	 * mínimo 1km e no máximo 40km;
	 */

	public String direcao(String sentido) {
		if (this.ligado == false)
			return "Tem que ligar o carro para acelerar!";

		while (this.velocidade >= 1 && this.velocidade <= 40) {
			if (sentido.equals("direita")) {
				this.setSentido("direita");
				return "Carro virado para direita!";
			} else if (sentido.equals("esquerda")) {
				this.setSentido("esquerda");
				return "Carro virado para esquerda!";
			} // fim else if
		} // fim while
		return "Não foi possivel virar o carro!";
	}// fim metodo direcao()

	/*
	 * Quando o carro for acelerado ele deve incrementar 1km em sua velocidade(pode
	 * chegar no máximo a 120km); A velocidade do carro deve respeitar os seguintes
	 * limites para cada velocidade se o carro estiver na marcha 0 (ponto morto) ele
	 * não pode acelerar se estiver na 1ª marcha sua velocidade pode estar entre 0km
	 * e 20km se estiver na 2ª marcha sua velocidade pode estar entre 21km e 40km se
	 * estiver na 3ª marcha sua velocidade pode estar entre 41km e 60km se estiver
	 * na 4ª marcha sua velocidade pode estar entre 61km e 80km se estiver na 5ª
	 * marcha sua velocidade pode estar entre 81km e 100km se estiver na 6ª marcha
	 * sua velocidade pode estar entre 101km e 120km
	 */
	public String acelerar() {

		if (this.ligado == false)
			return "Tem que ligar o carro para acelerar!";

		while (this.velocidade <= 120 && (this.marcha >= 1 && this.marcha <= 6)) {
			if (this.marcha == 1 && this.velocidade <= 20) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 2 && (this.velocidade > 20 && this.velocidade <= 40)) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 3 && (this.velocidade > 40 && this.velocidade <= 60)) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 4 && (this.velocidade > 60 && this.velocidade <= 80)) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 5 && (this.velocidade > 80 && this.velocidade <= 100)) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 6 && (this.velocidade > 100 && this.velocidade <= 120)) {
				this.velocidade++;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			}
		} // fim while
		return "Não foi possivel acelerar!";
	}// fim metodo acelerar()

	/*
	 * Quando diminuir a velocidade do carro ele deve decrementar 1 km de sua
	 * velocidade (pode chegar no minimo a 0km);
	 */
	public String desacelerar() {

		if (this.ligado == false)
			return "Tem que ligar o carro para acelerar!";

		while (this.velocidade <= 120 && (this.marcha >= 1 && this.marcha <= 6)) {
			if (this.marcha == 6 && (this.velocidade > 100 && this.velocidade <= 120)) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 5 && (this.velocidade > 80 && this.velocidade <= 100)) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 4 && (this.velocidade > 60 && this.velocidade <= 80)) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 3 && (this.velocidade > 40 && this.velocidade <= 60)) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 2 && (this.velocidade > 20 && this.velocidade <= 40)) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} else if (this.marcha == 1 && this.velocidade <= 20) {
				this.velocidade--;
				return "Marcha:" + this.marcha + " - Velocidade:" + this.velocidade;
			} // fim if
		} // fim while
		return "Não foi possivel desacelerar!";
	}// fim metodo desacelerar()

	public int verificarVelocidade() {
		if (this.ligado == false)
			return 0;
		return this.getVelocidade();
	}

	/*
	 * carro deve possuir 6 marchas, não deve ser permitido pular uma marcha no
	 * carro;
	 */
	public String trocarMarcha(int marcha) {
		
		if (this.ligado == false)
			return "Tem que ligar o carro para trocar a marcha!";

			if (marcha == 1) {
				this.setVelocidade(20);
				return "Marcha trocada para:"+marcha+" - velocidade:" + this.getVelocidade();
			} else if (marcha == 2) {
				this.setVelocidade(30);
				return "Marcha trocada para:"+marcha+" - velocidade:" + this.getVelocidade();
			} else if (marcha == 3) {
				this.setVelocidade(50);
				return "Marcha trocada para:"+marcha+" - velocidade:" + this.getVelocidade();
			} else if (marcha == 4) {
				this.setVelocidade(70);
				return "Marcha trocada para:" +marcha+" - velocidade:" + this.getVelocidade();
			} else if (marcha == 5) {
				this.setVelocidade(80);
				return "Marcha trocada para:" +marcha+" - velocidade:" + this.getVelocidade();
			} else if (marcha == 6) {
				this.setVelocidade(100);
				return "Marcha trocada para:" +marcha+" - velocidade:" + this.getVelocidade();
			}
		return "Marcha inválida!";
	}// fim metodo trocarMarcha()

}// fim classe Carro
