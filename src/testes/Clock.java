package testes;

public sealed abstract class Clock permits BRLClock, USClock {
	  protected int hour;
	  protected int minute;
	  protected int second;
	  
	  public void setMinute(int minute) {
		 if(minute >= 60) {
			this.minute = 60;
			return;
       }			
		 this.minute = minute;
	  }
	  public void setSecond(int second) {
		 if(second >= 60) {
			this.second = 60;
			return;
       }			
		 this.second = second;
	  }
	  public void setHour(int hour) {
		 if(hour >= 24) {
			this.hour = 24;
			return;
       }			
		 this.hour = hour;
	  }
	  public abstract Clock convert(Clock clock);
	  
	  /*public String getTime(){
		return hour +":"+minute+":"+second;  
	  }*/
	  public String getTime(){
		return format(hour)+":"+format(minute)+":"+format(second);  
	  }
	  private String setLeftZero(int value) {
		 return "0"+value;  
	  }
	  private String format(int value) {
		return value<9?"0"+value:String.valueOf(value);  
	  }
	public int getSecond() {
		return this.second;
	}
	public int getMinute() {
		return this.minute;
	}
	public int getHour() {
		return this.hour;
	}
}
