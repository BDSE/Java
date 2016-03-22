package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
	
	static void scan() throws FileNotFoundException{
		/*File fl = new File("Hai.txt");
		FileInputStream fin = new FileInputStream(fl);
		Scanner sc  = new Scanner(fin);
		String str = sc.next();
		System.out.println(str);*/
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int i = sc.nextInt();
		System.out.println(str+" "+i);
	}

	public static void main(String[] args) {
		try {
			scan();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
