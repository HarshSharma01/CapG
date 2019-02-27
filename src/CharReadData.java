import java.io.FileReader;

public class CharReadData {

	public static void main(String[] args) throws Exception {
		FileReader fis = new FileReader("C:\\Users\\VJIT\\Desktop\\IPOP\\MyFile.txt");
		int data = fis.read();
		while (data != -1) {
			System.out.print((char)data);
			data = fis.read();
		}
		fis.close();
	}

}
