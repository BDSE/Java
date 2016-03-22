package examples;

public class FinalMethodVariable2 {
	final int TESTVALUE_FORFINAL;
	final static int TESTVALUE2 = 12;
	
	FinalMethodVariable2(int finalDiVal){
		TESTVALUE_FORFINAL = finalDiVal;
	}
	
	final void showMyName(){
		System.out.println("my name is amar");
		System.out.println(TESTVALUE_FORFINAL);
	}

}
