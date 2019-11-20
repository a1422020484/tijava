package tjjava.sortUtil.seven.insertSort;

import java.util.Arrays;

public class HalfInsertSort {
	public static void main(String[] args) {
		int arr[] = { 5, 7, 8, 2, 1, 6, 4 };
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int high = i - 1;
			int low = 0;
			while (true) {
				int mid = (high + low) / 2;
				if (arr[mid] < temp) {
					low = mid + 1;
					if (low > high) {
						break;
					}
				} else {
					high = mid - 1;
					if (low > high || arr[high] < temp) {
						int h = i;
						while (h > mid) {
							arr[h] = arr[h - 1];
							h--;
						}
						arr[mid] = temp;
						break;
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
