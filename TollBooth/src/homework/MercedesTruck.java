package homework;

public class MercedesTruck implements Truck {

	private int axles;
	private int weight;

	public MercedesTruck(int axles, int total) {
		this.axles = axles;
		this.weight = total;
	}

	public int getAxles() {
		return axles;
	}

	public void setAxles(int axles) {
		this.axles = axles;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
