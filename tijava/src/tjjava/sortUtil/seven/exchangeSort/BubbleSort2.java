package tjjava.sortUtil.seven.exchangeSort;

import java.util.Arrays;

/**
 * @author yangxp
 * 冒泡排序，最小的向左边冒泡
 */
public class BubbleSort2 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		dSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void dSort(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arr[j] > temp) {
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
