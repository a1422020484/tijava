package tjjava.eight;

public class OneTest {

	public void ride(){
		System.out.println("One Test Ride");
	}
	public void ride(String message){
		System.out.println("OneTest === " + message);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneTest ot1 = new OneTest();
		System.out.println(ot1);
		ot1.ride();
		ot1.ride("main method");
		OneTest ot2 = new UnicycleA();
		System.out.println(ot2);
		ot2.ride();
		ot2.ride("main method");
		
		UnicycleA aa  = new UnicycleA();
		aa.ride("son message");
		
	}

}

class UnicycleA extends OneTest{
	
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
class UnicycleB extends OneTest{
//	OneTest ot = new UnicycleB();
}
class UnicycleC extends OneTest{
//	OneTest ot = new UnicycleC();
}
