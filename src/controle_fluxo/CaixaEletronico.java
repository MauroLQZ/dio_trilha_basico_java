package controle_fluxo;

public class CaixaEletronico {

	public static void main(String[] args) {
		double saldo = 25.0;
		   double valorSolicitado = 17.0;
		   /*Condicional Simples
		   if(valorSolicitado <= saldo) {
			   saldo -= valorSolicitado;
		   }
		   System.out.println(saldo);*/
		   /*Condicional Composta */
		   if(valorSolicitado <= saldo) {
			   saldo -= valorSolicitado;
			   System.out.println(saldo);
		   }else
			   System.out.println("Saldo Insuficiente: "+saldo);
	}
}
