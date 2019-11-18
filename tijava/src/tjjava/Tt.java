package tjjava;

public class Tt {
	public static void main(String[] args) {
		try {
			A a = Tt.createNewInstance(A.class);
			System.out.println(a.getClass());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	public static <T> T createNewInstance(Class<T> t) throws InstantiationException, IllegalAccessException{
		return t.newInstance();
	}
}

class A{
	
}
