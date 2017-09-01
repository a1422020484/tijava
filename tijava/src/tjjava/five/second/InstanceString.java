package tjjava.five.second;

import java.util.Arrays;

public class InstanceString {

	public static String[] nameArray;
	
	public InstanceString() {
		// TODO Auto-generated constructor stub
		System.out.println(Arrays.toString(nameArray));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstanceString instanceString = new InstanceString();
		nameArray = new String[]{"abc","bb"};
		System.out.println(Arrays.toString(nameArray));
		instanceString.play(nameArray);
		Spiciness howHot = Spiciness.HOT;
		System.out.println(howHot);
		
	}

	public void play(String ...arg){
		System.out.println(Arrays.toString(arg));
	}
	
}
