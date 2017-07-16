package tjjava.twentyOne.three;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Administrator
 * 原子类
 */
public class AtomicIntergerTest implements Runnable {

	private AtomicInteger i = new AtomicInteger(0);

	public int getValue() {
		return i.get();
	}

	private void evenIncrement() {
		i.addAndGet(2);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			evenIncrement();
		}
	}

	public static void main(String[] args) {
//		因为用了AtomicInteger 所以生成的val 不会失败 加了一个5秒钟的计时器在5秒后终止
		new Timer().schedule(new TimerTask() {

			@Override
			public void run() {
				System.out.println("Aborting");
				System.exit(0);
			}
		}, 5000);
		ExecutorService exec = Executors.newCachedThreadPool();
		AtomicIntergerTest ait = new AtomicIntergerTest();
		exec.execute(ait);
		while (true) {
			int val = ait.getValue();
			if (val % 2 != 0) {
				System.out.println(val);
				System.exit(0);
			}
		}
	}
}

class AtomicEvenGenerator2 extends IntGenerator{

	private AtomicInteger currentEvenValue = new AtomicInteger(0);
	
	@Override
	public int next() {
		return 0;
	}
	
}
