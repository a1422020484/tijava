package tjjava.seven;


class Plate {
	public Plate(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	public DinnerPlate(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("DinnerPlate constructor");
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil {
	public Spoon(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil {
	public Fork(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Fork constructor");

	}
}

class Knife extends Utensil {
	public Knife(int i) {
		// TODO Auto-generated constructor stub
		super(i);
		System.out.println("Knife constructor");
	}
}

public class PlaceSetting extends Custom {

	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;

	public PlaceSetting(int i) {
		super(i + 1);
		// TODO Auto-generated constructor stub
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting construstor");
	}
	
	public static void main(String[] args) {
		PlaceSetting placeSetting = new PlaceSetting(9);
	}

}

class Custom {
	public Custom(int i) {
		// TODO Auto-generated constructor stub
		System.out.println("Custor constructor");
	}
}
