import java.io.FileOutputStream;

public class WriteData {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("TakeFile.txt");
		String s = "VJIT";
		byte[] b = s.getBytes();
		fos.write(b);
		fos.close();
		System.out.println("successful");
	}
}