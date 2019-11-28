package tjjava;

public class Tt {
	public static void main(String[] args) {
		try {
			A a = Tt.createNewInstance(A.class);
			System.out.println(a.getClass());
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
		
		String t = "1111110110000001010101010110000110110101100011011000100101000000";
		String s[] = t.split("");
		System.out.println(s.length);
		
	}
	
	public static <T> T createNewInstance(Class<T> t) throws InstantiationException, IllegalAccessException{
		return t.newInstance();
	}
}

class A{
	
}
