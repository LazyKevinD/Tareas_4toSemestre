
import java.security.SecureRandom;

public class Producer implements Runnable{
	private static final SecureRandom generator = new SecureRandom();
	private final Buffer sharedLocation;
	int x; 
	
	public Producer(Buffer sharedLocation, int i) {
		this.sharedLocation = sharedLocation;
		x = i;
	}
	
	@Override
	public void run() {
		int sum = 0;
		for (int count = 1; count <= 10; count++) {
			try {
				Thread.sleep(generator.nextInt(3000));
				sharedLocation.blockingPut(count);
				sum += count;
				if(x==1) {
					System.out.printf("\t%2d%n", sum);
				}
			}
			catch (InterruptedException exception) {
				Thread.currentThread().interrupt();
			}
		}
		System.out.printf(
				"Producer done producing%nTerminating Producer%n");
	}
}