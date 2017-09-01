package tjjava.ten;

public class Parcel5 {
	public Destination destination(String s) {
		class PDestination implements Destination {
			private String label;

			private PDestination(String whereTo) {
				label = whereTo;
			}
			@Override
			public String readLable() {
				return label;
			}
		}
		return new PDestination(s);
	}
	
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
//		Destination 类只属于方法destination();
		Destination d = p.destination("Tasmania");
	}
}