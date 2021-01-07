package github2;
import java.util.Scanner;
public class erxing22 {
		public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner scanner=new Scanner(System.in);
	        System.out.print("Enter a point with two coordinates:");
	        double x = scanner.nextDouble();
	        double y = scanner.nextDouble();
	        double x1=0;
	        double y1=0;
	        double radius=10;
	        //¼ÆËã×ø±ê¾àÀëÔ²ÐÄµÄ¾àÀë
	        double distance=Math.pow(Math.pow(x-x1,2)+Math.pow(y-y1,2),0.5);
	        //ÅÐ¶ÏÊÇ·ñÔÚÔ²ÄÚ
	        if(distance>radius){
	            System.out.println("Point ("+x+","+y+ ") is not in the circle");
	        }
	        else if(radius==distance){
	            System.out.println("Point ("+x+","+y+ ") is in up the circle");
	        }
	        else{
	            System.out.println("Point ("+x+","+y+ ") is in the circle");
	        }
		}

}
