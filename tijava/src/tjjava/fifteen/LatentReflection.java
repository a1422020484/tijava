package tjjava.fifteen;

import java.lang.reflect.Method;

public class LatentReflection {
	public static void main(String[] args) {
		CommunicateReflectively.perform(new SmartDog());
		CommunicateReflectively.perform(new Mine());
	}
}

class Mine {
	public void walkAgainstTheWind() {

	}

	public void sit() {
		System.out.println("Pretendingn to sit");
	}

	public void pushInvisibleWalls() {

	}

	public String toString() {
		return "Mine";
	}
}

class SmartDog {
	public void speak() {
		System.out.println("Woof");
	}

	public void sit() {
		System.out.println("Sitting");
	}

	public void reproduce() {

	}
}

class CommunicateReflectively {
	public static void perform(Object speaker) {

		Class<?> spkr = speaker.getClass();

		try {
			try {
				Method speak = spkr.getMethod("speak");
				speak.invoke(speaker);
			} catch (Exception e) {
				System.out.println(speaker + " cannot speak ");
				e.printStackTrace();
			}
			
			try {
				Method sit = spkr.getMethod("sit");
				sit.invoke(speaker);
			} catch (Exception e) {
				System.out.println(speaker + " cannot sit ");
				e.printStackTrace();
			}
		} catch (Exception e) {
			throw new RuntimeException(speaker.toString() , e);
		} 
	}
}