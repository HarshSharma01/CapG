import java.util.Scanner;

public class AliCode {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char[] check = str.toCharArray();

		if (check[2] == 'A' || check[2] == 'E' || check[2] == 'I' || check[2] == 'O' || check[2] == 'U'
				|| check[2] == 'Y') {

		}
		else {
			System.out.println("invalid");
		}
		if ((check[0] + check[1]) % 2 == 0) { // 1 2
			if ((check[3] + check[4]) % 2 == 0) { // 4 5
				if ((check[4] + check[5]) % 2 == 0) { // 5 6
					if ((check[7] + check[8]) % 2 == 0) {
						System.out.println("valid");
					}
				}
			}
		}
		else {
			System.out.println("invalid");
		}
	}
}
