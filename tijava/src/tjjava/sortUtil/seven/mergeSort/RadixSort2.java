package tjjava.sortUtil.seven.mergeSort;

import java.util.Arrays;

public class RadixSort2 {
	public static void main(String[] args) {
		int arr[] = { 10, 5, 2, 1, 4, 3, 8, 9, 23, 12, 55, 22, 11, 25, 37 };
		rsort(arr, 2);
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * @param arr
	 *            待排序数组
	 * @param n
	 *            最大数值的位数
	 */
	public static void rsort(int arr[], int n) {
		int f = 1;
		while (n > 0) {
			int temp[][] = new int[10][0];// 创建一个桶数组

			for (int i = 0; i < arr.length; i++) {
				int r = arr[i] / f % 10; // 每个数值各位上的余数
				temp[r] = Arrays.copyOf(temp[r], temp[r].length + 1);
				temp[r][temp[r].length - 1] = arr[i];
			}

			int k = 0;
			for (int i = 0; i < temp.length; i++) {
				for (int j = 0; j < temp[i].length; j++) {
					if (temp[i][j] != 0) {
						arr[k] = temp[i][j];
						k++;
					}
				}
			}
			f *= 10;
			n--;
		}
	}
}
