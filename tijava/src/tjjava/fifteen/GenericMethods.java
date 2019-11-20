package tjjava.fifteen;

import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

	public <F> void f(F t) {
		System.out.println(t.getClass().getName());
	}

	public <T> List<T> makeList(T... ts) {
		List<T> arrayList = new ArrayList<T>();
		for (T t : ts) {
			arrayList.add(t);
		}
		System.out.println(arrayList);
		return arrayList;

	}

	public static void main(String[] args) {
		GenericMethods gm = new GenericMethods();
		gm.f(new A1());

		gm.makeList("tfb", new A1());
	}
}

class A1 {

}
