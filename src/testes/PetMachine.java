package testes;

public class PetMachine {
	private boolean clean = true;
	private int water = 30;
	private int shampoo = 10;
	private Pet pet;
	
	public void takeAShower() {
		if (this.pet == null) {
			System.out.println("Coloque o pet na máquina para iniciar o banho!");
			return;
		}
		//uso water/shampoo para dar banho
		this.water -= 10;
		this.shampoo -= 2;
		
		//pet foi limpo pela maquina de banho.
		pet.setClean(true);
		System.out.println("O pet " + pet.getName() + " esta limpo");
	}// FIM metodo takeAShower

	public void addWater() {
		if (water == 30) {
			System.out.println("A capacidade de agua da maquina esta no maximo!");
			return;
		} // FIM if
		
		//só add 2 litros por vez.
		water += 2;
	}// FIM metodo addWater

	public void addShampoo() {
		if (shampoo == 10) {
			System.out.println("A capacidade de shampoo da maquina esta no maximo!");
			return;
		} // FIM do if
		
		//só add 2 litros por vez.
		shampoo += 2;
	}// FIM metodo addShampoo

	public int getWater() {
		return water;
	}

	public int getShampoo() {
		return shampoo;
	}
    //Verificar se tem pet no banho.
	public boolean hasPet() {
		return pet != null;
	}
	//Maquina só pode permitir um pet por vez.
	public void setPet(Pet pet) {
		//Verificar se a maquina esta suja.
		if(!this.clean) {
			System.out.println("A maquina esta suja, para colocar o pet tem que limpá-la!");
			return;
		}//FIM if
		if(hasPet()) {
			System.out.println("O pet "+this.pet.getName()+" esta na maquina nesse momento!");
			return;
		}//FIM if
		this.pet = pet;
		System.out.println("O pet "+pet.getName()+" foi colocado na maquina!");
	}//FIM metodo setPet
	
	//retirar o pet da maquina
	public void removePet() {
		//se o pet estiver limpo ou sujo a maquina tambem estará
		this.clean = this.pet.isClean();
	    System.out.println("O pet "+this.pet.getName()+" foi tirado da maquina!");	
		//tirando o pet da maquina.
		this.pet = null;
	}//FIM metodo removePet
	
	//Metodo limpar a maquina.
	public void wash() {
		this.water -= 3;
		this.shampoo -= 1;
		this.clean = true;
		System.out.println("A maquina esta limpa!");
	}
	
}//FIM da classe PetMachine.

