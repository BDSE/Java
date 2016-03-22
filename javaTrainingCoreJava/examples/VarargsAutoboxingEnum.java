package examples;

public class VarargsAutoboxingEnum {
	
		
	// declaring enum- it is a custom datatype contains constants
	// enum is a class
	//can have methods, constructor all but only after enum constants
	public enum Seasons {
		
		//these constants are implicitly static and final
		WINTER, FALL, SUMMER, SPRING
	};

	// variable arguments implementation
	public static void sum(String... values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result = result + Integer.parseInt(values[i]);
		}
		System.out.println(result);
	}

	public static void main(String[] args) {
		
		double pi = Math.PI;

		sum("767", "5", "343", "3", "2");
		sum();

		for (Seasons s : Seasons.values()) {
			System.out.println(s);
		}
	}

}
