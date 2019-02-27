
public class Customers {
	public void transaction(String name, int bal) {
		System.out.println(name+bal);
		
	}
	protected void finalize() throws Throwable{
		System.out.println("From finalize");
	}
	public static void main(String[] args) {
		Customers c1=new Customers();
		Customers c2=new Customers();
		c1.transaction("harsh", 10000);
		c2.transaction("shruthi",20000);
		c1=c2;
		System.gc();
		Runtime.getRuntime().runFinalization();
		//System.out.println(c2);
	}
}
