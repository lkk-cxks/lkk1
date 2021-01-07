package example1and2;

public class example127 {
	 public static void main(String[] arg) {
		    long totalMilliseconds = System.currentTimeMillis();
		    long  totalSeconds = totalMilliseconds / 1000;
		    long  currentSecond = totalSeconds % 60;
		    long  totalMinutes = totalSeconds / 60;
		    long  currenrMinute =totalMinutes % 60;
		    long  totalHours = totalMinutes / 60;
		    long  curentHour = totalHours % 24;
		   System.out.println("Current time is "+ curentHour + " : "+currenrMinute + " : "+ currentSecond + " GMT");
		    }
}
