package tjjava.sortUtil.seven.insertSort;

import java.util.Arrays;

public class ShellSort2 {

	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		shellSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void shellSort(int[] a) {
		int N = a.length;

		for (int h = N / 2; h > 0; h /= 2) {// 希尔增量
			for (int i = h; i < N; i++) {
				// 将a[i]插入到a[i-h],a[i-2h],a[i-3h]...中
				for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
					int temp = a[j];
					a[j] = a[j - h];
					a[j - h] = temp;
				}
			}
		}
	}
}
