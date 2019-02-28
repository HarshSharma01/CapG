import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ExecutorEx implements Runnable {

	public void run() {
		System.out.println("running");
	}

	public static void main(String[] args) {
		Executor executor = Executors.newSingleThreadExecutor();
		executor.execute(new ExecutorEx());

		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new ExecutorEx());

		ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
		executorService.execute(new ExecutorEx());

		Executor executor2 = Executors.newFixedThreadPool(2);
		executor2.execute(new ExecutorEx());

	}

}
