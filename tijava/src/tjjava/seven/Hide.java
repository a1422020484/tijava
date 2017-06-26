package tjjava.seven;

public class Hide {

	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new MilHouse());
	}

}

class Homer{
	protected char doh(char c){
		System.out.println("doh(char)");
		return 'd';
	}
	
	float doh(float f){
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class MilHouse{}

class Bart extends Homer{
	void doh(MilHouse m){
		System.out.println("doh(MilHouse)");
	}
}
