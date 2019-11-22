package tjjava.fifteen;

import java.util.ArrayList;
import java.util.List;

public class CovariantArrays {
	public static void main(String[] args) {
		Fruit[] fruit = new Apple[10];
		fruit[0] = new Apple();
		fruit[1] = new Jonathan();
		
		try {
			fruit[0] = new Orange();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			fruit[0] = new Orange();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		List<Fruit> fruitList = new ArrayList<Apple>();
		
//		List<Integer> li = new ArrayList<Integer>();
//		List<Number> ln = li;
//		ln.add(new Float(3.14));
		
 	}
}


class Fruit{
	
}

class Apple extends Fruit{
	
}

class Jonathan extends Apple{
	
}

class Orange extends Fruit{
	
}

