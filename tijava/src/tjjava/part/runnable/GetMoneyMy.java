package tjjava.part.runnable;

public class GetMoneyMy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserT u = new UserT("张三", 100);
		System.out.println(u.toString());
		 MyThreadT t1 = new MyThreadT("线程A", u, 20); 
         MyThreadT t2 = new MyThreadT("线程B", u, -60); 
         MyThreadT t3 = new MyThreadT("线程C", u, -80); 
         MyThreadT t4 = new MyThreadT("线程D", u, -30); 
         MyThreadT t5 = new MyThreadT("线程E", u, 32); 
         MyThreadT t6 = new MyThreadT("线程F", u, 21); 

         t1.start(); 
         t2.start(); 
         t3.start(); 
         t4.start(); 
         t5.start(); 
         t6.start();
         
	}

}


class MyThreadT extends Thread{
	private UserT u; 
	private int y = 0;
	
	MyThreadT(String name, UserT u,int y){
		super(name);
		this.u = u; 
        this.y = y; 
	}
	
	public void run(){
		 u.oper(y);
	}
	
	
}

class UserT{
	private String code;
	private int cash;
	
	UserT(String code,int cash){
		this.code = code; 
        this.cash = cash; 
	}

//	public String getCode() {
//		return code;
//	}
//
//	public void setCode(String code) {
//		this.code = code;
//	}
	
	public synchronized void oper(int x){
			try {
				Thread.sleep(10L);
				this.cash += x; 
	            System.out.println(Thread.currentThread().getName() + "运行结束，增加“" + x + "”，当前用户账户余额为：" + cash); 
	            Thread.sleep(10L); 
	            System.out.println(this.toString());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
            
	}
	 @Override 
	    public String toString() { 
	            return "User{" + 
	                            "code='" + code + '\'' + 
	                            ", cash=" + cash + 
	                            '}'; 
	    } 
}










