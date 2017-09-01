package tjjava.twentyOne;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable {

	private int count = 0;
	@Override
	public void run() {
		while (true) {
			try {
				TimeUnit.MILLISECONDS.sleep(1000);
				System.out.println(Thread.currentThread() + " " + this + " " + count++);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("sleep() interrupted");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		for (int i = 0; i < 10; i++) {
			Thread daemon = new Thread(new SimpleDaemons());
			daemon.setDaemon(true);//设置后台线程是否为守护线程 true 是 false 否
			daemon.start();
		}
		System.out.println("All daemon started");
		TimeUnit.MILLISECONDS.sleep(5000);
		System.out.println("main Thread Stoped");
	}
}
