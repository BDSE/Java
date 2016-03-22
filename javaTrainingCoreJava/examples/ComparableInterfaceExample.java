/**
 * In case, we want to sort a custom object say person then Colestions.sort will not be
 * able to do so as it doesn't know any natural order.
 * In this case we need to use the Comparable interface and define that objects natural order.
 */
package examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Person implements Comparable<Person> {

	int id;
	String name;

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Person p) {
		if(id==p.getId())
			return 0;
		if(id > p.getId())
			return 1;
		else
			return -1;
	}
}

public class ComparableInterfaceExample {

	public static void main(String[] args) {

		List<Person> arrayListPerson = new ArrayList<Person>();
		Set<Person> treeSetPerson = new TreeSet<Person>();

		addElements(arrayListPerson);
		Collections.sort(arrayListPerson);
		// tree set maintains the natural order of the data, if data doesnt have
		// a natural order than we cant create a tree set like in the case of
		// person object we created here
		// before adding we need to provide the natural order of the object so
		// that tree set can can sort it that way
		addElements(treeSetPerson);

		showElements(arrayListPerson, "ArrayListPerson");
		showElements(treeSetPerson, "TreeSetPerson");
	}

	public static void addElements(Collection<Person> col) {
		col.add(new Person(100, "rana"));
		col.add(new Person(200, "amar"));
		col.add(new Person(600, "orange"));
		col.add(new Person(400, "minni"));
		col.add(new Person(90, "cheekoo"));
	}

	public static void showElements(Collection<Person> col, String name) {
		System.out.println(">>>>>>>>" + name);
		for (Person p : col) {
			System.out.println(p.getId() + ":" + p.getName());
		}
	}

}
