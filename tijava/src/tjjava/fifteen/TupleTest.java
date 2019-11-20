package tjjava.fifteen;

/**
 * @author yangxp
 * 元组：一次返回多个对象的包装类
 */
public class TupleTest {
	public static void main(String[] args) {
		System.out.println(f());
		System.out.println(h());
	}

	static TupleTwo<A, B> f() {
		return new TupleTwo<A, B>(new A(), new B());
	}

	static TupleThree<A, B, C> h() {
		return new TupleThree<A, B, C>(new A(), new B(), new C());
	}
}

class A {

}

class B {

}

class C {

}

class TupleTwo<A, B> {

	public final A first;
	public final B second;

	public TupleTwo(A a, B b) {
		this.first = a;
		this.second = b;
	}

	@Override
	public String toString() {
		return "TupleTwo [first=" + first + ", second=" + second + "]";
	}

}

class TupleThree<A, B, C> extends TupleTwo<A, B> {

	public final C three;

	public TupleThree(A a, B b, C c) {
		super(a, b);
		three = c;
	}

	@Override
	public String toString() {
		return "TupleThree [three=" + three + ", first=" + first + ", second=" + second + "]";
	}

}