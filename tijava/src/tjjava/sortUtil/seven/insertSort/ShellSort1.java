package tjjava.sortUtil.seven.insertSort;

import java.util.Arrays;

public class ShellSort1 {
	public static void main(String[] args) {
		int arr[] = { 2, 7, 5, 3, 6, 4, 9, 8, 1 };
		Ssort(arr);
		System.out.println(Arrays.toString(arr));
		
		DirectSort2.dSort(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void Ssort(int arr[]) {
		int zz = arr.length / 2;

		while(zz > 1) {
			for (int i = 0; i + zz < arr.length; i++) {
				if (arr[i] > arr[i + zz]) {
					int temp = arr[i + zz];
					arr[i + zz] = arr[i];
					arr[i] = temp;
				}
			}
			zz /= 2;
		}

	}
}
