package datastructures;

public class SortingObjectsUsingGenerics<T> {
	
	public void sort(Comparable<T>[] objects) {
		for (int i = 0; i < objects.length; i++) {
			Comparable<T> current = objects[i];
			int j = i - 1;
			while (j >= 0 && objects[j].compareTo((T) current) > 0) {
				objects[j + 1] = objects[j];
				j--;
			}
			objects[j + 1] = current;
		}
	}

	public static void main(String[] args) {
		String [] arrString = {"orange","ammo","ammi","Ammi","cheekoo","mango","laddu"};

		Circle[] circles = { new Circle(12), new Circle(4), new Circle(2), new Circle(19), new Circle(6) };

		SortingObjectsUsingGenerics<Circle> sorter = new SortingObjectsUsingGenerics<Circle>();
		SortingObjectsUsingGenerics<String> sorter2 = new SortingObjectsUsingGenerics<String>();

		sorter.sort(circles);
		sorter2.sort(arrString);

		for (int i = 0; i < circles.length; i++) {
			System.out.println(circles[i].toString());
		}
		for(String s: arrString){
			System.out.println(s);
		}
	}
}
