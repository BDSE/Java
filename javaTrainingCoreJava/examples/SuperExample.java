package examples;

/**
 * When instance of a derived class is created, an instance of base class is
 * also created implicitly. If you create a constructor in the base class which
 * is not default and its only one then in the derived class you will have to
 * create a constructor which call the base class's constructor because other
 * wise how will the base class be constructed if there is no default
 * constructor present.
 * @author milo
 * 
 */

class Vehicle {
	int maxSpeed;
	String hp;
	String brand;
	int superTestvariable = 100;

	Vehicle() {
		System.out.println("default constructor of base class");
		showVehicle();
	}

	Vehicle(int maxSpeed, String hp, String brand) {
		this.maxSpeed = maxSpeed;
		this.hp = hp;
		this.brand = brand;
		System.out.println("parameterized constructor of base class");
		showVehicle();
	}

	public void showVehicle() {
		System.out.println(brand + " has max speed : " + maxSpeed + " horse power : " + hp);
	}
}

public class SuperExample extends Vehicle {
	int superTestvariable = 60;

	SuperExample(int maxSpeed, String hp, String brand) {
		super(maxSpeed, hp, brand);
	}
	SuperExample(){
		super();
	}
	public static void main(String args[]) {
		SuperExample se1 = new SuperExample();
		SuperExample se2 = new SuperExample(200,"300hp","Audi");
		se1.showSuperVal();
		se2.showSuperVal();
	}

	private void showSuperVal() {
		System.out.println(superTestvariable + " : " + super.superTestvariable);
	}
}
