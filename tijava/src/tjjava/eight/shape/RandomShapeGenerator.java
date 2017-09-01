package tjjava.eight.shape;

import java.util.Random;

public class RandomShapeGenerator {
	private Random rand = new Random(47);

	public Shape next() {
		switch (rand.nextInt(3)) {
		case 1:
			return new Circle();
		case 2:
			return new Square();
		case 3:
			return new Triangle();
		}
		return new Shape();
	}
}
