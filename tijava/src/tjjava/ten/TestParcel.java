package tjjava.ten;

import tjjava.ten.Parcel4.PDestination;

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;
		@Override
		public int value() {
			// TODO Auto-generated method stub
			return i;
		}

	}
	protected class PDestination implements Destination{
		private String label;
		private PDestination(String whereTo){
			label = whereTo;
		}
		@Override
		public String readLable() {
			return label;
		}
	}
	public Destination destination(String s){
		return new PDestination(s);
	}
	public Contents contents(){
		return new PContents();
	}
}

public class TestParcel {
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		
		Destination d = p.destination("Tasmania");
//		Destination f = p.new PDestination("Tasmania");
	}
}
