package github4;

public class example3 {
     int channer = 1;
     int volumeLever = 1;
     boolean on = false;
     String volumeLeve1;
     String channer1;
     public void example3() {
     }
     public void turnOn() {
     	boolean ture = false;
    	 on = ture;
     }
     public void turnOff() {
    	 on =false;
     }
     public void setChanner1(int newChanner1) {
    	 int channer1=1;
    	 if(on && newChanner1 >= 1 && newChanner1 <=120)
    		 channer1 = newChanner1;
     }
     public void setVolume(int newVolume1) {
    	 int volumeLever1 = 1;
    	 int newvolumeLever1 = 1;
    	 if(on && newVolume1 >= 1 && newVolume1 <=7)
    		 volumeLever1 = newvolumeLever1;
     }
     public void channer1Up() {
    	 int channer1 = 1;
    	 if(on && channer1 < 120)
    		 channer1++;
     }
     public void channerDown() {
    	 int channer1 = 1;
    	 if (on && channer1>1)
    		 channer1--;
     }
     public void volumeDown() {
    	 int volumeLever1 = 1;
    	 if(on && volumeLever1>1)
    		 volumeLever1--;
     }
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


