package java_abstracao;

public record PessoaRecord(String name, int idade) {
	//static String name;
	//private static String name;
	//private static int idade;
	
	//Metodo possivel no Record
	//public String name() {
		//return "";
	//}
	//public void setName(String name) {
		//PessoaRecord.name = name; //ERRO
	//}
	//Construtor Compacto
	public PessoaRecord {
		System.out.println("=======================");
		System.out.println(name);
		System.out.println(idade);
		System.out.println("=======================");
	}
	//Construtor Secundario:
	public PessoaRecord(String name) {
		this(name,  1);
	}
	
	//Metodo com retorno
	public String getInfo() {
		return "Name: "+name+" idade: "+idade;
	}
}
