package example1and2;
import java.util.Scanner;
public class example129 {
  public static void main(String[] arg) {
	  Scanner input = new Scanner(System.in);
	  System.out.print("Enter annual interest rate, e.g.y 7.25%:");
	  double annualInterstRate = input.nextDouble();
	  double monthlyInterestRate = annualInterstRate/1200;
	  System.out.print("Enter number of years as an integer, e.g., 5:");
	  int numberOfYears=input.nextInt();
	  System.out.print("Enter loan amount, e.g., 120000.95:");
	  double loanAmount = input.nextDouble();
	  double monthlyPayment = loanAmount * monthlyInterestRate /(1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
	  double tatalPayment = monthlyPayment * numberOfYears*12;
	  System.out.println("The monthly payment is $ " + (int)(monthlyPayment * 100)/ 100.0);
	  System.out.println("The total payment is $ " + (int)(tatalPayment * 100)/ 100.0); 
  }
}
