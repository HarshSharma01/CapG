class PwdException extends Exception{
	PwdException(String str){
		System.out.println(str);
	}
}
class CustomExc {
	public static void main(String[] args) throws PwdException {
String pwd="chotu";
if(pwd=="harsh") {
  	System.out.println("");
}
else {
	throw new PwdException("invalid");
}
}
}