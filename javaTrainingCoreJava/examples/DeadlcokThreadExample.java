package examples;

/**
 * Dead lock- if a thread is waiting for something and other thread is held that
 * thing and this other thread is waiting on something which is held by first
 * thread then it will create a dead lock. this program also has a different way
 * of creating a thread.
 * 
 * @author milo
 */
public class DeadlcokThreadExample {
	public static void main(String args[]) {
		String str1 = "Amar";
		String str2 = "Fateh";
		
		//use of runnable to create thread t1 and thread class to make t2
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				synchronized (str1) {
					System.out.println(Thread.currentThread() +": str1 held");
					synchronized (str2) {
						System.out.println(Thread.currentThread() +": str2 held");
					}
				}
			}
		};
		Thread t1 = new Thread(r1);
		Thread t2 =  new Thread("thread2") {
			public void run() {
				synchronized (str2) {
					System.out.println(Thread.currentThread() +"str2 held");
					synchronized (str1) {
						System.out.println(Thread.currentThread() +" : str1 held");
					}
				}
			}
		};
		TestAnnonymousClss tac = new TestAnnonymousClss(){
			
		};
		t1.start();
		t2.start();
	}

}
