package desafio_controle_fluxo;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.InputMismatchException;

/**
 * Se o primeiro parâmetro for MAIOR que o segundo parâmetro, vc deverá lançar a
 * exceção customizada chamada de ParametrosInvalidosException com a segunda
 * mensagem: "O segundo parâmetro deve ser maior que o primeiro"
 */
public class ParametrosInvalidosException extends Exception {

	public String getMessage() {
		return "O segundo parâmetro deve ser maior que o primeiro!";
	}   
}
