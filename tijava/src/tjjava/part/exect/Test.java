package tjjava.part.exect;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) throws ExpcetionTest, ClassNotFoundException {
		// TODO Auto-generated method stub
		Test t = new Test();
		t.play();
		System.out.println(Class.forName("tjjava.part.exect.Test"));
	}

	
	public void play() throws ExpcetionTest{
//		HashMap<String,Object> hm = new HashMap<String,Object>();
		HashMap<String,Object> hm = null;
		try {
			if(hm == null){
				throw new ExpcetionTest("null point");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			System.out.println("sda");
		}
	}
}

class ExpcetionTest extends Exception {
	ExpcetionTest(String message){
		super(message);
	}
}