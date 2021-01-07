package github9;

public class BinaryFormatExceptionextendsException {
		String binString;

	    public void BinaryFormatException(String binString)
	    {
	        this.binString = binString;
	    }

	    public String getBinString()
	    {
	        return binString;
	    }
}
