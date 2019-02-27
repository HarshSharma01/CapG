import java.io.FileReader;
import java.io.FileWriter;

public class CharCopyFile {

	public static void main(String[] args) throws Exception {
		FileReader fileIpS = new FileReader("C:\\Users\\VJIT\\Desktop\\IPOP\\MyFile.txt");
		FileWriter fileOpS = new FileWriter("C:\\Users\\VJIT\\Desktop\\IPOP\\OpFile.txt");
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
