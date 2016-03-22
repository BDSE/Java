package datastructures;

public class TowerOfHanoi {
	long i = 0;

	public void move(int n, char from, char to, char inter) {
		if (n == 1) {
			System.out.println("Moving Disc 1 from " + from + " to " + to);
			i = i + 1;
		} else {
			move(n - 1, from, inter, to);
			System.out.println("Moving Disc " + n + " from " + from + " to " + to);
			i = i + 1;
			move(n - 1, inter, to, from);
		}
	}

	public static void main(String[] args) {

		TowerOfHanoi th = new TowerOfHanoi();
		th.move(21, 'A', 'C', 'B');
		System.out.println("total number of steps required : "+th.i);
	}

}
