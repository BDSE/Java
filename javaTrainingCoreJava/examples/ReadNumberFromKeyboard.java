package examples;

/**
 * when anything is entered from keyboard its taken character by character,
 *  even the numbers return the ASCII code as int
 * int a = system.in.read()
 * @author milo
 */
import java.io.IOException;

public class ReadNumberFromKeyboard {

	public static String readNumber() throws IOException {
		String numberStr = "";
		char ch = ' ';
		do {
			ch = (char) System.in.read();
			numberStr = numberStr+ch;
		} while (ch != 13);
		return numberStr;

	}

	public static void main(String[] args) {
		int a = 0, b = 0, result;

		try {
			System.out.println("please enter first number");
			a = Integer.parseInt(readNumber());

			System.out.println("please enter 2nd number");
			b = Integer.parseInt(readNumber());
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		result = a + b;
		System.out.println(result);
	}

}
