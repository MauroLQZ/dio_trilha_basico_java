package desafio_controle_fluxo;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * O sistema deverá receber dois parâmetros via terminal que representarão dois
 * números inteiros, com estes dois números vc deverá obter a quantidade de
 * interações(for) e realizar a impressão no console(System.out.print) dos
 * números incrementados, exemplo: Se vc passar os números 12 e 30, logo teremos
 * uma interação(for) com ocorrências para imprimir os números, ex:"Imprimindo o
 * número 1","Imprimindo o número 2"e assim por diante. Se o primeiro parâmetro
 * for MAIOR que o segundo parâmetro, vc deverá lançar a exceção customizada
 * chamada de ParametrosInvalidosException com a segunda mensagem: "O segundo
 * parâmetro deve ser maior que o primeiro"
 */
public class Contador {
	
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		int parametroUm = 0;
		int parametroDois = 0;
		try {
			System.out.println("Digite o primeiro parâmetro");
			parametroUm = terminal.nextInt();
			System.out.println("Digite o segundo parâmetro");
			parametroDois = terminal.nextInt();
			if (parametroUm > parametroDois) {
				throw new ParametrosInvalidosException();
			}
			// chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);

		} catch (InputMismatchException i) {
			System.out.println("Digitar somente numeros!");
			//terminal.nextLine();
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} 
	}// fim main

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		int contagem = parametroDois - parametroUm;
		System.out.println("Contando a diferença do parametro dois com o parametro um!");
		// realizar o for para imprimir os números com base na variável contagem
		for (int n = 1; n <= contagem; n++) {
			System.out.print(" " + n);
		}
	}// fim metodo contar
}// fim classe Contador
