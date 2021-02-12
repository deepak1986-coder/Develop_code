package desh.deepak;

class MyRunnable implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("From child thread");
		}
	}
}

public class RunnableDemo {
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		for (int j = 10; j < 20; j++) {
			System.out.println("from main thread");
		}

	}
}
