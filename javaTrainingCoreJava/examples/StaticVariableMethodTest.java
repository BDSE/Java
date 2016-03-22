package examples;

public class StaticVariableMethodTest {

	public static void main(String[] args) {
		
		Student s1 = new Student(20, 2); 
		Student s2 = new Student(30, 3); 
		Student s3 = new Student(40, 4); 
		Student s4 = new Student(50, 5); 
		
		s1.printNumbers();
		s2.printNumbers();
		s3.printNumbers();
		s4.printNumbers();
		
		Student.staticMethod();
	}
	
}
class Student{
	private static int a = 0;
	private int b = 0;
	Student(int a, int b){
		this.a = a;
		this.b = b;
	}
	void printNumbers(){
		System.out.println("instance variable is:"+b+" "+"static variable is:"+a);
	}
	static void staticMethod(){
		System.out.println("this is static method");
	}
}
