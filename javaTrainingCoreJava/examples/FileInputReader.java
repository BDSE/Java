/**
 *reading from input file.
 *it reads character by character.
 *the stream pointer goes onto every character and we can manipulate it from there. 
 *it also explore File object.
 */

package examples;

import java.io.*;

public class FileInputReader {

	public static void readFile() throws Exception {
		//File fl = new File("Hai.txt");
		FileInputStream fin = new FileInputStream("amar.txt");
		char ch;
		while(fin.available() > 0){
			ch = (char)fin.read();
			System.out.print(ch);
		}
		fin.close();
	}

	public static void main(String[] args) {
		try{
			readFile();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

}
