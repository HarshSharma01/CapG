
public class ThreadPriority implements Runnable {

	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadPriority tp0 = new ThreadPriority();
		Thread tc0 = new Thread(tp0);

		ThreadPriority tp1 = new ThreadPriority();
		Thread tc1 = new Thread(tp1);

		tc0.setName("T0");
		tc1.setName("T1");

		tc0.setPriority(Thread.MIN_PRIORITY);
		tc1.setPriority(Thread.MAX_PRIORITY);

		System.out.println(tc0.getPriority());
		System.out.println(tc1.getPriority());
		
		tc0.start();
		tc1.start();

	}

}
