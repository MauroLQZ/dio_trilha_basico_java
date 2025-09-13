package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		// Usando lambda para implementação da interface Operacao
		/*
		 * Operacao soma = (a, b) -> a + b; System.out.println("Soma: " +
		 * soma.calcular(5, 3)); // Saída: 8
		 * 
		 * Operacao multiplicacao = (a, b) -> a * b;
		 * System.out.println("Multiplicação: " + multiplicacao.calcular(5, 3));
		 */
		// Lambda que converte um String para um número inteiro
		// Function<String, Integer> converter = s -> Integer.parseInt(s);
		// System.out.println("Conversão: " + converter.apply("123")); // Saída: 123
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Thread com classer interna!");
			}
		};
		new Thread(r).start();

		Runnable rn = () -> System.out.println("Thread com função lambda!");
		new Thread(rn).start();

		// Função lambda passada como parâmetro para um método:
		new Thread(() -> System.out.println("hello world")).start();

		// Imprimindo os elementos de uma lista:
		System.out.println("Imprime todos os elementos da lista!");
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		for (Integer n : list) {
			System.out.print("-" + n);
		}
		System.out.println("\nImprime todos os elementos da lista!");
		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		lista.forEach(n -> System.out.print("-" + n));

		// Imprimindo apenas os elementos pares de uma lista:
		System.out.println("\nImprime todos os elementos pares da lista!");
		List<Integer> listI = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		listI.forEach(n -> {
			if (n % 2 == 0) {
				System.out.print("-"+n);
			}
		});
	}

}
