package tjjava.eight;

public class ThreeTest {

	public void ride(){
		System.out.println("One Test Ride");
	}
	public void ride(String message){
		System.out.println("OneTest === " + message);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}

class ThreeA extends ThreeTest{
	
//	OneTest ot = new UnicycleA();
	public void ride(){
//		super.ride();
//		this.ride();
		System.out.println("UnicycleA ride");
	}
	public void ride(String message){
//		super.ride();
//		this.ride();
		System.out.println("UnicycleA === " + message);
	}
//	无论如何也访问不了父类的方法,只能用super的方式调用
//	ot.ride();
	
	
}
class ThreeB extends ThreeTest{
//	OneTest ot = new UnicycleB();
}
class ThreeC extends ThreeTest{
//	OneTest ot = new UnicycleC();
}
