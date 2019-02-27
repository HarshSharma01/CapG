
public class WrapperEx {
	public static void main(String[] args) {
		Integer x=5;
		x=x+10;
		System.out.println(x);
		
		//converting integer to  int
		Integer a=new Integer(3);
		int i=a.intValue();
		int j=a;
		System.out.println(a+" "+i+" "+j);
		
		//converting int to integer
		int b=10;
		Integer k=Integer.valueOf(b);
		Integer l=b; //autoboxing
		System.out.println(b+" "+k+" "+l);
		
		//xxxvalue
		Integer m=5;
		System.out.println(m.byteValue());
		System.out.println(m.doubleValue());
		
		System.out.println(x.compareTo(3));
		System.out.println(x.compareTo(5));
		System.out.println(x.compareTo(8));
		
	}
}
