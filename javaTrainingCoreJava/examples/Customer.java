package examples;

/**
 * this object has aggregation and encapsulation covered. encapsulation is
 * nothing but creating a proper channel to access the variable of a class, by
 * making them private and binding them to a public method from where they can
 * be accessed.
 * 
 * @author milo
 */

public class Customer {
	private int id;
	private AddressTest address; //this is aggregation.

	Customer(int id, AddressTest add) {
		this.id = id;
		this.address = add;
	}

	public int getId() {
		return id;
	}

	public AddressTest getAddress() {
		return address;
	}
	
	public String toString(){
		return ("Customers id is: "+id+" and Address is: "+address.getHno()+", "+address.getAddressLine());
	}
}
