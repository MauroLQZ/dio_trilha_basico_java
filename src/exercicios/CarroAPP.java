package exercicios;

import java.util.Scanner;

/**Escreva um código onde controlamos as funções de um carro, ele deve ter as seguintes 
 * funções: O carro desligado não pode realizar nenhuma função;     */
public class CarroAPP {
	
		private final static Scanner scanner = new Scanner(System.in);
		private static Carro carroApp = null;
		static int option = -1;
		 
		public static void main(String[] args) {
			do {
				System.out.println("Carro:");
				System.out.println("================");
				System.out.println("Selecione uma das Opções:");
				System.out.println("-------------------------");
				System.out.println("1- Ligar o carro.");
				System.out.println("2- Desligar o carro.");
				System.out.println("3- Acelerar.");
				System.out.println("4- Diminuir velocidade.");
				System.out.println("5- Virar o carro.");
				System.out.println("6- Verificar velocidade.");
				System.out.println("7- Trocar a marcha.");
				System.out.println("8- Informação do carro!");
				System.out.println("0- SAIR.");
				option = scanner.nextInt();

				switch (option) {
				case 1:// 1- Ligar o carro.
				    System.out.println(ligarCarro());
					break;
				case 2:// 2- Desligar o carro.
				    System.out.println(desligarCarro());
					break;
				case 3:// 3- Acelerar.
					System.out.println(acelerarCarro());
					break;
				case 4:// 4- Diminuir velocidade.
					System.out.println(desAcelerarCarro());
					break;
				case 5:// 5- Virar o carro.
					System.out.println(mudarDirecaoCarro());
					break;
				case 6:// 6- Verificar velocidade..
					System.out.println(verificarVelocidade());
					break;
				case 7:// 7- Trocar a marcha.
					System.out.println(trocandoMarcha());
					break;
				case 8:// 8- Informação do carro.
					System.out.println(infoCarro());
					break;
				case 0:
					// sai do aplicativo
					System.exit(0);
				default:
					System.out.println("Opcao invalida!");
				}
			} while (true);
		}
		private static String infoCarro() {
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			String info = "Carro ligado: "+carroApp.isLigado()+
					" - Velocidade: "+carroApp.getVelocidade()+
					" - Marcha: "+carroApp.getMarcha()+
					" - Sentido: "+carroApp.getSentido();
			return info;				      
		}
		private static String trocandoMarcha() {
			String marchaTrocada;
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			Scanner scan = new Scanner(System.in);
			System.out.println("Para qual marcha vc quer mudar(1 a 6)?");
			int marcha = scan.nextInt();
			marchaTrocada = carroApp.trocarMarcha(marcha);
			return marchaTrocada;
		}
		private static String verificarVelocidade() {
			if(carroApp == null) 
				return "O carro não foi instanciado!";
		     return "A velocidade do carro é: "+carroApp.getVelocidade();
		}
        // O carro só pode virar para esquerda/direita se sua velocidade for de no
		// mínimo 1km e no máximo 40km;
		private static String mudarDirecaoCarro() {
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			if(carroApp.getVelocidade() < 1 && carroApp.getVelocidade() > 40)
				return "Para mudar a direção do carro a velocidade tem que ser "
						+ "entre 1km e 40km";
			Scanner scan = new Scanner(System.in);
			System.out.println("Qual direcao vc quer esquerda/direita?");
			String direcao = scan.nextLine();
			String mudaDirecao = carroApp.direcao(direcao);
			return mudaDirecao;
		}

		private static String desAcelerarCarro() {
			String desacelera;
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			desacelera = carroApp.desacelerar();
			return desacelera;
		}

		private static String acelerarCarro() {
			String aceleraCarro;
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			aceleraCarro = carroApp.acelerar();
			return aceleraCarro;
		}

		private static String desligarCarro() {
			String desligaCarro;
			if(carroApp == null) 
				return "O carro não foi instanciado!";
			desligaCarro = carroApp.desLigarCarro();
			return desligaCarro;
		}

		private static String ligarCarro() {
			String ligarCarro;
			if(carroApp == null) 
				carroApp = new Carro();
			ligarCarro = carroApp.ligarCarro();
			return ligarCarro;
		}//fim metodo ligarCarro()

	}

