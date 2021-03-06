package tjjava.twelve;

public class Rethrowing {

	public static void f() throws Exception{
		System.out.println("Originating the exception in f()");
		throw new Exception("thrown from f()");
	}
	
	public static void g() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside g(),e.printStackTrace()");
			e.printStackTrace(System.out);
			throw e;
		}
	}
	public static void h() throws Exception{
		try {
			f();
		} catch (Exception e) {
			System.out.println("Inside h(),e.printStackTrace()");
			e.printStackTrace(System.out);
//			强转类型。此处成了新的异常发生点，有关原来异常的信息会丢失
			throw (Exception)e.fillInStackTrace();
		}
	}
	
	public static void main(String[] args) {
		try {
			g();
		} catch (Exception e) {
			System.out.println("main : printStackTrace()");
			e.printStackTrace(System.out);
		}
		try {
			h();
		} catch (Exception e) {
			System.out.println("main : printStackTrace()");
			e.printStackTrace();
		}
	}

}
