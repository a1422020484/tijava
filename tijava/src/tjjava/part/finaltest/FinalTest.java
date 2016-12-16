package tjjava.part.finaltest;

import tjjava.part.MyTest;

public class FinalTest implements MyTest{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
//	public final int e;
//	
//	public void Test3(int x) { 
//        e = x; 
//	} 
	
	public final String name = "yang x p ";
	
	public final static First f = new First() ;
	
	public static void main(String[] args) {
		String add = "henan";
		FinalTest ft = new FinalTest();
//		final的参数不能修改值
//		ft.name = "ss";
//		final的引用不能指向另一个对象。但是对象的值是可以改变的
//		f = new First();
		System.out.println(ft.name+"dd");
//		String name = add + this.name;
	}
	
	
	public void finalMethod(){
		System.out.println("final Method father");
	}
}


class SecondTest extends FinalTest{
	@Override
	public void finalMethod(){
		System.out.println("son method son");
	}
}


final class First implements MyTest{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
}