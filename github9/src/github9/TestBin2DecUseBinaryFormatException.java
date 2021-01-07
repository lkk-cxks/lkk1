package github9;
import java.net.BindException;
import java.util.Scanner;
public class TestBin2DecUseBinaryFormatException {
		public static void main(String[] args) {
			 @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
		        try{
		            System.out.print("Enter a bin string: ");
		            Bin2DecUseBinaryFormatException bin = new
		                 Bin2DecUseBinaryFormatException(input.next());
		            System.out.println("The binary value for decimal number " +
		                bin.getBinString() + " is " + bin.bin2Dec());
		        }
		        catch (BindException ex){
		            System.out.println(ex.getMessage());
		        }
		}
}
