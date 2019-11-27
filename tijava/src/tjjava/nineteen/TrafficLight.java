package tjjava.nineteen;

public class TrafficLight {
	Signal color = Signal.RED;

	public void change() {
		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.GREEN;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}
	}

	public static void main(String[] args) {
		TrafficLight tl = new TrafficLight();
		for (int i = 0; i < 7; i++) {
			System.out.println(tl);
			tl.change();
		}
	}

	@Override
	public String toString() {
		return " tl color == " + color;
	}
}

enum Signal {
	GREEN, YELLOW, RED;

}