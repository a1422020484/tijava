package tjjava.fifteen;

public class OrdinaryArguments {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedSetter ds = new DerivedSetter();
//		调用子类的set方法，因为参数不同，调用了父类的方法
		ds.set(base);
		ds.set(derived);

	}
}

class OrdinarySetter {
	void set(Base base) {
		System.out.println("OrdinarySetter.set(Base)");
	}
}

class DerivedSetter extends OrdinarySetter {
	void set(Derived derived) {
		System.out.println("DerivedSetter.set(Derived)");
	}
}
