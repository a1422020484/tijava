package tjjava.util;

import tjjava.six.OverrideMethod;

public class Test {
	
	public void getPlay(){
		System.out.println("test!");
	}
	
	protected void getProtected(){
		System.out.println("getProtected");
	}
	
	public static void main(String[] args) {
		OverrideMethod om = new OverrideMethod();
		OverrideMethod om2 = new OverrideMethod("yang");
	}
}
