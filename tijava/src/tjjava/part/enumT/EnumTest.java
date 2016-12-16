package tjjava.part.enumT;

public class EnumTest {

	public static void main(String[] args) {
		for (Color e : Color.values()) {
            System.out.println(e.toString());
        }
		
		System.out.println(Color.RED);
		
	}
}
