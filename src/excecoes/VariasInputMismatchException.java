package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.IllegalArgumentException;
import java.lang.NullPointerException;

/**
 * InputMismatchException: No exemplo, o Scanner tenta ler um inteiro usando
 * nextInt(). Se o usuário digitar algo que não seja um inteiro, uma
 * InputMismatchException é lançada, e o bloco catch trata o erro, imprimindo
 * uma mensagem de erro.
 * 
 * IllegalArgumentException: O método validarTamanho() recebe uma string e um
 * tamanho mínimo. Se o tamanho d/string for menor q/tamanho mínimo, uma
 * IllegalArgumentException é lançada, indicando que o argumento fornecido (o
 * tamanho da string) é inválido. O bloco catch trata a exceção, exibindo a
 * mensagem de erro.
 * 
 * NullPointerException: O código tenta acessar o método length() de uma
 * variável textoNulo que foi definida como null. Isso resulta em uma
 * NullPointerException. O bloco catch trata o erro, informando que não se pode
 * acessar um objeto nulo. O bloco finally garante que o Scanner seja fechado,
 * independentemente de ocorrerem exceções ou não, evitando vazamentos de
 * recursos.
 */
public class VariasInputMismatchException {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		//Exemplo de InputMismatchException
		try {
			System.out.print("Digite um número inteiro: ");
			int numero = scanner.nextInt();
			System.out.println("Número digitado: " + numero);
		} catch (InputMismatchException e) {
			System.err.println("Erro: Entrada inválida. Digite um número inteiro.");
		}

		//Exemplo de IllegalArgumentException
		try {
			//String texto = "texto";
			String texto = "teto";
			// Lançará IllegalArgumentException se o tamanho for menor que 5
			validarTamanho(texto, 5); 
			System.out.println("Tamanho válido: " + texto);
		} catch (IllegalArgumentException e) {
			System.err.println("Erro: " + e.getMessage());
		}

		// Exemplo de NullPointerException
		try {
			String textoNulo = null;
			// Lançará NullPointerException
			System.out.println(textoNulo.length()); 
		} catch (NullPointerException e) {
			System.err.println("Erro: Tentativa de acessar um objeto nulo.");
		} finally {
			scanner.close();
		}
	}

	public static void validarTamanho(String texto, int tamanhoMinimo) {
		if (texto.length() < tamanhoMinimo) {
			throw new IllegalArgumentException("O texto deve ter pelo menos "+
		                                               tamanhoMinimo + " caracteres.");
		}
	}
}
