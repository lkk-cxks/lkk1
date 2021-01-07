package github9;

public class HexFormatExceptionextendsException {
		String hexString;
		public HexFormatExceptionextendsException(String hexString){
			super();
	        this.hexString = hexString;
		}
		public String getHexString(){
	        return hexString;
	    }
}
