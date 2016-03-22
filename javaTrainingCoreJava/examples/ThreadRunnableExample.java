package examples;

public class ThreadRunnableExample implements Runnable {

	public static void main(String[] args) {
		ThreadRunnableExample tre = new ThreadRunnableExample();
		// Runnable tre = new ThreadRunnableExample();
		Thread th = new Thread(tre);
		th.start();

	}

	@Override
	public void run() {
		
		for(int i = 0; i< 6; i++){
			System.out.println("runnable"+i);
		}
	}

	public void testmethod() {
		System.out.println("amar");
	}

}
