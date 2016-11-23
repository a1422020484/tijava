package tjjava.seven;

public class Orange extends Fruit {

	private static String name = "orange";
	private static String color = "yellow";
	public Orange(String name, String color) {
		super(name, color);
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
//		Orange o = new Orange(name,color);
		
		Apple a = new Apple(name,color);
		System.out.println(a.name);
	}
}
