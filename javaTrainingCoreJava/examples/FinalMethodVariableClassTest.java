package examples;

public class FinalMethodVariableClassTest extends FinalMethodVariable2{

	/*void showMyName() {
		System.out.println("my name from inherited class");
	}*/

	

	FinalMethodVariableClassTest(int finalDiVal) {
		super(finalDiVal);
		// TODO Auto-generated constructor stub
	}

	public static void main(String args[]) {
		FinalMethodVariable2 fvm2 = new FinalMethodVariable2(3000);
		fvm2.showMyName();
	}

}
