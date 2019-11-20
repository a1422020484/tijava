package tjjava.sortUtil.seven.insertSort;

import java.util.Arrays;

public class DirectSort1 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		dSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void dSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = 0; j < i; j++) {
				if (temp < arr[j]) {
					int h = j;
					while (h > j) {
						arr[h] = arr[h - 1];
						h--;
					}
					arr[j] = temp;
				}
			}
		}
	}
}
