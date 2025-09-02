package exercicios;

public sealed abstract class Clock permits ClockBR, ClockUS {

	protected int hour = 0;
	protected int minute = 0;
	protected int second = 0;

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour >= 24) {
			this.hour = 0;
			return;
		} else{
			this.hour = hour;
			return;
		}
	}

	public int getMinute() {
		return this.minute;
	}

	public void setMinute(int minute) {
		if (minute >= 60) {
			this.minute = 0;
			return;
		}
		this.minute = minute;
		return;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second >= 60) {
			this.second = 0;
			return;
		}
		this.second = second;
		return;
	}

	// método que deverá retornar a hora no formato HH:MM:SS,
	public String formatHora(Clock clock) {
		String resposta = "";
		switch (clock) {
		case ClockUS clockus: {

			if (clockus.getHour() <= 9) {
				resposta = "0" + clockus.getHour() + ":" + clockus.getMinute() + ":" + clockus.getSecond() + " "
						+ clockus.getPeriodIndicator();
			}else if(clockus.getHour() >= 10) {
			resposta = "" + clockus.getHour() + ":" + clockus.getMinute() + ":" + clockus.getSecond() + " "
					+ clockus.getPeriodIndicator();
			}//fim else if
			//return resposta;
		} // fim case ClockUS clockus:
			break;
		case ClockBR clockbr: {
			if (clockbr.getHour() <= 9) {
				resposta = "0" + clockbr.getHour() + ":" + clockbr.getMinute() + ":" + clockbr.getSecond();
			}else if(clockbr.getHour() >= 10) {
			resposta = "" + clockbr.getHour() + ":" + clockbr.getMinute() + ":" + clockbr.getSecond();
			}//else if(clockbr.getHour()
			//return resposta;
		} // fim case ClockUS clockus:
		default:
			break;
		}// fim switch(clock)
		//return resposta;
		return resposta;
	}// fim metodo formatHora(Clock clock)

	public abstract Clock convert(Clock clock);
}
