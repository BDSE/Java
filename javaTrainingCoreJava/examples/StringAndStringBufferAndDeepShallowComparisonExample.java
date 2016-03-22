package examples;

/**
 * String is immutable, means its value cant change if you change it a new
 * memory location is assigned. So string buffer is better as it is mutable ==
 * is shallow comparison it compares memory location equals is deep comparison
 * it compares values
 * 
 * @author milo
 */

public class StringAndStringBufferAndDeepShallowComparisonExample {

	String s1 = "Amar";
	String s2 = "Amar";
	String s3 = new String("Amar");

	StringBuffer sb1 = new StringBuffer("Amar fateh");

	public static void main(String[] args) {
		StringAndStringBufferAndDeepShallowComparisonExample ssbdsc = new StringAndStringBufferAndDeepShallowComparisonExample();
		ssbdsc.sb1.append(" Singh");
		ssbdsc.sb1.append(" Sandhu");
		
		System.out.println("s1 : "+ssbdsc.s1.hashCode()+" s2 : "+ssbdsc.s2.hashCode()+" s3 : "+ssbdsc.s3.hashCode());
		System.out.println(ssbdsc.s1.equals(ssbdsc.s2)); 
		System.out.println(ssbdsc.s1.equals(ssbdsc.s3));
		System.out.println(ssbdsc.s1 == ssbdsc.s2);
		System.out.println(ssbdsc.s1 == ssbdsc.s3);
		ssbdsc.s1 = "Ammu";
		System.out.println("s1 : "+ssbdsc.s1.hashCode()+" s2 : "+ssbdsc.s2.hashCode()+" s3 : "+ssbdsc.s3.hashCode());
		System.out.println(ssbdsc.sb1);
	}
	void printmethod(String data){
		System.out.println(data);
	}

}
