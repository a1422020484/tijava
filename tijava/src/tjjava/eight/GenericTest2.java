package tjjava.eight;

public class GenericTest2 {

	public static void main(String[] args) {

		Box2<String> name = new Box2<String>("corn");
		Box2<Integer> age = new Box2<Integer>(712);
		Box2<Number> number = new Box2<Number>(314);

		getData(name);
		getData(age);
		getData(number);
	}

	public static void getData(Box2<?> data) {
		System.out.println("data :" + data.getData());
	}

}

class Box2<T> {
	private T data;

	public Box2() {
		// TODO Auto-generated constructor stub
	}

	public Box2(T data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(T data) {
		this.data = data;
	}

}
