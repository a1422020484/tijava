package tjjava.sortUtil.seven.chooseSort;

import java.util.Arrays;

/**
 * @author yangxp
 * 堆排序
 */
public class HeapSort {

	public static void main(String[] args) {
		int tree[] = { 10, 5, 2, 1, 4, 3, 8, 9, 23, 44, 55, 22, 11, 25, 37 };
		printSort(tree);
	}

	public static void printSort(int tree[]) {
		int n = tree.length - 1;
		int newtree[] = Arrays.copyOf(tree, tree.length);
		for (int i = n; i >= 0; i--) {
			heapfiy(newtree, (i - 1) / 2, newtree.length);
			
			// 大根堆的根放到最后一位，然后就并将最后一位砍断输出。
			swap(newtree, 0, i);
			System.out.print(newtree[i] + " ");
			newtree = Arrays.copyOf(newtree, i);
		}
	}

	public static void heapfiy(int tree[], int i, int n) {
		if (i < 0) {
			return;
		}

		int c1 = 2 * i + 1;
		int c2 = 2 * i + 2;
		if (c1 < n && tree[c1] > tree[i]) {
			swap(tree, c1, i);
		}
		if (c2 < n && tree[c2] > tree[i]) {
			swap(tree, c2, i);
		}
		heapfiy(tree, i - 1, n);
	}

	private static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
