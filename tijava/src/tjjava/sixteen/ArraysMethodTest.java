package tjjava.sixteen;

import java.util.Arrays;

public class ArraysMethodTest {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 21, 5, 6, 234, 343, 22 };
		int arr2[] = { 1, 2, 3, 4, 21, 5, 6, 234, 343, 22 };
		
		Integer arr3[] = {Integer.valueOf(1)};
		int arr4[] = {1};
		
		
		System.out.println(Arrays.equals(arr, arr2));
//		System.out.println(Arrays.equals(arr3, arr4));// error
		
		System.out.println(Arrays.binarySearch(arr, 22));
		Arrays.sort(arr);
		Arrays.fill(arr2, 1);
		
		
		
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
}
