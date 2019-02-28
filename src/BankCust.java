import java.util.Scanner;

public class BankCust implements Runnable {
	static Thread thread = new Thread();

	static Scanner scan = new Scanner(System.in);
	int bal = 0;

	public void deposit() {
		System.out.println("enter dep amt");
		int depAmt = scan.nextInt();
		bal = bal + depAmt;
		System.out.println("the dep amt is" + depAmt);
		System.out.println("bal is" + bal);
	}

	public void withdraw() {
		System.out.println("enter withdraw amt");
		int withAmt = scan.nextInt();
		bal = bal - withAmt;
		System.out.println("the with amt is" + withAmt);
		System.out.println("bal is" + bal);
	}

	public void run() {
		synchronized (thread) {
			deposit();
			withdraw();
		}
	}

	public static void main(String[] args) {
		BankCust sync1 = new BankCust();
		BankCust sync2 = new BankCust();

		Thread thread1 = new Thread(sync1);
		Thread thread2 = new Thread(sync2);
		thread1.start();
		thread2.start();
	}

}
