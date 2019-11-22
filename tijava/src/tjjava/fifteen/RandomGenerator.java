package tjjava.fifteen;

import java.util.Random;

public class RandomGenerator {

	private static Random random = new Random(System.currentTimeMillis());

	private static java.lang.String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	private RandomGenerator() {
	}

	public static void setSeed(long aSeed) {
		random = new Random(aSeed);
	}

	public static int nextInt() {
		return random.nextInt();
	}

	public static int nextInt(int scope) {
		return random.nextInt(scope);
	}

	public static long nextLong() {
		return random.nextLong();
	}

	static class String implements Generator<java.lang.String> {
		
		private int length;
		
		public String(int length) {
			this.length = length;
		}

		@Override
		public java.lang.String next() {
			Random random = new Random();
			StringBuffer sb = new StringBuffer();
			// 长度为几就循环几次
			for (int i = 0; i < length; ++i) {
				// 产生0-61的数字
				int number = random.nextInt(42);
				// 将产生的数字通过length次承载到sb中
				sb.append(str.charAt(number));
			}
			// 将承载的字符转换成字符串
			return sb.toString();
		}

	}

	static class Integer implements Generator<java.lang.Integer> {

		@Override
		public java.lang.Integer next() {
			Random random = new Random();
			return random.nextInt(10000);
		}

	}
}
