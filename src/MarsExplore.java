import java.util.Scanner;

public class MarsExplore {

	public int marsexp(String s) {
		int diff = 0;
		char[] c=s.toCharArray();
		for(int i=0;i<c.length-3;i++) {
			if((c[i]=='S') && (c[i+1]=='O') && (c[i+2]=='S')) {
				diff=0;
				i+=2;
			}
			else if((c[i]!='S')  || (c[i+1]!='O') || (c[i+2]!='S')) {
				diff++;
			}
		}
		
		return diff;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String mess;
		mess = scan.next();
		MarsExplore me = new MarsExplore();
		int result = me.marsexp(mess);
		System.out.println(result);
	}

}
