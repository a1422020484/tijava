package tjjava.fifteen;

public class SelfBoundingAndCovariantArguments {
	void testA(Setter1 s1, Setter1 s2, SelfBoundSetter1 sbs) {
		s1.set(s2);
//		s2.set(sbs);
	}
}

interface SelfBoundSetter1<T extends SelfBoundSetter1<T>> {
	void set(T arg);
}

interface Setter1 extends SelfBoundSetter1<Setter1> {

}
