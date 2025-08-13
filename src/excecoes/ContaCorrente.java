package excecoes;

import desafio.ContaBanco;

public class ContaCorrente {
	
	private int numero;
	private String agencia;
	private String cliente;
	private double saldo;
	private double valorSolicitado;
	
	public ContaCorrente(int numero, String agencia, String cliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.cliente = cliente;
		this.saldo = saldo;
	}
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
	/**No nosso caso, lança uma do tipo unchecked. RuntimeException é a exception mãe de 
     * todas as exceptions unchecked. A desvantagem aqui é que ela é muito genérica; quem 
     * receber esse erro não saberá dizer exatamente qual foi o problema. 
     * Podemos então usar uma exception mais específica:*/
	public void saca(double valor) {
	    if (this.saldo < valor) {
	        throw new IllegalArgumentException();
	    } else {
	        this.saldo-=valor;      
	    }       
	}
	public String saque(double valor) {
	   if(valor <= saldo) {
		   saldo -= valorSolicitado;
		   return "Saque do valor = "+valorSolicitado+" realizado!";   
	   } else {
		   return "Saldo insuficiente!";
	   }
	}
	public String relatorio(ContaCorrente conta) {
		return 
		"Olá ["+conta.getCliente()+"], obrigado por criar uma conta em nosso banco, \r\n"
	   +"sua agência é ["+conta.getAgencia()+"], conta["+conta.getNumero()+"] e seu \r\n"
	   +"saldo["+conta.getSaldo()+"], já está disponível para saque se vc quer realizar!";
	}
}
