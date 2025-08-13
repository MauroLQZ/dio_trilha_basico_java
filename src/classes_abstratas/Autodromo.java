package classes_abstratas;

public class Autodromo {
	public static void main(String[] args) {
		  Carro jeep = new Carro();
		  jeep.setChassi("897897");
		  jeep.ligar();

		  Moto z400 = new Moto();
		  z400.setChassi("477754");
		  z400.ligar();
		  
		  Veiculo coringa = jeep;
		  coringa.ligar();
		  Veiculo coringa2 = z400;
		  coringa2.ligar();
	  }

}
