package tjjava.ten;

/**
 * @author Administrator
 *	这个类是Parcel7b.java的简化
 */
public class Parcel7 {
	public Contents contents(){
		return new Contents(){
			private int i = 11;
			public int value(){
				return i;
			}
		};
	}
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}

}
