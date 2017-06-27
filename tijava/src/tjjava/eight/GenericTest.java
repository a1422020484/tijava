package tjjava.eight;

public class GenericTest {

	public static void main(String[] args) {
		Box<String> box = new Box<String>("yang");
		Box<TypeT> box2 = new Box<TypeT>(new TypeT());
	}
}

class Box<T> {
	private T dataT;

	public Box() {
		// TODO Auto-generated constructor stub
	}

	public Box(T dataT) {
		this.dataT = dataT;
	}

	/**
	 * @return the dataT
	 */
	public T getDataT() {
		return dataT;
	}

	/**
	 * @param dataT
	 *            the dataT to set
	 */
	public void setDataT(T dataT) {
		this.dataT = dataT;
	}

}

class TypeT{
	
}
