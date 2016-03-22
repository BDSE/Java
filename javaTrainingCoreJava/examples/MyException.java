package examples;

public class MyException extends Exception{
	
	private static final long serialVersionUID = 2685110916201785737L;
	
	MyException(String errorMsg){
		super(errorMsg);
	}

}
