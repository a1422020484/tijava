package tjjava.sortUtil.seven.chooseSort;

import java.util.Arrays;

/**
 * @author Administrator
 * 一个简单选择排序
 */
public class SimpleChooseSort {

	public static int[] arr = { 22, 59, 86, 99, 44, 11, 22, 33, 46, 33, 26 };

	public static void main(String[] args) {
		method1(arr);
		printArr(arr);
	}

	public static void method1(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[i]) {
					min = arr[j];
					arr[j] = arr[i];
					arr[i] = min;
				}
			}
		}
	}

	public static void printArr(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
