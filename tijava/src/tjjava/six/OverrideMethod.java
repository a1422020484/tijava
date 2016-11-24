package tjjava.six;

public class OverrideMethod {
	
	public OverrideMethod(){
		System.out.println("默认是protected的");
	}
	
	public OverrideMethod(String name){
		System.out.println("name"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
//	方法的重载不能通过返回值来区分，只能通过构造方法来区分。
	public String returnTest(String name){
		return "String return!";
	}
	
	public int returnTest(){
		return 123;
	}
}
