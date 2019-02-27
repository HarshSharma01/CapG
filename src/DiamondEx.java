import java.util.Scanner;
public class DiamondEx {
	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=1;i<=n;i++){		
				System.out.println(" * ");
				for(int j=1;j<=(2*i-i);j++) {
				System.out.print(" * ");
			}
		}
	}
}
