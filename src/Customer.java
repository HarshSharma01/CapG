import java.util.HashMap;
import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		String customerName = null;
		long accountNo = 0;

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			accountNo = scan.nextLong();
			customerName = scan.next();
		}

		HashMap<Long, String> hashm = new HashMap<Long, String>();

		for (int i = 0; i < n; i++) {
			hashm.put(accountNo, customerName);
		}

		for (int i = 0; i < n; i++) {
			if (customerName.charAt(0) > 65 && customerName.charAt(0) < 94)
				System.out.println(hashm.values());
		}

	}

}
