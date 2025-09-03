package exercicios;

public non-sealed class CineEstudante extends CineIngresso {
	protected double ingressoEstudante = 0;

	public double getIngressoEstudante() {
		return ingressoEstudante;
	}

	public void setIngressoEstudante(double ingressoEstudante) {
		this.ingressoEstudante = ingressoEstudante;
	}
	
	@Override
	public double valorIngresso(CineIngresso cine) {
        this.setNomeFilme(cine.getNomeFilme());
        this.setDublado(cine.getDublado());
        this.setLegendado(cine.getLegendado());
      
		this.setIngressoEstudante(cine.getValor());
		double valorMetodo = this.getIngressoEstudante() * 0.5;
		this.setIngressoEstudante(this.getIngressoEstudante() - valorMetodo);
		
		System.out.println("VALOR INGRESSO: "+this.ingressoEstudante);
		return this.getIngressoEstudante();
	}
}
