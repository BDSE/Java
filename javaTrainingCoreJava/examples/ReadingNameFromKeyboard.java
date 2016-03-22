package examples;

import java.io.IOException;

public class ReadingNameFromKeyboard {

	public static String readNumber() {
		String name = " ";
		char ch;
		System.out.println("enter your name and press enter");
		try {
			do {
				ch = (char) System.in.read();
				if (ch != 13) {
					name = name + ch;
				}

			} while (ch != 13);
			System.out.println("hello : " + name);
		} catch (IOException ie) {
			ie.printStackTrace();
		}
		return name;
	}

	public static void main(String[] args) {
		String name1 = readNumber();
		System.out.println(name1);
	}

}
