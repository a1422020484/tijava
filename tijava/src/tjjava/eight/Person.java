package tjjava.eight;

interface genericTest4<T> {

	void play();

	T getT();
}

interface GenericTest5 {
	void play5();
}

public class Person {
	private static GenericTest5 genericTest5;

	public static void main(String[] args) {
		genericTest5 = new ManImpl5();
		genericTest5.play5();
	}
}

class ManImpl5 implements GenericTest5 {
	
	@Override
	public void play5() {
		// TODO Auto-generated method stub
		System.out.println("ManImpl5 play5()");
	}
	
}
class ManImpl implements genericTest4<Person> {

	@Override
	public void play() {
		// TODO Auto-generated method stub

	}

	@Override
	public Person getT() {
		// TODO Auto-generated method stub
		return new Person();
	}

}

