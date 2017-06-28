package tjjava.twentyOne;

class InnerThread1My{
	private int countDown = 5;
	private Inner inner;
	
	private class Inner extends Thread{
		public Inner(String name) {
			super(name);
			start();
		}
		
		@Override
		public void run(){
			try {
				while (true) {
					System.out.println(this);
					if(--countDown == 0)
						return;
					sleep(10);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public String toString(){
			return getName() + " : " + countDown;
		}
	}
	
	public InnerThread1My(String name){
		inner = new Inner(name);
	}
}

public class ThreadVariationsMy {

	public static void main(String[] args) {
		
	}

}
