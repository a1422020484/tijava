package tjjava.twelve;

public class ExceptionMethods {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
//			可以发现每个方法都是上个方法的信息多，都是上个方法的超集；
			System.out.println("Caught Exception");
			System.out.println("getMessage(): " + e.getMessage());
			System.out.println("getLocalizeMessage(): " + e.getLocalizedMessage());
			System.out.println("toString():" + e);
			System.out.println("printStackTrance():");
			e.printStackTrace(System.out);
		}
	}
}
