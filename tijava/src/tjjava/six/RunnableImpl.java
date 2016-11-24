package tjjava.six;

public class RunnableImpl implements Runnable {

	private int i;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(i=0;i<100;i++){
			//Thread.currentThread()方法返回当前正在执行的线程对象。GetName()方法返回调用该方法的线程的名字。
			System.out.println(Thread.currentThread().getName() + "  " + i);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 0;i < 100;i++)  
        {  
            System.out.println(Thread.currentThread().getName()+" "+i);  
            if(i==20)  
            {  
            	RunnableImpl rtt = new RunnableImpl();  
                new Thread(rtt,"新线程1").start();  
                new Thread(rtt,"新线程2").start();  
            }  
        }	
	}
}
