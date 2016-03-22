package examples;

public class DynamicBindingLooseCoupling2 implements DynamicBindingLooseCoupling {

	@Override
	public void method1() {
		System.out.println("this is method 1 from interface..example of loose coupling and dynamic binding.");
	}

	@Override
	public int method2(int a, int b) {

		int sum = a + b;

		return sum;

	}
	
	public void method3(){
		System.out.println("this method belongs to this class..method3, not from interface");
	}
}