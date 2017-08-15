package tjjava.eighten;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Iterator;

public class FileTest {

	static String fileName = "ReadName.txt";

	public static void main(String[] args) throws Exception {
		FileTest.wirteFile();
		FileTest.readFile();
	}

	public static void readFile() throws Exception {
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		String s;
		String[] array = null;
		if((s = in.readLine()) != null)
			array = s.split(",");
		in.close();
		int[] intArr = new int[array.length];
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = Integer.valueOf(array[i]);
		}
		sort(intArr);
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + ",");
		}
	}

	public static void wirteFile() throws Exception {
		int[] array = { 10, 2, 12, 4, 124, -190 };
		PrintWriter out = new PrintWriter(fileName);
		for (int e : array) {
			out.print(e + ",");
		}
		out.close();
	}

	public static void sort(int[] data) {
		int temp;
		for (int i = 0; i < data.length; i++) {
			for (int j = data.length - 1; j > i; j--) {
				if (data[i] < data[j]) {
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
			}
		}
	}
}
