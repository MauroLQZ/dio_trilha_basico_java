package dio_trilha_basico_java.arte_abstracao;

import java.time.OffsetDateTime;

public class Pessoa {
	
	// Usando name final só pode ser atribuida uma vez,No ex. atribuimos no construtor e
	// excluimos o setName(),para nao atribuir mais valores,isto é regra de negocio.
	// private final String name;    
	
	private String name;	
	private int age;
	private static String test;

	/**Regra negocio:só incrementa a idade uma vez por ano
	 * OffsetDateTime.now()=retorna data/hora sist. operacional */
	private int lastYearAgeInc = OffsetDateTime.now().getYear();
	
	/*//Diminuindo ano em -1,para testar o metodo de incremento public void incAge(){ 
	private int lastYearAgeInc = OffsetDateTime.now().getYear()-1;
    */
	//age definido como 1 e nao pode ser alterada
	public Pessoa(String name) {
		this.name = name;
		this.age = 1;
	}
	/* //Esconde um construtor sem argumento.
	private Pessoa() {
		
	}  */
	public static void setTest(String testParam) {
		test = testParam;
	}

	public static String getTest() {
		return test;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void incAge() {
// Variavel interna só para nosso controle, ñ pode acessar em outro lugar,como main.
// Verifica se é igual ou maior ano corrente ele entra nesse if,ele ve que data/hora é a
// atual, senao foi atualizado,ele ve que o ano passado nao foi atualizado e atualiza 
// data/hora. Ele atualiza o ano em  +1 e o ano corrente.
		if (this.lastYearAgeInc >= OffsetDateTime.now().getYear())
			return;
		this.age += 1;
		this.lastYearAgeInc = OffsetDateTime.now().getYear();
	}

	public void setAge(int age) {
		this.age = age;
	}
}
