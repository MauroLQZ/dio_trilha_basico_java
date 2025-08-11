package dio_trilha_basico_java.arte_abstracao;

public class AppMain {
	public static void main(String[] args) {
		/*var male = new Pessoa();
		male.setName("Joao");
		male.setAge(12);
		male.incAge();
		male.setTest("Teste 123"); 
		
		//nao aceita parametro 
		var male = new Pessoa(name:"Kiko"); */
		
		var male = new Pessoa("Kiko");
		male.incAge();
		var female = new Pessoa("Maria");
		female.incAge();
		
		/*var female = new Pessoa();
		female.setName("Maria");
		female.setAge(10);
		female.incAge();
		female.setTest("Teste - 456");*/
		
		System.out.println("Male name: " + male.getName() + " age: " + male.getAge());
		System.out.println("Female name: " + female.getName() + " age: " + female.getAge());
		//System.out.println("Testendo metodo static teste() male: "+male.getTest());
		//System.out.println("Testendo metodo static teste(): female: "+female.getTest());
	}


}
