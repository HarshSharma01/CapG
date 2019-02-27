public class StrExample {
	public static void main(String[] args) {
		String s1="I am a Btech Student";
		String s2="I am a Btech Student";
		
		int value=30;
		String s=String.valueOf(value);
		
		String s3 = s1.replaceAll("a", "R");
		System.out.println(s3);
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		System.out.println("Char at position "+s1.charAt(3)); //charat
		//System.out.println("Trim "+s1.trim());  //trim
		System.out.println(s);
		if(s1.equals(s2)){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
		if(s1.equalsIgnoreCase(s2)){
			System.out.println("Yes");
		}
		else
			System.out.println("No");
	}
}






//append reverse insert delete replace