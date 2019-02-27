
public class ThreadRun implements Runnable {

	public String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) throws Exception {
		ThreadRun tc0 = new ThreadRun();
		Thread thread0 = new Thread(tc0);

		ThreadRun tc1 = new ThreadRun();
		Thread thread1 = new Thread(tc1);

		ThreadRun tc2 = new ThreadRun();
		Thread thread2 = new Thread(tc2);

		ThreadRun tc3 = new ThreadRun();
		Thread thread3 = new Thread(tc3);

		thread0.setName("T0");
		thread1.setName("T1");
		thread2.setName("T2");
		thread3.setName("T3");

		thread0.start();
		thread0.join(5000);
		Thread.sleep(5000);
		thread1.start();
		thread1.join(5000);
		Thread.sleep(5000);
		thread2.start();
		thread2.join(5000);
		Thread.sleep(5000);
		thread3.start();
	}

}