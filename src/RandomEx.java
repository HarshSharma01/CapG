import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		Random ran = new Random();
		long pwd;
		pwd = ran.nextInt();
		System.out.println("sss " + Math.abs(pwd));
	}
}