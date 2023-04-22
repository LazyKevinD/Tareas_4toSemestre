
import java.security.SecureRandom;

public class Consumer implements Runnable{
	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation;
	int x;
	public Consumer(Buffer sharedLocation, int x1) {
		this.sharedLocation = sharedLocation;
		x = x1;
	}

	@Override
	public void run() {
		int sum = 0;
		
		for (int count = 1; count <= 10; count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sum += sharedLocation.blockingGet();
				if(x==1) {
					System.out.printf("\t\t\t%2d%n", sum);
				}
			}
			catch(InterruptedException exception) {
				Thread.currentThread().interrupt();
			}
		}
		
		System.out.printf("%n%s %d%n%s%n",
			"Consumer read values totaling", sum, "Terminating Consumer");
	}
}