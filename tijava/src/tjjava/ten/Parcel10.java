package tjjava.ten;

public class Parcel10 {
	public Destination destination(final String dest,final float price){
//		实例的初始化的实际效果就是构造器，不能重载，所以有且只有一个这样的构造器
		return new Destination() {
			private int cost;
			{
				cost = Math.round(price);
				if(cost > 100)
					System.out.println("Over budget");
			}
			private String label = dest;
			@Override
			public String readLable() {
				// TODO Auto-generated method stub
				return label;
			}
		};
	}
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.396F);
	}
}
