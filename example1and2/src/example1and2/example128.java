package example1and2;

import java.util.Scanner;
public class example128 {
    public static void main(String[] arg) {
  Scanner input = new Scanner(System.in);
  System.out.print("Enter purchase amount: ");
  double purchaseAmount = input.nextDouble();
  double tax = purchaseAmount * 0.06;
  System.out.println("Sales tax is $ "+(int)(tax*100)/100.0);
   }

}
