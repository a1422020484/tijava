package tjjava.twentyOne;

class Sleeper extends Thread {
	private int duration;

	public Sleeper(String name, int sleepTime) {
		super(name);
		duration = sleepTime;
		start();
	}

	@Override
	public void run() {
		try {
			sleep(duration);
			System.out.println(getName() + "1 was interrupted " + " interrupted(): " + isInterrupted());
		} catch (InterruptedException e) {
			System.out.println(getName() + " was interrupted " + " interrupted(): " + isInterrupted());
			return;
		}
		System.out.println(getName() + "has awakened");
	}
}

class Joiner extends Thread {
	private Sleeper sleeper;

	public Joiner(String name, Sleeper sleeper) {
		super(name);
		this.sleeper = sleeper;
		start();
	}
	
	public void run(){
		try {
			sleeper.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println(getName() + " join Completed");
	}
}

public class Joining {

	public static void main(String[] args) {
		Sleeper
			sleeper = new Sleeper("Sleepy", 1500),
			grumpy = new Sleeper("Grumy", 1500);
		Joiner 
			dopey = new Joiner("Dopey", sleeper), 
			doc = new Joiner("doc", grumpy);
		grumpy.interrupt();
	}

}
