/**
 * this example have various small things, from youtube channel of Mr durga and Java scjp book.
 * read the individual comments for what they are
 */
package examples;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaBook {

	public static void main(String[] args) {
		
		//operators
		int a, b, c;
		b = 10;
		a = b = c = 20;

		System.out.println(a);
		String a1, b1, c1;
		c1 = new String("cat");
		a1 = new String("mouse");

		b1 = a1;

		a1 = new String("dog");

		c1 = b1;
		System.out.println(c1);
		System.out.println(c1 == b1);

		// isNan
		System.out.println(0.0f / 0.0f);

		String i = "10";
		String j = "20";

		String k = new String("20");
		String l = new String("20");

		System.out.println(i.hashCode() + " " + j.hashCode());
		System.out.println(k == l);

		// regex

		String input = "amar@com.com";

		final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
				+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
		Pattern p = Pattern.compile(EMAIL_PATTERN);
		Matcher m = p.matcher(input);

		System.out.println(m.matches());

		Pattern p1 = Pattern.compile("\\W");

		String arr[] = p1.split("Amar|sandhu|cheekoo|ammi|orange");

		for (String s : arr) {
			System.out.println(s);
		}

		// array of object

		Customer cArr[] = new Customer[11];

		cArr[0] = new Customer(1, new Address("971", "ranjit ave"));
		cArr[1] = new Customer(2, new Address("223", "ranjit ave"));
		cArr[2] = new Customer(3, new Address("323", "ranjit ave"));
		cArr[6] = new Customer(7, new Address("34", "ranjit ave"));
		cArr[10] = new Customer(10, new Address("232", "ranjit ave"));

		for (Customer cstmer : cArr) {
			if (cstmer != null) {
				System.out.println(cstmer.toString());
			}
		}

	}

}
