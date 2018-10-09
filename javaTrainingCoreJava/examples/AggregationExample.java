package examples;

/**
 * concepts of oops inheritance,polymorphism,encapsulation, aggregation data
 * binding data hiding multiple inheritence is not allowed in java, to implement
 * it we use interfaces. Aggregation is just accesing a object say Address,
 * inside another object say Employee. refer to class employee and address.
 * 
 * @author milo
 */

public class AggregationExample {

	public static void main(String[] args) {
		AddressTest add = new AddressTest("Hno 971", "Ranjit Avenue Asr.");
		Customer c = new Customer(100, add);

		System.out.println("Aggregation Example" + c.getAddress().getAddressLine());
	}

}
