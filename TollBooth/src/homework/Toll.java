package homework;

public class Toll implements TollBooth {

	private int numberOfTrucks = 0;
	private int total = 0;
	private int tollTotal = 0;
	static int axles = 0;
	int weight = 0;

	public int calculateToll(Truck truck) {

		axles = truck.getAxles();
		weight = truck.getWeight();

		total = (5 * axles) + ((weight / 500) * 10);
		++numberOfTrucks;

		tollTotal = tollTotal + total;

		return total;
	}

	public void displayReciept() {

		String displayMsg = "Truck arrival - Axles: " + axles + " Total weight: " + weight + " Toll due: $" + total;

		System.out.println(displayMsg);

	}

	public static void main(String[] args) {

		Toll toll = new Toll();

		Truck fordTruck1 = new FordTruck(5, 12500);
		Truck fordTruck2 = new FordTruck(7, 15000);
		Truck mercedesTruck = new MercedesTruck(6, 15000);

		toll.calculateToll(fordTruck1);
		toll.displayReciept();
		
		toll.calculateToll(fordTruck2);
		toll.displayReciept();

		toll.calculateToll(mercedesTruck);
		toll.displayReciept();
		
		toll.displayToll();
	}

	public void displayToll() {
		System.out.println("Totals since last collection - Receipts: $" + tollTotal + " Trucks:" + numberOfTrucks);
	}

	public void resetToll() {
		System.out.println("*** Collecting receipts  ***");
		System.out.println("Totals since last collection - Receipts: $" + tollTotal + " Trucks:" + numberOfTrucks);
		tollTotal = 0;
		numberOfTrucks = 0;
	}

}
