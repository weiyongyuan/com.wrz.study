package concurrent_study.com.wrz.study.thread;

public class ThreadTest implements Runnable {
	
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		
		new Thread(t).run();
		new Thread(t).start();
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " running");

	}
}