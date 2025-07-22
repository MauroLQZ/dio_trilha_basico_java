package desafio;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

/**
 * Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte
 * forma: new Scanner(System.in): cria um leitor de Entradas, com métodos úteis
 * com prefixo "next"; System.out.println:.imprime um texto de Saída (Output) e
 * pulando uma linha.
 * --------------------------------------------------------------------------------------
 * Implemente um programa em Java que receba o saldo inicial de uma conta
 * bancária e três transações (positivas para depósitos e negativas para
 * saques). O programa deve calcular e exibir o saldo final da conta. Entrada: O
 * programa deve receber: Um número decimal representando o saldo inicial. rês
 * números decimais representando os valores das transações. Saída: O saldo
 * final da conta bancária após as três transações. Exemplos: A tabela abaixo
 * apresenta exemplos c/alguns dados de entrada e suas respectivas saídas
 * esperadas. Certifique-se de testar seu programa com esses exemplos e com
 * outros casos possíveis. 
 * Entrada:             | Saída 
 * 100.00               | 
 * 50.00 -20.00 -30.00  | 100.00 
 * -----------------------------
 * 200.50              
 * -50.50 -70.00 30.00  | 110.00
 * -----------------------------
 * 0.00                 | 
 * 100.00 -50.00 -25.00 | 25.00
 */
public class MainBanco {
	/*
	 * Implemente um programa em Java que receba o saldo inicial de uma conta
	 * bancária e três transações (positivas para depósitos e negativas para
	 * saques). O programa deve calcular e exibir o saldo final da conta. Entrada: O
	 * programa deve receber: Um número decimal representando o saldo inicial. três
	 * números decimais representando os valores das transações. Saída: O saldo
	 * final da conta bancária após as três transações.
	 */
	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
			double saldoInicial = 0;
			double saldoFinal = 0;
			double deposito = 0;
			double saque = 0;
			boolean teste = true;
			do {
				System.out.println("Digite o valor do saldo inicial da conta: ");
				saldoInicial = scanner.nextDouble();
				if (saldoInicial < 0) {
					System.out.println("O valor deve ser positivo.");
					scanner.nextLine();
					continue;
				}
				System.out.println("Digite o valor do deposito: ");
				deposito = scanner.nextDouble();
				if (deposito <= 0) {
					System.out.println("O valor deve ser positivo.");
					scanner.nextLine();
					continue;
				}
				saldoInicial += deposito;
				//System.out.println("Deposito realizado no valor: " + deposito);
				System.out.printf("Deposito realizado no valor: %.2f\n",deposito);
				System.out.printf("Saldo da conta: %.2f\n",saldoInicial);
	
				System.out.println("Digite o valor do primeiro saque: ");
				saque = scanner.nextDouble();
				if (saque <= 0) {
					System.out.println("O valor deve ser positivo.");
					scanner.nextLine();
					continue;
				}
				if (saque > saldoInicial) {
					System.out.println("Saldo insuficiente! Nao foi possivel saque!");
				} else {
					saldoInicial -= saque;
					System.out.printf("Primeiro saque realizado no valor: %.2f\n",saque);
					System.out.printf("Saldo da conta: %.2f\n",saldoInicial);
				}
	
				System.out.println("Digite o valor do segundo saque: ");
				saque = scanner.nextDouble();
				if (saque <= 0) {
					System.out.println("O valor deve ser positivo.");
					scanner.nextLine();
					continue;
				}
				if (saque > saldoInicial) {
					System.out.println("Saldo insuficiente! Nao foi possivel saque!");
				} else {
					saldoInicial -= saque;
					System.out.printf("Segundo saque realizado no valor: %.2f\n",saque);
					System.out.printf("Saldo da conta: %.2f\n",saldoInicial);
				}
				teste = false;
			}while(teste);
	            saldoFinal = saldoInicial;
	            System.out.printf("Saldo final da conta: %.2f\n", saldoFinal);
				scanner.close();
		}//Fim try
		catch (InputMismatchException e) {
			System.out.println(e.getMessage() + ": Digite somente numeros!");
		}//Fim catch
	}//Fim do metodo main
}//-Fim classe Main
