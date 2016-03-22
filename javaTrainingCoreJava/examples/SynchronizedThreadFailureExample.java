package examples;

/**
 * very important concept---below example doesnt show any synchronized behaviour
 * {@link MyTable} is not being shared with two threads
 * @author milo
 *
 */

class MyTable1 {
	int n;

	MyTable1(int n) {
		this.n = n;
	}

	public void printMyTable() {
		System.out.println("N is : " + n);
		synchronized (Thread.currentThread()) {
			for (int i = 1; i <= 5; i++) {
				System.out.println(n * i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}
}

public class SynchronizedThreadFailureExample {
	public static void main(String args[]) {
		MyThread11 t1 = new MyThread11();
		MyThread22 t2 = new MyThread22();

		t1.start();
		t2.start();
	}
}

class MyThread11 extends Thread {
	MyTable1 mt1;

	public void run() {
		mt1 = new MyTable1(5);
		mt1.printMyTable();
	}
}

class MyThread22 extends Thread {
	MyTable1 mt2;

	public void run() {
		mt2 = new MyTable1(10);
		mt2.printMyTable();
	}
}