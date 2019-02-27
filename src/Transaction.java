import java.util.Scanner;
public class Transaction {

	public static void main(String[] args) {
		int withdraw;
		int bal=10000;
		Scanner scan=new Scanner(System.in);
		withdraw=scan.nextInt();
		bal=bal-withdraw;
        	
        		 if(bal<1000){
						throw new ArithmeticException("Insufficient balance");
					}
        		 
        		 else {
        			 System.out.println(bal);
        		 }
	}
}

//Exception cannot be used in throw 