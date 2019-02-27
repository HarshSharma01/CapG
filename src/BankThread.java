public class BankThread implements Runnable {

	static int bal = 10000;

	static synchronized void deposit(int depAmt) {
		bal = bal + depAmt;
		System.out.println(bal);
	}

	static synchronized void withdraw(int withBal) {
		if(bal<withBal) {
			terminate();
		}
		
		bal = bal - withBal;
		
		System.out.println(bal);
	}

	static synchronized void balcheck() {
		System.out.println(bal);
	}

	static synchronized void terminate() {
		System.out.println("terminated");
	}

	static synchronized void printmess() {
		System.out.println(bal);
	}

	public void run() {
		System.out.println("Current");
	}

	public static void main(String[] args) {

		BankThread tc0 = new BankThread();
		Thread thread0 = new Thread(tc0);

		BankThread tc1 = new BankThread();
		Thread thread1 = new Thread(tc1);

		BankThread tc2 = new BankThread();
		Thread thread2 = new Thread(tc2);

		BankThread tc3 = new BankThread();
		Thread thread3 = new Thread(tc3);

		BankThread tc4 = new BankThread();
		Thread thread4 = new Thread(tc4);
		thread0.start();
		deposit(100);
		thread1.start();
		withdraw(200);

		thread2.start();
		balcheck();

		thread3.start();
		terminate();

		thread4.start();
		printmess();

	}

}
