package dio_trilha_basico_java_controle_fluxo;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {

	public static void main(String[] args) {
		Number valor = Double.valueOf("a1.75");
		try {
			valor = NumberFormat.getInstance().parse("a1.75");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		System.out.println(valor);
	}
}
