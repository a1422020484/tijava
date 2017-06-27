package tjjava.eight;

public class PolyConstructors {

	public static void main(String[] args) {
		new RoundGlyph(5);
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

	public RoundGlyph(int r) {
		System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
	}

	void draw() {
		System.out.println("RoundGlyph.RoundGlyph() , radius = " + radius);
	}
}
