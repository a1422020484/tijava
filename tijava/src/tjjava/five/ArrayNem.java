package tjjava.five;

import java.util.Arrays;
import java.util.Random;

public class ArrayNem {

	public static void main(String[] args) {
		int[] a;
		Random random = new Random(47);
		System.out.println(random);
		a = new int[random.nextInt(20)];
		for(int i = 0;i<a.length;i++){
			a[i] = random.nextInt(500);
			System.out.println(Arrays.toString(a));
		}
	}

}
