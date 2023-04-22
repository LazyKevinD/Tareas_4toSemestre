import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class BlockingBufferTest {
	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newCachedThreadPool();
		Buffer sharedLocation = new BlockingBuffer();
		executorService.execute(new Producer(sharedLocation, 0));
		executorService.execute(new Consumer(sharedLocation, 0));
		executorService.shutdown();
		executorService.awaitTermination(1, TimeUnit.MINUTES);
	}
}