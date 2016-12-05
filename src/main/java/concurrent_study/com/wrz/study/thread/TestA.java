package concurrent_study.com.wrz.study.thread;

public class TestA {

	public static void main(String[] args) {
		Thread t = new Thread() {
			@Override
			public void run() {
				pong();
			}
		};
		t.run();
		System.out.print("ping");
		System.out.println();
		t.start();
		System.out.print("ping");
	}

	static void pong() {
		System.out.print("pong");
	}

}
