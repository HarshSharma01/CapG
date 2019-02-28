import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture implements Callable {

	public String call() {
		System.out.println(Thread.currentThread().getName());
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService service = Executors.newSingleThreadExecutor();
		Callable task = new CallableFuture();
		Future<String> future = service.submit(task);
		System.out.println(future);
	}
}