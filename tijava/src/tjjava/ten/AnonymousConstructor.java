package tjjava.ten;

abstract class Base {
	Base(int i) {
		System.out.println("Base constructor , i = " + i);
	}

	public abstract void f();
}

public class AnonymousConstructor {

	public static Base getBase(int i) {
		return new Base(i) {
			{
				System.out.println("Inside instance initializer");
			}

			@Override
			public void f() {
				System.out.println("In anonumous f()");
			}
		};
	}

	public static void main(String[] args) {
		Base b = getBase(47);
		b.f();
	}

}
