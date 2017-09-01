package tjjava.twentyOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SleepingTask extends LiftOff{

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<5;i++)
			exec.execute(new SleepingTask());
		exec.shutdown();
	}

	public void run(){
		while (countDown-- > 0) {
			System.out.println(status());
			try {
				TimeUnit.MICROSECONDS.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Interrupted");
			}
		}
	}
}
