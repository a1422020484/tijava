package tjjava.six;

public class OverrideTest {

	public void play(){
		OverrideMethod om = new OverrideMethod();
		OverrideMethod om2 = new OverrideMethod("yxp");
	}
	
	public static void main(String[] args) {
		OverrideTest ot = new OverrideTest();
		ot.play();
	}
}
