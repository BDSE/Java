package examples;

/**
 * refrence variables - str2 is a refrence variable and has a refrence to str1
 * stored in memory similarly s3 s4 are refrences pointing to s2 memory location
 * s3 is of type Object so it will have all methods from Object but not from
 * student. Object is a base class of all classes so student1 class is also
 * inherited from it. Due to this reason we can do Object s3 = s2; but we cant
 * do System s5 = s2; constructor overloading this implementation super
 * implementation
 * 
 * @author milo
 */

public class ConstructorThisRefrenceVariableSuper {
	static {
		System.out.println("from static block");
	}

	public static void main(String args[]) {
		Student1 s1 = new Student1();
		Student1 s2 = new Student1("Amar", 2323);

		Object s3 = s2; // refrence variable
		Student1 s4 = s2; // refrence variable
		// System s5 = s2; //this is wrong

		System.out.println("s1 : " + s1.hashCode() + " s2 : " + s2.hashCode() + " s3 : " + s3.hashCode() + " s4 : "
				+ s4.hashCode());

		s1.showConstructorExampleMethod();
		s2.showConstructorExampleMethod();
	}

}

class Student1 {
	String str1 = "Amar";
	String str2 = str1;
	private String studentName;
	private int studentID;

	Student1() {
		this("Amarfateh from this", 143066);
		// this.showConstructorExampleMethod();
		System.out.println("default constructor is called");
	}

	Student1(String studentName, int studentId) {
		this.studentName = studentName;
		this.studentID = studentId;
	}

	public void showConstructorExampleMethod() {
		System.out.println("value of this is: " + this.toString());
		System.out.println("value of string1 is: " + this.str1.hashCode());
		System.out.println("value of string2 is: " + this.str2.hashCode());
		System.out.println("parameterized constructor is called " + studentName + " : " + studentID);
	}

	public void thisTestMethod() {
		System.out.println("this method test" + studentName + " : " + studentID);
	}
}