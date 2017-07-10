package tjjava.twentyOne.three;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable {
	private IntGenerator generator;
	private final int id;

	public EvenChecker(IntGenerator g, int ident) {
		generator = g;
		id = ident;
	}

	@Override
	public void run() {
		while (!generator.isCanceled()) {
			int val = generator.next();
//			多个线程同时调用EvenGenerator.currentEvenValue造成错误
//			System.out.println("val ==========" + val);
			if (val % 2 != 0) {
				System.out.println(val + " not even!");
				generator.cancel();
			}
		}
	}

	public static void test(IntGenerator g, int count) {
		System.out.println("press Control-C to exit");
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < count; i++) {
			exec.execute(new EvenChecker(g, i));
		}
		exec.shutdown();
	}

	public static void test(IntGenerator g) {
		test(g, 10);
	}
}
