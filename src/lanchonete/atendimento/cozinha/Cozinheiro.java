package lanchonete.atendimento.cozinha;

public class Cozinheiro {
	//poder ser dafault
    public void adicionarLancheNoBalcao() {
		System.out.println("ADICIONANDO LANCHE NATURAL NO BALCAO!");
	}
	//pode ser default
    public void adicionarSucoNoBalcao() {
		System.out.println("ADICIONANADO SUCO NO BALCAO!");
    }		
	//PODE SER DEFAULT
	public void adicionarComboNoBalcao(){
		adicionarLancheNoBalcao();
		adicionarSucoNoBalcao();
	}
	private void prepararLanche() {
		System.out.println("PREPARANDO LANCHE TIPO NATURAL!");
	}
	private void prepararVitamina() {
	    System.out.println("PREPARANDO SUCO!");		
	}
	private void prepartarCombo() {
		prepararLanche();
		prepararVitamina();
	}
	private void selecionarIngredientesLanche() {
		System.out.println("SELECIONANDO O PÃO, SALADA E FRUTAS!");	
	}
    private void selecionarIngredientesVitamina() {
		System.out.println("SELECIONANDO FRUTA, LEITE E AÇUCAR!");
	}
	private void lavarIgredientes() {
		System.out.println("LAVANDO IGREDIENTES!");	
	}
	private void baterVitaminaLiquidificador() {
		System.out.println("BATENDO VITAMINA LIQUIDIFICADOR!");	
	}
    private void fritarIngredientesLanche() {
		System.out.println("FRITANDO CARNE E OVO PARA LANCHE!");	
	}
	private void pedirParaTrocarGas(Almoxarife meuAmigo) {
		meuAmigo.trocarGas();
	}
	private void pedirIgredientes(Almoxarife almoxarife) {
		almoxarife.entregarIngredientes();	
	}
}
