package exercicios;

public non-sealed class ClockBR extends Clock{

	/**
	 * Defina também na super classe um método que ficará por responsabilidade da
	 * classe que extende-la definir seu funcionamemnto, esse método deve receber um
	 * relógio ( independente da implementação) e deve-se extrair as informações
	 * dele e usa-la no objeto que recebeu para setar as novas informações do
	 * relógio.
	 */
	@Override
	public Clock convert(Clock clock) {
		this.setHour(clock.getHour());
		this.setMinute(clock.getMinute());
		this.setSecond(clock.getSecond());
		return this;
	}
}
