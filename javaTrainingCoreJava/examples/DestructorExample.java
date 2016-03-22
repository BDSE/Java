package examples;

/**
 * Destructor- used to clean up after the class instances, all variables etc and
 * frees up the memory Java doesnt have a dedicated destructor for each class.
 * protedted void finalize is the method that can be used as a destructor. It is
 * automatically invoked when System.gc() is invoked.
 * 
 * @author milo
 */

public class DestructorExample {
	String name = null;

	DestructorExample(String Name) {
		this.name = Name;
	}

	protected void finalize() {
		System.out.println(name + " is being removed");
	}
 
	public static void main(String[] args) {
		DestructorExample de1 = new DestructorExample("Amar1");
		DestructorExample de2 = new DestructorExample("Amar2");
		DestructorExample de3 = new DestructorExample("Amar3");
		DestructorExample de4 = new DestructorExample("Amar4");

		de1 = null;
		de2 = null;
		de3 = null;
		de4 = null;
		System.out.println("finished cleaning...");
		System.gc();
	}

}
