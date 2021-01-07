package github2;
import java.util.Scanner;

public class erxing15 {
		public static void main(String[] args) {
			int gu, gD1, gD2, gD3;
			final int lD1, lD2, lD3;
			//随机产生的数
			final int lo = (int)(Math.random() * 1000);
			
			System.out.print("Enter your ticket number: ");
			Scanner input = new Scanner(System.in);
			gu = input.nextInt();
			
			gD1 = gu/100;
			gD2 = gu%100/10;
			gD3 = gu%10;
			
			lD1 = lo/100;
			lD2 = lo%100/10;
			lD3 = lo%10;
			  //匹配顺序的数
			
			if(lo == gu)
				System.out.println("Won $10000");	
			 //所有数匹配彩票的所有数字
			else if((lD1 == gD1 && lD2 == gD3 && lD3 == gD2)||(lD1 == gD2 && lD2 == gD1 && lD3 == gD3)
				||(lD1 == gD2 && lD2 == gD3 && lD3 == gD1)||(lD1 == gD3 && lD2 == gD1 && lD3 == gD2)
				||(lD1 == gD3 && lD2 == gD2 && lD3 == gD1))
			{
				System.out.println("Won $3000");
			}
        //匹配到一个数
			else if(lD1 == gD1 || lD1 == gD2 || lD1 == gD3||lD2 == gD1 || lD2 == gD2 || lD2 == gD3
				||lD3 == gD1 || lD3 == gD2 || lD3 == gD3)
			{
				System.out.println("Won $1000");
			}
			//没中奖
	
			else
				System.out.println("Thank you for your patronage");
			input.close();
		}

	}

