import java.util.Scanner;
public class CompareTriplets {

	public int[] check(int a[],int b[]) {
		int k=0,l=0;	
		int c[]= new int[2];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>b[i]) {
				k++;
				c[0]=k;
				
			}
			if(a[i]<b[i]) {
				l++;
				c[1]=l;
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int a[]=new int[3];
		int b[]=new int[3];
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]=scan.nextInt();
		}
		CompareTriplets ct=new CompareTriplets();
		int c[]=ct.check(a, b);
		for(int i=0;i<c.length;i++)
		System.out.println(c[i]);
	}
}
