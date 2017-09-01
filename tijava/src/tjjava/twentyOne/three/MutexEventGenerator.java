package tjjava.twentyOne.three;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 * 使用显示的Lock对象锁
 */
public class MutexEventGenerator extends IntGenerator{

	private int currentEventValue = 0;
	private Lock lock = new ReentrantLock();
	@Override
	public int next() {
		lock.lock();
		try {
			++currentEventValue;
			Thread.yield();
			++currentEventValue;
			return currentEventValue;
		} finally {
			lock.unlock();
		}
//		不能写在这里
//		return currentEventValue
	}

	public static void main(String[] args) {
		EvenChecker.test(new MutexEventGenerator());
	}
}
