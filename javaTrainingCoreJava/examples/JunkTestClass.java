package examples;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class JunkClass2 {

	static void junkClassStatic2() {
		int ki = 1+1+1+1+1+1+1+1+1+1+1+1*0+1;
		System.out.println("junclass 2 static method called");
		System.out.println("funny stuff"+ki);
	}

	void junkClass2() {
		System.out.println("junclass 2 non static method called");
	}
}

public class JunkTestClass<J> {
	int kl = 10;

	public void variableTest() {

		// public variable cant be declared as a local
		// public static final int i = 10;

		final int i = 10;

		int k = 22;

		int j = variabletest2();

	}

	public static int variabletest2() {
		return 10;

		// cant make a static refrence to non static feild
		// kl= 23;
	}

	public static void main(String args[]) throws SQLException {
		//Make a thread
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("annonymous class- as a thread");
			}
		};
		t1.start();
		// call junk class 2 methods
		JunkClass2.junkClassStatic2();
		
		//invalid junkClass2 is instance variable and not class 
		//JunkClass2.junkClass2();

		// testObj3 s = testMethod();

		testMethodForClass();
		int a = 0;
		try {
			a = System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a + ":" + (char) a);
		String str = testStringMethod();
		Object obj = new String("Amar");
		String s = (String) obj;

	}

	/**
	 * important concept, new way of returnig a class it is actually
	 * implementing the {@link InterfaceForJunkClass} interface so we have to
	 * prove the abstract methods from this interface
	 * 
	 * @return
	 */
	public InterfaceForJunkClass interfaceTestMethod() {
		return new InterfaceForJunkClass() {

			@Override
			public void showName() {
				// TODO Auto-generated method stub

			}

			@Override
			public int sum(int a, int b) {
				// TODO Auto-generated method stub
				return 0;
			}

		};

	}

	/**
	 * 
	 * @return
	 */
	public static void testMethodForClass() {
		TestClassForJunkClass tc = new TestClassForJunkClass() {
			public void testShow1() {
				System.out.println("hello new");
			}
		};
		tc.showTest();
		// tc.testShow1();
	}

	public static testObj3 testMethod() {
		testObj2 tb2 = null; // testobj2 is an interface
		testObj3 tb3 = new testObj3(); // testObj3 is class
		testObject tb = null;// testObject is an enum
		String str = null; // string is a class
		return tb3;
		// Connection con = DriverManager.getConnection("asdasd");// connection
		// is an interface
	}

	public static String testStringMethod() {
		String s = "Amar";
		return s;
	}
}
