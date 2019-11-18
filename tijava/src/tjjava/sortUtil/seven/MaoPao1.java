package tjjava.sortUtil.seven;

public class MaoPao1 {

	public static int[] arr = { 22, 59, 86, 99, 44, 11, 22, 33, 46, 33, 26 };

	public static void main(String[] args) {
		method1(arr);
		
		
		printArr(arr);
	}

	public static void method1(int[] arr) {
		int temp = 0;
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void printArr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
