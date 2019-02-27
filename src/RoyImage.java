import java.util.Scanner;

public class RoyImage {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int l,w,h;
		l=scan.nextInt();
		w=scan.nextInt();
		h=scan.nextInt();
		if((w<l && h<l)) {
			System.out.println("UPLOAD ANOTHER");
		}
		else if((w>l && h<l)) {
			System.out.println("UPLOAD ANOTHER");
		}
		else if((w<l && h>l)) {
			System.out.println("UPLOAD ANOTHER");
		}
		else if(w==h && w>l) {
			System.out.println("ACCEPTED");
		}
		else if((w>l && w>h)) {
			System.out.println("CROP IT");
		}
		else if((h>l && h>w)) {
			System.out.println("CROP IT");
		}
	}

}
