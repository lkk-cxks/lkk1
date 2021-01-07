package github9;
import java.util.Scanner;

import javax.xml.xpath.XPathException;
public class TestHexFormatException {
		public static void main(String [] args){
	        @SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
	        try{
	            System.out.print("Enter a hex string: ");
	            HexToDecUseHexFormatException hex = 
	                new HexToDecUseHexFormatException(input.next());
	            System.out.println("The decimal value for hex number " 
	                + hex.getHexString() + " is " + hex.hexToDec());
	        }
	        catch (XPathException ex){
	            System.out.println(ex.getMessage());
	        }
	    }
}
