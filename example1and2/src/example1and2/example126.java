package example1and2;
import java.util.Scanner;
public class example126 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a degree in Fahrenheit: ");
		double fahrenheit= input.nextDouble();
		double Celsius = (5.0 / 9) * (fahrenheit - 32);
		System.out.println("Fahrenheit " + fahrenheit + " is M "+Celsius + " in Celsius");
	}
}
