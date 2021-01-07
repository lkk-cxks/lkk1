package github5;
import java.util.Random;
public class pratice4 {
		public static void main(String[] args) {
			Random random = new Random(1000);
			int num=0;
	        for(int i=0;i<50;i++,num++) {
	            if(num% 10 == 0)
	                System.out.println("");
	            System.out.print(random.nextInt(100) + " ");
			}
		}
}
