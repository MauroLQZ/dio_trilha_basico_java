package dio_trilha_basico_java;

import java.util.Locale;
import java.util.Scanner;
//import javax.swing.JOptionPane;

/** O programa deverá simular uma operação de saque onde.
 * Terá uma variável denominada saldo do tipo double contendo o valor inicial 
 * igual a 25;
 * Terá uma variável denominada de valor solicitado do tipo double contendo 
 * o valor inicial igual a 18;
 * Criar uma expressão relacional para que caso o saldo seja maior que o valor
 * solicitado, o saldo recebe o novo valor como saldo é igual saldo menos o 
 * valor solicitado. Caso o saldo seja menor que o valor solicitado, devemos 
 * exibir a mensagem "Saldo insuficiente";
 * Imprima o valor do saldo;
 * Em seguida, realize a mesma execução do programa agora com os valores 
 * saldo igual a 15 e valor solicitado igual a 22 e exiba o resultado; */
public class ContaTerminal {
	public static void main(String[] args) {
		Scanner resposta = new Scanner(System.in);
		resposta.useLocale(Locale.US);
		ContaBanco conta = new ContaBanco();
		System.out.println("Qual nome do cliente?");
		String name = resposta.next();
		conta.setCliente(name);
		System.out.println("Digite a agencia?");
		String agencia = resposta.next();
		conta.setAgencia(agencia);
		System.out.println("Qual o numero da conta?");
		int numero = resposta.nextInt();
		conta.setNumero(numero);
		System.out.printf("Valor do Saldo?");
		double saldo = resposta.nextDouble();
		conta.setSaldo(saldo);
		System.out.printf("Valor do Saque?");
		double valorSaque = resposta.nextDouble();
		conta.setValorSolicitado(valorSaque);
		
		System.out.println("Cliente: "+conta.getCliente());
		System.out.println("Agencia: "+conta.getAgencia());
		System.out.println("Numero C/C: "+conta.getNumero());
		//System.out.printf("\nPeso Ideal = %.2f kgs\n", psIdeal);
		System.out.printf("Saldo atual: %.2f",conta.getSaldo()); 
		System.out.printf("\nValor Solicitado para saque: %.2f",conta.getValorSolicitado());
		System.out.printf("\nValor do saque: %.2f",conta.getValorSolicitado());
		//System.out.printf("Saque solicitado: %.2f",conta.saque());
		System.out.printf("\nSaque solicitado: %.2f",conta.getValorSolicitado()," - ",conta.saque());
		System.out.printf("\nSaldo Final: %.2f",conta.getSaldo());
		System.out.println("\n==========================================================");
		System.out.println("Balanço:");
		System.out.println(conta.relatorio(conta));
		resposta.close();
		/*conta.setSaldo(15);
		conta.setValorSolicitado(22);
		System.out.println("Saldo atual: "+conta.getSaldo());
		System.out.println("Valor Solicitado para saque: "+conta.getValorSolicitado());
	    System.out.println("Valor do saque: "+conta.getValorSolicitado());
	    System.out.println("Saque solicitado: "+conta.saque());
	    System.out.println("Saldo Final: "+conta.getSaldo());*/	
//------------------------------------------------------------------------
		/*String name = JOptionPane.showInputDialog("Qual nome do cliente?");
		conta.setCliente(name);
		String agencia = JOptionPane.showInputDialog("Qual a Agencia?");
		conta.setAgencia(agencia);
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Qual numero da conta?"));
		conta.setNumero(numero);
		double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o saldo?"));
		conta.setSaldo(saldo);
		double valorSaque = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque?"));
		conta.setValorSolicitado(valorSaque);
		//System.out.println("Cliente: "+conta.getCliente());
		JOptionPane.showMessageDialog(null,"Cliente: "+conta.getCliente());
		//System.out.println("Agencia: "+conta.getAgencia());
		JOptionPane.showMessageDialog(null,"Agencia: "+conta.getAgencia());
		//System.out.println("Numero C/C: "+conta.getNumero());
		JOptionPane.showMessageDialog(null,"Numero: "+conta.getNumero());
		//System.out.println("Saldo atual: "+conta.getSaldo());
		JOptionPane.showMessageDialog(null,"Saldo: "+conta.getSaldo());
		//System.out.println("Valor Solicitado para saque: "+conta.getValorSolicitado());
		JOptionPane.showMessageDialog(null,"Valor solicitdo para saque: "+conta.getValorSolicitado());
		//System.out.println("Valor do saque: "+conta.getValorSolicitado());
		JOptionPane.showMessageDialog(null,"Valor do saque: "+conta.getValorSolicitado());
	    //System.out.println("Saque solicitado: "+conta.saque());
		JOptionPane.showMessageDialog(null,"Saque solicitado: "+conta.saque());
	    //System.out.println("Saldo Final: "+conta.getSaldo());
		JOptionPane.showMessageDialog(null,"Saldo final: "+conta.getSaldo());
	    //System.out.println("Balanço:");
		JOptionPane.showMessageDialog(null,"Balanço!");
		//System.out.println(conta.toString());
		JOptionPane.showMessageDialog(null,conta.relatorio(conta)); */
		/*conta.setSaldo(15);
		conta.setValorSolicitado(22);
		System.out.println("Saldo atual: "+conta.getSaldo());
		System.out.println("Valor Solicitado para saque: "+conta.getValorSolicitado());
	    System.out.println("Valor do saque: "+conta.getValorSolicitado());
	    System.out.println("Saque solicitado: "+conta.saque());
	    System.out.println("Saldo Final: "+conta.getSaldo());*/
	}
}
