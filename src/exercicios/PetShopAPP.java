package exercicios;

import java.util.Scanner;

public class PetShopAPP {

	private final static Scanner scanner = new Scanner(System.in);
	private final static PetShop petShop = new PetShop();
	static int option = -1;

	public static void main(String[] args) {
		do {
			System.out.println("Programa de banho do PetShop:");
			System.out.println("=============================");
			System.out.println("Selecione uma das Opções:");
			System.out.println("-------------------------");
			System.out.println("1- Dar banho no pet.");
			System.out.println("2- Abastecer a maquina com água.");
			System.out.println("3- Abastecer a maquina com shampoo.");
			System.out.println("4- Verificar nivel de água da maquina.");
			System.out.println("5- Verificar nivel de shampoo da maquina.");
			System.out.println("6- Verificar se tem pet no banho.");
			System.out.println("7- Colocar pet na maquina.");
			System.out.println("8- Retirar pet da máquina.");
			System.out.println("9- Limpar a maquina.");
			System.out.println("0- SAIR.");
			option = scanner.nextInt();

			switch (option) {
			case 1://Dar banho no pet
				//chama metodo da classe PetShop p/dar banho no pet
				petShop.takeAShower();
				break;
			case 2:
				//chama o metodo na classe Main p/add agua
				setWater();
				break;
			case 3:
				//chama o metodo na classe Main p/add shampoo
				setShampoo();
				break;
			case 4:
				//chama o metodo na classe Main
				//Verificar nivel de água da maquina
				verifyWater();
				break;
			case 5:
				//chama o metodo na classe Main
				//Verificar nivel de água da maquina
				verifyShampoo();
				break;
			case 6:
				//chama o metodo na classe Main
				//Verificar se tem pet no banho
				checkIfHasPetInMachine();
				break;
			case 7:
				//chama o metodo na classe Main
				//Verificar se tem pet na maquina
				setPetInPetMachine();
				break;
			case 8:
				//Retirar pet da máquina
				//chama metodo da classe PetShop p/remover pet da maquina
				petShop.removePet();
				
				break;
			case 9:
				//chama metodo da classe PetShop p/limpar a maquina
				petShop.wash();
				break;
			case 0:
				//sai do aplicativo
				System.exit(0);
			default:
				System.out.println("Opcao invalida!");
			}
		} while (true);
	}
    //metodo chamado na classe da aplicação(PetShopAPP)
	private static void setWater() {
		System.out.println("Tentando colocar agua na maquina!");
		//Metodo p/add agua chamada da classe PetShop
		petShop.addWater();
	}
	//metodo chamado na classe da aplicação(PetShopAPP)
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na maquina!");
		//Metodo p/add shampoo chamada da classe PetShop
		petShop.addShampoo();
	}
	//metodo chamado na classe da aplicação(PetShopAPP)
	private static void verifyWater() {
		//metodo da classe PetShop q/retorna qtde de agua da maquina
		int amount = petShop.getWater();
		System.out.println("A maquina esta com " + amount + " litro(s) de agua!");
	}
	//metodo chamado na classe da aplicação(PetShopAPP)
	private static void verifyShampoo() {
		//metodo da classe PetShop q/retorna qtde de agua da maquina
		var amount = petShop.getShampoo();
		System.out.println("A maquina esta com " + amount + " litro(s) de shampoo!");
	}

	private static void checkIfHasPetInMachine() {
		//metodo chamado na classe da aplicação(PetShopAPP)
		//Verificar se tem pet no banho
		var hasPet = petShop.hasPet();
		System.out.println(hasPet ? "Tem pet na maquina!" : "Nao tem pet na maquina!");
	}
	//Verificar se tem pet na maquina
	public static void setPetInPetMachine() {
		var name = "";
		//Força a digitar o nome do pet.
		while (name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet:");
			name = scanner.nextLine();
		}
		//Instancia um novo pet
		Pet pet = new Pet(name);
		//metodo chamado na classe da aplicação(PetShopAPP)
		//pet(true)p/colocar na maquina
		petShop.setPet(pet);
	}// FIM metodo setPetInPetMachine
}
