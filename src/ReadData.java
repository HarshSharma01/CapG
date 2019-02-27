import java.io.FileInputStream;

public class ReadData {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:\\Users\\VJIT\\Downloads\\MyFile.txt");
		int data = fis.read();
		while (data != -1) {
			System.out.print((char) data);
			data = fis.read();
		}
		fis.close();
	}
}