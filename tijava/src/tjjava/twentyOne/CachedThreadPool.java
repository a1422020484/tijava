package tjjava.twentyOne;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {

	public static void main(String[] args) {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++) {
			exec.execute(new LiftOff());
		}
		System.out.println("waiting for liftoff");
		exec.shutdown();//防止新的任务提交给Executor
	}

}
