import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CustomerName implements Callable {
	String customerName;

	public String call() throws Exception {
		Scanner scan = new Scanner(System.in);
		this.customerName = scan.next();
		return customerName;
	}

	public static void main(String[] args) throws Exception, Exception {

		ExecutorService service = Executors.newFixedThreadPool(3);
		ArrayList<Future<String>> arrayList = new ArrayList<Future<String>>();
		Callable name = new CustomerName();
		for (int i = 0; i < 3; i++) {
			Future<String> future = service.submit(name);
			arrayList.add(future);
		}
		for (Future<String> fut : arrayList) {
			System.out.println(fut.get());
		}
	}
}