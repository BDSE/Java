package examples;

/**
 * @author milo 
 * Abstract class example, its just like interface used for the
 * purpose to achieve abstraction. it can have non abstract methods too
 * unlike interface. class extending abstract class have to provide
 * definition of all abstract methods.
 *         
 */
abstract class AbstractExp1 {
	

	void print() {
		System.out.println("aaddssds");
	}

	abstract void show();
}

public class AbstractClassOverideExample extends AbstractExp1 {

	public static void main(String[] args) {
		AbstractClassOverideExample acoe = new AbstractClassOverideExample();
		acoe.show();
		acoe.print();
	}

	@Override
	void show() {
		System.out.println("abstract method defination");

	}

}
