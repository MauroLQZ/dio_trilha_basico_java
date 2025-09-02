package testes;

public non-sealed class BRLClock extends Clock{
	@Override
	public Clock convert(Clock clock) {
	   this.second = clock.getSecond();
	   this.minute = clock.getMinute();
	   
	   switch(clock) {
		 case USClock usclock:
		 this.hour = (usclock.getPeriodIndicator().equals("PM"))? 
		 usclock.getHour() + 12 : usclock.getHour();		 
		 break;
	case BRLClock brlclock:
		    this.hour = brlclock.getHour();
	   }
	   return this;
	}
  }