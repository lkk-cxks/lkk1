package github9;

import java.net.BindException;

public class Bin2DecUseBinaryFormatException {
		String binString;
	    public  Bin2DecUseBinaryFormatException(String binString)
	        throws BindException
	    {
	        setBinString(binString);
	    }

	    public void setBinString(String binString)
	        throws BindException
	    {
	        for (int i = 0; i <  binString.length(); i++)
	        {
	            if ((binString.charAt(i) != '0') && (binString.charAt(i) != '1'))
	            {
	                throw new BindException(binString + " is not a binary string");
	            }
	        }

	        this.binString = binString;
	    }

	    public String getBinString()
	    {
	        return binString;
	    }

	    public int bin2Dec()
	    {
	        int result = 0;
	        for (int i = binString.length() - 1; i >= 0; i--)
	        {
	            result += (binString.charAt(i) - '0') * Math.pow(2, binString.length() - i - 1);
	        }

	        return result;
	    }

		public char[] getMessage() {
			// TODO Auto-generated method stub
			return null;
		}
	}
