package tjjava.six;

public class RunnableExtendMy extends Thread {
	
	private int i;
	
	public void run(){
		for(i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
		}
	}
	
	public static void main(String[] arg){
		for(int i=0;i<100;i++){
			System.out.println(Thread.currentThread().getName()+"  "+i);
			
			if(i==20)  
            {  
				//创建一个线程名字叫做Thread-0
                new RunnableExtendMy().start();  
                new RunnableExtendMy().start();  
            } 
		}
	}
}
