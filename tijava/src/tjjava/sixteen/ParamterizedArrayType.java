package tjjava.sixteen;

public class ParamterizedArrayType {
	public static void main(String[] args) {
		Integer[] ints = { 1, 2, 3, 4, 5 };
		Double[] doubles = { 1.1, 2.2, 3.3, 4.4 };
		Integer[] ints2 = new ClassParameter<Integer>().f(ints);
		Double[] doubles2 = new ClassParameter<Double>().f(doubles);

		ints = MethodParameter.f(ints);
		doubles = MethodParameter.f(doubles);
	}
}

class ClassParameter<T> {
	public T[] f(T[] arg) {
		return arg;
	}
}

class MethodParameter {
	public static <T> T[] f(T[] arg) {
		return arg;
	}
}
