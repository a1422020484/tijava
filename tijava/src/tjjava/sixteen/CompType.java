package tjjava.sixteen;

import java.util.Arrays;
import java.util.Random;

import tjjava.fifteen.Generator;

public class CompType implements Comparable<CompType> {

	int i, j;
	private static int count = 1;

	public CompType(int n1, int n2) {
		i = n1;
		j = n2;
	}

	@Override
	public String toString() {
		return "CompType [i=" + i + ", j=" + j + "]";
	}

	@Override
	public int compareTo(CompType rv) {
		return (i < rv.i ? -1 : (i == rv.i ? 0 : 1));
	}

	private static Random r = new Random(47);

	public static Generator<CompType> generator() {
		return new Generator<CompType>() {
			public CompType next() {
				return new CompType(r.nextInt(100), r.nextInt(100));
			}
		};
	}

	public static void main(String[] args) {
		CompType[] a = Generated.array(new CompType[12], generator());
		System.out.println("before sorting");
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting");
		System.out.println(Arrays.toString(a));
	}
}
