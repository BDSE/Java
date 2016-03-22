package examples;

public class DynamicBindingLooseCoupling1 {
	public static void main(String[] args) {
		
		//loose coupling
		DynamicBindingLooseCoupling dynamicbindingclass1 = new DynamicBindingLooseCoupling2();
		
		int i = dynamicbindingclass1.i;
		
		dynamicbindingclass1.method1();
		
	}
}
