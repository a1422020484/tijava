package tjjava.twentyOne;

import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory{

	//这个与普通的ThreadFactory的唯一区别是将后台状态都设置成ture
	@Override
	public Thread newThread(Runnable r) {
		Thread t = new Thread(r);
		t.setDaemon(true);
		return t;
	}

}
