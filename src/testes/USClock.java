package testes;

public non-sealed class USClock extends Clock {
	 protected String periodIndicator;
	 
	 public String getPeriodIndicator() {
			return this.periodIndicator;
		}
	 
	 public void setHour(int hour) {
		setBeforeMidday();
		
		if((hour > 12) && (hour <= 23)) {
		   setAfterMidday();
		   this.hour = hour - 12;
	    }else if(hour >= 24) {
		   this.hour = 0;
	    }else  {
		   this.hour = hour;
		}
	 }
	 public void setAfterMidday() {
		this.periodIndicator = "PM";
	 }
	 public void setBeforeMidday() {
		this.periodIndicator = "AM";
	 }
	 @Override
	public Clock convert(Clock clock) {
		this.second = clock.getSecond();
		this.minute = clock.getMinute();
		
		switch(clock) {
		  case USClock usclock: {
			this.hour = usclock.getHour();
			this.periodIndicator = usclock.getPeriodIndicator();
			return this;
		  }
		  case BRLClock brlclock:{
		    this.setHour(brlclock.getHour());
		    return this;
		  }		    	  
	    }//fim switch
	 }//fim metodo convert()
	@Override
	 public String getTime() {
	   return super.getTime()+" "+this.periodIndicator; 
	 }
 }	  