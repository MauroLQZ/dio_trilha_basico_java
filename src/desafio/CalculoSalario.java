package desafio;

import java.util.InputMismatchException;
import java.util.Scanner;

import desafio_controle_fluxo.ParametrosInvalidosException;

/**
 * Faça um programa que calcule e imprima o salário a ser transferido p/um
 * funcionário: A entrada consiste em vários arquivos de teste, que conterá o
 * valor bruto do salário e adicional dos benefícios. Calculo Salario: salário =
 * (salárioBruto - impostoSalário)+ benefícios. percentual imposto: De R$0.00 a
 * R$1100.00 = 5.00% De R$1100.01 a R$2500.00 = 10.00% Maior que R$2500.00 =
 * 15.00% Saída: Para cada arquivo da entrada, terá um arquivo de saída. E o
 * como mencionado no Desafio, será gerado uma linha com um número que será a
 * diferença entre o valor bruto do salário e o percentual de imposto mediante a
 * faixa salárial somado com o adicional dos benefícios. Use o exemplo abaixo
 * para clarear o que está sendo pedido. Entrada: 2000 - 250 - Saída: 2050.00
 */
public class CalculoSalario {

	public static void main(String[] args) throws InputMismatchException {
		try {
			Scanner terminal = new Scanner(System.in);
			double salario = 0;
			double beneficios = 0, imposto = 0;
			boolean teste = true;
			do {
				System.out.println("Digite o valor do salario: ");
				salario = terminal.nextDouble();

				if (salario <= 0) {
					System.out.println("O Salario deve ser positivo.");
					System.out.println();
					terminal.nextLine();
					continue;
				}

				System.out.println("Digite o valor dos beneficios: ");
				beneficios = terminal.nextDouble();

				if (beneficios <= 0) {
					System.out.println("Os beneficios devem ser positivo.");
					System.out.println();
					terminal.nextLine();
					continue;
				}

				if (salario > 0 && salario <= 1100.00) {
					imposto = salario * 0.05;
				} else if (salario >= 1100.01 && salario <= 2500.00) {
					imposto = salario * 0.10;
				} else {
					imposto = salario * 0.15;
				}
				salario = (salario - imposto) + beneficios;
				System.out.println("O valor do salario: " + salario);
				teste = false;
			} while (teste);
		} catch (InputMismatchException e) {
			System.out.println(e.getMessage() + ": Digite somente numeros positivos!");
		}
	}
}
