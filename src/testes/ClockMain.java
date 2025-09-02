package testes;

public class ClockMain {

	public static void main(String[] args) {
		Clock brlclock = new BRLClock();
		  brlclock.setSecond(0);
		  brlclock.setMinute(0);
		  brlclock.setHour(25);//13

		  System.out.println(brlclock.getTime());
		  System.out.println(new USClock().convert(brlclock)); 
	}

}
