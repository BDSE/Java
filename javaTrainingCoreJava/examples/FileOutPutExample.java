package examples;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutPutExample {

	public static void main(String[] args) {
		try {
			createFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createFile() throws IOException {
		//DataInputStream din = new DataInputStream(System.in);
		System.out.println("enter file name");
		Scanner sc = new Scanner(System.in);
		String fileName = sc.nextLine();
		//String fileName = din.readLine();
		
		//file writre can also be used
		//FileWriter fout = new FileWriter(fileName,true);
		FileOutputStream fout = new FileOutputStream(fileName,true);
		System.out.println("enter data");
		int ch;
		do{
			ch = System.in.read();
			if(ch == (int)'.')
				break;
			else
				fout.write(ch);
		}
		while(true);
		fout.close();
	}

}
