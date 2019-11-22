package tjjava.sortUtil.seven.mergeSort;

import java.util.Arrays;

/**
 * @author yangxp av9982752
 */
public class MergeSort1 {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 2, 1, 4, 3, 8, 9, 23, 44, 55, 22, 11, 25, 37 };
		mergeSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}

	public static void merge(int arr[], int L, int M, int R) {
		int leftSize = M - L;
		int rightSize = R - M + 1;
		int leftArr[] = new int[leftSize];
		int rightArr[] = new int[rightSize];
		for (int i = L; i < M; i++) {
			leftArr[i - L] = arr[i];
		}

		for (int i = M; i <= R; i++) {
			rightArr[i - M] = arr[i];
		}

		int i = 0;
		int j = 0;
		int k = L;
		while (i < leftSize && j < rightSize) {
			if (leftArr[i] < rightArr[j]) {
				arr[k] = leftArr[i];
				k++;
				i++;
			} else {
				arr[k] = rightArr[j];
				k++;
				j++;
			}
		}

		while (i < leftSize) {
			arr[k] = leftArr[i];
			k++;
			i++;
		}

		while (j < rightSize) {
			arr[k] = rightArr[j];
			k++;
			j++;
		}

	}

	public static void mergeSort(int arr[], int L, int R) {
		if (L == R) {
			return;
		}

		int M = (L + R) / 2;
		mergeSort(arr, L, M);
		mergeSort(arr, M + 1, R);
		merge(arr, L, M + 1, R);
	}
}
