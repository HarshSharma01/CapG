import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteArrayMany {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("TakeFile.txt");
		OutputStream os1 = new FileOutputStream("TakeFile1.txt");
		OutputStream os2 = new FileOutputStream("TakeFile2.txt");
		ByteArrayOutputStream baos = new ByteArrayOutputStream();

		byte data;
		while ((data = (byte) is.read()) != -1) {
			baos.write(data);
		}

		baos.writeTo(os1);
		baos.writeTo(os2);

		baos.flush();
		baos.close();
		is.close();
		os1.close();
		os2.close();
	}

}