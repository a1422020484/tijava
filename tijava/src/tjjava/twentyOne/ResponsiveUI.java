package tjjava.twentyOne;


public class ResponsiveUI extends Thread{
	private static volatile double d = 1;
	public ResponsiveUI() {
		// TODO Auto-generated constructor stub
		System.out.println("constructor method");
		setDaemon(true);
		start();
	}
	
	@Override
	public void run(){
		System.out.println("run() method");
		while (true) {
			d = d + (Math.PI + Math.E) / d;
		}
	}
	
	public static void main(String[] args) throws Exception {
		new ResponsiveUI();
		System.in.read();
		System.out.println(d);
	}
}

class UnresponsiveUI{
	private volatile double d = 1;
	public UnresponsiveUI() throws Exception {
		// TODO Auto-generated constructor stub
		while (d > 0) {
			d = d + (Math.PI + Math.E) / d;
		}
		System.in.read();
	}
}
