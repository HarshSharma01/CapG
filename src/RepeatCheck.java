import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RepeatCheck {

	public static void main(String[] args) {
		int i = 0;
		Scanner scan = new Scanner(System.in);
		int n, count = 0;
		n = scan.nextInt();
		int arr[] = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);

	}
}