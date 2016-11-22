package tjjava.six;


public class Lunch {
	
	void testPrivate(){
//     不能直接调用
//		Soup1 soup = new Soup1();
		
	}
	void testStatic(){
		Soup1 sp = Soup1.makeSoup();
	}
	
	void testSingleton(){
		Soup2.access().f();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t = new Test();
		//proctected的方法只能访问同包下的
		t.getProtected();
	}
}

class Soup1 {
	private Soup1(){};
	public static Soup1 makeSoup(){
		return new Soup1();
	}
}

class Soup2{
	private Soup2(){};
	private static Soup2 ps1 = new Soup2();
	public static Soup2 access(){
		return ps1;
	}
	public void f(){
		
	}
}
