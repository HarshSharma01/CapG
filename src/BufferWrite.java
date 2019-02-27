import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class BufferWrite {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("TakeFile.txt");
		BufferedOutputStream bfs = new BufferedOutputStream(os);
		String s = "VJIT";
		byte[] b = s.getBytes();
		bfs.write(b);

		bfs.close();
		os.close();
		System.out.println("success");
	}

}
