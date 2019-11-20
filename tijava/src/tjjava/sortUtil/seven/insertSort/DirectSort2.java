package tjjava.sortUtil.seven.insertSort;

import java.util.Arrays;

public class DirectSort2 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		dSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void dSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			// 待排元素小于有序序列的最后一个元素时，向前插入
			if (arr[i] < arr[i - 1]) {
				for (int j = i; j >= 0; j--) {
					if (j > 0 && arr[j - 1] > temp) {
						arr[j] = arr[j - 1];
					} else {
						arr[j] = temp;
						break;
					}
				}
			}
		}
	}
}
