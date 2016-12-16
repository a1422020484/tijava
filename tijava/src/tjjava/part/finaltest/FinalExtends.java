package tjjava.part.finaltest;

import tjjava.part.MyTest;

public class FinalExtends implements MyTest{

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}
	
	public final void play(String name){
		System.out.println("name:" + name);
	}

}

//class FinalEx extends FinalTest{
//	
//}
