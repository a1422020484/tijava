package tjjava.twelve;

class MyException2 extends Exception {
	private int x;

	public MyException2() {

	}

	public MyException2(String msg) {
		super(msg);
	}

	public MyException2(String msg, int x) {
		super(msg);
		this.x = x;
	}

	public int val() {
		return x;
	}

	public String getMessage() {
		return "Detail Message: " + x + " " + super.getMessage();
	}
}

public class ExtraFeatures {
	public static void f() throws MyException2 {
		System.out.println("Throwing MyException2 form f()");
		throw new MyException2();
	}

	public static void g() throws MyException2 {
		System.out.println("Throwing MyException2 form g()");
		throw new MyException2("Originated in g()");
	}

	public static void h() throws MyException2 {
		System.out.println("Throwing MyException2 form h()");
		throw new MyException2("Originated in h()", 30);
	}

	public static void main(String[] args) {
		try {
			f();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(System.out);
			e.printStackTrace();
		}
		try {
			g();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(System.out);
			e.printStackTrace();
		}
		try {
			h();
		} catch (MyException2 e) {
			// TODO Auto-generated catch block
//			e.printStackTrace(System.out);
			e.printStackTrace();
		}
	}
}
