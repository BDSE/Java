package examples;

public class WrapperClassesTest {

	public static void main(String[] args) {
		
		int i = 10;
		
		Integer j = new Integer(i);
		int k = j.intValue();
		System.out.println(i+" "+j.intValue()+" "+j);
		
	}

}
