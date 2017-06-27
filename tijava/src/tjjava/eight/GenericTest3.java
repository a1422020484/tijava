package tjjava.eight;

/**
 * @author Administrator
 *
 */
public class GenericTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3<Integer> age = new Box3<Integer>(712);
		Box3<Number> number = new Box3<Number>(314);
		
		getUpperNumberData(age);
		getUpperNumberData(number);
	}
	
	public static void getData(Box3<?> data){
		System.out.println("data : " + data.getData());
	}
	
	public static void getUpperNumberData(Box3<? extends Number> data){ 
		System.out.println("data : " + data.getData());
	}

}
/**
 * @author Administrator
 *	限制泛型类必须是Number的子类
 */
class Box3<T extends Number> {
	private T data;
	public Box3(T data) {
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
