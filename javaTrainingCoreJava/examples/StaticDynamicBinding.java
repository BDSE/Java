package examples;

/**
 * Static and dynamic binding example.
 * 
 * @author milo
 */
class Animal {
	void eating() {
		System.out.println("Animal is eating");
	};
}

class Dog extends Animal {
	void eating() {
		System.out.println("dog is eating");
	};

	void sleeping() {
		System.out.println("Dog is sleeping");
	}
}

class Cat extends Animal {
	void eating() {
		System.out.println("cat is eating");
	};

	void sleeping() {
		System.out.println("cat is sleeping");
	}
}

public class StaticDynamicBinding {
	public static void main(String[] args) {
		Animal obj = null;
		String animalType = args[0];
		switch (animalType) {
		case "cat":
			obj = new Cat();
			break;
		case "dog":
			obj = new Dog();
			break;
			default:
			obj = new Animal();
		}
		//obj.sleeping(); //this method is not available in animal only available in its sub classes dog and cat
		obj.eating();
	}

}
