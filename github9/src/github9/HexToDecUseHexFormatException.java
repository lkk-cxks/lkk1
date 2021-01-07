package github9;
import java.util.Scanner;

import javax.xml.xpath.XPathException;
@SuppressWarnings("unused")
public class HexToDecUseHexFormatException {
		String hexString;

	    public HexToDecUseHexFormatException(String hexString)
	        throws XPathException
	    {
	        setHexString(hexString);
	    }

	    public void setHexString(String hexString)
	        throws XPathException
	    {
	        for (int i = 0; i < hexString.length(); i++)
	        {
	            if (judge(hexString.charAt(i)) == -1)
	            {
	                throw new XPathException(hexString + " is not a hex string");
	            }
	        }

	        this.hexString = hexString;
	    }

	    public String getHexString()
	    {
	        return hexString;
	    }

	    private int judge(char ch)
	    {
	        if ((ch >= '0') && (ch <= '9'))
	        {
	            return (ch - '0');
	        }
	        else if ((ch >= 'A') && (ch <= 'F'))
	        {
	            return (ch - 'A' + 10);
	        }
	        else
	            return -1;
	    }

	    public int hexToDec()
	    {
	        int result = 0;
	        for (int i = hexString.length() - 1; i >= 0; i--)
	        {
	            result += judge(hexString.charAt(i)) * (Math.pow(16, (hexString.length() - i - 1)));
	        }
	        return result;
	    }

		public char[] getMessage() {
			// TODO Auto-generated method stub
			return null;
		}


}
