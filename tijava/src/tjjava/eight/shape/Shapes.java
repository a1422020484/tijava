package tjjava.eight.shape;

public class Shapes {

	private static RandomShapeGenerator gen = new RandomShapeGenerator();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] s = new Shape[9];
		for(int i=0;i<s.length;i++){
			s[i] = gen.next();
		}
		for(Shape shp : s){
			shp.play();
		}
	}

}
