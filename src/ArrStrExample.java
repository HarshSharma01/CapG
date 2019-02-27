public class ArrStrExample {
public static void main(String args[])
{
	//String example
	
	String name="Harsh";   //literal
	String myName1=new String(); //heap method
	myName1="Dinesh";
	String myName2=new String("Jai"); //heap method
	StringBuffer sbName=new StringBuffer("Rahul");   //buffer
	StringBuilder sBuilder=new StringBuilder("Kala"); //builder
	
	System.out.println("The string buffer name is "+sbName);
	System.out.println("The string literal name is "+name);
	System.out.println("The 1 name is "+myName1);
	System.out.println("The 2 name is "+myName2);
	System.out.println("The string builder name is "+sBuilder);
	
	System.out.println("Length of String Literal"+name.length());
	System.out.println("Length of String 1 "+myName1.length());
	System.out.println("Length of String 2 "+myName2.length());
	System.out.println("Length of String Buffer "+sbName.length());
	System.out.println("Length of String Builder "+sBuilder.length());
	System.out.println("capacity of String Buffer "+sbName.capacity());
	System.out.println("capacity of String Builder "+sBuilder.capacity());
	
	//arrays example
	int[] intArray=new int[5];
	intArray[0]=10;
	intArray[1]=20;
	intArray[2]=30;
	intArray[3]=40;
	intArray[4]=50;
	float[] floatArr= {2.0f,3.0f};
	int[] array= {10,20,30,40,50};
	char[] charArr=new char[5];
	charArr[0]='a';
	charArr[1]='b';
	charArr[2]='c';
	charArr[3]='d';
	charArr[4]='e';
	for(int i=0;i<5;i++) {
	System.out.println("The integer array is "+array[i]);
	}
	for(int i=0;i<2;i++) {
		System.out.println("The float array is "+floatArr[i]);
		}
	for(int i=0;i<5;i++) {
		System.out.println("The integer intarray is "+intArray[i]);
		}
	for(int i=0;i<5;i++) {
		System.out.println("The char array is "+charArr[i]);
		}
	System.out.println("Length of integer array "+intArray.length);
	System.out.println("Length of float array "+floatArr.length);
	System.out.println("Length of  array "+array.length);
	System.out.println("Length of char array "+charArr.length);
	System.out.println("Length of name "+name.length());
}
}


/*Note String Literal stores in String pool -------duplicates not allowed ----- one memory location
String created using new will be stored in heap ---- duplicates allowed 
String buffer is immutable --- cannot keep changing it anytime--- 
*/