package tjjava.twentyOne;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepTaskTest implements Runnable {

	private int count = 10;
	private int sleepTime;

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 10; i++)
			exec.execute(new SleepTaskTest());
		exec.shutdown();
	}

	@Override
	public void run() {
		Random random = new Random(47);
		while (count-- > 0) {
			sleepTime = random.nextInt(10);
			System.out.println(sleepTime + " , " + count);
			long beginTime = System.currentTimeMillis();
			try {
				TimeUnit.MICROSECONDS.sleep(sleepTime * 1000);
				long internalTime = System.currentTimeMillis() - beginTime;
				System.out.println("internalTime === " + internalTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
