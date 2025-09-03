package exercicios;

public non-sealed class CineFamilia extends CineIngresso {
    protected double ingressoFamilia = 0;
    protected int numeroPessoas = 0;
	
	public CineFamilia(int numeroPessoas) {
		super();
		this.setNumeroPessoas(numeroPessoas);
	}

	public int getNumeroPessoas() {
		return numeroPessoas;
	}

	public void setNumeroPessoas(int numeroPessoas) {
		this.numeroPessoas = numeroPessoas;
	}

	public double getIngressoFamilia() {
		return this.ingressoFamilia;
	}

	public void setIngressoFamilia(double ingressoFamilia) {
		this.ingressoFamilia = ingressoFamilia;
	}

	@Override
	public double valorIngresso(CineIngresso cine) {
		this.setNomeFilme(cine.getNomeFilme());
        this.setDublado(cine.getDublado());
        this.setLegendado(cine.getLegendado());
 
		if (this.getNumeroPessoas() > 3) {
			double valor = cine.getValor() * getNumeroPessoas();
			this.setIngressoFamilia(valor);
			double valorDesc = this.getIngressoFamilia() * 0.05;
			valor = this.getIngressoFamilia() - valorDesc;
			this.setIngressoFamilia(valor);
			return this.getIngressoFamilia();
			
		} else {
			this.setIngressoFamilia(cine.getValor());
			this.setIngressoFamilia(this.getIngressoFamilia() * this.getNumeroPessoas());
			return this.getIngressoFamilia();
		}
	}
}
