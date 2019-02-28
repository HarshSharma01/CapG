import java.util.Scanner;

public class BankSync implements Runnable {
	static Scanner scan = new Scanner(System.in);
	int bal = 0;

	public void deposit() {
		//System.out.println("enter dep amt");
		int depAmt = scan.nextInt();
		bal = bal + depAmt;
		System.out.println("the dep amt is" + depAmt);
		System.out.println("bal is" + bal);
	}

	public void withdraw() {
		//System.out.println("enter withdraw amt");
		int withAmt = scan.nextInt();
		bal = bal - withAmt;
		System.out.println("the with amt is" + withAmt);
		System.out.println("bal is" + bal);
	}

	public void run() {
		BankSync sync1 = new BankSync();
		BankSync sync2 = new BankSync();
		
		synchronized (sync1) {
			sync1.deposit();
			sync1.withdraw();
		}
		
		
		synchronized (sync2) {
			sync2.deposit();
			sync2.withdraw();
		}
	}

	public static void main(String[] args) {
		BankSync sync1 = new BankSync();
		BankSync sync2 = new BankSync();

		Thread thread1 = new Thread(sync1);
		Thread thread2 = new Thread(sync2);
		thread1.start();
		thread2.start();
	}
}
