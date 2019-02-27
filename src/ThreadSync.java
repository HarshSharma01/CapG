
public class ThreadSync implements Runnable {
	public static synchronized void mymethod() {
		int var;
		for (var = 1; var < 9; var++) {
			System.out.println("Thread " + var);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void run() {
		mymethod();
	}

	public static void main(String[] args) {
		ThreadSync tc0 = new ThreadSync();
		Thread tobj0 = new Thread(tc0);

		ThreadSync tc1 = new ThreadSync();
		Thread tobj1 = new Thread(tc1);

		ThreadSync tc2 = new ThreadSync();
		Thread tobj2 = new Thread(tc2);

		tobj0.start();
		tobj1.start();
		tobj2.start();
	}
}
