package tjjava.sortUtil.seven.exchangeSort;

import java.util.Arrays;

/**
 * @author yangxp
 * 冒泡排序  最大的向右边冒泡
 */
public class BubbleSort1 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void bubbleSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}
