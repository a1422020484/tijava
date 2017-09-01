package tjjava.twelve;

class SimpleException extends Exception{
	
}

public class InheritingExceptions {

	public void f() throws SimpleException{
		System.out.println("Throw SimpleException form f()");
		throw new SimpleException();
	}
	
	public static void main(String[] args) {
		InheritingExceptions sed = new InheritingExceptions();
		try {
			sed.f();
		} catch (SimpleException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Caught it !");
		}
	}

}
