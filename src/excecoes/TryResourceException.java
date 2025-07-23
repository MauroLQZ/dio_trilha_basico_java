package excecoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/** instrução try-with-resources:
 *  -----------------------------
 * A instrução try-with-resources é uma instrução try que declara um ou mais recursos, 
 * sendo um recurso um objeto que deve ser fechado e liberado após o programa ter terminado
 * o seu uso. Ao contrário da instrução try, essa nova instrução garante que cada recurso
 * seja fechado no final das instruções contidas em seu bloco sem que tenhamos que escrever
 * código para isso.
 * 
 * Primeiro, utilizaremos o método tradicional try-catch-finally e em seguida produziremos 
 * o mesmo resultado com a instrução try-with-resources a fim de compararmos a facilidade 
 * de uso de uma em relação à outra. Vamos usar o objeto BufferedReader, que estende a 
 * classe Reader, que, por sua vez, implementa a interface Closeable.*/
public class TryResourceException {

	public static void main(String[] args) {
		try {
			//ContaCorrente(int numero, String agencia, String cliente, double saldo)
			ContaCorrente cc = new ContaCorrente(123,"2563-5","Nuno",0.00);
		    //System.out.println(cc.relatorio(cc));
			cc.saca(100);
		} catch (IllegalArgumentException e) {
			//retorno msg para metodo new IllegalArgumentException();
		    System.out.println("Saldo Insuficiente");
		}
	}
	public static String readFirstLineFromFile(String path) throws IOException {
		  BufferedReader br = new BufferedReader(new FileReader(path));
		   try {
		      return br.readLine();
		   }
		   finally {
		     if (br != null) {
		      try {
		        br.close();
		     }
		     catch (Exception e) {
		       // Do nothing!
		      }
		    }
		  }
		}
	//instrução try-with-resources:
	//-----------------------------
    //No nosso caso, lança uma do tipo unchecked. RuntimeException é a exception mãe de 
    //todas as exceptions unchecked. A desvantagem aqui é que ela é muito genérica; quem 
    //receber esse erro não saberá dizer exatamente qual foi o problema. 
    //Podemos então usar uma exception mais específica:
	//Resulado: Saldo Insuficiente
	public void saca(double valor) {
		double saldo = 0;
	    //if (this.saldo < valor) {
	    if (saldo < valor) {
	    	//retorna na chamada do metodo no main: new IllegalArgumentException();
	        throw new IllegalArgumentException();
	    } else {
	        //this.saldo-=valor;
	    	saldo -= valor;
	    }
	}
}//Fim da classe Excep...

