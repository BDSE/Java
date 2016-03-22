/**
 * this class creates byte stream from the StudentSerializable object and stores on computer
 * it also reads the stored data file(deserialization)
 */
package examples;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectSerializationAndDeserialization {

	static {
		System.out.println("type r for reading and w for writting a file");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String what = sc.nextLine();

		if (what.equalsIgnoreCase("w")) {
			System.out.println("enter file name");
			String fl = sc.nextLine();
			writeObj(fl);
		} else if (what.equalsIgnoreCase("r")) {
			System.out.println("what file do you want to read");
			String fn = sc.nextLine();
			readObject(fn);
		}
	}

	public static void writeObj(String fl) {
		SerializableStudent s = new SerializableStudent(1000, "Amar", "ECE", "90percent");
		try {

			FileOutputStream fop = new FileOutputStream(fl);
			ObjectOutputStream oot = new ObjectOutputStream(fop);

			oot.writeObject(s);
			oot.flush();
			System.out.println("object saved successfully...");
		} catch (Exception io) {
			io.printStackTrace();
		}

	}

	public static void readObject(String fn) {
		try {
			FileInputStream fin = new FileInputStream(fn);
			ObjectInputStream oin = new ObjectInputStream(fin);
			
			SerializableStudent s1 = (SerializableStudent)oin.readObject();
			System.out.println(s1.toString());
		} catch (FileNotFoundException e) {
			System.out.println("File not foud please enter another file name");
			main(null);
		} catch (IOException ie) {
			ie.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
