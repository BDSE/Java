/**
 * String is immutable, its value cant be changed.
 * String bilder is a better option if you want to make changes to your strings
 * 
 * this exapmle also has \t, \n 
 * and %d %2d
 */
package examples;

public class StringBuilderBuffer {
	public static void main(String[] args) {
		
		String test = "";
		
		//inefficient as test is created new every time we try to change it
		test += "Hello my name is Amar";
		test += "I am a Student";
		System.out.println(test);
		
		//Efficient way
		StringBuilder sb = new StringBuilder();
		sb.append("hello");
		sb.append("world");
		System.out.println(sb);

	}
}
