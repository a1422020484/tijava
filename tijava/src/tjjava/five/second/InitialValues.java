package tjjava.five.second;

public class InitialValues {

	static boolean t;
	static char c;
	static byte b;
	static short s;
	static int i;
	static long l;
	static float f;
	static double d;
	static InitialValues reference;

	public static void main(String[] args) {
//		printInitialValues();
		System.out.println(w);
		System.out.println(j);
	}

	static void printInitialValues() {
		System.out.println("boolean : " + t);
		System.out.println("char : " + c);
		System.out.println("byte : " + b);
		System.out.println("short : " + s);
		System.out.println("int : " + i);
		System.out.println("long : " + l);
		System.out.println("float : " + f);
		System.out.println("double : " + d);
		System.out.println("reference : " + reference);
	}
	
	static int w = f();
	static int j = g(w);
	static int f(){
		return 11;
	}
	static int g(int n){
		return n * 10;
	}
}
