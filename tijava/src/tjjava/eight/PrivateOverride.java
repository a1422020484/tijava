package tjjava.eight;

public class PrivateOverride {

	private void f(){
		System.out.println("Private f()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateOverride ss = new Derived();
		System.out.println(ss.getClass());
		ss.f();
	}

}

class Derived extends PrivateOverride{
	public void f(){
		System.out.println("public void f()");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived ss = new Derived();
		System.out.println(ss.getClass());
		ss.f();
	}
}
