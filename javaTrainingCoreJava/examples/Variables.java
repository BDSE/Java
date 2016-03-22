package examples;

public class Variables {
	private int prInt = 100;

	public static void main(String[] args) {
		// byte b = 23;
		int i = 98;
		long l = 232;
		short s = (short) i;
		s = (short) l;

		char ch = 'A';
		char ch1 = (char) i;
		int asciiVal = ch;
		
		System.out.println(asciiVal + " " + ch + " " + ch1);
		
		//char c = (char) args[0];
		Variables v = new Variables();
		TestVariables tv = new TestVariables();

		System.out.println(v.prInt);
		System.out.println(s);

		// private variable is invisible here. create a getter setter for it.
		// System.out.println(tv.prInt2);

	}

}

class TestVariables {
	private int prInt2 = 200;
}
