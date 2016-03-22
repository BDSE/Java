package examples;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * explores the reg ex. two method to filter email id and an indian phone number
 * 
 * @author milo
 *
 */
public class RegExExample {

	public static void main(String[] args) {
		
		checkEmail("amar-sandhu@gmail.co.in");
		checkPhoneNumber("919915941437");

	}

	public static void checkEmail(String id) {
		//String regex = "[a-zA-Z0-9][a-zA-Z0-9._-]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)+";
		
		//only for gmail.co.in
		String regex = "[a-zA-Z0-9][a-zA-Z0-9._-]*@gmail\\.co\\.in";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(id);

		System.out.println(m.matches());
	}
	public static void checkPhoneNumber(String num) {
		String regex = "(0|91)?[7-9][0-9]{9}";
		Pattern p = Pattern.compile(regex);

		Matcher m = p.matcher(num);

		System.out.println(m.matches());
	}
}
