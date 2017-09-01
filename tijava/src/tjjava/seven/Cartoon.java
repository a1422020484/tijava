package tjjava.seven;

public class Cartoon extends Drawing{
	
	public B1 b1 = new B1();
	
	public Cartoon() {
		System.out.println("Cartoon constructor");
	}	
	public static void main(String[] args) {
		Cartoon drawing = new Cartoon();
	}

}

class Drawing extends Art{
	public Drawing() {
		System.out.println("Drawing constructor");
	}
}

class Art{
	public Art() {
		System.out.println("art constructor");
	}
}

class B1{
	public B1() {
		System.out.println("B1 constructor");
	}
}
