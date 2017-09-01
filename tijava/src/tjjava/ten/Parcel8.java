package tjjava.ten;

public class Parcel8 {
	public Wrapping warpping(int x){
		return new Wrapping(x){
			public int value(){
				return super.value();
			}
		};
	}
}
