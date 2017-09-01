package tjjava.twentyOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable {

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool(new DaemonThreadFactory());
		for (int i = 0; i < 10; i++) {
			exec.execute(new DaemonFromFactory());
		}
		exec.shutdown();
		System.out.println("All Daemons started");
		TimeUnit.MILLISECONDS.sleep(500);
		System.out.println("main Thread Stop");

	}

	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(100);
				System.out.println(Thread.currentThread() + " " + this);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Interrupted");
			}
		}
	}

}
