import java.util.Scanner;

public class SeatArrange {

	public static void main(String[] args) {
		int noCompartments=108;
		int a;
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		switch((a=n%12)) {
		case 1 : System.out.println("WS "+(n+11));
					break;
		case 2 : System.out.println("MS "+(n+9));
					break;
		case 3 : System.out.println("AS "+(n+7));
		break;
		case 4 : System.out.println("MS "+(n+3));
		break;
		
		}
	}
}
