package github2;
import java.util.Scanner;
public class erxing19 {
		public static void main(String[] args) {
	double a,b,c,s=0;
			
			// Prompt the user to enter three edges
			System.out.print("输入三角形的三条边: ");
			Scanner input = new Scanner(System.in);
			a=input.nextDouble();
			b=input.nextDouble();
			c=input.nextDouble();
			if(a+b>c && a+c>b && b+c>a)
				s=a+b+c;
			else
				System.out.println("输入错误，不构成三角形");
			
			if(s!=0)
				System.out.println("三角形的周长4为 "+s);
			input.close();
		}
}
