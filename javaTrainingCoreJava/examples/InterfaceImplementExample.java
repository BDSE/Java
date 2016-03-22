package examples;

import packageA.InterfaceExample3;

public class InterfaceImplementExample implements InterfaceExample1 {
	static int result1 = 0;
	String test = "testing";

	public static void main(String args[]) {
		InterfaceImplementExample iee = new InterfaceImplementExample();

		result1 = iee.addANumberToNumber1();
		System.out.println(result1);
		iee.testMethod();
		testMethod2();
	}

	@Override
	public testObj2 show() {
		System.out.println("Amar-interface used--" + test);
		return null;

	}

	@Override
	public int addANumberToNumber1() {
		int result = InterfaceImplementExample.NUMBER1 + 100;
		return result;
	}

	public void testMethod() {
		System.out.println("from testMethod" + test);
		System.out.println("from testMethod" + result1);
		show();
	}

	public static void testMethod2() {
		InterfaceImplementExample iee = new InterfaceImplementExample();
		System.out.println("from testMethod2" + iee.test); // non static variable test
		System.out.println("from testMethod2" + result1); //static varialble result1
	}

	@Override
	public void showMyName() {
		// method from interfaceExample2
		
	}

	@Override
	public InterfaceExample3 showInterfaceExample3() {
		
		return null;
	}
}
