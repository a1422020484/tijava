package tjjava.fifteen;

public class GenericArray<T> {
	private T[] array;

	public GenericArray(int sz) {
//		我们并不能直接声明 T[] array = new T[sz];
		array = (T[]) new Object[sz];
	}

	public void put(int index, T item) {
		array[index] = item;
	}

	public T get(int index) {
		return array[index];
	}

	public T[] rap() {
		return array;
	}

	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);

		Object[] oa = gai.rap();
	}
}
