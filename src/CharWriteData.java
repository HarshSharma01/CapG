import java.io.FileWriter;

public class CharWriteData {

	public static void main(String[] args) throws Exception {
		FileWriter fos = new FileWriter("TakeFile.txt");
		String s = "VJIT is a good college";
		fos.write(s);
		fos.close();
		System.out.println("successful");
	}
}
