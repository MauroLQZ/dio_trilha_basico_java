package controle_fluxo;

import java.util.Random;
/*
 * Joãozinho resolveu ligar para o seu amigo dizendo que hoje se entupiu de comer docinhos:
 */	 
public class ExemploDoWhile {

	public static void main(String[] args) {
		System.out.println("Discando...");
		  do {
			  //executando repetidas vezes até alguém 
			  System.out.println("Telefone tocando...");
		//testa metodo tocando()se retorna false(true/alterado-!) do metodo ele encerra o
	    //do/while.
	      }while(tocando());		  
		  System.out.println("Alô!!!");
	}
	private static boolean tocando() {
		//Se o valor de 1 a 3 for igual a 1, retorna true.
		boolean atendeu = new Random().nextInt(3)==1;
		System.out.println("Atendeu? "+atendeu);
		//testa variavel booleana atendeu
	    //quando retornar true(1) é alterado para false com o !)
		return !atendeu;
	  }
}
