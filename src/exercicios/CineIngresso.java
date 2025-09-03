package exercicios;

public sealed class CineIngresso permits CineFamilia, CineEstudante{
	
	protected double valor = 0;
	protected boolean dublado = false;
	protected boolean legendado = false;
	protected String nomeFilme = ""; 
	
	public CineIngresso() {
	
	}
	public CineIngresso(double valor) {
		this.setValor(valor);
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setDublado(boolean dublado) {
		this.dublado = dublado;
	}
    public boolean getDublado() {
    	return this.dublado;
    }
    public void setLegendado(boolean legendado) {
		this.legendado = legendado;
	}
    public boolean getLegendado() {
    	return this.legendado;
    }
    public String getNomeFilme() {
		return nomeFilme;
	}
	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}
/*Cada ingresso deve ter um método que retorna o seu valor real ( baseado no valor informado 
 * na criação do ingresso) para os de meia entrada o seu valor deve ser de metade do valor, 
 * para os ingressos família deve-se retornar o valor multiplicado pelo número de pessoas e 
 * fornecer um desconto de 5% quando o número de pessoas for maior que 3*/
    public double valorIngresso(CineIngresso cine) {
    	return this.valor;
    }
}
