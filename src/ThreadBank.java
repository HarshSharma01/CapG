import java.util.Scanner;

public class ThreadBank implements Runnable {
	static int balance = 0;
	static Scanner scan = new Scanner(System.in);
	private static ThreadBank bank;

	public void withdraw() {
		System.out.println("Enter Withdraw Amount");
		int withdrawAmt = scan.nextInt();
		if (withdrawAmt > balance) {
			System.out.println("Enter an amount first as bal is less");
			synchronized (this) {
				try {
					wait();
					deposit();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		} else {
			balance = balance - withdrawAmt;
		}
	}

	public void deposit() {
		System.out.println("Enter Deposit Amount");
		int depAmt = scan.nextInt();
		balance = balance + depAmt;
		synchronized (this) {
			notify();
		}
	}

	public void run() {

	}

	public static void main(String[] args) {
		ThreadBank threadBank = new ThreadBank();
		Thread thread1 = new Thread(threadBank);
		Thread thread2 = new Thread(threadBank);
		thread1.start();
		threadBank.withdraw();
		thread2.start();
		threadBank.deposit();
		System.out.println("balance is" + balance);
	}
}