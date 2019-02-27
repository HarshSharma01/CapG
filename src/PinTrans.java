import java.util.*;
public class PinTrans {
    static int tpin=1234;
	public void transaction() {
		int bal=2000;
		System.out.println(bal);
		
	}
	public static void main(String[] args) {
		int attempts=1;
		int pin;
		PinTrans pint=new PinTrans();
		System.out.println("enter pin");
		Scanner scan=new Scanner(System.in);
		pin=scan.nextInt();
		exitTr:	for(int i=0;i<1;i++) {
		 
		if(attempts==1)
		{
			if(pin==tpin) {
				System.out.println("Success "+attempts);
				pint.transaction();
				}
			else {
				System.out.println("try again"+attempts);
				pin=scan.nextInt();
				if(pin==tpin) {
					//System.out.println("Success "+attempts);
					pint.transaction();
					}
				attempts++;
			}
		}
		if(attempts==2) {
			if(pin==tpin) {
				System.out.println("Success "+attempts);
				pint.transaction();
				}
			else {
				System.out.println("try again"+attempts);
				pin=scan.nextInt();
				if(pin==tpin) {
					//System.out.println("Success "+attempts);
					pint.transaction();
					}
				attempts++;
			}
		
		}
		if(attempts==3) {
			if(pin==tpin) {
				System.out.println("Success "+attempts);
				pint.transaction();
				}
			else {
				System.out.println("You have crossed limits"+attempts);
				 break exitTr;
			}
		}
		}
	}
}
