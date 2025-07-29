package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarSucoNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
	    System.out.println("------------------------");
		Atendente atendente = new Atendente();
		atendente.receberPagamento();
		atendente.servindoMesa();
		System.out.println("------------------------");
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();	
	  }
}
