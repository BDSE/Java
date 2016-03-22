package examples;

/**
 * Contrary to the SynchronizedThreadFailureExample this example shows the
 * synchronization reason for that is in previous example we have created to
 * different instances they are not shared in this example we have created only
 * one instance of {@link MyTable} and shared in between two threads
 * 
 * @author milo
 */

class MyTable {

	public void printMyTable(int n) {
		System.out.println("N is : " + n);
		synchronized (this) {
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

public class SynchronizedThreadsWorkingCase {
	public static void main(String args[]) {
		MyTable obj = new MyTable();
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);

		t1.start();
		t2.start();
	}
}

class MyThread1 extends Thread {
	MyTable mt1;

	public MyThread1(MyTable mt1) {
		this.mt1 = mt1;
	}

	public void run() {
		mt1.printMyTable(5);
	}
}

class MyThread2 extends Thread {
	MyTable mt2;

	public MyThread2(MyTable mt2) {
		this.mt2 = mt2;
	}

	public void run() {
		mt2.printMyTable(10);
	}
}