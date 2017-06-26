package tjjava.five.second;


public class OverLoadMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadMethod oLoadMethod = new OverLoadMethod();
		oLoadMethod.f1((float) 0.1);
	}

	public void f1(float x){
		System.out.println("float : " + x);
	}
	
//	public void f1(double x){
//		System.out.println("dobule : " + x);
//	};
	public void f1(char x){
		System.out.println("char : " + x);
	}
	public void f1(int x){
		System.out.println("int : " + x);
	}
	public void f1(long x){
		System.out.println("long : " + x);
	}
	public void f1(short x){
		System.out.println("short : " + x);
	}
	public void f1(byte x){
		System.out.println("byte : " + x);
	}
}
