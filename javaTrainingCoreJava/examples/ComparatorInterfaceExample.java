/**
 * Comparator interface example
 * If you are trying to sort something which doesnt have any particular natural order(like String and integer have the natural order)
 * then we need to define a natural order for that object using a Comparable interface
 */
package examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class StringLengthComparator implements Comparator<String> {
    
	//alphabetical ordering
	@Override
	public int compare(String s1, String s2) {
		return s1.compareTo(s2);
	}

	//@Override
	/*public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		if (len1 > len2)
			return 1;
		else if (len1 < len2)
			return -1;
		else
			return 0;
	}*/

}

public class ComparatorInterfaceExample {
	public static void main(String args[]) {

		// creating arraylist and treeset with strings in it. thus they can be
		// sorted automatically with coleection.sort()
		List<String> arrayList = new ArrayList<String>();
		Set<String> treeSet = new TreeSet<String>();

		addElements(arrayList);
		// Sort the list string since it has a natural order so it will be
		// sorted
		Collections.sort(arrayList);

		// if you want to sort something with some other criteria other than
		// natural order, say length of the string then we have to use the
		// comparator interface
		Collections.sort(arrayList, new StringLengthComparator());
		
		addElements(treeSet);

		showElements(arrayList, "Arraylist");
		showElements(treeSet, "TreeSet");
	}

	public static void addElements(Collection<String> col) {
		col.add("rana");
		col.add("amar");
		col.add("orange");
		col.add("minni");
		col.add("cheekoo");
	}

	public static void showElements(Collection<String> col, String name) {
		System.out.println(">>>>>>>>" + name);
		for (String s : col) {
			System.out.println(s);
		}
	}
}
