package examples;
/**
 * mutli threading,
 * Thread.currentThread().getName().equals("Thread-A") is same as this.getName().equals("Thread")
 * whenever start() method is called it executes the code inside the run method of the respected thread.
 * @author milo
 */
public class ThreadExample extends Thread{
	public ThreadExample(String name) {
		super(name);
	}
	public ThreadExample() {
		
	}
	@Override
	public void run(){
		for(int i = 0; i<6; i++ ){
			try {
				//Thread.currentThread().getName().equals("Thread-A")
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+i);
		}
	}
	public static void main(String[] args) {
		ThreadExample te = new ThreadExample("thread-A");
		ThreadExample te1 = new ThreadExample("thread-B");
		ThreadExample te2 = new ThreadExample("thread-C");
		ThreadRunnableExample tre = new ThreadRunnableExample();
		Thread th = new Thread(tre);
		te.setPriority(MAX_PRIORITY);
		te1.setPriority(NORM_PRIORITY);
		te2.setPriority(MIN_PRIORITY);
		te.start();
		te1.start();
		te2.start();
		th.start();
	}

}
