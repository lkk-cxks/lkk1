package github4;

public class example4 {
	
	public static void main(String[] arg) {
		
   	 example3 tv1 = new example3();
   	 tv1.turnOn();
   	 tv1.setChanner1(30);
   	 tv1.setVolume(3);
   	 example3 tv2 = new example3();
   	 tv2.turnOn();
   	 tv2.turnOn();
   	 tv2.channer1Up();
   	 tv2.channer1Up();
   	 tv2.volumeDown();
   	 System.out.println("tv1's channe1 is" + tv1.channer1 + "and volume level is " + tv1.volumeLeve1);
   	 System.out.println("tv2's channe1 is" + tv2.channer1 + "and volume level is " + tv2.volumeLeve1);
    }
	}


