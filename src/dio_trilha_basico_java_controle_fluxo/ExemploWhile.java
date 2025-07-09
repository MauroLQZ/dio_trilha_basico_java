package dio_trilha_basico_java_controle_fluxo;

import java.util.concurrent.ThreadLocalRandom;

/*
 * Joãozinho recebeu R$50,00 de mesada e foi em uma loja de doces gastar todo o seu dinheiro, 
 * logo, enquanto o valor dos doces não igualar a R$50,00 ele foi adicionando itens 
 * no carrinho.*/
public class ExemploWhile {

	public static void main(String[] args) {
		double mesada = 50;
		while(mesada > 0) {
		   double valorDoce = valorAleatorio();			  
		   //Se o vlr doce maior que mesada,deixa ele igual a mesada.
		   //Para não precisar fazer novas verificações/sucessivamente.
		   //e tornar um numero negativo.
	       if(valorDoce > mesada) {
		      valorDoce = mesada;
	          System.out.println("Doce do valor: "+valorDoce+"A mesada = "+mesada);
	       }
		   mesada -= valorDoce;
		   System.out.println("Valor Doce: "+valorDoce+" - Mesada: "+mesada);
		}
	}
	private static double valorAleatorio() {
		//retorna um valor entre 2 e 8.
		return ThreadLocalRandom.current().nextDouble(2, 8);
	 }
}
