package dio_trilha_basico_java;

/**
 * 1- Crie o projeto ContaBanco que receberá dados via terminal contendo as 
 * características de conta em banco conforme atributos abaixo:
 * 2- Dentro do projeto,crie a classe ContaTerminal.java para realizar toda 
 * a codificação do nosso programa.
 * 
 * O programa deverá simular uma operação de saque onde.
 * Terá uma variável denominada saldo do tipo double contendo o valor inicial 
 * igual a 25;
 * Terá uma variável denominada de valor solicitado do tipo double contendo 
 * o valor inicial igual a 18;
 * Criar uma expressão relacional para que caso o saldo seja maior que o 
 * valor solicitado, o saldo recebe o novo valor como saldo é igual saldo 
 * menos o valor solicitado. Caso o saldo seja menor que o valor solicitado, 
 * devemos exibir a mensagem "Saldo insuficiente";
- Imprima o valor do saldo;
- Em seguida, realize a mesma execução do programa agora com os valores saldo igual a 15 e valor solicitado igual a 22 e exiba o resultado;
 * */
public class ContaBanco {
	private int numero;
	private String agencia;
	private String cliente;
	private double saldo;
	private double valorSolicitado;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getValorSolicitado() {
		return valorSolicitado;
	}
	public void setValorSolicitado(double valorSolicitado) {
		this.valorSolicitado = valorSolicitado;
	}   
	public String saque() {
	   if(valorSolicitado <= saldo) {
		   saldo -= valorSolicitado;
		   return "Saque do valor = "+valorSolicitado+" realizado!";   
	   } else {
		   return "Saldo insuficiente!";
	   }
	}
	public String relatorio(ContaBanco conta) {
		return 
		"Olá ["+conta.getCliente()+"], obrigado por criar uma conta em nosso banco, \r\n"
	   +"sua agência é ["+conta.getAgencia()+"], conta["+conta.getNumero()+"] e seu \r\n"
	   +"saldo["+conta.getSaldo()+"], já está disponível para saque.";
	}
}
