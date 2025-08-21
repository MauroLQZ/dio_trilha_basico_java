package exercicios;

import testes.Pet;

/** A conta bancária deve ter um limite de cheque especial somado ao saldo da
 * conta; 
 * O valor do cheque especial é definido no momento da criação da
 * conta, de acordo com o valor depositado na conta em sua criação; 
 * Se o valor depositado na criação da conta for de R$500,00 ou menos o cheque especial
 * deve ser de R$50,00 
 * Para valores acima de R$500,00 o cheque especial deve  ser de 50% do valor depositado; 
 * Caso o limite de cheque especial seja usado, assim que possível a conta deve cobrar uma 
 * taxa de 20% do valor usado do cheque especial.
 */
public class Banco {

	private Cliente cliente;
	private static String agencia;
	private double saldo = 0;
	private double chequeEspecial = 0;
	private double limiteChequeEspecial = 0;
	private double taxaChequeEspecial = 0;

	public Banco() {
		
	}
	public Banco(Cliente cliente, double valorDeposito) {
		super();
		this.cliente = cliente;
		Banco.agencia = "Progresso";
		if (valorDeposito <= 500.0)
			chequeEspecial += 50.0;
		if (valorDeposito > 500.0)
			chequeEspecial = valorDeposito * 0.5;
		this.saldo += valorDeposito;
		this.limiteChequeEspecial = this.saldo + this.chequeEspecial;
	}

	public void deposita(double valor) {
		this.saldo += valor;
		if (this.taxaChequeEspecial > 0)
			this.saldo -= this.taxaChequeEspecial;
		this.limiteChequeEspecial = this.chequeEspecial + this.saldo;
		System.out.println("Deposito no valor "+valor+" na conta de "+this.cliente.getNome()+
				    "!");
	}

	/* Caso o limite de cheque especial seja usado, assim que possível a conta deve
	 * cobrar uma taxa de 20% do valor usado do cheque especial.  */
	public boolean saca(double valor) {

		if (valor <= this.saldo) {
			this.saldo -= valor;
			System.out.println("Saque de "+valor+" na conta de "+this.cliente.getNome()+
				    "!");
			return true;
		} else if (valor <= this.limiteChequeEspecial) {
			this.limiteChequeEspecial -= valor;
			this.taxaChequeEspecial = valor * 0.2;
			System.out.println("Saque de "+valor+" na conta de "+this.cliente.getNome()+
				    ", USADO LIMITE DO CHEQUE ESPECIAL!");
			return true;
		} else {
			System.out.println("SALDO INSUFICIENTE, na conta de "+this.cliente.getNome()+
					          "!");
			return false;
		}

	}

	public void pagarBoleto(double valorBoleto) {
		if (valorBoleto <= this.saldo) {
			this.saldo -= valorBoleto;
			System.out.println("Pagamento do boleto realizado,na conta de "+
			                                                     this.cliente.getNome());
		} else if (valorBoleto <= this.limiteChequeEspecial) {
			this.limiteChequeEspecial -= valorBoleto;
			this.taxaChequeEspecial = valorBoleto * 0.2;
			System.out.println("PAGAMENTO DO BOLETO USANDO O LIMITE DO CHEQUE ESPECIAL!");
		} else {
			System.out.println("Saldo Insuficiente para pagar boleto:");
		}	
	}
	public String verificaTaxaChequeEspecial() {
		if(this.taxaChequeEspecial > 0) {
			return "A conta esta usando cheque especial no valor: "+
		this.getTaxaChequeEspecial()+".Na conta de "+this.cliente.getNome();
		} else {
			return "A conta não esta usando cheque especial!.Na conta de "+
		               this.cliente.getNome()+"!";
		}
	}
	public double getTaxaChequeEspecial() {
		return taxaChequeEspecial;
	}
	public void setTaxaChequeEspecial(double taxaChequeEspecial) {
		this.taxaChequeEspecial = taxaChequeEspecial;
	}
	public double getLimiteChequeEspecial() {
		return this.limiteChequeEspecial;
	}
	public double setLimiteChequeEspecial(double valor) {
		return this.limiteChequeEspecial += valor;
	}

	public Cliente getCliente() {
		return this.cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public static String getAgencia() {
		return Banco.agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public double getChequeEspecial() {
		return this.chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	@Override
	public String toString() {
		return "Banco "+Banco.agencia+":[Cliente: "+this.cliente.getNome()+", saldo: "+
	            this.getSaldo()+", chequeEspecial: "+this.getChequeEspecial()+ 
				"\n, limiteChequeEspecial: "+this.getLimiteChequeEspecial()+
				", taxaChequeEspecial=" +this.getTaxaChequeEspecial()+"]";
	}
	public String infoConta() {
		//this.cliente = cliente;
		System.out.println("Nome do cliente: "+this.cliente.getNome());
		System.out.println("-----------------------------------------");
		
		return "Banco "+Banco.getAgencia()+":[Cliente: "+this.getCliente().getNome()+", "
			+ "saldo: "+this.getSaldo()+", chequeEspecial: "+this.getChequeEspecial()
	        +", limite cheque especial: "+this.limiteChequeEspecial+"]";
	}
}
