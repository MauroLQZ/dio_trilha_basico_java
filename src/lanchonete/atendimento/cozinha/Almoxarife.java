package lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void ControlarEntrada() {
		System.out.println("CONTROLANDO A ENTRADA!");
	}
	private void controlarSaida() {
		System.out.println("CONTROLANDO A SAIDA DOS ITENS LANCHONETE!");
	}
	void entregarIngredientes() {
		System.out.println("ENTREGANDO INGREDIENTES!");
		controlarSaida();	
	}
	void trocarGas() {
	   System.out.println("ALMOXARIFE TROCANDO O GAS!");	
	}

}
