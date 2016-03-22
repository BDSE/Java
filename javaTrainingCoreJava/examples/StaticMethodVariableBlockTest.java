package examples;

class StaticTest {

	static int a = 10;
	static int b = 20;

	static void add() {
		System.out.println(a + b);
	}
}

public class StaticMethodVariableBlockTest extends StaticTest{

	StaticMethodVariableBlockTest smvb = new StaticMethodVariableBlockTest();

	public static void main(String[] args) {

		StaticMethodVariableBlockTest.add();
	}

}
