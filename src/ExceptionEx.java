public class ExceptionEx {
	public static void main(String[] args) {
		int emiMonth=0;
		int amount=32000;
		try {
		System.out.println(amount/emiMonth);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		//System.out.println("EMI");
		
	   finally {
			System.out.println("Hi");
		}
		
	}
}