package tjjava.eight;

public class PolyConstructors {

	public static void main(String[] args) {
		RoundGlyph glyph = new RoundGlyph(5);
		System.out.println(glyph.getRadius());
	}

}

class Glyph {
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();//子类重写了这个方法，所以不会调用
		System.out.println("Glyph() after draw()");
	}

	void draw() {
		System.out.println("Glyph.draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	private static int staticRadius = 1;

	public RoundGlyph(int r) {
		System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
		System.out.println("RoundGlyph.RoundGlyph() , staticRadius = " + staticRadius);
	}

	void draw() {
		System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
		System.out.println("RoundGlyph.RoundGlyph() , staticRadius = " + staticRadius);
	}
	
	public int getRadius(){
		return this.radius;
	}
}
