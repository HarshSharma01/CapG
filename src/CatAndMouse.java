import java.util.Scanner;

public class CatAndMouse {

	public String catMouse(int x, int y, int z) {
		String ans = null;
		if ((Math.abs(z - x)) > Math.abs(y - z)) {
			ans = "Cat B";
		} else if ((Math.abs(z - x)) < Math.abs(y - z)) {
			ans = "Cat A";
		} else {
			ans = "Mouse C";
		}

		return ans;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int q = scan.nextInt();
		String result[]=new String[q];
		CatAndMouse cam = new CatAndMouse();
		for (int i = 0; i < q; i++) {
			int x = scan.nextInt();
			int y = scan.nextInt();
			int z = scan.nextInt();
			result[i] = cam.catMouse(x, y, z);
		}
		for (int i = 0; i < q; i++) {
			System.out.println(result[i]);
		}
	}
}
