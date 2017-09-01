package tjjava.five;

public class Mugs {

	static Mug mug1;
	static Mug mug2;
	static {
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 and mug2 initialized");
	}

	Mugs() {
		System.out.println("Mug()");
	}

	Mugs(int s) {
		System.out.println("Mugs(int s)" + s);
	}

	public static void main(String[] args) {
		System.out.println("Inside main()");
		new Mugs();
		System.out.println("new Mugs() completed");
		new Mugs(1);
		System.out.println("new Mugs(1) completed");
	}

}

class Mug {
	public Mug(int marker) {
		System.out.println("Mug :" + marker);
	}

	void f(int marker) {
		System.out.println("f() :" + marker);
	}
}
