package tjjava.fifteen;

public class CRGWithBasicHolder {
	public static void main(String[] args) {
		Subtype s1 = new Subtype();
		Subtype s2 = new Subtype();
		
		s1.set(s2);
		s2.set(s1);
		Subtype s3 = s1.get();
		s3.f();
		
	}
}



class Subtype extends BasicHolder<Subtype> {

}

class SelfBounded<T extends SelfBounded<T>>{}

class D{}
// Bound mismatch: The type D is not a valid substitute for the bounded parameter <T extends SelfBounded<T>> of the type SelfBounded<T>
//class E extends SelfBounded<D>{}

class NotSelfBounded<T>{}

class E extends NotSelfBounded<D>{};

class BasicHolder<T> {
	T element;

	void set(T arg) {
		element = arg;
	}

	void f() {
		System.out.println(element.getClass().getName());
	}

	T get() {
		return this.element;
	}
}


