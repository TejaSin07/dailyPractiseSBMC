package in.tejas.exception;
// below class used for user define exception class
// we must have to write our own exception class co it is not predefine exception
public class ProductNotFoundException extends Exception{
	
	public ProductNotFoundException() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductNotFoundException(String msg) {
		super(msg);// check for more details
	}

}
