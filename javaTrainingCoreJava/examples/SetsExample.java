/**
 * Sets- hashSet, treeSet, linkedhashSet extends Set interface like lists implements List interface and Maps Implements Map interface
 * hash Set - cant reatain any order
 * tree Set - retain natural order or ascending order in numbers and alphabetical order in strings
 * linkedHash Set - uses double linked list and maintain the order in which you entered data
 * 
 * Example alo demonstrates the intersection and difference between two sets.
 */
package examples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {

	public static void main(String[] args) {

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new TreeSet<String>();

		set1.add("dog");
		set1.add("Horse");
		set1.add("elephant");
		set1.add("lion");
		set1.add("cat");

		// Adding a duplicate value will not do anything
		set1.add("dog");

		set2.add("donkey");
		set2.add("dog");
		set2.add("cat");
		set2.add("zebra");
		set2.add("cow");

		Iterator<String> ie = set1.iterator();
		
		System.out.println("set1 : " + set1);
		while (ie.hasNext()) {
			System.out.println(ie.next());
		}
		
		System.out.println("set2 : " + set2);
		for (String s : set2) {
			System.out.println(s);
		}
		
		//intersection
		set1.retainAll(set2);
		System.out.println(set1);
		
		//difference
		set1.removeAll(set2);
		System.out.println(set1);
	}
}
