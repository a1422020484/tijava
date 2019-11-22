package tjjava.fifteen;

public class PlainGenericInheritance {
	public static void main(String[] args) {
		Base base = new Base();
		Derived derived = new Derived();
		DerivedGS dgs = new DerivedGS();
//		调用子类的set方法，因为参数不同，调用了父类的方法
		dgs.set(base);
		dgs.set(derived);
	}
}

class GenericSetter<T>{
	void set(T arg) {
		System.out.println("GenericSetter set base");
	}
}

class DerivedGS extends GenericSetter<Base>{
	void set(Derived derived) {
		System.out.println("DerivedGS set derived");
	}
}

