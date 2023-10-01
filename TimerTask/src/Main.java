import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	public static void main(String[] args) {
		Timer timer = new Timer();
		
		TimerTask task = new TimerTask() {

			int counter = 10;
			@Override
			public void run() {
				if(counter>0) {
					System.out.println(counter + "seconds");
					counter--;
				}
				else {
					System.out.println("Happy new year ");
					timer.cancel();
				}
				
			}
			
		};
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR,2020);
		date.set(Calendar.MONTH,Calendar.APRIL);
		date.set(Calendar.YEAR,Calendar.DAY_OF_MONTH,20);
		date.set(Calendar.YEAR,Calendar.MINUTE);
		
//		timer.schedule(task, date.getTime());
		
//		timer.schedule(task, 2000);
		
	//	timer.scheduleAtFixedRate(task, 0,1000);
		
		timer.scheduleAtFixedRate(task, 0,1000);
		
//		
	}

}
