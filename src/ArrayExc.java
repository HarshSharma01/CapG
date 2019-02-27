import java.util.Scanner;
public class ArrayExc {
	public static void main(String[] args) {
		int emiMonth=1;
		int amount=32000;
		int lastTrans[]=new int[5];
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println(amount/emiMonth);
		for(int i=0;i<6;i++) {
			lastTrans[i]=scan.nextInt();
		}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		/*for(int i=0;i<lastTrans.length;i++) {
		System.out.println(lastTrans[i]);
		}*/
	}
}