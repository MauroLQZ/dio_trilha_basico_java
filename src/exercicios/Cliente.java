package exercicios;

public class Cliente {
	private static int idCliente = 0;
	//Ñ altera o nome do cliente quando ele for criado
	private String nome;
	private int cpf;

	public Cliente() {
		idCliente++;
	}
	/*public Cliente(String nome) {
		this.nome = nome;
		idCliente++;
	}*/

	public void setNome(String nome) {
		this.nome = nome;	
	}

	public int getIdCliente() {
		return Cliente.idCliente;
	}

	public String getNome() {
		return this.nome;
	}

	public int getCpf() {
		return this.cpf;
	}
	public int setCpf(int cpf) {
		return this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "Cliente [idCliente = "+Cliente.idCliente+", nome = "+this.getNome()+
				", cpf = "+this.getCpf()+"]";
	}
}