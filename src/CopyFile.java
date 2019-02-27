import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {

	public static void main(String[] args) throws Exception {
		FileInputStream fileIpS = new FileInputStream("C:\\Users\\VJIT\\Downloads\\MyFile.txt");
		FileOutputStream fileOpS = new FileOutputStream("C:\\Users\\VJIT\\Downloads\\OPFile.txt");
		int data;
		while ((data = fileIpS.read()) != -1) {
			fileOpS.write(data);
		}

		fileOpS.flush();
		fileIpS.close();
		fileOpS.close();
		System.out.println("success");
	}
}