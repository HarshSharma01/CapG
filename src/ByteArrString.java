import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class ByteArrString {

	public static void main(String[] args) throws Exception {
		OutputStream os1 = new FileOutputStream("TakeFile1.txt");
		OutputStream os2 = new FileOutputStream("TakeFile2.txt");
		BufferedOutputStream bfs1 = new BufferedOutputStream(os1);
		BufferedOutputStream bfs2 = new BufferedOutputStream(os2);
		String s = "VJIT IS A GOOD COLLEGE";
		byte[] b = s.getBytes();
		bfs1.write(b);
		bfs2.write(b);
		
		bfs1.close();
		bfs2.close();
		os1.close();
		os2.close();
		System.out.println("success");

	}

}
