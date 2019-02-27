/*//Member Nested class
public class Bank {

	private String loginId="HUDA";
	class OnlineBank
	{
		void message(){
			System.out.println("The loginID is "+loginId);
		}
	}
	void show(){
		OnlineBank ob=new OnlineBank();
		ob.message();
	}
	public static void main(String args[]) {
	 Bank bk=new Bank();
	 bk.show();
	}
}*/

//Local Nested Class
/*public class Bank {
	void show() {
		class OfflineBank{
		  void display() {
			  System.out.println("hello");
		  }
		}
		OfflineBank ob=new OfflineBank();
		ob.display();
	}
	public static void main(String[] args) {
	  Bank bk=new Bank();
	  bk.show();
	  
	}
}*/
/*interface Banking{
	public void transaction();
}
public class Bank implements Banking{
	
	public void transaction() {
		class Show{
			void display() {
				System.out.println("hello");
			}
		}
		Show sh=new Show();
		sh.display();
	}
	public static void main(String args[]) {
		Banking bank=new Bank();
		bank.transaction();
	}
	
}*/
/*public class Bank{
	static class Banking{
		void transaction(){
			System.out.println("Hello");
		}
	}
	public static void main(String args[]){
		Banking bank=new Banking();
		bank.transaction();
	}
}*/
