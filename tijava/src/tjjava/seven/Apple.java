package tjjava.seven;

public class Apple extends Fruit {
	
//	public Apple(String name ,String color){
//		System.out.println("apple contructor");
//	}
	protected static String name = "apple";
	private static String color = "red";
	public Apple(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Fruit f = new Fruit("33");
//		Fruit fn = new Fruit();
//		Cannot make a static reference to the non-static field name
		Apple a = new Apple(name,color);
	} 
}
