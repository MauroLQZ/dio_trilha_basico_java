package desafio;

import java.util.Scanner;

/**
 * Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte
 * forma: new Scanner(System.in):cria um leitor de Entradas, c/métodos úteis com
 * prefixo "next"; - System.out.println:imprime um texto de Saída(Output)e
 * pulando uma linha.
 */
/**Entrada:             | Saída 
 * 100.00               | 
 * 50.00 -20.00 -30.00  | 100.00 
 * -----------------------------
 * 200.50              
 * -50.50 -70.00 30.00  | 110.00
 * -----------------------------
 * 0.00                 | 
 * 100.00 -50.00 -25.00 | 25.00*/
public class DesafioDIO {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o saldo inicial: ");
		// Entrada do saldo inicial
		double saldoInicial = scanner.nextDouble();

		// TODO: Na linha abaixo, implemente a entrada das três transações:
		System.out.println("Digite o deposito: ");
		double deposito = scanner.nextDouble();
		saldoInicial += deposito;
		System.out.println("Digite o saque1: ");
		double saque1 = scanner.nextDouble();
		saldoInicial += saque1;
		System.out.println("Digite o saque2: ");
		double saque2 = scanner.nextDouble();
		saldoInicial += saque2;
		
		// TODO: Na linha abaixo, realize o cálculo do saldo final:
		double saldoFinal = saldoInicial;

		// Saldo final
		System.out.printf("%.2f\n", saldoFinal);

		scanner.close();
	}
}
