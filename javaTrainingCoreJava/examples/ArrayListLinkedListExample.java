/**
 * Array list and linked list example
 * Array list is faster if we work at the end of it. it uses array mechanism
 * linkedlist is faster if we work in the beginning or in the middle of data structure it uses linked list mechanism
 * in this example adding elements at the end is more faster in Arraylist than in linked list
 * adding element at the begining of arraylist is significantly slower than linked list 
 */
package examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class ArrayListLinkedListExample {
	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<String>();

		// Array list without generics can hold string and integer both
		ArrayList al1 = new ArrayList();
		al1.add("asa");
		al1.add(121);
		for (Object o : al1) {
			System.out.println(o);
		}

		LinkedList ll = new LinkedList();

		al.add("ss");
		al.add("ff");
		al.add("23");
		System.out.println(al instanceof List);
		Iterator<String> ie = al.iterator();

		// see the difference between following two for loops
		for (String s : al) {
			System.out.println("from for loop 1 : " + s);
		}

		for (Object s : al) {
			System.out.println("from for loop 2 : " + s);
		}

		while (ie.hasNext()) {
			System.out.println("from while loop: " + ie.next());
		}

		// Array list implements List interface so it can also be made like this
		// or like the one after wards
		List arraylist = new ArrayList();
		List linkedlist = new LinkedList();

		calculateTime("ArrayList", arraylist);
		calculateTime("Linked list", linkedlist);

	}

	private static void calculateTime(String typeOflist, List l) {

		for (int i = 0; i < 1E7; i++) {
			l.add(i);
		}

		long startTime = System.currentTimeMillis();
		
		//to get an element
		System.out.println(l.get(999999));
		// Add items at end of list use Array list in this case
		/*
		 * for (int i = 0; i < 1E5; i++) { l.add(i); }
		 */

		// Add items at the beginning of list use linked list in this case
		// for (int i = 0; i < 1E5; i++) {
		// l.add(0, i);
		// }

		long endTime = System.currentTimeMillis();
		System.out.println("time take for " + typeOflist + " is " + (endTime - startTime) + " ms");
	}
}
