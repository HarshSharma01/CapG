import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class BufferRead {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("NewFile.txt");
		BufferedInputStream bfs = new BufferedInputStream(is);
		int data = bfs.read();
		while (data != -1) {
			System.out.print((char) data);
			data = bfs.read();
		}

		bfs.close();
		is.close();
	}
}
