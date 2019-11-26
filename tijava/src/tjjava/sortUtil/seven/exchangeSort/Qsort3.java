package tjjava.sortUtil.seven.exchangeSort;

import java.util.Arrays;

/**
 * @author yangxp av39093184 核心是在选基准值， 第一趟排序之后，将基准值左边都是小于基准值，右边都大于基准。
 */
public class Qsort3 {
	public static int[] qsort(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start;
		int j = end - 1;
		while (i < j) {
			while ((i < j) && (arr[i] < pivot)) {
				i++;
			}
			while ((i < j) && (arr[j] > pivot)) {
				j--;
			}
			if (i == j) {
				if(arr[i] > pivot) {
					int temp = arr[i];
					arr[i] = pivot;
					arr[end] = temp;
				}
			} else {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			System.out.println(Arrays.toString(arr));
		}
		if (j - 1 > start)
			arr = qsort(arr, 0, j);
		if (i + 1 < end)
			arr = qsort(arr, j, end);
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = new int[] { 3, 2, 1, 5, 8, 6, 4, 9 };
		int len = arr.length - 1;
		arr = qsort(arr, 0, len);
		System.out.println(Arrays.toString(arr));
	}
}
