import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
	public static void main(String[] args) {

		List listobj = new ArrayList();
		listobj.add("CustomerName1");
		listobj.add("CustomerName2");
		listobj.add("CustomerName3");
		listobj.add("CustomerName4");

		List listobj1 = new ArrayList();
		listobj1.add("CustomerName5");
		listobj1.add("CustomerName2");
		listobj1.add("CustomerName3");
		listobj1.add("CustomerName4");

		listobj.addAll(listobj1);

		Iterator iterate = listobj.iterator();

		while (iterate.hasNext())
			System.out.println("element- " + iterate.next());

	}
}