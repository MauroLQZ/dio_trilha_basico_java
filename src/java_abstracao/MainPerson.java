package java_abstracao;

public class MainPerson {

	public static void main(String[] args) {
		var pessoa = new PessoaRecord("Joao", 12);
		//System.out.println(pessoa.toString());//PessoaRecord[]
        //pessoa.name = "Mauro";//acessando qdo variavel static
		//System.out.println(pessoa); //PessoaRecord[name=Joao]
		//System.out.println(pessoa.name());//Joao
		//var newPessoa = new PessoaRecord(pessoa.name(), 13);
		//System.out.println(newPessoa);
		System.out.println(pessoa.getInfo());
		System.out.println(pessoa.name());
		
	}

}
