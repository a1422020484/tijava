package tjjava.fifteen;

public class PrimitiveGenericTest {
	public static void main(String[] args) {
		String[] strings = Farray.fill(new String[7], new RandomGenerator.String(10));
		for (String string : strings) {
			System.out.println(string);
		}
		Integer[] integers = Farray.fill(new Integer[7], new RandomGenerator.Integer());
		for (Integer integer : integers) {
			System.out.println(integer);
		}
	}
}

class Farray {
	public static <T> T[] fill(T[] a, Generator<T> gen) {
		for (int i = 0; i < a.length; i++) {
			a[i] = gen.next();
		}
		return a;
	}
} 
