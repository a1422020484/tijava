package tjjava.twentyOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


/**
 * @author Administrator
 * 参看CaptureUncaughtException.java
 */
public class ExceptionThread implements Runnable {

	@Override
	public void run() {
		throw new RuntimeException();
	}
	public static void main(String[] args) {
		// 这样的try catch 是没有用的
		try {
			ExecutorService exec = Executors.newCachedThreadPool();
			exec.execute(new ExceptionThread());
			exec.shutdown();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("catch exception");
		}
	}

}
