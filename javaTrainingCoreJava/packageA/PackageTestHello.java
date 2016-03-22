package packageA;

import packageB.PackageTestHai;

public class PackageTestHello {

	public static void main(String[] args) {
		
		PackageTestHai pth = new PackageTestHai();
		pth.hai();
		Test t = new Test("Amar-testing constructor argument");
	}
	public static void testMethod3(){
		System.out.println("diff package");
	}

}
