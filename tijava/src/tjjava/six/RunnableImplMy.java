package tjjava.six;

public class RunnableImplMy implements Runnable {

	private int i ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
			if(i==20)  
            {  
				//创建一个线程名字叫做Thread-0
                new Thread().start();  
                new Thread().start();  
            } 
		}
	}

	public void run(){
		for(i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}

}
