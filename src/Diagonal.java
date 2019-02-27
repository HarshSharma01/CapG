import java.util.Scanner;
public class Diagonal {
	static int diagonalDifference(int[][] arr) {
		int sum3,sum1 = 0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i==j) {
					sum1=sum1+arr[i][j];
				}
			}
		}
		for(int i=arr.length-1;i>0;i--) {
			for(int j=0;j<arr.length-i;j++) {
		      sum2=sum2+arr[i][j];
			}
		}
		sum3=sum2-sum1;
		return sum3;
	}
	
	public static void main(String[] args) {
		int m,n;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter m");
		m=scan.nextInt();
		//n=scan.nextInt();
		int a[][]=new int[m][m];
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		Diagonal dg=new Diagonal();
		int c=dg.diagonalDifference(a);
		System.out.println(c);	
	}
}
