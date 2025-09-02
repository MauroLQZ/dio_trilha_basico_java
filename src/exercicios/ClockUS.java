package exercicios;

/*relógio americano não existem as horas de 13 até 24.*/
public non-sealed class ClockUS extends Clock {
	private String periodIndicator = "";

	public String getPeriodIndicator() {
		return this.periodIndicator;
	}

	public void setPeriodIndicator(String periodHora) {
		this.periodIndicator = periodHora;
	}

	/**
	 * Defina também na super classe um método que ficará por responsabilidade da
	 * classe que extende-la definir seu funcionamemnto, esse método deve receber um
	 * relógio ( independente da implementação) e deve-se extrair as informações
	 * dele e usa-la no objeto que recebeu para setar as novas informações do
	 * relógio.
	 */
	@Override
	public Clock convert(Clock clock) {
		String periodo = "";
			if (clock.getHour() > 12) {
				periodo = "PM";
				this.setHour(clock.getHour() - 12);
				this.setMinute(clock.getMinute());
				this.setSecond(clock.getSecond());
				this.setPeriodIndicator(periodo);
				return this;
			} else {
				periodo = "AM";
				this.setHour(clock.getHour());
				this.setMinute(clock.getMinute());
				this.setSecond(clock.getSecond());
				this.setPeriodIndicator(periodo);
				return this;
			}
	}//fim metodo Clock convert(Clock clock)
}
