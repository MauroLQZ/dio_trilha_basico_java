package testes;

import java.util.Scanner;

public class Main {
	private final static Scanner scanner = new Scanner(System.in);
	private final static PetMachine petMachine = new PetMachine();
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
			case 1:
				petMachine.takeAShower();
				break;
			case 2:
				setWater();
				break;
			case 3:
				setShampoo();
				break;
			case 4:
				verifyWater();
				break;
			case 5:
				verifyShampoo();
				break;
			case 6:
				checkIfHasPetInMachine();
				break;
			case 7:
				setPetInPetMachine();
				break;
			case 8:
				petMachine.removePet();
				break;
			case 9:
				petMachine.wash();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Opcao invalida!");
			}
		}while(true);
	}//FIM do main
    
	private static void setWater() {
		System.out.println("Tentando colocar agua na maquina!");
		petMachine.addWater();
	}
	
	private static void setShampoo() {
		System.out.println("Tentando colocar shampoo na maquina!");
		petMachine.addShampoo();
	}
	
	private static void verifyWater() {
		int amount = petMachine.getWater();
		System.out.println("A maquina esta com "+amount+" litro(s) de agua!");
	}
	
	private static void verifyShampoo() {
		var amount = petMachine.getShampoo();
		System.out.println("A maquina esta com "+amount+" litro(s) de shampoo!");
	}

	private static void checkIfHasPetInMachine() {
		var hasPet = petMachine.hasPet();
		System.out.println(hasPet ? "Tem pet na maquina!" : "Nao tem pet na maquina!");
	}
	
	public static void setPetInPetMachine() {
		var name = "";
		while(name == null || name.isEmpty()) {
			System.out.println("Informe o nome do pet:");
	        name = scanner.nextLine();
		}
        var pet = new Pet(name);
        petMachine.setPet(pet);
	}//FIM metodo setPetInPetMachine
   
}
